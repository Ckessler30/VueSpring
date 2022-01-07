package io.moonrake.springboot.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "airplanes")
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "plane_type", nullable = false)
    private String planeType;
//    @Column(name = "airline", nullable = false)
    private String airline;
//    @Column(name = "manufacturer", nullable = false)
    private String manufacturer;
}
