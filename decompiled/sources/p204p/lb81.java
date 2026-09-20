package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class lb81 {

    /* JADX INFO: renamed from: a */
    public static final lb81 f131600a;

    /* JADX INFO: renamed from: b */
    public static final lb81 f131601b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ lb81[] f131602c;

    static {
        lb81 lb81Var = new lb81("TRACK_A", 0);
        f131600a = lb81Var;
        lb81 lb81Var2 = new lb81("TRACK_B", 1);
        f131601b = lb81Var2;
        f131602c = new lb81[]{lb81Var, lb81Var2};
    }

    public static lb81 valueOf(String str) {
        return (lb81) Enum.valueOf(lb81.class, str);
    }

    public static lb81[] values() {
        return (lb81[]) f131602c.clone();
    }
}
