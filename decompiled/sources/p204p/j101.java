package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j101 {

    /* JADX INFO: renamed from: a */
    public static final j101 f107584a;

    /* JADX INFO: renamed from: b */
    public static final j101 f107585b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ j101[] f107586c;

    static {
        j101 j101Var = new j101("FLOW", 0);
        f107584a = j101Var;
        j101 j101Var2 = new j101("SEARCH", 1);
        f107585b = j101Var2;
        f107586c = new j101[]{j101Var, j101Var2};
    }

    public static j101 valueOf(String str) {
        return (j101) Enum.valueOf(j101.class, str);
    }

    public static j101[] values() {
        return (j101[]) f107586c.clone();
    }
}
