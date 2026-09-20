package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class ph21 {

    /* JADX INFO: renamed from: a */
    public static final ph21 f177449a;

    /* JADX INFO: renamed from: b */
    public static final ph21 f177450b;

    /* JADX INFO: renamed from: c */
    public static final ph21 f177451c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ph21[] f177452d;

    static {
        ph21 ph21Var = new ph21("CardViewTapped", 0);
        f177449a = ph21Var;
        ph21 ph21Var2 = new ph21("PrimaryButtonTapped", 1);
        f177450b = ph21Var2;
        ph21 ph21Var3 = new ph21("AatEntryPointClicked", 2);
        f177451c = ph21Var3;
        f177452d = new ph21[]{ph21Var, ph21Var2, ph21Var3};
    }

    public static ph21 valueOf(String str) {
        return (ph21) Enum.valueOf(ph21.class, str);
    }

    public static ph21[] values() {
        return (ph21[]) f177452d.clone();
    }
}
