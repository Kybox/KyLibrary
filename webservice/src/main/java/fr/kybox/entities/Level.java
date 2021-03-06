package fr.kybox.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Kybox
 * @version 1.0
 */

@Entity
@Table(name = "user_level", schema = "public")
public class Level extends AbstractEntity {

    @Column
    String label;

    public Level() {}

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
