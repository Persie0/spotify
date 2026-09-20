package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class tvz0 {

    /* JADX INFO: renamed from: a */
    public static final tvz0 f224279a;

    /* JADX INFO: renamed from: b */
    public static final tvz0 f224280b;

    /* JADX INFO: renamed from: c */
    public static final tvz0 f224281c;

    /* JADX INFO: renamed from: d */
    public static final tvz0 f224282d;

    /* JADX INFO: renamed from: e */
    public static final tvz0 f224283e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ tvz0[] f224284f;

    static {
        tvz0 tvz0Var = new tvz0("SDK_INIT_WAIT_LOCK", 0);
        f224279a = tvz0Var;
        tvz0 tvz0Var2 = new tvz0("GAID_FETCH_WAIT_LOCK", 1);
        f224280b = tvz0Var2;
        tvz0 tvz0Var3 = new tvz0("INTENT_PENDING_WAIT_LOCK", 2);
        f224281c = tvz0Var3;
        tvz0 tvz0Var4 = new tvz0("USER_SET_WAIT_LOCK", 3);
        tvz0 tvz0Var5 = new tvz0("INSTALL_REFERRER_FETCH_WAIT_LOCK", 4);
        f224282d = tvz0Var5;
        tvz0 tvz0Var6 = new tvz0("USER_AGENT_STRING_LOCK", 5);
        f224283e = tvz0Var6;
        f224284f = new tvz0[]{tvz0Var, tvz0Var2, tvz0Var3, tvz0Var4, tvz0Var5, tvz0Var6};
    }

    public static tvz0 valueOf(String str) {
        return (tvz0) Enum.valueOf(tvz0.class, str);
    }

    public static tvz0[] values() {
        return (tvz0[]) f224284f.clone();
    }
}
