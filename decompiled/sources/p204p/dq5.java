package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class dq5 implements im20 {

    /* JADX INFO: renamed from: a */
    public static final dq5 f51816a;

    /* JADX INFO: renamed from: b */
    public static final dq5 f51817b;

    /* JADX INFO: renamed from: c */
    public static final dq5 f51818c;

    /* JADX INFO: renamed from: d */
    public static final dq5 f51819d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ dq5[] f51820e;

    static {
        dq5 dq5Var = new dq5("EntityExplorer", 0);
        f51816a = dq5Var;
        dq5 dq5Var2 = new dq5("PlayButton", 1);
        f51817b = dq5Var2;
        dq5 dq5Var3 = new dq5("ShuffleButton", 2);
        f51818c = dq5Var3;
        dq5 dq5Var4 = new dq5("Share", 3);
        f51819d = dq5Var4;
        f51820e = new dq5[]{dq5Var, dq5Var2, dq5Var3, dq5Var4};
    }

    public static dq5 valueOf(String str) {
        return (dq5) Enum.valueOf(dq5.class, str);
    }

    public static dq5[] values() {
        return (dq5[]) f51820e.clone();
    }
}
