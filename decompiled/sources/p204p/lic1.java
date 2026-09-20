package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class lic1 {

    /* JADX INFO: renamed from: a */
    public static final lic1 f133766a;

    /* JADX INFO: renamed from: b */
    public static final lic1 f133767b;

    /* JADX INFO: renamed from: c */
    public static final lic1 f133768c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ lic1[] f133769d;

    static {
        lic1 lic1Var = new lic1("CURRENT_USER", 0);
        f133766a = lic1Var;
        lic1 lic1Var2 = new lic1("OTHER_USER", 1);
        f133767b = lic1Var2;
        lic1 lic1Var3 = new lic1("PREVIEW_CURRENT_USER", 2);
        f133768c = lic1Var3;
        f133769d = new lic1[]{lic1Var, lic1Var2, lic1Var3};
    }

    public static lic1 valueOf(String str) {
        return (lic1) Enum.valueOf(lic1.class, str);
    }

    public static lic1[] values() {
        return (lic1[]) f133769d.clone();
    }
}
