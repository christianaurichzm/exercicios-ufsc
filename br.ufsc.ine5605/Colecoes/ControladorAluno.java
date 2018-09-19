package colecoes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ControladorAluno {
    
    public static void main(String[] args) {
        
        List<Aluno> arrayList = new ArrayList<>();
        List<Aluno> linkedList = new LinkedList<>();
        Set<Aluno> hashSet = new HashSet<>();
        Map<String, Aluno> hashMap = new HashMap<>();
        
        Aluno aluno1 = new Aluno("123");
        Aluno aluno2 = new Aluno("456");
        Aluno aluno3 = new Aluno("789");
        
        arrayList.add(aluno1);
        arrayList.add(aluno2);
        arrayList.add(aluno2);
        arrayList.add(aluno3);
        
        System.out.println("---- IMPRIMINDO ARRAYLIST ----");
        
        for (Aluno aluno : arrayList) {            
            System.out.println("Aluno: " + aluno.getMatricula());            
        }
       
        hashSet.add(aluno1);
        hashSet.add(aluno2);
        hashSet.add(aluno2);
        hashSet.add(aluno3);
        
        System.out.println("---- IMPRIMINDO HASHSET ----");
        
        for (Aluno aluno : hashSet) {            
            System.out.println("Aluno: " + aluno.getMatricula());            
        }
      
        linkedList.add(aluno1);
        linkedList.add(aluno2);
        linkedList.add(aluno2);
        linkedList.add(aluno3);
        
        System.out.println("---- IMPRIMINDO LINKEDLIST ----");
        
        for (Aluno aluno : linkedList) {            
            System.out.println("Aluno: " + aluno.getMatricula());            
        }
          
        hashMap.put(aluno1.getMatricula(), aluno1);
        hashMap.put(aluno2.getMatricula(), aluno2);
        hashMap.put(aluno2.getMatricula(), aluno2);
        hashMap.put(aluno3.getMatricula(), aluno3);
        
        System.out.println("---- IMPRIMINDO HASHMAP VALUES ----");
        
        for (Aluno aluno : hashMap.values()) {            
            System.out.println("Aluno: " + aluno.getMatricula());            
        }      
        
        System.out.println("---- IMPRIMINDO HASHMAP KEYS ----");
        
        for (String matriculaALuno : hashMap.keySet()) {            
            System.out.println("Matricula: " + matriculaALuno);            
        }        
              
        Aluno aluno = hashMap.get("123");
        
        System.out.println("Aluno 123: " + aluno.getMatricula());
        
    }
    
}