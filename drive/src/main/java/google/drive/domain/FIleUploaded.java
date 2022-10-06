package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FIleUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private String size;

    public FIleUploaded(File aggregate){
        super(aggregate);
    }
    public FIleUploaded(){
        super();
    }
}
