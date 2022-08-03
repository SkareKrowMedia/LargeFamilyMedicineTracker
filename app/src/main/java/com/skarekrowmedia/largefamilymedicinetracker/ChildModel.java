package com.skarekrowmedia.largefamilymedicinetracker;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "childInfo")

public class ChildModel {

    @PrimaryKey(autoGenerate = true)
    private int idChild;

    private String childName;

    private int age;

    private float weight;

    public ChildModel(String childName, int age, float weight) {
        this.childName = childName;
        this.age = age;
        this.weight = weight;
    }

    public void setIdChild(int idChild) {
        this.idChild = idChild;
    }

    public int getIdChild() {
        return idChild;
    }

    public String getChildName() {
        return childName;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }
}
