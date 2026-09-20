package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class j0u0 {

    /* JADX INFO: renamed from: a */
    public static final j0u0 f107557a;

    /* JADX INFO: renamed from: b */
    public static final j0u0 f107558b;

    /* JADX INFO: renamed from: c */
    public static final j0u0 f107559c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ j0u0[] f107560d;

    static {
        j0u0 j0u0Var = new j0u0("NO_QUOTA_DATA", 0);
        f107557a = j0u0Var;
        j0u0 j0u0Var2 = new j0u0("HAS_REMAINING_QUOTA", 1);
        f107558b = j0u0Var2;
        j0u0 j0u0Var3 = new j0u0("QUOTA_FULLY_CONSUMED", 2);
        f107559c = j0u0Var3;
        f107560d = new j0u0[]{j0u0Var, j0u0Var2, j0u0Var3};
    }

    public static j0u0 valueOf(String str) {
        return (j0u0) Enum.valueOf(j0u0.class, str);
    }

    public static j0u0[] values() {
        return (j0u0[]) f107560d.clone();
    }
}
