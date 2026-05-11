package com.gymbooking.model;

public class GymClass {
    private String className;
    private String trainer;
    private int maxCapacity;
    private int currentCapacity;
    private static int classCount = 0;

    public GymClass() {
        classCount++;
    }

    public GymClass(String className, String trainer, int maxCapacity) {
        setClassName(className);
        setTrainer(trainer);
        setMaxCapacity(maxCapacity);
        classCount++;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        if (maxCapacity <= 0 ) {
            System.out.println("Invalid max capacity.");
            return;
        }
        this.maxCapacity = maxCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

//    public void setCurrentCapacity(int currentCapacity) {
//        if (currentCapacity < 0) {
//            System.out.println("Invalid current capacity.");
//            return;
//        }
//        if  (currentCapacity > maxCapacity){
//            System.out.println("Current capacity can not exceed max capacity.");
//            return;
//        }
//        this.currentCapacity = currentCapacity;
//    }

//    public void printInfo() {
//        System.out.println("Class name: " + className + "\n" + "Trainer: " + trainer + "\n" +
//                "Max Capacity: " + maxCapacity + "\n" + "Current Capacity: " + currentCapacity + "\n");
//    }

    @Override
    public String toString() {
        return "Class name: " + className + "\n" + "Trainer: " + trainer + "\n" +
                "Max Capacity: " + maxCapacity + "\n" + "Current Capacity: " + currentCapacity + "\n";
    }

    public void addMember() {
        if (currentCapacity >= maxCapacity) {
            System.out.println("Class is full");
            return;
        }

        currentCapacity++;
        System.out.println("Member added. Current capacity: " + currentCapacity);
    }

    public void removeMember() {
        if (currentCapacity <= 0) {
            System.out.println("Class is empty. No members to remove");
            return;
        }

        currentCapacity--;
        System.out.println("Member removed. Current capacity: " +currentCapacity);
    }

    public boolean isFull() {
        return currentCapacity >= maxCapacity;
    }
}
