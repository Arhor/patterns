package dev.arhor.pattern.creational.builder;

public final record User(String username, String password) {

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String username;
        private String password;

        public User build() {
            return new User(username, password);
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }
    }
}
