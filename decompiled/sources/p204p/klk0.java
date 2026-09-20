package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class klk0 {

    /* JADX INFO: renamed from: a */
    public static final klk0 f123917a;

    /* JADX INFO: renamed from: b */
    public static final klk0 f123918b;

    /* JADX INFO: renamed from: c */
    public static final klk0 f123919c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ klk0[] f123920d;

    static {
        klk0 klk0Var = new klk0("FORCE_FLEXIBILITY", 0);
        f123917a = klk0Var;
        klk0 klk0Var2 = new klk0("NULLABLE", 1);
        f123918b = klk0Var2;
        klk0 klk0Var3 = new klk0("NOT_NULL", 2);
        f123919c = klk0Var3;
        f123920d = new klk0[]{klk0Var, klk0Var2, klk0Var3};
    }

    public static klk0 valueOf(String str) {
        return (klk0) Enum.valueOf(klk0.class, str);
    }

    public static klk0[] values() {
        return (klk0[]) f123920d.clone();
    }
}
