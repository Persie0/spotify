package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sg5 {

    /* JADX INFO: renamed from: a */
    public static final sg5 f208720a;

    /* JADX INFO: renamed from: b */
    public static final sg5 f208721b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ sg5[] f208722c;

    static {
        sg5 sg5Var = new sg5("FOREGROUND", 0);
        f208720a = sg5Var;
        sg5 sg5Var2 = new sg5("BACKGROUND", 1);
        f208721b = sg5Var2;
        f208722c = new sg5[]{sg5Var, sg5Var2};
    }

    public static sg5 valueOf(String str) {
        return (sg5) Enum.valueOf(sg5.class, str);
    }

    public static sg5[] values() {
        return (sg5[]) f208722c.clone();
    }
}
