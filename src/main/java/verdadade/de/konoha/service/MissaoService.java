package verdadade.de.konoha.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import verdadade.de.konoha.database.model.MissaoEntity;
import verdadade.de.konoha.database.model.NinjaEntity;
import verdadade.de.konoha.database.respository.MissaoRepository;
import verdadade.de.konoha.database.respository.NinjaRepository;
import verdadade.de.konoha.dto.request.MissaoRequestDto;
import verdadade.de.konoha.dto.response.MissaoResponseDto;
import verdadade.de.konoha.enume.Status;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MissaoService {
    private final MissaoRepository missaoRepository;
    private final NinjaRepository ninjaRepository;

    public void save(MissaoRequestDto dto){
        NinjaEntity ninja = ninjaRepository.findById(dto.getNinja()).orElseThrow();
        missaoRepository.save(MissaoEntity.builder()
                        .title(dto.getTitle())
                        .description(dto.getDescription())
                        .status(dto.getStatus())
                        .ninja(ninja)
                .build());
    }

    public List<MissaoResponseDto> findAll(){
        return missaoRepository.findAll().stream()
                .map(m -> MissaoResponseDto.builder()
                        .title(m.getTitle())
                        .description(m.getDescription())
                        .status(m.getStatus())
                        .ninja(m.getNinja().getName())
                        .build()
                ).toList();
    }

    public void addNinja(Long id, MissaoRequestDto dto){
        MissaoEntity missao = missaoRepository.findById(id).orElseThrow(() -> new RuntimeException("missao nao econtrada"));

        if (missao.getStatus() == Status.DONE){
            throw new RuntimeException("missao ja finalizada");
        }

        NinjaEntity ninja = ninjaRepository.findById(dto.getNinja()).orElseThrow(() -> new RuntimeException("ninja nao econtrado"));
        missao.setNinja(ninja);

        missaoRepository.save(missao);

    }

    public void delete(Long id){
        missaoRepository.deleteById(id);
    }

    public void updateStatus(Long id, MissaoRequestDto dto){
        MissaoEntity missao = missaoRepository.findById(id).orElseThrow();
        if (missao.getStatus() == Status.DONE){
            throw new RuntimeException("missao ja finalizada");
        }
        if (dto.getStatus() != null){
            missao.setStatus(dto.getStatus());
        }

        missaoRepository.save(missao);
    }
}

