package com.luffyjet.gweb.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Tue May 16 15:42:09 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userName
     *
     * @mbg.generated Tue May 16 15:42:09 CST 2017
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userAge
     *
     * @mbg.generated Tue May 16 15:42:09 CST 2017
     */
    private Integer userage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userAddress
     *
     * @mbg.generated Tue May 16 15:42:09 CST 2017
     */
    private String useraddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Tue May 16 15:42:09 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Tue May 16 15:42:09 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userName
     *
     * @return the value of user.userName
     *
     * @mbg.generated Tue May 16 15:42:09 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userName
     *
     * @param username the value for user.userName
     *
     * @mbg.generated Tue May 16 15:42:09 CST 2017
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userAge
     *
     * @return the value of user.userAge
     *
     * @mbg.generated Tue May 16 15:42:09 CST 2017
     */
    public Integer getUserage() {
        return userage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userAge
     *
     * @param userage the value for user.userAge
     *
     * @mbg.generated Tue May 16 15:42:09 CST 2017
     */
    public void setUserage(Integer userage) {
        this.userage = userage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userAddress
     *
     * @return the value of user.userAddress
     *
     * @mbg.generated Tue May 16 15:42:09 CST 2017
     */
    public String getUseraddress() {
        return useraddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userAddress
     *
     * @param useraddress the value for user.userAddress
     *
     * @mbg.generated Tue May 16 15:42:09 CST 2017
     */
    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress == null ? null : useraddress.trim();
    }
}