package lec10.abtractExample;

import org.jetbrains.annotations.NotNull;

public class JavaPenguin extends JavaAnimal {
    private final int wingCount;

    public JavaPenguin(@NotNull String species) {
        super(species, 2);
        this.wingCount = 2;
    }

    @Override
    public void move() {
        System.out.println("펭귄이 움직입니다.~ 꿱꿱");
    }

    @Override
    public int getLegCount() {
        return super.legCount + this.wingCount;
    }
}
