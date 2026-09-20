package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class b4s0 {

    /* JADX INFO: renamed from: a */
    public static final b4s0 f23407a;

    /* JADX INFO: renamed from: b */
    public static final b4s0 f23408b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ b4s0[] f23409c;

    static {
        b4s0 b4s0Var = new b4s0("THUMB", 0);
        f23407a = b4s0Var;
        b4s0 b4s0Var2 = new b4s0("TRACK", 1);
        f23408b = b4s0Var2;
        f23409c = new b4s0[]{b4s0Var, b4s0Var2};
    }

    public static b4s0 valueOf(String str) {
        return (b4s0) Enum.valueOf(b4s0.class, str);
    }

    public static b4s0[] values() {
        return (b4s0[]) f23409c.clone();
    }
}
