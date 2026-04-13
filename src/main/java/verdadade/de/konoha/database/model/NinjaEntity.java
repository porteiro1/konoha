package verdadade.de.konoha.database.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import verdadade.de.konoha.enume.Rank;

import java.util.List;

@Entity
@Table(name = "tb_ninja")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NinjaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Rank rank;

    @OneToMany(mappedBy = "ninja")
    private List<MissaoEntity> missoes;
}
