package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class rh21 {

    /* JADX INFO: renamed from: a */
    public static final rh21 f199096a;

    /* JADX INFO: renamed from: b */
    public static final rh21 f199097b;

    /* JADX INFO: renamed from: c */
    public static final rh21 f199098c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ rh21[] f199099d;

    static {
        rh21 rh21Var = new rh21("CardViewTapped", 0);
        f199096a = rh21Var;
        rh21 rh21Var2 = new rh21("PrimaryButtonTapped", 1);
        f199097b = rh21Var2;
        rh21 rh21Var3 = new rh21("AatEntryPointClicked", 2);
        f199098c = rh21Var3;
        f199099d = new rh21[]{rh21Var, rh21Var2, rh21Var3};
    }

    public static rh21 valueOf(String str) {
        return (rh21) Enum.valueOf(rh21.class, str);
    }

    public static rh21[] values() {
        return (rh21[]) f199099d.clone();
    }
}
