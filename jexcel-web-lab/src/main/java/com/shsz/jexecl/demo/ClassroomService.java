package com.shsz.jexecl.demo;

import java.util.ArrayList;
import java.util.List;

public class ClassroomService {   
    public List findAllClassroom(){   
        List list = new ArrayList();   
        ClassroomDTO to = new ClassroomDTO();   
        to.setStuName("33333");   
        to.setStuPassword("bbbbbbbbbbb");   
        list.add(to);   
        return list;    
    }   
}  