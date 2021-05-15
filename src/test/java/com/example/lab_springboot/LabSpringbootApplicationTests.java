package com.example.lab_springboot;

import com.example.lab_springboot.models.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LabSpringbootApplicationTests {

    @Test
    void contextLoads() {
    }

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getsById(){
        Book firstBook = new Book(1, "Collins Bird Guide 2nd edition", "Lars Svensson");
        assertThat(
                this.restTemplate.getForObject("http://localhost:" + port + "/books/1", Book.class))
                .isEqualTo(firstBook);
    }
}
