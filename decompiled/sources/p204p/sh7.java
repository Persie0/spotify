package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sh7 {

    /* JADX INFO: renamed from: L0 */
    public static final sh7 f209119L0;

    /* JADX INFO: renamed from: M0 */
    public static final sh7 f209120M0;

    /* JADX INFO: renamed from: N0 */
    public static final sh7 f209121N0;

    /* JADX INFO: renamed from: O0 */
    public static final /* synthetic */ sh7[] f209122O0;

    /* JADX INFO: renamed from: X */
    public static final sh7 f209123X;

    /* JADX INFO: renamed from: Y */
    public static final sh7 f209124Y;

    /* JADX INFO: renamed from: Z */
    public static final sh7 f209125Z;

    /* JADX INFO: renamed from: a */
    public static final sh7 f209126a;

    /* JADX INFO: renamed from: b */
    public static final sh7 f209127b;

    /* JADX INFO: renamed from: c */
    public static final sh7 f209128c;

    /* JADX INFO: renamed from: d */
    public static final sh7 f209129d;

    /* JADX INFO: renamed from: e */
    public static final sh7 f209130e;

    /* JADX INFO: renamed from: f */
    public static final sh7 f209131f;

    /* JADX INFO: renamed from: g */
    public static final sh7 f209132g;

    /* JADX INFO: renamed from: h */
    public static final sh7 f209133h;

    /* JADX INFO: renamed from: i */
    public static final sh7 f209134i;

    /* JADX INFO: renamed from: t */
    public static final sh7 f209135t;

    static {
        sh7 sh7Var = new sh7("UNDEFINED", 0);
        f209126a = sh7Var;
        sh7 sh7Var2 = new sh7("ATTEMPTING_AUTOLOGIN", 1);
        f209127b = sh7Var2;
        sh7 sh7Var3 = new sh7("NOT_LOGGED_IN", 2);
        f209128c = sh7Var3;
        sh7 sh7Var4 = new sh7("USER_INITIATED", 3);
        f209129d = sh7Var4;
        sh7 sh7Var5 = new sh7("FORCED_LOGOUT", 4);
        f209130e = sh7Var5;
        sh7 sh7Var6 = new sh7("REMOTE_LOGOUT", 5);
        f209131f = sh7Var6;
        sh7 sh7Var7 = new sh7("BOOTSTRAP_FAILURE", 6);
        f209132g = sh7Var7;
        sh7 sh7Var8 = new sh7("APP_SHUTDOWN", 7);
        f209133h = sh7Var8;
        sh7 sh7Var9 = new sh7("ABROAD_SINCE", 8);
        f209134i = sh7Var9;
        sh7 sh7Var10 = new sh7("ACCOUNT_SWITCHING", 9);
        f209135t = sh7Var10;
        sh7 sh7Var11 = new sh7("ADDING_ACCOUNT_SWITCHING_ACCOUNT", 10);
        f209123X = sh7Var11;
        sh7 sh7Var12 = new sh7("LOGGING_IN_TO_ACCOUNT_SWITCHING_ACCOUNT", 11);
        f209124Y = sh7Var12;
        sh7 sh7Var13 = new sh7("LOGIN_TAKEOVER", 12);
        f209125Z = sh7Var13;
        sh7 sh7Var14 = new sh7("USER_GRADUATION", 13);
        f209119L0 = sh7Var14;
        sh7 sh7Var15 = new sh7("AGE_SIGNAL_BLOCKED", 14);
        f209120M0 = sh7Var15;
        sh7 sh7Var16 = new sh7("CHILD_INITIATED_TRANSITION_FALLBACK", 15);
        f209121N0 = sh7Var16;
        f209122O0 = new sh7[]{sh7Var, sh7Var2, sh7Var3, sh7Var4, sh7Var5, sh7Var6, sh7Var7, sh7Var8, sh7Var9, sh7Var10, sh7Var11, sh7Var12, sh7Var13, sh7Var14, sh7Var15, sh7Var16};
    }

    public static sh7 valueOf(String str) {
        return (sh7) Enum.valueOf(sh7.class, str);
    }

    public static sh7[] values() {
        return (sh7[]) f209122O0.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m78128a() {
        return this == f209129d || this == f209135t || this == f209123X || this == f209124Y || this == f209125Z || this == f209130e || this == f209134i || this == f209131f || this == f209119L0 || this == f209120M0 || this == f209121N0;
    }
}
