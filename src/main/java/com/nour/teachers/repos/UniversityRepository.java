package com.nour.teachers.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nour.teachers.entities.University;
public interface UniversityRepository extends JpaRepository<University, Long> {
}