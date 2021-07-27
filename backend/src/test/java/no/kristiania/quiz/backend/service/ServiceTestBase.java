package no.kristiania.quiz.backend.service;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;

public class ServiceTestBase {

    @Autowired
    private ResetService deleteService;


    @BeforeEach
    public void cleanDatabase(){
        deleteService.resetDatabase();
    }
}
