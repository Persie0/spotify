package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nrt0 {

    /* JADX INFO: renamed from: a */
    public static final nrt0 f157606a;

    /* JADX INFO: renamed from: b */
    public static final nrt0 f157607b;

    /* JADX INFO: renamed from: c */
    public static final nrt0 f157608c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nrt0[] f157609d;

    static {
        nrt0 nrt0Var = new nrt0("CAPPED", 0);
        f157606a = nrt0Var;
        nrt0 nrt0Var2 = new nrt0("NOT_CAPPED", 1);
        f157607b = nrt0Var2;
        nrt0 nrt0Var3 = new nrt0("UNKNOWN", 2);
        f157608c = nrt0Var3;
        f157609d = new nrt0[]{nrt0Var, nrt0Var2, nrt0Var3};
    }

    public static nrt0 valueOf(String str) {
        return (nrt0) Enum.valueOf(nrt0.class, str);
    }

    public static nrt0[] values() {
        return (nrt0[]) f157609d.clone();
    }
}
