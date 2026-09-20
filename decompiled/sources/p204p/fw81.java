package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class fw81 {

    /* JADX INFO: renamed from: a */
    public static final fw81 f74026a;

    /* JADX INFO: renamed from: b */
    public static final fw81 f74027b;

    /* JADX INFO: renamed from: c */
    public static final fw81 f74028c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ fw81[] f74029d;

    static {
        fw81 fw81Var = new fw81("Trailer", 0);
        f74026a = fw81Var;
        fw81 fw81Var2 = new fw81("Sample", 1);
        f74027b = fw81Var2;
        fw81 fw81Var3 = new fw81("None", 2);
        f74028c = fw81Var3;
        f74029d = new fw81[]{fw81Var, fw81Var2, fw81Var3};
    }

    public static fw81 valueOf(String str) {
        return (fw81) Enum.valueOf(fw81.class, str);
    }

    public static fw81[] values() {
        return (fw81[]) f74029d.clone();
    }
}
