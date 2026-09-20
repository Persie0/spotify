package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class nh21 {

    /* JADX INFO: renamed from: a */
    public static final nh21 f153846a;

    /* JADX INFO: renamed from: b */
    public static final nh21 f153847b;

    /* JADX INFO: renamed from: c */
    public static final nh21 f153848c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nh21[] f153849d;

    static {
        nh21 nh21Var = new nh21("CardViewTapped", 0);
        f153846a = nh21Var;
        nh21 nh21Var2 = new nh21("PrimaryButtonTapped", 1);
        f153847b = nh21Var2;
        nh21 nh21Var3 = new nh21("AatEntryPointClicked", 2);
        f153848c = nh21Var3;
        f153849d = new nh21[]{nh21Var, nh21Var2, nh21Var3};
    }

    public static nh21 valueOf(String str) {
        return (nh21) Enum.valueOf(nh21.class, str);
    }

    public static nh21[] values() {
        return (nh21[]) f153849d.clone();
    }
}
