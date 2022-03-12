
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 *
 * @author MIGUEL
 */
@Data 
@NoArgsConstructor
@AllArgsConstructor
@Table(name="character")
public class character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    @Column(name="Image")
    private String image;
    @Column(name="Name")
    private String name;
    @Column(name="Age")
    private Integer age;
    @Column(name="Weight")
    private Integer weight;
    @Column(name="Story")
    private String story;
    
    @ManyToMany(mappedBy="characters")
    public List<Movies> movies = new ArrayList<>();
}
