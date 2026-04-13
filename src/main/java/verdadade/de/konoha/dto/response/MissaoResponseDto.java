package verdadade.de.konoha.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import verdadade.de.konoha.database.model.NinjaEntity;
import verdadade.de.konoha.enume.Status;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MissaoResponseDto {
    private String title;
    private String description;
    private Status status;
    private String ninja;
}
