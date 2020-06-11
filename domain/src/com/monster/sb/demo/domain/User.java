package com.monster.sb.demo.domain;

import java.util.Date;

public class User {
    private long id;

    private String firstName;

    private String lastName;

    private String email;

    private Date createdAt;

    private long createdBy;

    private Date updatedAt;

    private long updatedBy;

    public User(long id, String firstName, String lastName, String email, Date createdAt, long createdBy, Date updatedAt, long updatedBy) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.updatedAt = updatedAt;
        this.updatedBy = updatedBy;
    }


    /**
     * Gets id.
     *
     * @return the id
     */

    public long getId() {
        return id;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */

    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */

    public String getLastName() {
        return lastName;
    }

     /**
     * Gets email.
     *
     * @return the email
     */

    public String getEmail() {
        return email;
    }

    /**
     * Gets created at.
     *
     * @return the created at
     */
    public Date getCreatedAt() {
        return createdAt;
    }


    /**
     * Gets created by.
     *
     * @return the created by
     */
    public long getCreatedBy() {
        return createdBy;
    }


    /**
     * Gets updated at.
     *
     * @return the updated at
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }



    /**
     * Gets updated by.
     *
     * @return the updated by
     */
    public long getUpdatedBy() {
        return updatedBy;
    }


}
