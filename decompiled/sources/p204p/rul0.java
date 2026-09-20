package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class rul0 {

    /* JADX INFO: renamed from: a */
    public static final rul0 f202872a;

    /* JADX INFO: renamed from: b */
    public static final rul0 f202873b;

    /* JADX INFO: renamed from: c */
    public static final rul0 f202874c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ rul0[] f202875d;

    static {
        rul0 rul0Var = new rul0("ALARM", 0);
        f202872a = rul0Var;
        rul0 rul0Var2 = new rul0("DEFAULT", 1);
        f202873b = rul0Var2;
        rul0 rul0Var3 = new rul0("UNKNOWN_STREAMTYPE", 2);
        f202874c = rul0Var3;
        f202875d = new rul0[]{rul0Var, rul0Var2, rul0Var3};
    }

    public static rul0 valueOf(String str) {
        return (rul0) Enum.valueOf(rul0.class, str);
    }

    public static rul0[] values() {
        return (rul0[]) f202875d.clone();
    }
}
