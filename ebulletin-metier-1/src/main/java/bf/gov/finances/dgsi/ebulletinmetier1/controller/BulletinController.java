/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bf.gov.finances.dgsi.ebulletinmetier1.controller;

import bf.gov.finances.dgsi.ebulletinmetier1.entity.Bulletin;
import bf.gov.finances.dgsi.ebulletinmetier1.service.BulletinServices;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Canisius <canisiushien@gmail.com>
 */
@RestController
@RequestMapping(path = "/api/ebulletin-metier/bulletins")
public class BulletinController {

    private final BulletinServices services;

    public BulletinController(BulletinServices services) {
        this.services = services;
    }

    /**
     *
     * @param bulletin
     * @return
     * @throws URISyntaxException
     */
    @PostMapping
    public ResponseEntity<Bulletin> create(@RequestBody Bulletin bulletin) throws URISyntaxException {
        Bulletin result = services.saveBulletin(bulletin);
        return ResponseEntity.created(new URI("/api/affiliation-immatriculation/activite/" + result.getId()))
                .body(result);
    }

    /**
     *
     * @return
     */
    @GetMapping
    public ResponseEntity<List<Bulletin>> findAll() {
        List<Bulletin> result = services.findBulletins();
        return ResponseEntity.ok().body(result);
    }
}
