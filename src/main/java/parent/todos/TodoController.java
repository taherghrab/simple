package parent.todos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/todos")
public class TodoController {
@Autowired
    private TodoService todoService;
    @GetMapping(value = "/")
    public List<Todo> getall(){
return todoService.findAll();
    }
    @GetMapping(value = "/{id}")
    public Todo gettodbyid(@PathVariable String id){

        return todoService.getid(id);
    }
    @PostMapping(value = "/")
    public Todo createtodo(@RequestBody Todo todo){
return todoService.save(todo);}
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable String id){
        todoService.delet(id);

    }


}
