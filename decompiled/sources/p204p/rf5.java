package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class rf5 {

    /* JADX INFO: renamed from: X */
    public static final rf5 f198513X;

    /* JADX INFO: renamed from: Y */
    public static final /* synthetic */ rf5[] f198514Y;

    /* JADX INFO: renamed from: a */
    public static final rf5 f198515a;

    /* JADX INFO: renamed from: b */
    public static final rf5 f198516b;

    /* JADX INFO: renamed from: c */
    public static final rf5 f198517c;

    /* JADX INFO: renamed from: d */
    public static final rf5 f198518d;

    /* JADX INFO: renamed from: e */
    public static final rf5 f198519e;

    /* JADX INFO: renamed from: f */
    public static final rf5 f198520f;

    /* JADX INFO: renamed from: g */
    public static final rf5 f198521g;

    /* JADX INFO: renamed from: h */
    public static final rf5 f198522h;

    /* JADX INFO: renamed from: i */
    public static final rf5 f198523i;

    /* JADX INFO: renamed from: t */
    public static final rf5 f198524t;

    static {
        rf5 rf5Var = new rf5("INVALID_PIN_FORMAT", 0);
        f198515a = rf5Var;
        rf5 rf5Var2 = new rf5("HAP_AUTHENTICATION", 1);
        f198516b = rf5Var2;
        rf5 rf5Var3 = new rf5("HAP_BACKOFF", 2);
        f198517c = rf5Var3;
        rf5 rf5Var4 = new rf5("HAP_MAX_PEERS", 3);
        f198518d = rf5Var4;
        rf5 rf5Var5 = new rf5("HAP_MAX_TRIES", 4);
        f198519e = rf5Var5;
        rf5 rf5Var6 = new rf5("HAP_UNAVAILABLE", 5);
        f198520f = rf5Var6;
        rf5 rf5Var7 = new rf5("HAP_BUSY", 6);
        f198521g = rf5Var7;
        rf5 rf5Var8 = new rf5("DEVICE_NOT_RESPONDING", 7);
        f198522h = rf5Var8;
        rf5 rf5Var9 = new rf5("CONNECTION_LOST", 8);
        f198523i = rf5Var9;
        rf5 rf5Var10 = new rf5("TRANSPORT", 9);
        f198524t = rf5Var10;
        rf5 rf5Var11 = new rf5("UNKNOWN", 10);
        f198513X = rf5Var11;
        f198514Y = new rf5[]{rf5Var, rf5Var2, rf5Var3, rf5Var4, rf5Var5, rf5Var6, rf5Var7, rf5Var8, rf5Var9, rf5Var10, rf5Var11};
    }

    public static rf5 valueOf(String str) {
        return (rf5) Enum.valueOf(rf5.class, str);
    }

    public static rf5[] values() {
        return (rf5[]) f198514Y.clone();
    }
}
