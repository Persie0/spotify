package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class i9d0 {

    /* JADX INFO: renamed from: a */
    public static final i9d0 f99989a;

    /* JADX INFO: renamed from: b */
    public static final i9d0 f99990b;

    /* JADX INFO: renamed from: c */
    public static final i9d0 f99991c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ i9d0[] f99992d;

    static {
        i9d0 i9d0Var = new i9d0("INTEGRATION_UNAUTHORIZED", 0);
        f99989a = i9d0Var;
        i9d0 i9d0Var2 = new i9d0("BAD_REQUEST", 1);
        f99990b = i9d0Var2;
        i9d0 i9d0Var3 = new i9d0("INTERNAL_ERROR", 2);
        f99991c = i9d0Var3;
        f99992d = new i9d0[]{i9d0Var, i9d0Var2, i9d0Var3};
    }

    public static i9d0 valueOf(String str) {
        return (i9d0) Enum.valueOf(i9d0.class, str);
    }

    public static i9d0[] values() {
        return (i9d0[]) f99992d.clone();
    }
}
