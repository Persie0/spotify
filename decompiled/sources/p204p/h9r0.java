package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class h9r0 {

    /* JADX INFO: renamed from: a */
    public static final h9r0 f89025a;

    /* JADX INFO: renamed from: b */
    public static final h9r0 f89026b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ h9r0[] f89027c;

    static {
        h9r0 h9r0Var = new h9r0("Play", 0);
        f89025a = h9r0Var;
        h9r0 h9r0Var2 = new h9r0("Stop", 1);
        f89026b = h9r0Var2;
        f89027c = new h9r0[]{h9r0Var, h9r0Var2};
    }

    public static h9r0 valueOf(String str) {
        return (h9r0) Enum.valueOf(h9r0.class, str);
    }

    public static h9r0[] values() {
        return (h9r0[]) f89027c.clone();
    }
}
