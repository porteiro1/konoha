package verdadade.de.konoha.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import verdadade.de.konoha.dto.request.MissaoRequestDto;
import verdadade.de.konoha.dto.request.NinjaRequestDto;
import verdadade.de.konoha.dto.response.NinjaResponseDto;
import verdadade.de.konoha.service.NinjaService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/ninjas")
public class NinjaController {

    private final NinjaService ninjaService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<NinjaResponseDto> findAll(){
        return ninjaService.findAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody NinjaRequestDto dto){
        ninjaService.save(dto);
    }

    @GetMapping("/ninja")
    @ResponseStatus(HttpStatus.OK)
    public List<NinjaResponseDto> findById(@RequestParam Long id){
        return ninjaService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id){
        ninjaService.delete(id);
    }

    @PatchMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateStatus(@PathVariable Long id, @RequestBody NinjaRequestDto dto){
        ninjaService.update(id, dto);
    }


}
