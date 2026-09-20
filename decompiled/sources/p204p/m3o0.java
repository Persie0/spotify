package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class m3o0 {

    /* JADX INFO: renamed from: a */
    public static final m3o0 f139688a;

    /* JADX INFO: renamed from: b */
    public static final m3o0 f139689b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ m3o0[] f139690c;

    static {
        m3o0 m3o0Var = new m3o0("TogglePiPSetting", 0);
        f139688a = m3o0Var;
        m3o0 m3o0Var2 = new m3o0("NavigateToOsPipSetting", 1);
        f139689b = m3o0Var2;
        f139690c = new m3o0[]{m3o0Var, m3o0Var2};
    }

    public static m3o0 valueOf(String str) {
        return (m3o0) Enum.valueOf(m3o0.class, str);
    }

    public static m3o0[] values() {
        return (m3o0[]) f139690c.clone();
    }
}
