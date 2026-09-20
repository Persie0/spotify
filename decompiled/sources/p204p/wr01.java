package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class wr01 {

    /* JADX INFO: renamed from: a */
    public static final wr01 f254234a;

    /* JADX INFO: renamed from: b */
    public static final wr01 f254235b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ wr01[] f254236c;

    static {
        wr01 wr01Var = new wr01("UNKNOWN", 0);
        f254234a = wr01Var;
        wr01 wr01Var2 = new wr01("UGC", 1);
        f254235b = wr01Var2;
        f254236c = new wr01[]{wr01Var, wr01Var2};
    }

    public static wr01 valueOf(String str) {
        return (wr01) Enum.valueOf(wr01.class, str);
    }

    public static wr01[] values() {
        return (wr01[]) f254236c.clone();
    }
}
