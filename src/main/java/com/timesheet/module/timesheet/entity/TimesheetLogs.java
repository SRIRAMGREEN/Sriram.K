package com.timesheet.module.timesheet.entity;

import com.timesheet.module.Employee.entity.Employee;
import com.timesheet.module.task.entity.Task;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "timesheetLogs")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TimesheetLogs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "logs_Id", unique = true)
    public int id;

//    @Temporal(TemporalType.DATE)
    public String Date;

    @Column(name = "hours")
    public Long hours;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(name = "task_id", referencedColumnName = "task_id")
    private Task task;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name = "timesheet_Id", referencedColumnName = "timesheet_Id")
    private Timesheet timesheet;


}
