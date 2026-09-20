package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class yg11 {

    /* JADX INFO: renamed from: a */
    public static final yg11 f272450a;

    /* JADX INFO: renamed from: b */
    public static final yg11 f272451b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ yg11[] f272452c;

    static {
        yg11 yg11Var = new yg11("CardClicked", 0);
        f272450a = yg11Var;
        yg11 yg11Var2 = new yg11("CardLongClicked", 1);
        f272451b = yg11Var2;
        f272452c = new yg11[]{yg11Var, yg11Var2};
    }

    public static yg11 valueOf(String str) {
        return (yg11) Enum.valueOf(yg11.class, str);
    }

    public static yg11[] values() {
        return (yg11[]) f272452c.clone();
    }
}
