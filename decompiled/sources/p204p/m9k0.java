package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class m9k0 {

    /* JADX INFO: renamed from: a */
    public static final m9k0 f141324a;

    /* JADX INFO: renamed from: b */
    public static final m9k0 f141325b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ m9k0[] f141326c;

    static {
        m9k0 m9k0Var = new m9k0("REGULAR", 0);
        f141324a = m9k0Var;
        m9k0 m9k0Var2 = new m9k0("LIVE_ROOM", 1);
        f141325b = m9k0Var2;
        f141326c = new m9k0[]{m9k0Var, m9k0Var2};
    }

    public static m9k0 valueOf(String str) {
        return (m9k0) Enum.valueOf(m9k0.class, str);
    }

    public static m9k0[] values() {
        return (m9k0[]) f141326c.clone();
    }
}
