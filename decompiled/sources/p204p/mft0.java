package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class mft0 {

    /* JADX INFO: renamed from: a */
    public static final mft0 f143181a;

    /* JADX INFO: renamed from: b */
    public static final mft0 f143182b;

    /* JADX INFO: renamed from: c */
    public static final mft0 f143183c;

    /* JADX INFO: renamed from: d */
    public static final mft0 f143184d;

    /* JADX INFO: renamed from: e */
    public static final mft0 f143185e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ mft0[] f143186f;

    static {
        mft0 mft0Var = new mft0("DENIED_UNKNOWN", 0);
        f143181a = mft0Var;
        mft0 mft0Var2 = new mft0("NOT_ASKED", 1);
        f143182b = mft0Var2;
        mft0 mft0Var3 = new mft0("DENIED_ONCE", 2);
        f143183c = mft0Var3;
        mft0 mft0Var4 = new mft0("DENIED", 3);
        f143184d = mft0Var4;
        mft0 mft0Var5 = new mft0("GRANTED", 4);
        f143185e = mft0Var5;
        f143186f = new mft0[]{mft0Var, mft0Var2, mft0Var3, mft0Var4, mft0Var5};
    }

    public static mft0 valueOf(String str) {
        return (mft0) Enum.valueOf(mft0.class, str);
    }

    public static mft0[] values() {
        return (mft0[]) f143186f.clone();
    }
}
