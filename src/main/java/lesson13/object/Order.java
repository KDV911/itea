package lesson13.object;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Order {

    private String id;
    private int petId;
    private int quantity;
    private String date;
    private String status;
    private String complete;
}
