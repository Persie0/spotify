package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class yf11 {

    /* JADX INFO: renamed from: a */
    public static final yf11 f272099a;

    /* JADX INFO: renamed from: b */
    public static final yf11 f272100b;

    /* JADX INFO: renamed from: c */
    public static final yf11 f272101c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ yf11[] f272102d;

    static {
        yf11 yf11Var = new yf11("Hidden", 0);
        f272099a = yf11Var;
        yf11 yf11Var2 = new yf11("Expanded", 1);
        f272100b = yf11Var2;
        yf11 yf11Var3 = new yf11("PartiallyExpanded", 2);
        f272101c = yf11Var3;
        f272102d = new yf11[]{yf11Var, yf11Var2, yf11Var3};
    }

    public static yf11 valueOf(String str) {
        return (yf11) Enum.valueOf(yf11.class, str);
    }

    public static yf11[] values() {
        return (yf11[]) f272102d.clone();
    }
}
