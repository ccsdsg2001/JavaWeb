package pojo;

import java.sql.Date;
import java.util.List;

/**
 * @author cc
 * @date 2022年09月05日 22:30
 */
public class UserDetail {
    private Integer id;
    private String realName;
    private String tel;
    private String email;
    private Date birth;
    private String star;

    private  UserDetail userDetail;
    private List<Topic> topicList;
    private List<UserBasic> friendList;

    public UserDetail(Integer id, String realName, String tel, String email, Date birth, String star, UserDetail userDetail, List<Topic> topicList, List<UserBasic> friendList) {
        this.id = id;
        this.realName = realName;
        this.tel = tel;
        this.email = email;
        this.birth = birth;
        this.star = star;
        this.userDetail = userDetail;
        this.topicList = topicList;
        this.friendList = friendList;
    }

    public UserDetail() {
    }

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public List<Topic> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }

    public List<UserBasic> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<UserBasic> friendList) {
        this.friendList = friendList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "UserDetail{" +
                "id=" + id +
                ", realName='" + realName + '\'' +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", birth=" + birth +
                ", star='" + star + '\'' +
                ", userDetail=" + userDetail +
                ", topicList=" + topicList +
                ", friendList=" + friendList +
                '}';
    }
}
