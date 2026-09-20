package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class dy50 {

    /* JADX INFO: renamed from: a */
    public static final dy50 f54189a;

    /* JADX INFO: renamed from: b */
    public static final dy50 f54190b;

    /* JADX INFO: renamed from: c */
    public static final dy50 f54191c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ dy50[] f54192d;

    static {
        dy50 dy50Var = new dy50("GotItClicked", 0);
        f54189a = dy50Var;
        dy50 dy50Var2 = new dy50("LeaveClicked", 1);
        f54190b = dy50Var2;
        dy50 dy50Var3 = new dy50("SystemDismissed", 2);
        f54191c = dy50Var3;
        f54192d = new dy50[]{dy50Var, dy50Var2, dy50Var3};
    }

    public static dy50 valueOf(String str) {
        return (dy50) Enum.valueOf(dy50.class, str);
    }

    public static dy50[] values() {
        return (dy50[]) f54192d.clone();
    }
}
