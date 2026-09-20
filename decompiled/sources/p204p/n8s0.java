package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n8s0 {

    /* JADX INFO: renamed from: a */
    public static final n8s0 f151616a;

    /* JADX INFO: renamed from: b */
    public static final n8s0 f151617b;

    /* JADX INFO: renamed from: c */
    public static final n8s0 f151618c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ n8s0[] f151619d;

    static {
        n8s0 n8s0Var = new n8s0("PASS_THROUGH", 0);
        f151616a = n8s0Var;
        n8s0 n8s0Var2 = new n8s0("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f151617b = n8s0Var2;
        n8s0 n8s0Var3 = new n8s0("DISCARDING", 2);
        f151618c = n8s0Var3;
        f151619d = new n8s0[]{n8s0Var, n8s0Var2, n8s0Var3};
    }

    public static n8s0 valueOf(String str) {
        return (n8s0) Enum.valueOf(n8s0.class, str);
    }

    public static n8s0[] values() {
        return (n8s0[]) f151619d.clone();
    }
}
