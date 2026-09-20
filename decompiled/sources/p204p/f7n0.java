package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class f7n0 {

    /* JADX INFO: renamed from: a */
    public static final f7n0 f66752a;

    /* JADX INFO: renamed from: b */
    public static final f7n0 f66753b;

    /* JADX INFO: renamed from: c */
    public static final f7n0 f66754c;

    /* JADX INFO: renamed from: d */
    public static final f7n0 f66755d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ f7n0[] f66756e;

    static {
        f7n0 f7n0Var = new f7n0("SCHEDULED", 0);
        f66752a = f7n0Var;
        f7n0 f7n0Var2 = new f7n0("STARTING_SOON", 1);
        f66753b = f7n0Var2;
        f7n0 f7n0Var3 = new f7n0("LIVE", 2);
        f66754c = f7n0Var3;
        f7n0 f7n0Var4 = new f7n0("ENDED", 3);
        f66755d = f7n0Var4;
        f66756e = new f7n0[]{f7n0Var, f7n0Var2, f7n0Var3, f7n0Var4};
    }

    public static f7n0 valueOf(String str) {
        return (f7n0) Enum.valueOf(f7n0.class, str);
    }

    public static f7n0[] values() {
        return (f7n0[]) f66756e.clone();
    }
}
