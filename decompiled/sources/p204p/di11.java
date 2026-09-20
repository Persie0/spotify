package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class di11 {

    /* JADX INFO: renamed from: a */
    public static final di11 f49204a;

    /* JADX INFO: renamed from: b */
    public static final di11 f49205b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ di11[] f49206c;

    static {
        di11 di11Var = new di11("VolumeSlider", 0);
        f49204a = di11Var;
        di11 di11Var2 = new di11("JamToggle", 1);
        f49205b = di11Var2;
        f49206c = new di11[]{di11Var, di11Var2};
    }

    public static di11 valueOf(String str) {
        return (di11) Enum.valueOf(di11.class, str);
    }

    public static di11[] values() {
        return (di11[]) f49206c.clone();
    }
}
