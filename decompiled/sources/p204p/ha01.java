package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ha01 {

    /* JADX INFO: renamed from: a */
    public static final ha01 f89083a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ha01[] f89084b;

    static {
        ha01 ha01Var = new ha01("ButtonClicked", 0);
        f89083a = ha01Var;
        f89084b = new ha01[]{ha01Var};
    }

    public static ha01 valueOf(String str) {
        return (ha01) Enum.valueOf(ha01.class, str);
    }

    public static ha01[] values() {
        return (ha01[]) f89084b.clone();
    }
}
