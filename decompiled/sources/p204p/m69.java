package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class m69 {

    /* JADX INFO: renamed from: a */
    public static final m69 f140424a;

    /* JADX INFO: renamed from: b */
    public static final m69 f140425b;

    /* JADX INFO: renamed from: c */
    public static final m69 f140426c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ m69[] f140427d;

    static {
        m69 m69Var = new m69("NONE", 0);
        f140424a = m69Var;
        m69 m69Var2 = new m69("TRANSFER", 1);
        f140425b = m69Var2;
        m69 m69Var3 = new m69("GO_TO_APP", 2);
        f140426c = m69Var3;
        f140427d = new m69[]{m69Var, m69Var2, m69Var3};
    }

    public static m69 valueOf(String str) {
        return (m69) Enum.valueOf(m69.class, str);
    }

    public static m69[] values() {
        return (m69[]) f140427d.clone();
    }
}
