package parent.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {
   @Autowired
    private TodoRespository todoRespository;
/*get all todos
* return list of todos*/
    public List<Todo> findAll() {
        return todoRespository.findAll();
    }
    public Todo getid(String id){
         return todoRespository.findById(id).get();
        }
public Todo save(Todo todo){
        return todoRespository.insert(todo);
}
public void delet(String id){

   todoRespository.deleteById(id);
}
}
