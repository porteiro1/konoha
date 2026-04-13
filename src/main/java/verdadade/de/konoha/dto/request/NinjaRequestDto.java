package verdadade.de.konoha.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import verdadade.de.konoha.database.model.MissaoEntity;
import verdadade.de.konoha.enume.Rank;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaRequestDto {
    private String name;
    private Rank rank;
}
