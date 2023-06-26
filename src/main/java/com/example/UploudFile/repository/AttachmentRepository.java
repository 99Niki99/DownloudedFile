package com.example.UploudFile.repository;

import com.example.UploudFile.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment, String> {

}
