package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class lnn0 {

    /* JADX INFO: renamed from: a */
    public static final lnn0 f135182a;

    /* JADX INFO: renamed from: b */
    public static final lnn0 f135183b;

    /* JADX INFO: renamed from: c */
    public static final lnn0 f135184c;

    /* JADX INFO: renamed from: d */
    public static final lnn0 f135185d;

    /* JADX INFO: renamed from: e */
    public static final lnn0 f135186e;

    /* JADX INFO: renamed from: f */
    public static final lnn0 f135187f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ lnn0[] f135188g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ nzv f135189h;

    static {
        lnn0 lnn0Var = new lnn0("ADMIN", 0);
        f135182a = lnn0Var;
        lnn0 lnn0Var2 = new lnn0("UNKNOWN", 1);
        f135183b = lnn0Var2;
        lnn0 lnn0Var3 = new lnn0("BLOCKED", 2);
        f135184c = lnn0Var3;
        lnn0 lnn0Var4 = new lnn0("VIEWER", 3);
        f135185d = lnn0Var4;
        lnn0 lnn0Var5 = new lnn0("MADE_FOR", 4);
        f135186e = lnn0Var5;
        lnn0 lnn0Var6 = new lnn0("CONTRIBUTOR", 5);
        f135187f = lnn0Var6;
        lnn0[] lnn0VarArr = {lnn0Var, lnn0Var2, lnn0Var3, lnn0Var4, lnn0Var5, lnn0Var6};
        f135188g = lnn0VarArr;
        f135189h = new nzv(lnn0VarArr);
    }

    public static lnn0 valueOf(String str) {
        return (lnn0) Enum.valueOf(lnn0.class, str);
    }

    public static lnn0[] values() {
        return (lnn0[]) f135188g.clone();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m59499a() {
        return this == f135184c;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m59500b() {
        return this == f135187f;
    }
}
