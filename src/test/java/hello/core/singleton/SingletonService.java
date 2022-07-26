package hello.core.singleton;

public class SingletonService {

    // 1. static 영역에 객체를 딱 1개만 생성해둔다.
    // 자기자신의 의미로 instance 이름으로 많이 사용한다.
    // 자기자신을 내부 private으로 1개를 가지는데 static이므로 클래스 레벨에서는 1개만 존재
    private static final SingletonService instance = new SingletonService();

    // 2. public으로 열어서 객체 인스터스가 필요하면 이 static 메서드를 통해서만 조회하도록 허용한다.
    public static SingletonService getInstance() {
        return instance;
    }

    // 3. 생성자를 private으로 선언해서 외부에서 new 키워드를 사용한 객체 생성을 못하게 막는다.
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
