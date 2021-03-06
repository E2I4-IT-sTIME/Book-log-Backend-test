package com.itstime.Booklog.model.portfolio;

import com.itstime.Booklog.model.portfolio.Portfolio;
import com.itstime.Booklog.model.user.UserInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "review")
public class Review {

    @Id  // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userInfo_id")
    private UserInfo userInfo;


    @ManyToMany(mappedBy = "reviews")
    private List<Portfolio> portfolio;

    private String title;

    @Lob
    private String text;
}
