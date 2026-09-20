package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class lla1 {

    /* JADX INFO: renamed from: a */
    public static final lla1 f134599a;

    /* JADX INFO: renamed from: b */
    public static final lla1 f134600b;

    /* JADX INFO: renamed from: c */
    public static final lla1 f134601c;

    /* JADX INFO: renamed from: d */
    public static final lla1 f134602d;

    /* JADX INFO: renamed from: e */
    public static final lla1 f134603e;

    /* JADX INFO: renamed from: f */
    public static final lla1 f134604f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ lla1[] f134605g;

    static {
        lla1 lla1Var = new lla1("IMAGE_CAPTURE", 0);
        f134599a = lla1Var;
        lla1 lla1Var2 = new lla1("PREVIEW", 1);
        f134600b = lla1Var2;
        lla1 lla1Var3 = new lla1("IMAGE_ANALYSIS", 2);
        f134601c = lla1Var3;
        lla1 lla1Var4 = new lla1("VIDEO_CAPTURE", 3);
        f134602d = lla1Var4;
        lla1 lla1Var5 = new lla1("STREAM_SHARING", 4);
        f134603e = lla1Var5;
        lla1 lla1Var6 = new lla1("METERING_REPEATING", 5);
        f134604f = lla1Var6;
        f134605g = new lla1[]{lla1Var, lla1Var2, lla1Var3, lla1Var4, lla1Var5, lla1Var6};
    }

    public static lla1 valueOf(String str) {
        return (lla1) Enum.valueOf(lla1.class, str);
    }

    public static lla1[] values() {
        return (lla1[]) f134605g.clone();
    }
}
