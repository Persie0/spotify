package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class ex51 {
    public static final dx51 Companion;

    /* JADX INFO: renamed from: a */
    public static final Object f63674a;

    /* JADX INFO: renamed from: b */
    public static final ex51 f63675b;

    /* JADX INFO: renamed from: c */
    public static final ex51 f63676c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ex51[] f63677d;

    static {
        ex51 ex51Var = new ex51("ORIGINAL", 0);
        f63675b = ex51Var;
        ex51 ex51Var2 = new ex51("TRANSLATION", 1);
        f63676c = ex51Var2;
        f63677d = new ex51[]{ex51Var, ex51Var2};
        Companion = new dx51();
        f63674a = q3d0.m72078I(2, uv51.f234367d);
    }

    public static ex51 valueOf(String str) {
        return (ex51) Enum.valueOf(ex51.class, str);
    }

    public static ex51[] values() {
        return (ex51[]) f63677d.clone();
    }
}
