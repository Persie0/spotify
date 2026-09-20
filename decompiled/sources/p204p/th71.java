package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class th71 {

    /* JADX INFO: renamed from: a */
    public static final th71 f220370a;

    /* JADX INFO: renamed from: b */
    public static final th71 f220371b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ th71[] f220372c;

    static {
        th71 th71Var = new th71("UP", 0);
        f220370a = th71Var;
        th71 th71Var2 = new th71("DOWN", 1);
        f220371b = th71Var2;
        f220372c = new th71[]{th71Var, th71Var2};
    }

    public static th71 valueOf(String str) {
        return (th71) Enum.valueOf(th71.class, str);
    }

    public static th71[] values() {
        return (th71[]) f220372c.clone();
    }
}
