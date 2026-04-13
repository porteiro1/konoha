package verdadade.de.konoha.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import verdadade.de.konoha.database.model.NinjaEntity;
import verdadade.de.konoha.enume.Status;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissaoRequestDto {
    private String title;
    private String description;
    private Status status;
    private Long  ninja;
}
