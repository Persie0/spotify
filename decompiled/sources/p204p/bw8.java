package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bw8 {

    /* JADX INFO: renamed from: a */
    public static final bw8 f31577a;

    /* JADX INFO: renamed from: b */
    public static final bw8 f31578b;

    /* JADX INFO: renamed from: c */
    public static final bw8 f31579c;

    /* JADX INFO: renamed from: d */
    public static final bw8 f31580d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ bw8[] f31581e;

    static {
        bw8 bw8Var = new bw8("QUEUED", 0);
        f31577a = bw8Var;
        bw8 bw8Var2 = new bw8("PRESENTED", 1);
        f31578b = bw8Var2;
        bw8 bw8Var3 = new bw8("DISMISSED", 2);
        f31579c = bw8Var3;
        bw8 bw8Var4 = new bw8("CANCELLED", 3);
        f31580d = bw8Var4;
        f31581e = new bw8[]{bw8Var, bw8Var2, bw8Var3, bw8Var4};
    }

    public static bw8 valueOf(String str) {
        return (bw8) Enum.valueOf(bw8.class, str);
    }

    public static bw8[] values() {
        return (bw8[]) f31581e.clone();
    }
}
