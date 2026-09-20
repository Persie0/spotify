package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a4i0 {

    /* JADX INFO: renamed from: a */
    public static final a4i0 f12262a;

    /* JADX INFO: renamed from: b */
    public static final a4i0 f12263b;

    /* JADX INFO: renamed from: c */
    public static final a4i0 f12264c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ a4i0[] f12265d;

    static {
        a4i0 a4i0Var = new a4i0("EVERYTHING_IN_SYNC", 0);
        f12262a = a4i0Var;
        a4i0 a4i0Var2 = new a4i0("SOMETHING_SYNCED", 1);
        f12263b = a4i0Var2;
        a4i0 a4i0Var3 = new a4i0("AN_ERROR_WHILE_SYNCING", 2);
        f12264c = a4i0Var3;
        f12265d = new a4i0[]{a4i0Var, a4i0Var2, a4i0Var3};
    }

    public static a4i0 valueOf(String str) {
        return (a4i0) Enum.valueOf(a4i0.class, str);
    }

    public static a4i0[] values() {
        return (a4i0[]) f12265d.clone();
    }
}
