package ir.maktab32.projects.lettermanagement.model;

import ir.maktab32.projects.lettermanagement.core.annotations.Entity;
import ir.maktab32.projects.lettermanagement.core.annotations.Id;

@Entity
public class Letter {
    @Id
    private Long id;
    private Long indicator;
    private String title;
    private String privacy;
    private String sender;
    private String submitDate; //YYYY-MM-DD

    public Letter(Long id, Long indicator, String title, String privacy, String sender, String submitDate) {
        this.id = id;
        this.indicator = indicator;
        this.title = title;
        this.privacy = privacy;
        this.sender = sender;
        this.submitDate = submitDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIndicator() {
        return indicator;
    }

    public void setIndicator(Long indicator) {
        this.indicator = indicator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(String submitDate) {
        this.submitDate = submitDate;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "id=" + id +
                ", indicator=" + indicator +
                ", title='" + title + '\'' +
                ", privacy='" + privacy + '\'' +
                ", sender='" + sender + '\'' +
                ", submitDate='" + submitDate + '\'' +
                '}';
    }
}
