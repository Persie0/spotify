package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@rtz0
public final class l0u0 {
    public static final k0u0 Companion;

    /* JADX INFO: renamed from: a */
    public static final Object f128513a;

    /* JADX INFO: renamed from: b */
    public static final l0u0 f128514b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ l0u0[] f128515c;

    static {
        l0u0 l0u0Var = new l0u0("UNSPECIFIED", 0);
        f128514b = l0u0Var;
        f128515c = new l0u0[]{l0u0Var, new l0u0("RECURRENT", 1), new l0u0("TOP_UP", 2)};
        Companion = new k0u0();
        f128513a = q3d0.m72078I(2, o5t0.f162066O0);
    }

    public static l0u0 valueOf(String str) {
        return (l0u0) Enum.valueOf(l0u0.class, str);
    }

    public static l0u0[] values() {
        return (l0u0[]) f128515c.clone();
    }
}
