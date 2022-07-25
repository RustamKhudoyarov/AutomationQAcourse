package homework14map;

public class Pet {
    private String nickname;
    private String kind;

    public Pet(String nickname, String kind) {
        this.nickname = nickname;
        this.kind = kind;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
