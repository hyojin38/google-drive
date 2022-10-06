package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FIleUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private String size;
}


