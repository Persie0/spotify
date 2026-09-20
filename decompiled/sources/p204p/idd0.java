package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class idd0 {

    /* JADX INFO: renamed from: a */
    public static final idd0 f101063a;

    /* JADX INFO: renamed from: b */
    public static final idd0 f101064b;

    /* JADX INFO: renamed from: c */
    public static final idd0 f101065c;

    /* JADX INFO: renamed from: d */
    public static final idd0 f101066d;

    /* JADX INFO: renamed from: e */
    public static final idd0 f101067e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ idd0[] f101068f;

    static {
        idd0 idd0Var = new idd0("UPLOADING", 0);
        f101063a = idd0Var;
        idd0 idd0Var2 = new idd0("CANCELLING", 1);
        f101064b = idd0Var2;
        idd0 idd0Var3 = new idd0("SUBMITTING", 2);
        f101065c = idd0Var3;
        idd0 idd0Var4 = new idd0("UPLOADED", 3);
        f101066d = idd0Var4;
        idd0 idd0Var5 = new idd0("FAILED", 4);
        f101067e = idd0Var5;
        f101068f = new idd0[]{idd0Var, idd0Var2, idd0Var3, idd0Var4, idd0Var5};
    }

    public static idd0 valueOf(String str) {
        return (idd0) Enum.valueOf(idd0.class, str);
    }

    public static idd0[] values() {
        return (idd0[]) f101068f.clone();
    }
}
