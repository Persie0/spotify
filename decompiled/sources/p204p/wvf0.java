package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class wvf0 {

    /* JADX INFO: renamed from: a */
    public static final wvf0 f255488a;

    /* JADX INFO: renamed from: b */
    public static final wvf0 f255489b;

    /* JADX INFO: renamed from: c */
    public static final wvf0 f255490c;

    /* JADX INFO: renamed from: d */
    public static final wvf0 f255491d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ wvf0[] f255492e;

    static {
        wvf0 wvf0Var = new wvf0("OnPauseClicked", 0);
        f255488a = wvf0Var;
        wvf0 wvf0Var2 = new wvf0("OnResumeClicked", 1);
        f255489b = wvf0Var2;
        wvf0 wvf0Var3 = new wvf0("OnPlayLinearClicked", 2);
        f255490c = wvf0Var3;
        wvf0 wvf0Var4 = new wvf0("OnPlayShuffleClicked", 3);
        f255491d = wvf0Var4;
        f255492e = new wvf0[]{wvf0Var, wvf0Var2, wvf0Var3, wvf0Var4};
    }

    public static wvf0 valueOf(String str) {
        return (wvf0) Enum.valueOf(wvf0.class, str);
    }

    public static wvf0[] values() {
        return (wvf0[]) f255492e.clone();
    }
}
