package models;

import managers.utils.GeneratorID;
import models.utils.FormaterZonedDataTime;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Objects;

public class StudyGroup implements Comparable<StudyGroup>{
    private Long id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private ZonedDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private Integer studentsCount; //Значение поля должно быть больше 0, Поле не может быть null
    private FormOfEducation formOfEducation; //Поле не может быть null
    private Semester semesterEnum; //Поле не может быть null
    private Person groupAdmin; //Поле может быть null

    public StudyGroup() {
        this.id = GeneratorID.newId();
        this.creationDate = ZonedDateTime.now(ZoneOffset.UTC);
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public Integer getStudentsCount() {
        return studentsCount;
    }

    public FormOfEducation getFormOfEducation() {
        return formOfEducation;
    }

    public Semester getSemesterEnum() {
        return semesterEnum;
    }

    public Person getGroupAdmin() {
        return groupAdmin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setStudentsCount(Integer studentsCount) {
        this.studentsCount = studentsCount;
    }

    public void setFormOfEducation(FormOfEducation formOfEducation) {
        this.formOfEducation = formOfEducation;
    }

    public void setSemesterEnum(Semester semesterEnum) {
        this.semesterEnum = semesterEnum;
    }

    public void setGroupAdmin(Person groupAdmin) {
        this.groupAdmin = groupAdmin;
    }

    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "\n"  + "ID: " + Long.valueOf(id).toString() + "\n"
                        + "Название: " + name + "\n"
                        + "Координаты: " + coordinates.toString() + "\n"
                        + "Дата создания: " + FormaterZonedDataTime.Formating(creationDate) + "\n"
                        + "Количество студентов: " + Long.valueOf(studentsCount).toString() + "\n"
                        + "Форма обучения: " + formOfEducation.toString() + "\n"
                        + "Семестр: " + semesterEnum.toString() + "\n"
                        + "Админ группы: " + groupAdmin.toString() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudyGroup that = (StudyGroup) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(coordinates, that.coordinates) && Objects.equals(creationDate, that.creationDate) && Objects.equals(studentsCount, that.studentsCount) && formOfEducation == that.formOfEducation && semesterEnum == that.semesterEnum && Objects.equals(groupAdmin, that.groupAdmin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, coordinates, studentsCount, formOfEducation, semesterEnum, groupAdmin);
    }

    @Override
    public int compareTo(StudyGroup o) {
        return Integer.compare(studentsCount, o.getStudentsCount());
    }
}

