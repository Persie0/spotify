package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class ep3 {
    public static final dp3 Companion;

    /* JADX INFO: renamed from: a */
    public static final Object f61537a;

    /* JADX INFO: renamed from: b */
    public static final ep3 f61538b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ep3[] f61539c;

    static {
        ep3 ep3Var = new ep3("AIRPODS", 0);
        f61538b = ep3Var;
        f61539c = new ep3[]{ep3Var, new ep3("OTHER", 1)};
        Companion = new dp3();
        f61537a = q3d0.m72078I(2, l12.f128568M0);
    }

    public static ep3 valueOf(String str) {
        return (ep3) Enum.valueOf(ep3.class, str);
    }

    public static ep3[] values() {
        return (ep3[]) f61539c.clone();
    }
}
