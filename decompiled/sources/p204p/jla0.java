package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class jla0 {

    /* JADX INFO: renamed from: a */
    public static final jla0 f113561a;

    /* JADX INFO: renamed from: b */
    public static final jla0 f113562b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ jla0[] f113563c;

    static {
        jla0 jla0Var = new jla0("RowClicked", 0);
        f113561a = jla0Var;
        jla0 jla0Var2 = new jla0("RemoveClicked", 1);
        f113562b = jla0Var2;
        f113563c = new jla0[]{jla0Var, jla0Var2};
    }

    public static jla0 valueOf(String str) {
        return (jla0) Enum.valueOf(jla0.class, str);
    }

    public static jla0[] values() {
        return (jla0[]) f113563c.clone();
    }
}
