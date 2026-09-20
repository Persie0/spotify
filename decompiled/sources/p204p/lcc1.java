package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class lcc1 {

    /* JADX INFO: renamed from: a */
    public static final lcc1 f131897a;

    /* JADX INFO: renamed from: b */
    public static final lcc1 f131898b;

    /* JADX INFO: renamed from: c */
    public static final lcc1 f131899c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ lcc1[] f131900d;

    static {
        lcc1 lcc1Var = new lcc1("MUSIC_VIDEO", 0);
        f131897a = lcc1Var;
        lcc1 lcc1Var2 = new lcc1("CANVAS", 1);
        f131898b = lcc1Var2;
        lcc1 lcc1Var3 = new lcc1("OTHER_VIDEO", 2);
        f131899c = lcc1Var3;
        f131900d = new lcc1[]{lcc1Var, lcc1Var2, lcc1Var3};
    }

    public static lcc1 valueOf(String str) {
        return (lcc1) Enum.valueOf(lcc1.class, str);
    }

    public static lcc1[] values() {
        return (lcc1[]) f131900d.clone();
    }
}
