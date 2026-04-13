package verdadade.de.konoha.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import verdadade.de.konoha.database.model.MissaoEntity;
import verdadade.de.konoha.database.model.NinjaEntity;
import verdadade.de.konoha.database.respository.MissaoRepository;
import verdadade.de.konoha.database.respository.NinjaRepository;
import verdadade.de.konoha.dto.MissaoResumo;
import verdadade.de.konoha.dto.request.NinjaRequestDto;
import verdadade.de.konoha.dto.response.NinjaResponseDto;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class NinjaService {
    private final NinjaRepository ninjaRepository;
    private final MissaoRepository missaoRepository;

    public void save(NinjaRequestDto dto){
        if(dto.getName() == null){
            throw new RuntimeException("nome obrigatorio");
        }
        if(dto.getRank() == null){
            throw new RuntimeException("rank obrigatorio");
        }
        ninjaRepository.save(NinjaEntity.builder()
                        .name(dto.getName())
                        .rank(dto.getRank())
                .build());
    }

    public List<NinjaResponseDto> findAll(){
        return ninjaRepository.findAll().stream()
                .map(n -> NinjaResponseDto.builder()
                .name(n.getName())
                .rank(n.getRank())
                .missoes(n.getMissoes().stream().map(m -> MissaoResumo.builder()
                        .title(m.getTitle())
                        .description(m.getDescription())
                        .build()
                ).toList())
                .build())
                .toList();
    }

    public void parcialUpdate(Long id, NinjaRequestDto dto){
        NinjaEntity ninja = ninjaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ninja nao encontrado"));

        if (dto.getName() != null){
            ninja.setName(dto.getName());
        }
        if (dto.getRank() != null){
            ninja.setRank(dto.getRank());
        }

        ninjaRepository.save(ninja);
    }

    public List<NinjaResponseDto> findById(Long id){
        ninjaRepository.findById(id).orElseThrow(() -> new RuntimeException("ninja nao existe"));

            return ninjaRepository.findById(id).stream().map(n -> NinjaResponseDto.builder()
                            .name(n.getName())
                            .rank(n.getRank())
                            .missoes(n.getMissoes().stream().map(
                                    m -> MissaoResumo.builder()
                                            .title(m.getTitle())
                                            .description(m.getDescription())
                                            .build()
                            ).toList())
                            .build())
                    .toList();

    }

    public void delete(Long id){
        ninjaRepository.deleteById(id);
    }

    public void update(Long id, NinjaRequestDto dto){
        NinjaEntity ninja = ninjaRepository.findById(id).orElseThrow();

        if(dto.getName() != null){
            ninja.setName(dto.getName());
        }
        if(dto.getRank() != null){
            ninja.setRank(dto.getRank());
        }
        ninjaRepository.save(ninja);
    }

}
