package co.simplon.springticketapi.controller;

import co.simplon.springticketapi.dao.LearnerDao;

import co.simplon.springticketapi.model.Learner;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/learner")
@RestController
public class LeanerController {

    private final LearnerDao learnerDao;

    public LeanerController(LearnerDao learnerDao) {
        this.learnerDao = learnerDao;
    }

    @GetMapping
    public List<Learner> getAllLearners() {
        return learnerDao.getAll();
    }

    @GetMapping("/{id}")
    public Learner getLearner(@PathVariable Long id) {
        return learnerDao.get(id);
    }

    @PostMapping
    public Learner postLearner(@RequestBody Learner learner) { learnerDao.save(learner); return null; }

    @DeleteMapping("/{id}")
    public Learner deleteLearner(@PathVariable Long id) {learnerDao.delete(id); return null;}

    @PutMapping("/{id}")
    public Learner updateLearner(@PathVariable Long id,@RequestBody Learner learner) {learnerDao.update(id, learner); return null;}

}
