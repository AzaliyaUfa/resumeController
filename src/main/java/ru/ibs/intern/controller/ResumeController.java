package ru.ibs.intern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import ru.ibs.intern.entity.SearchParameters;
import ru.ibs.intern.service.ResumeServiceImpl;
import ru.ibs.intern.service.SearchServiceImpl;

import java.io.IOException;

@RestController
@RequestMapping(value = "/resumes", consumes = {MediaType.ALL_VALUE}, produces = MediaType.APPLICATION_JSON_VALUE)
public class ResumeController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ResumeServiceImpl resumeService;

    @Autowired
    SearchServiceImpl searchService;


    @GetMapping(value ="fakeApiHH", produces = {MediaType.APPLICATION_JSON_VALUE})
    public String test() throws IOException {
        return resumeService.readFromJsonFile();
    }

    @PostMapping(value = "searchByParams", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String getVacancies(@RequestBody SearchParameters params) {
        resumeService.truncateResumeTable();
        String searchURL = searchService.getResumeSearchURL(params);
        //resumeService.getResumesFromHH(searchURL);
        return "Got it.";
    }


}
