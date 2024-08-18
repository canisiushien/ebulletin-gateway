/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.ebulletinmetier1.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Canisius <canisiushien@gmail.com>
 */
@Data
@Entity
@Table(name = "bulletin", schema = "ebulletin")
public class Bulletin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "matricule", nullable = false, length = 10)
    private String matricule;

    @Column(name = "salarie", nullable = false, length = 150)
    private String salarie;

    private Double netAPayer;
}
