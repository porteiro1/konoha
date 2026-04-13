package verdadade.de.konoha.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import verdadade.de.konoha.database.model.MissaoEntity;
import verdadade.de.konoha.dto.request.MissaoRequestDto;
import verdadade.de.konoha.dto.response.MissaoResponseDto;
import verdadade.de.konoha.service.MissaoService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/missoes")
public class MissaoController {
    private final MissaoService missaoService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MissaoResponseDto> findAll(){
        return missaoService.findAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody MissaoRequestDto dto){
        missaoService.save(dto);
    }

    @PatchMapping("/{id}/ninja")
    @ResponseStatus(HttpStatus.OK)
    public void addNinja(@PathVariable Long id, @RequestBody MissaoRequestDto dto){
        missaoService.addNinja(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id){
        missaoService.delete(id);
    }

    @PatchMapping("/update/status/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateStatus(@PathVariable Long id, @RequestBody MissaoRequestDto dto){
        missaoService.updateStatus(id, dto);
    }
}
