package google.drive.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import google.drive.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import google.drive.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired VideoRepository videoRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='FIleUploaded'")
    public void wheneverFIleUploaded_ProcessVideo(@Payload FIleUploaded fIleUploaded){

        FIleUploaded event = fIleUploaded;
        System.out.println("\n\n##### listener ProcessVideo : " + fIleUploaded + "\n\n");


        

        // Sample Logic //
        Video.processVideo(event);
        

        

    }

}


