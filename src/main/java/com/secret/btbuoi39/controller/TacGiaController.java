package com.secret.btbuoi39.controller;

import com.secret.btbuoi39.entity.TacGiaEntity;
import com.secret.btbuoi39.repository.TacGiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tacgia")
public class TacGiaController {
    @Autowired
    TacGiaRepository tacGiaRepository;

    @GetMapping("")
    public ResponseEntity<?> getTacGia(){
        List<TacGiaEntity> listTacGia = tacGiaRepository.findAll();

        ResponseEntity<?> responseEntity = new  ResponseEntity<>(listTacGia, HttpStatus.OK);
        return responseEntity;
    }

    @PostMapping("")
    public ResponseEntity<?> insertTacGia(@RequestParam String hoTen, @RequestParam String tenTacGia, @RequestParam String gioiTinh){
        TacGiaEntity tacGiaEntity = new TacGiaEntity();
        tacGiaEntity.setHoTen(hoTen);
        tacGiaEntity.setTenTacGia(tenTacGia);
        tacGiaEntity.setGioiTinh(gioiTinh);
        tacGiaRepository.save(tacGiaEntity);

        ResponseEntity<?> responseEntity = new  ResponseEntity<>("Đã thêm tác giả", HttpStatus.OK);
        return responseEntity;
    }

    @DeleteMapping("")
    public ResponseEntity<?> deleteTacGia(@RequestParam int id){
        tacGiaRepository.deleteById(id);

        ResponseEntity<?> responseEntity = new  ResponseEntity<>("Đã xoá tác giả", HttpStatus.OK);
        return responseEntity;
    }

    @PutMapping("")
    public ResponseEntity<?> updateTacGia(@RequestParam int id,@RequestParam String hoTen, @RequestParam String tenTacGia, @RequestParam String gioiTinh){
        TacGiaEntity tacGiaEntity = new TacGiaEntity();
        tacGiaEntity.setId(id);
        tacGiaEntity.setHoTen(hoTen);
        tacGiaEntity.setTenTacGia(tenTacGia);
        tacGiaEntity.setGioiTinh(gioiTinh);
        tacGiaRepository.save(tacGiaEntity);

        ResponseEntity<?> responseEntity = new  ResponseEntity<>("Đã cập nhật tác giả", HttpStatus.OK);
        return responseEntity;
    }
}
