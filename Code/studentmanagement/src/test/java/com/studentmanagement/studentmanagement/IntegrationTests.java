package com.studentmanagement.studentmanagement;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.studentmanagement.studentmanagement.model.entity.Student;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static com.studentmanagement.studentmanagement.models.StudentListTestBuilder.createStudentsList;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest
public class IntegrationTests {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @Before
    public void setupMock() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    @Ignore
    public void shouldGetStudents() throws Exception {
        List<Student> studentList = createStudentsList();
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = mapper.writeValueAsString(studentList);

       mockMvc.perform(get("/student/studentsList"))
                .andExpect(status().isOk())
                .andExpect(content().string(jsonInString))
                .andReturn().getResponse().getContentAsString();

    }

    @Test
    @Ignore
    public void shouldGetStudentById() throws Exception {
        List<Student> studentList = createStudentsList();
        Student student = studentList.get(0);
        ObjectMapper mapper = new ObjectMapper();
        String jsonInString = mapper.writeValueAsString(student);

        mockMvc.perform(get("/student/seeStudentDetails/2"))
                .andExpect(status().isOk())
                .andExpect(content().string(jsonInString))
                .andReturn();

    }


}
