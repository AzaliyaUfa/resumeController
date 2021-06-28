package ru.ibs.intern.service;

import org.springframework.stereotype.Service;
import ru.ibs.intern.entity.SearchParameters;


@Service
public class SearchServiceImpl {



    public String getResumeSearchURL(SearchParameters params) {

        return "http://localhost:8080/resumes/fakeApiHH";
    }


}
