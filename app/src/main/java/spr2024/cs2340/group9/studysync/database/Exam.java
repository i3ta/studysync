package spr2024.cs2340.group9.studysync.database;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity
public class Exam {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public String name;
    long startTime;
    long endTime;
    public int notifyBefore;

    @Ignore
    public Exam(String name, Date startTime, Date endTime, int notifyBefore) {
        this.name = name;
        this.startTime = startTime.getTime();
        this.endTime = endTime.getTime();
        this.notifyBefore = notifyBefore;
    }

    @Ignore
    public void setStartTime(Date startTime) {
        this.startTime = startTime.getTime();
    }

    @Ignore
    public Date getStartTime() {
        return new Date(startTime);
    }

    @Ignore
    public void setEndTime(Date endTime) {
        this.endTime = endTime.getTime();
    }

    @Ignore
    public Date getEndTime() {
        return new Date(endTime);
    }
}
