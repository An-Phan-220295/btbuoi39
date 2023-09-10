package com.secret.btbuoi39.controller;

import com.secret.btbuoi39.entity.BaiVietEntity;
import com.secret.btbuoi39.repository.BaiVietRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/baiviet")
public class BaiVietController {
    @Autowired
    BaiVietRepository baiVietRepository;

    @GetMapping("")
    public ResponseEntity<?> getBaiViet(){
        List<BaiVietEntity> listBaiViet = baiVietRepository.findAll();

        ResponseEntity<?> responseEntity = new ResponseEntity<>(listBaiViet, HttpStatus.OK);
        return responseEntity;
    }

    @PostMapping("")
    public ResponseEntity<?> insertBaiViet(@RequestParam String noiDung, @RequestParam String tieuDe, @RequestParam int idTacGia, @RequestParam String ngayViet){
        BaiVietEntity baiVietEntity = new BaiVietEntity();
        baiVietEntity.setNoiDung(noiDung);
        baiVietEntity.setTieuDe(tieuDe);
        baiVietEntity.setIdTacGia(idTacGia);
        baiVietEntity.setNgayViet(ngayViet);
        baiVietRepository.save(baiVietEntity);

        ResponseEntity<?> responseEntity = new ResponseEntity<>("Đã lưu bài viết", HttpStatus.OK);
        return responseEntity;
    }

    @DeleteMapping("")
    public ResponseEntity<?> deleteBaiViet (@RequestParam int id){
        baiVietRepository.deleteById(id);

        ResponseEntity<?> responseEntity = new ResponseEntity<>("Đã xóa bài viết số " +id, HttpStatus.OK);
        return responseEntity;
    }

    @PutMapping("")
    public ResponseEntity<?> updateBaiViet(@RequestParam int id, @RequestParam int idTacGia, @RequestParam String noiDung, @RequestParam String tieuDe, @RequestParam String ngayViet){
        BaiVietEntity baiVietEntity = new BaiVietEntity();
        baiVietEntity.setId(id);
        baiVietEntity.setNoiDung(noiDung);
        baiVietEntity.setTieuDe(tieuDe);
        baiVietEntity.setIdTacGia(idTacGia);
        baiVietEntity.setNgayViet(ngayViet);
        baiVietRepository.save(baiVietEntity);

        ResponseEntity<?> responseEntity = new ResponseEntity<>("Đã cập nhật bài viết", HttpStatus.OK);
        return responseEntity;
    }
}
