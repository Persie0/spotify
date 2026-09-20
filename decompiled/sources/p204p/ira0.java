package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ira0 {

    /* JADX INFO: renamed from: a */
    public static final ira0 f104935a;

    /* JADX INFO: renamed from: b */
    public static final ira0 f104936b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ira0[] f104937c;

    static {
        ira0 ira0Var = new ira0("LOGIN", 0);
        f104935a = ira0Var;
        ira0 ira0Var2 = new ira0("LOGOUT", 1);
        f104936b = ira0Var2;
        f104937c = new ira0[]{ira0Var, ira0Var2};
    }

    public static ira0 valueOf(String str) {
        return (ira0) Enum.valueOf(ira0.class, str);
    }

    public static ira0[] values() {
        return (ira0[]) f104937c.clone();
    }
}
