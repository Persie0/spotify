package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class aqk0 {

    /* JADX INFO: renamed from: a */
    public static final aqk0 f18268a;

    /* JADX INFO: renamed from: b */
    public static final aqk0 f18269b;

    /* JADX INFO: renamed from: c */
    public static final aqk0 f18270c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ aqk0[] f18271d;

    static {
        aqk0 aqk0Var = new aqk0("NO_OP", 0);
        f18268a = aqk0Var;
        aqk0 aqk0Var2 = new aqk0("ADD", 1);
        f18269b = aqk0Var2;
        aqk0 aqk0Var3 = new aqk0("REMOVE", 2);
        f18270c = aqk0Var3;
        f18271d = new aqk0[]{aqk0Var, aqk0Var2, aqk0Var3};
    }

    public static aqk0 valueOf(String str) {
        return (aqk0) Enum.valueOf(aqk0.class, str);
    }

    public static aqk0[] values() {
        return (aqk0[]) f18271d.clone();
    }
}
