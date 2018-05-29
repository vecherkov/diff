package com.github.vecherkov.webdiff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;

@Controller
public class ComparisionController {

    private final ComparisionService comparisionService;

    @Autowired
    public ComparisionController(ComparisionService comparisionService) {
        this.comparisionService = Objects.requireNonNull(comparisionService, "comparisionService");
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/")
    public String compare(Model model, @RequestParam("file_1") MultipartFile file1, @RequestParam("file_2") MultipartFile file2) throws IOException {
        String comparisionOutcome = comparisionService.compare(new String(file1.getBytes()), new String(file2.getBytes()));
        model.addAttribute("comparisionOutcome", comparisionOutcome);
        return "index";
    }

}
