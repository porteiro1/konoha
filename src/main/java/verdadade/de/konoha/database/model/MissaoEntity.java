package verdadade.de.konoha.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import verdadade.de.konoha.enume.Status;

@Entity
@Table(name = "tb_missoes")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MissaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Status status;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "ninja_id")
    private NinjaEntity ninja;
}
