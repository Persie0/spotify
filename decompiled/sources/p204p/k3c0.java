package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class k3c0 {

    /* JADX INFO: renamed from: a */
    public static final k3c0 f118840a;

    /* JADX INFO: renamed from: b */
    public static final k3c0 f118841b;

    /* JADX INFO: renamed from: c */
    public static final k3c0 f118842c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ k3c0[] f118843d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f118844e;

    static {
        k3c0 k3c0Var = new k3c0("NONE", 0);
        f118840a = k3c0Var;
        k3c0 k3c0Var2 = new k3c0("ARTIST", 1);
        f118841b = k3c0Var2;
        k3c0 k3c0Var3 = new k3c0("TRACK", 2);
        f118842c = k3c0Var3;
        k3c0[] k3c0VarArr = {k3c0Var, k3c0Var2, k3c0Var3};
        f118843d = k3c0VarArr;
        f118844e = new nzv(k3c0VarArr);
    }

    public static k3c0 valueOf(String str) {
        return (k3c0) Enum.valueOf(k3c0.class, str);
    }

    public static k3c0[] values() {
        return (k3c0[]) f118843d.clone();
    }
}
