package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class dtb1 {

    /* JADX INFO: renamed from: a */
    public static final dtb1 f52759a;

    /* JADX INFO: renamed from: b */
    public static final dtb1 f52760b;

    /* JADX INFO: renamed from: c */
    public static final dtb1 f52761c;

    /* JADX INFO: renamed from: d */
    public static final dtb1 f52762d;

    /* JADX INFO: renamed from: e */
    public static final dtb1 f52763e;

    /* JADX INFO: renamed from: f */
    public static final dtb1 f52764f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ dtb1[] f52765g;

    static {
        dtb1 dtb1Var = new dtb1("DRIVER_DISTRACTION_MODE", 0);
        f52759a = dtb1Var;
        dtb1 dtb1Var2 = new dtb1("VIDEO_PODCAST_DATA_SAVER", 1);
        f52760b = dtb1Var2;
        dtb1 dtb1Var3 = new dtb1("VIDEO_PODCAST_LOCAL_SWITCH", 2);
        f52761c = dtb1Var3;
        dtb1 dtb1Var4 = new dtb1("DISABLED_BY_CONTEXT_PLAYER", 3);
        f52762d = dtb1Var4;
        dtb1 dtb1Var5 = new dtb1("NO_SURFACE_ATTACHED", 4);
        f52763e = dtb1Var5;
        dtb1 dtb1Var6 = new dtb1("PLAYBACK_DEFERRED", 5);
        f52764f = dtb1Var6;
        f52765g = new dtb1[]{dtb1Var, dtb1Var2, dtb1Var3, dtb1Var4, dtb1Var5, dtb1Var6};
    }

    public static dtb1 valueOf(String str) {
        return (dtb1) Enum.valueOf(dtb1.class, str);
    }

    public static dtb1[] values() {
        return (dtb1[]) f52765g.clone();
    }
}
