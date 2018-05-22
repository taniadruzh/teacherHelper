package Obj;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Journal {
    private int idJournal;
    private int idStudent;
    private String data;
}
