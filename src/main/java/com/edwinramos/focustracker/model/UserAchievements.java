package com.edwinramos.focustracker.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "user_achievements")
public class UserAchievements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "achievement_id", nullable = false)
    private Achievement achievement;

    @Column(name = "date_unlocked")
    private LocalDateTime dateUnlocked;

    public UserAchievements(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Achievement getAchievement() {
        return achievement;
    }

    public void setAchievement(Achievement achievement) {
        this.achievement = achievement;
    }

    public LocalDateTime getDateUnlocked() {
        return dateUnlocked;
    }

    public void setDateUnlocked(LocalDateTime dateUnlocked) {
        this.dateUnlocked = dateUnlocked;
    }
}
