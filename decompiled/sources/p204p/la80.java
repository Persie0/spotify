package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class la80 {

    /* JADX INFO: renamed from: a */
    public static final la80 f131299a;

    /* JADX INFO: renamed from: b */
    public static final la80 f131300b;

    /* JADX INFO: renamed from: c */
    public static final la80 f131301c;

    /* JADX INFO: renamed from: d */
    public static final la80 f131302d;

    /* JADX INFO: renamed from: e */
    public static final la80 f131303e;

    /* JADX INFO: renamed from: f */
    public static final la80 f131304f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ la80[] f131305g;

    static {
        la80 la80Var = new la80("ON_DEMAND_WHEN_FREE_JUMPIN", 0);
        f131299a = la80Var;
        la80 la80Var2 = new la80("ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS", 1);
        f131300b = la80Var2;
        la80 la80Var3 = new la80("ON_DEMAND_WHEN_FREE_TFT", 2);
        f131301c = la80Var3;
        la80 la80Var4 = new la80("SHUFFLE_WHEN_FREE", 3);
        f131302d = la80Var4;
        la80 la80Var5 = new la80("TRACK_LIST_WHEN_FREE_REINVENTION", 4);
        f131303e = la80Var5;
        la80 la80Var6 = new la80("ON_DEMAND_WHEN_PREMIUM", 5);
        f131304f = la80Var6;
        f131305g = new la80[]{la80Var, la80Var2, la80Var3, la80Var4, la80Var5, la80Var6};
    }

    public static la80 valueOf(String str) {
        return (la80) Enum.valueOf(la80.class, str);
    }

    public static la80[] values() {
        return (la80[]) f131305g.clone();
    }
}
