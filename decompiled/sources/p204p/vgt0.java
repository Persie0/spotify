package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class vgt0 {

    /* JADX INFO: renamed from: a */
    public static final vgt0 f241312a;

    /* JADX INFO: renamed from: b */
    public static final vgt0 f241313b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ vgt0[] f241314c;

    static {
        vgt0 vgt0Var = new vgt0("Utf8", 0);
        f241312a = vgt0Var;
        vgt0 vgt0Var2 = new vgt0("Legacy", 1);
        f241313b = vgt0Var2;
        f241314c = new vgt0[]{vgt0Var, vgt0Var2};
    }

    public static vgt0 valueOf(String str) {
        return (vgt0) Enum.valueOf(vgt0.class, str);
    }

    public static vgt0[] values() {
        return (vgt0[]) f241314c.clone();
    }
}
