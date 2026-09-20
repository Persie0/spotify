package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class tgv0 {

    /* JADX INFO: renamed from: a */
    public static final tgv0 f220266a;

    /* JADX INFO: renamed from: b */
    public static final tgv0 f220267b;

    /* JADX INFO: renamed from: c */
    public static final tgv0 f220268c;

    /* JADX INFO: renamed from: d */
    public static final tgv0 f220269d;

    /* JADX INFO: renamed from: e */
    public static final tgv0 f220270e;

    /* JADX INFO: renamed from: f */
    public static final tgv0 f220271f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ tgv0[] f220272g;

    static {
        tgv0 tgv0Var = new tgv0("ShutDown", 0);
        f220266a = tgv0Var;
        tgv0 tgv0Var2 = new tgv0("ShuttingDown", 1);
        f220267b = tgv0Var2;
        tgv0 tgv0Var3 = new tgv0("Inactive", 2);
        f220268c = tgv0Var3;
        tgv0 tgv0Var4 = new tgv0("InactivePendingWork", 3);
        f220269d = tgv0Var4;
        tgv0 tgv0Var5 = new tgv0("Idle", 4);
        f220270e = tgv0Var5;
        tgv0 tgv0Var6 = new tgv0("PendingWork", 5);
        f220271f = tgv0Var6;
        f220272g = new tgv0[]{tgv0Var, tgv0Var2, tgv0Var3, tgv0Var4, tgv0Var5, tgv0Var6};
    }

    public static tgv0 valueOf(String str) {
        return (tgv0) Enum.valueOf(tgv0.class, str);
    }

    public static tgv0[] values() {
        return (tgv0[]) f220272g.clone();
    }
}
