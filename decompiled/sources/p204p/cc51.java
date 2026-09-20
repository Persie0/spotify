package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class cc51 {

    /* JADX INFO: renamed from: a */
    public static final cc51 f36316a;

    /* JADX INFO: renamed from: b */
    public static final cc51 f36317b;

    /* JADX INFO: renamed from: c */
    public static final cc51 f36318c;

    /* JADX INFO: renamed from: d */
    public static final cc51 f36319d;

    /* JADX INFO: renamed from: e */
    public static final cc51 f36320e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ cc51[] f36321f;

    static {
        cc51 cc51Var = new cc51("SCREEN_PRESS", 0);
        f36316a = cc51Var;
        cc51 cc51Var2 = new cc51("SCREEN_PRESS_RELEASE", 1);
        f36317b = cc51Var2;
        cc51 cc51Var3 = new cc51("LEFT_CLICK", 2);
        f36318c = cc51Var3;
        cc51 cc51Var4 = new cc51("RIGHT_CLICK", 3);
        f36319d = cc51Var4;
        cc51 cc51Var5 = new cc51("SWIPE_TOP_DOWN", 4);
        f36320e = cc51Var5;
        f36321f = new cc51[]{cc51Var, cc51Var2, cc51Var3, cc51Var4, cc51Var5};
    }

    public static cc51 valueOf(String str) {
        return (cc51) Enum.valueOf(cc51.class, str);
    }

    public static cc51[] values() {
        return (cc51[]) f36321f.clone();
    }
}
