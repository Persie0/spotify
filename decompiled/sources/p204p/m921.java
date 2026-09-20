package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class m921 {

    /* JADX INFO: renamed from: a */
    public static final m921 f141199a;

    /* JADX INFO: renamed from: b */
    public static final m921 f141200b;

    /* JADX INFO: renamed from: c */
    public static final m921 f141201c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ m921[] f141202d;

    static {
        m921 m921Var = new m921("TEXT", 0);
        f141199a = m921Var;
        m921 m921Var2 = new m921("SUGGESTED", 1);
        f141200b = m921Var2;
        m921 m921Var3 = new m921("VOICE", 2);
        f141201c = m921Var3;
        f141202d = new m921[]{m921Var, m921Var2, m921Var3};
    }

    public static m921 valueOf(String str) {
        return (m921) Enum.valueOf(m921.class, str);
    }

    public static m921[] values() {
        return (m921[]) f141202d.clone();
    }
}
