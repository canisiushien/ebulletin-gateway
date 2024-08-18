/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.ebulletinmetier1.repository;

import bf.gov.finances.dgsi.ebulletinmetier1.entity.Bulletin;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Canisius <canisiushien@gmail.com>
 */
public interface BulletinRepository extends JpaRepository<Bulletin, Long> {

}
