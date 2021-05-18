package co.simplon.springticketapi.model;

public class ClassRoom {
    private Long id;
    private String classroomname;

    public ClassRoom(Long id, String classroomname) {
        this.id = id;
        this.classroomname = classroomname;
    }

    public Long getId() {
        return id;
    }

    public String getClassroomName() {
        return classroomname;
    }
}
