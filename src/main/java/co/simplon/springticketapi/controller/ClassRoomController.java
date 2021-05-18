package co.simplon.springticketapi.controller;

import co.simplon.springticketapi.dao.ClassRoomDao;
import co.simplon.springticketapi.dao.LearnerDao;
import co.simplon.springticketapi.model.ClassRoom;
import co.simplon.springticketapi.model.Learner;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/ClassRoom")
@RestController
public class ClassRoomController {

    private final ClassRoomDao classRoomDao;

    public ClassRoomController(ClassRoomDao classRoomDao) {
        this.classRoomDao = classRoomDao;
    }

    @GetMapping
    public List<ClassRoom> getAllClassRoom() {
        return classRoomDao.getAll();
    }

    @GetMapping("/{id}")
    public ClassRoom getClassRoom(@PathVariable Long id) {
        return classRoomDao.get(id);
    }

    @PostMapping
    public ClassRoom postClassRoom(@RequestBody ClassRoom classRoom) { classRoomDao.save(classRoom); return null; }

    @DeleteMapping("/{id}")
    public ClassRoom deleteClassRoom(@PathVariable Long id) {classRoomDao.delete(id); return null;}

 /*   @PutMapping("/{id}")
    public ClassRoom updateClassRoom(@PathVariable Long id,@RequestBody ClassRoom classRoom) {ClassRoomDao.update(id, classRoom); return null;}
*/
}
