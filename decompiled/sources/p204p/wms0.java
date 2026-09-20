package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@rtz0
public final class wms0 {
    public static final tms0 Companion;

    /* JADX INFO: renamed from: a */
    public static final Object f252972a;

    /* JADX INFO: renamed from: b */
    public static final wms0 f252973b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ wms0[] f252974c;

    static {
        wms0 wms0Var = new wms0("Foundational", 0);
        f252973b = wms0Var;
        f252974c = new wms0[]{wms0Var, new wms0("Rule", 1)};
        Companion = new tms0();
        f252972a = q3d0.m72078I(2, mwq0.f147848P0);
    }

    public static wms0 valueOf(String str) {
        return (wms0) Enum.valueOf(wms0.class, str);
    }

    public static wms0[] values() {
        return (wms0[]) f252974c.clone();
    }
}
