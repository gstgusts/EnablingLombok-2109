package com.company;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.SneakyThrows;

import java.io.File;
import java.io.IOException;

public class DogRepo {

   @SneakyThrows
   public Dog load() {
       var mapper = new XmlMapper();

       var file = new File("adsfasdf.xml");

       var dog = mapper.readValue(file, Dog.class);

       return dog;
   }
}
