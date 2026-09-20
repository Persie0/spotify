package p204p;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
public final class zvb0 {

    /* JADX INFO: renamed from: c */
    public static final zvb0 f286671c;

    /* JADX INFO: renamed from: d */
    public static final zvb0 f286672d;

    /* JADX INFO: renamed from: e */
    public static final zvb0 f286673e;

    /* JADX INFO: renamed from: f */
    public static final zvb0 f286674f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ zvb0[] f286675g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ nzv f286676h;

    /* JADX INFO: renamed from: a */
    public final uek0 f286677a;

    /* JADX INFO: renamed from: b */
    public final boolean f286678b;

    static {
        uek0 uek0Var = uek0.f229553a;
        zvb0 zvb0Var = new zvb0("NOW_PLAYING_VIEW_EXPANDED", 0, uek0Var, false);
        f286671c = zvb0Var;
        uek0 uek0Var2 = uek0.f229554b;
        zvb0 zvb0Var2 = new zvb0("NOW_PLAYING_VIEW_COLLAPSED", 1, uek0Var2, false);
        f286672d = zvb0Var2;
        zvb0 zvb0Var3 = new zvb0("NOW_PLAYING_VIEW_EXPANDED_OFF_SCREEN", 2, uek0Var, true);
        f286673e = zvb0Var3;
        zvb0 zvb0Var4 = new zvb0("NOW_PLAYING_VIEW_COLLAPSED_OFF_SCREEN", 3, uek0Var2, true);
        f286674f = zvb0Var4;
        zvb0[] zvb0VarArr = {zvb0Var, zvb0Var2, zvb0Var3, zvb0Var4};
        f286675g = zvb0VarArr;
        f286676h = new nzv(zvb0VarArr);
    }

    public zvb0(String str, int i, uek0 uek0Var, boolean z) {
        super(str, i);
        this.f286677a = uek0Var;
        this.f286678b = z;
    }

    public static zvb0 valueOf(String str) {
        return (zvb0) Enum.valueOf(zvb0.class, str);
    }

    public static zvb0[] values() {
        return (zvb0[]) f286675g.clone();
    }
}
