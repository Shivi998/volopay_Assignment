
package com.example.volopayAssigment;

        import jakarta.persistence.Entity;
        import jakarta.persistence.GeneratedValue;
        import jakarta.persistence.GenerationType;
        import jakarta.persistence.Id;
        import org.hibernate.annotations.CreationTimestamp;

        import java.util.Date;

@Entity
//@Data
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // @CreationTimestamp
    private Date date;

    private String department;

    private String software;

    private int seats;

    private int amount;


}
