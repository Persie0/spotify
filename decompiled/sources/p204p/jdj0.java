package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class jdj0 {

    /* JADX INFO: renamed from: a */
    public static final jdj0 f111361a;

    /* JADX INFO: renamed from: b */
    public static final jdj0 f111362b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ jdj0[] f111363c;

    static {
        jdj0 jdj0Var = new jdj0("PermissionRequested", 0);
        f111361a = jdj0Var;
        jdj0 jdj0Var2 = new jdj0("NavigatedToSettings", 1);
        f111362b = jdj0Var2;
        f111363c = new jdj0[]{jdj0Var, jdj0Var2};
    }

    public static jdj0 valueOf(String str) {
        return (jdj0) Enum.valueOf(jdj0.class, str);
    }

    public static jdj0[] values() {
        return (jdj0[]) f111363c.clone();
    }
}
