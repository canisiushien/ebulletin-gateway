/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.ebulletinmetier1.service;

import bf.gov.finances.dgsi.ebulletinmetier1.entity.Bulletin;
import bf.gov.finances.dgsi.ebulletinmetier1.repository.BulletinRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 *
 * @author Canisius <canisiushien@gmail.com>
 */
@Slf4j
@Service
public class BulletinServices {

    private final BulletinRepository bulletinRepository;

    public BulletinServices(BulletinRepository bulletinRepository) {
        this.bulletinRepository = bulletinRepository;
    }

    public Bulletin saveBulletin(Bulletin bulletin) {
        log.info("Save a bulletins with : {}", bulletin);
        return bulletinRepository.save(bulletin);
    }

    public List<Bulletin> findBulletins() {
        log.info("List of all bulletins");
        return bulletinRepository.findAll();
    }
}
