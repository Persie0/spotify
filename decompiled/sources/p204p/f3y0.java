package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class f3y0 {

    /* JADX INFO: renamed from: a */
    public static final f3y0 f65612a;

    /* JADX INFO: renamed from: b */
    public static final f3y0 f65613b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ f3y0[] f65614c;

    static {
        f3y0 f3y0Var = new f3y0("SPOTIFY_OPENING", 0);
        f65612a = f3y0Var;
        f3y0 f3y0Var2 = new f3y0("SAMSUNG_DEVICE_DETECTED", 1);
        f65613b = f3y0Var2;
        f65614c = new f3y0[]{f3y0Var, f3y0Var2};
    }

    public static f3y0 valueOf(String str) {
        return (f3y0) Enum.valueOf(f3y0.class, str);
    }

    public static f3y0[] values() {
        return (f3y0[]) f65614c.clone();
    }
}
