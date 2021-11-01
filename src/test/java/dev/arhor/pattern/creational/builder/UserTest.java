package dev.arhor.pattern.creational.builder;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void builderTest() {
        // given
        var expectedUsername = "username";
        var expectedPassword = "password";

        // when
        var user = User.builder().username(expectedUsername).password(expectedPassword).build();

        // then
        assertThat(user).isNotNull();
        assertThat(user.username()).isEqualTo(expectedUsername);
        assertThat(user.password()).isEqualTo(expectedPassword);
    }
}