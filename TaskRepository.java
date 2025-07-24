package com.To_Do_List.TO_Do_Tist_RestAPI.Repository;

import com.To_Do_List.TO_Do_Tist_RestAPI.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
