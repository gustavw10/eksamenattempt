/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.Dog;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustav
 */
public class DogsDTO {
    
    private List<DogDTO> dogsDTO = new ArrayList();
    
     public DogsDTO(String user, List<Dog> dogs) {
         for(int i = 0; i < dogs.size(); i++){
            if(dogs.get(i).getUser().getUserName().equals(user)){
            dogsDTO.add(new DogDTO(dogs.get(i)));
            }
        }
     }
    
}
