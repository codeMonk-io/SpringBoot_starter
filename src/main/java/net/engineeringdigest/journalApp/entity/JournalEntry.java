package net.engineeringdigest.journalApp.entity;
import lombok.*;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "JournalEntries")


//@Getter
//@Setter
//@Slf4j
//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//lombok ka ek part continuos scan karta h annotations ko aur usko getter setter generate karta h
@Data
@ToString
@EqualsAndHashCode

public class JournalEntry {
    private String title;
    @Id
    private ObjectId id;
    private String content;
    private LocalDateTime date;

//
//    public LocalDateTime getDate() {
//        return date;
//    }
//
//    public void setDate(LocalDateTime date) {
//        this.date = date;
//    }
//
//
//    public ObjectId getId() {
//        return id;
//    }
//
//    public void setId(ObjectId id) {
//        this.id = id;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }

}
