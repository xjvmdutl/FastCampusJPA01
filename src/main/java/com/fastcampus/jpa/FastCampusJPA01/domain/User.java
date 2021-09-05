package com.fastcampus.jpa.FastCampusJPA01.domain;

import lombok.*;

import java.time.LocalDateTime;
/*
@Getter
@Setter
@ToString//ToString 어노테이션 추가
@EqualsAndHashCode
*/
@NoArgsConstructor//생성자 생성방법 3가지 -> 인자가 없는 생성자 User user = new User()
@AllArgsConstructor//모든 매개변수를 인자로받는 생성자 User user = new User(1,2,3,4)
@RequiredArgsConstructor//NonNull 필드와, final필드를 매개변수로 하는 생성자를 생성해 준다..
@Data // 가장 많이 사용하는 어노테이션
@Builder//AllArgsConstructor 과 비슷하게 객체를 생성해 주고 값을 주입받지만, Builder을 형식을 가지고 받는다.

public class User extends Object{
    //Getter와 Setter를 만들어 주어야 된다.
    //방법 1 : 직접 코딩
    //방법2 : 우클릭 -> Gererate -> Getter and Setter 선택
    //방법3 ㅣ @Getter , @Setter 를 선언
    
    //클래스에 범위를 지정할 수도 있고, 필드에 지정할수도 있다.
    //@Getter
    //@Setter
    //Compile시 해당 어노테이션을 읽어 Getter와 Setter를 생성해 준다
    @NonNull
    private String name;
    @NonNull//이메일과 이름은 필수값이 된다.
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;
    /*
    @Override
    public String toString(){
        //Object의 toString을 오버라이딩 하기 때문에 오류가 안뜬다.
        return getClass().getName()
            + " : "
            + "name = " + name
            + ", email = " + email
            + ", createAt = " + createAt
            + ", updateAt = " + updateAt;
        //필드가 추가가 되면 계속 수정을 해줘야된다.
    }
    */
    //@Equals, HashCode 는 @EqualsAndHashCode 어노테이션으로 생성한다


}
