package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class m43 {

    /* JADX INFO: renamed from: a */
    public static final m43 f139797a;

    /* JADX INFO: renamed from: b */
    public static final m43 f139798b;

    /* JADX INFO: renamed from: c */
    public static final m43 f139799c;

    /* JADX INFO: renamed from: d */
    public static final m43 f139800d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ m43[] f139801e;

    static {
        m43 m43Var = new m43("CardClicked", 0);
        f139797a = m43Var;
        m43 m43Var2 = new m43("PresaveButtonClicked", 1);
        f139798b = m43Var2;
        m43 m43Var3 = new m43("PlayButtonClicked", 2);
        f139799c = m43Var3;
        m43 m43Var4 = new m43("ShareButtonClicked", 3);
        f139800d = m43Var4;
        f139801e = new m43[]{m43Var, m43Var2, m43Var3, m43Var4};
    }

    public static m43 valueOf(String str) {
        return (m43) Enum.valueOf(m43.class, str);
    }

    public static m43[] values() {
        return (m43[]) f139801e.clone();
    }
}
