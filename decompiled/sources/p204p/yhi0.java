package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class yhi0 {

    /* JADX INFO: renamed from: a */
    public static final yhi0 f272909a;

    /* JADX INFO: renamed from: b */
    public static final yhi0 f272910b;

    /* JADX INFO: renamed from: c */
    public static final yhi0 f272911c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ yhi0[] f272912d;

    static {
        yhi0 yhi0Var = new yhi0("WAITING", 0);
        f272909a = yhi0Var;
        yhi0 yhi0Var2 = new yhi0("LOGGED", 1);
        f272910b = yhi0Var2;
        yhi0 yhi0Var3 = new yhi0("NOT_LOGGED", 2);
        f272911c = yhi0Var3;
        f272912d = new yhi0[]{yhi0Var, yhi0Var2, yhi0Var3};
    }

    public static yhi0 valueOf(String str) {
        return (yhi0) Enum.valueOf(yhi0.class, str);
    }

    public static yhi0[] values() {
        return (yhi0[]) f272912d.clone();
    }
}
