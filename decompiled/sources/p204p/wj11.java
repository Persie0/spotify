package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class wj11 {

    /* JADX INFO: renamed from: a */
    public static final wj11 f251827a;

    /* JADX INFO: renamed from: b */
    public static final wj11 f251828b;

    /* JADX INFO: renamed from: c */
    public static final wj11 f251829c;

    /* JADX INFO: renamed from: d */
    public static final wj11 f251830d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ wj11[] f251831e;

    static {
        wj11 wj11Var = new wj11("MIXED", 0);
        f251827a = wj11Var;
        wj11 wj11Var2 = new wj11("AUDIO", 1);
        f251828b = wj11Var2;
        wj11 wj11Var3 = new wj11("VIDEO", 2);
        f251829c = wj11Var3;
        wj11 wj11Var4 = new wj11("UNKNOWN", 3);
        f251830d = wj11Var4;
        f251831e = new wj11[]{wj11Var, wj11Var2, wj11Var3, wj11Var4};
        values();
    }

    public static wj11 valueOf(String str) {
        return (wj11) Enum.valueOf(wj11.class, str);
    }

    public static wj11[] values() {
        return (wj11[]) f251831e.clone();
    }
}
