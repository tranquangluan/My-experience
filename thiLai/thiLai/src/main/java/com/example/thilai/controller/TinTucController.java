package com.example.thilai.controller;

import com.example.thilai.entity.DanhMuc;
import com.example.thilai.entity.TinTuc;
import com.example.thilai.service.DanhMucService;
import com.example.thilai.service.TinTucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/tinTuc")
public class TinTucController {
    @Autowired
    private TinTucService tinTucService;
    @Autowired
    private DanhMucService danhMucService;

    @GetMapping("/list")
    public String showList(ModelMap modelMap)
    {
        List<TinTuc> tinTucs = tinTucService.findAll();
        modelMap.addAttribute("tinTucs", tinTucs);
        return "/list";
    }

    @GetMapping("/create")
    public String showCreate(ModelMap modelMap) {
        List<DanhMuc> danhMucs = danhMucService.findAll();
        TinTuc tinTuc = new TinTuc();
        tinTuc.setDanhMuc(new DanhMuc());
        modelMap.addAttribute("danhMucs", danhMucs);
        modelMap.addAttribute("tinTuc", tinTuc);
        return "/create";
    }

    @PostMapping("create")
    public String doCreate(@Valid @ModelAttribute("tinTuc") TinTuc tinTuc, BindingResult bindingResult
            , ModelMap modelMap) {
        if (bindingResult.hasErrors()) {
            List<DanhMuc> classes = danhMucService.findAll();
            modelMap.addAttribute("classes", classes);
            if (tinTuc.getDanhMuc() == null) {
                tinTuc.setDanhMuc(new DanhMuc());
            }
            return "/create";
        }
        tinTucService.create(tinTuc);
        return "redirect:/tinTuc/list";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id") String id) {
        tinTucService.delete(id);
        return "redirect:/tinTuc/list";
    }

    @GetMapping("/search")
    public String search(ModelMap modelMap, @RequestParam(value = "tieuDe", defaultValue = "") String tieuDe) {
        List<TinTuc> tinTucs = tinTucService.findAllByTieuDeContaining(tieuDe);
        modelMap.addAttribute("tinTucs", tinTucs);
        modelMap.addAttribute("tieuDe", tieuDe);
        return "/list";
    }


}
