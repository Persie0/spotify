package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class kby0 {

    /* JADX INFO: renamed from: a */
    public static final kby0 f121305a;

    /* JADX INFO: renamed from: b */
    public static final kby0 f121306b;

    /* JADX INFO: renamed from: c */
    public static final kby0 f121307c;

    /* JADX INFO: renamed from: d */
    public static final kby0 f121308d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ kby0[] f121309e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ nzv f121310f;

    static {
        kby0 kby0Var = new kby0("IDLE", 0);
        f121305a = kby0Var;
        kby0 kby0Var2 = new kby0("ANIMATED", 1);
        f121306b = kby0Var2;
        kby0 kby0Var3 = new kby0("STATIC", 2);
        f121307c = kby0Var3;
        kby0 kby0Var4 = new kby0("WARNING", 3);
        f121308d = kby0Var4;
        kby0[] kby0VarArr = {kby0Var, kby0Var2, kby0Var3, kby0Var4};
        f121309e = kby0VarArr;
        f121310f = new nzv(kby0VarArr);
    }

    public static kby0 valueOf(String str) {
        return (kby0) Enum.valueOf(kby0.class, str);
    }

    public static kby0[] values() {
        return (kby0[]) f121309e.clone();
    }
}
