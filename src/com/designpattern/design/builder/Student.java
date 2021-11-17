package com.designpattern.design.builder;

public class Student {
    //required parameters
    private String id;
    private String name;
    private String className;
    private int age;
    private boolean gender;

    //optional parameters
    private String address;
    private String fatherName;
    private String motherName;
    private String nationnality;
    private String religion;

    public Student(StudentBuilder studentBuilder) {
        this.id = studentBuilder.id;
        this.name = studentBuilder.name;
        this.className = studentBuilder.className;
        this.age = studentBuilder.age;
        this.gender = studentBuilder.gender;
        this.address = studentBuilder.address;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.nationnality = studentBuilder.nationnality;
        this.religion = studentBuilder.religion;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getNationnality() {
        return nationnality;
    }

    public String getReligion() {
        return religion;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", nationnality='" + nationnality + '\'' +
                ", religion='" + religion + '\'' +
                '}';
    }

    //Builder Class
    public static class StudentBuilder {
        //required parameters
        private String id;
        private String name;
        private String className;
        private int age;
        private boolean gender;

        //optional parameters
        private String address;
        private String fatherName;
        private String motherName;
        private String nationnality;
        private String religion;

        public StudentBuilder(String id, String name, String className, int age, boolean gender) {
            this.id = id;
            this.name = name;
            this.className = className;
            this.age = age;
            this.gender = gender;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setFatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public StudentBuilder setMotherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public StudentBuilder setNationnality(String nationnality) {
            this.nationnality = nationnality;
            return this;
        }

        public StudentBuilder setReligion(String religion) {
            this.religion = religion;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }
}
