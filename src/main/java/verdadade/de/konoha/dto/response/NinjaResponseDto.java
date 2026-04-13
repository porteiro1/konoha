package verdadade.de.konoha.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import verdadade.de.konoha.database.model.MissaoEntity;
import verdadade.de.konoha.dto.MissaoResumo;
import verdadade.de.konoha.enume.Rank;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NinjaResponseDto {
    private String name;
    private Rank rank;
    private List<MissaoResumo> missoes;
}
