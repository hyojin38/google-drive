package google.drive.domain;

import google.drive.domain.FIleUploaded;
import google.drive.DriveApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="File_table")
@Data

public class File  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private String type;
    
    
    
    
    
    private String size;

    @PostPersist
    public void onPostPersist(){


        FIleUploaded fIleUploaded = new FIleUploaded(this);
        fIleUploaded.publishAfterCommit();

    }

    public static FileRepository repository(){
        FileRepository fileRepository = DriveApplication.applicationContext.getBean(FileRepository.class);
        return fileRepository;
    }






}
