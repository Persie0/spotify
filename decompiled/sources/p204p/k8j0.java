package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class k8j0 {

    /* JADX INFO: renamed from: a */
    public static final k8j0 f120376a;

    /* JADX INFO: renamed from: b */
    public static final k8j0 f120377b;

    /* JADX INFO: renamed from: c */
    public static final k8j0 f120378c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ k8j0[] f120379d;

    static {
        k8j0 k8j0Var = new k8j0("MANAGED_SUB", 0);
        f120376a = k8j0Var;
        k8j0 k8j0Var2 = new k8j0("REGULAR_SUB", 1);
        f120377b = k8j0Var2;
        k8j0 k8j0Var3 = new k8j0("LEGACY", 2);
        f120378c = k8j0Var3;
        f120379d = new k8j0[]{k8j0Var, k8j0Var2, k8j0Var3};
    }

    public static k8j0 valueOf(String str) {
        return (k8j0) Enum.valueOf(k8j0.class, str);
    }

    public static k8j0[] values() {
        return (k8j0[]) f120379d.clone();
    }
}
