package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class z6w0 {

    /* JADX INFO: renamed from: a */
    public static final z6w0 f280009a;

    /* JADX INFO: renamed from: b */
    public static final z6w0 f280010b;

    /* JADX INFO: renamed from: c */
    public static final z6w0 f280011c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ z6w0[] f280012d;

    static {
        z6w0 z6w0Var = new z6w0("UNKNOWN", 0);
        f280009a = z6w0Var;
        z6w0 z6w0Var2 = new z6w0("LATEST_RELEASE", 1);
        f280010b = z6w0Var2;
        z6w0 z6w0Var3 = new z6w0("PRE_RELEASE", 2);
        f280011c = z6w0Var3;
        f280012d = new z6w0[]{z6w0Var, z6w0Var2, z6w0Var3};
    }

    public static z6w0 valueOf(String str) {
        return (z6w0) Enum.valueOf(z6w0.class, str);
    }

    public static z6w0[] values() {
        return (z6w0[]) f280012d.clone();
    }
}
