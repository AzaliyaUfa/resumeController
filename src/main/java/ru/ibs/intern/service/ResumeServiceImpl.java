package ru.ibs.intern.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;


import java.io.*;
import java.nio.file.Files;


@Service
public class ResumeServiceImpl {


    public String readFromJsonFile() throws IOException {

        File resource = new ClassPathResource("data/resume.json").getFile();
        return new String(Files.readAllBytes(resource.toPath()));
    }


    /*
    В резюме обязательно должен быть указан email (и он может быть только один).
    В резюме должен быть указан хотя бы один телефон, причём можно указывать только один телефон каждого типа.
    Комментарий можно указывать только для телефонов, для email комментарий не сохранится.
    В контакте типа 'email' value — это email, а для телефонов — объект.
        Обязательно указать либо телефон полностью в поле formatted,
    либо все три части телефона по отдельности в полях country, city и number.
    Если указано и то, и то, используются данные из разделенного телефона.
    В поле formatted допустимо указание дополнительных символов: пробелов, скобок, дефисов.
    В раздельных полях допустимы только цифры.
    */


    public void truncateResumeTable() {

    }


}
