package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class dej0 {

    /* JADX INFO: renamed from: a */
    public static final dej0 f48108a;

    /* JADX INFO: renamed from: b */
    public static final dej0 f48109b;

    /* JADX INFO: renamed from: c */
    public static final dej0 f48110c;

    /* JADX INFO: renamed from: d */
    public static final dej0 f48111d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ dej0[] f48112e;

    static {
        dej0 dej0Var = new dej0("Granted", 0);
        f48108a = dej0Var;
        dej0 dej0Var2 = new dej0("DeniedOnce", 1);
        f48109b = dej0Var2;
        dej0 dej0Var3 = new dej0("DeniedTwice", 2);
        f48110c = dej0Var3;
        dej0 dej0Var4 = new dej0("NeverDenied", 3);
        f48111d = dej0Var4;
        f48112e = new dej0[]{dej0Var, dej0Var2, dej0Var3, dej0Var4};
    }

    public static dej0 valueOf(String str) {
        return (dej0) Enum.valueOf(dej0.class, str);
    }

    public static dej0[] values() {
        return (dej0[]) f48112e.clone();
    }
}
