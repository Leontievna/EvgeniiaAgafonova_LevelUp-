package comments;

import com.google.gson.annotations.SerializedName;

public class CommentsRequest {

    private long post;
    @SerializedName("post_id")
    private long postId;
    private String name;
    private String email;
    private String body;

    public CommentsRequest(){
    }

    public CommentsRequest(long post, long postId, String name, String email, String body) {
        this.post = post;
        this.postId = postId;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public long getPost() {
        return post;
    }

    public void setPost(long post) {
        this.post = post;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentsRequest that = (CommentsRequest) o;

        if (post != that.post) return false;
        if (postId != that.postId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        return body != null ? body.equals(that.body) : that.body == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (post ^ (post >>> 32));
        result = 31 * result + (int) (postId ^ (postId >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "comments.CommentsRequest{" +
                "post='" + post + '\'' +
                ", postId=" + postId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
