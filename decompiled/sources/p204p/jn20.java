package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jn20 {

    /* JADX INFO: renamed from: a */
    public static final jn20 f113989a;

    /* JADX INFO: renamed from: b */
    public static final jn20 f113990b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ jn20[] f113991c;

    static {
        jn20 jn20Var = new jn20("CLOSE", 0);
        f113989a = jn20Var;
        jn20 jn20Var2 = new jn20("BACK", 1);
        f113990b = jn20Var2;
        f113991c = new jn20[]{jn20Var, jn20Var2};
    }

    public static jn20 valueOf(String str) {
        return (jn20) Enum.valueOf(jn20.class, str);
    }

    public static jn20[] values() {
        return (jn20[]) f113991c.clone();
    }
}
