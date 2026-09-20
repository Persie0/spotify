package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class pv1 {

    /* JADX INFO: renamed from: a */
    public static final pv1 f181559a;

    /* JADX INFO: renamed from: b */
    public static final pv1 f181560b;

    /* JADX INFO: renamed from: c */
    public static final pv1 f181561c;

    /* JADX INFO: renamed from: d */
    public static final pv1 f181562d;

    /* JADX INFO: renamed from: e */
    public static final pv1 f181563e;

    /* JADX INFO: renamed from: f */
    public static final pv1 f181564f;

    /* JADX INFO: renamed from: g */
    public static final pv1 f181565g;

    /* JADX INFO: renamed from: h */
    public static final pv1 f181566h;

    /* JADX INFO: renamed from: i */
    public static final pv1 f181567i;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ pv1[] f181568t;

    static {
        pv1 pv1Var = new pv1("UNKNOWN", 0);
        f181559a = pv1Var;
        pv1 pv1Var2 = new pv1("MEET_VERSION_UNSUPPORTED", 1);
        f181560b = pv1Var2;
        pv1 pv1Var3 = new pv1("SDK_VERSION_UNSUPPORTED", 2);
        f181561c = pv1Var3;
        pv1 pv1Var4 = new pv1("PARTICIPANT_INELIGIBLE", 3);
        f181562d = pv1Var4;
        pv1 pv1Var5 = new pv1("ADDON_SESSION_IN_PROGRESS_WITH_DIFFERENT_APPLICATION", 4);
        f181563e = pv1Var5;
        pv1 pv1Var6 = new pv1("SECURITY_POLICY_EXCEPTION", 5);
        f181564f = pv1Var6;
        pv1 pv1Var7 = new pv1("OPERATION_UNSUPPORTED", 6);
        f181565g = pv1Var7;
        pv1 pv1Var8 = new pv1("ONGOING_RECORDING", 7);
        f181566h = pv1Var8;
        pv1 pv1Var9 = new pv1("ADDON_NOT_INSTALLED", 8);
        f181567i = pv1Var9;
        f181568t = new pv1[]{pv1Var, pv1Var2, pv1Var3, pv1Var4, pv1Var5, pv1Var6, pv1Var7, pv1Var8, pv1Var9};
    }

    public static pv1 valueOf(String str) {
        return (pv1) Enum.valueOf(pv1.class, str);
    }

    public static pv1[] values() {
        return (pv1[]) f181568t.clone();
    }
}
