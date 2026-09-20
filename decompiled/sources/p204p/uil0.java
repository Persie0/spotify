package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class uil0 {

    /* JADX INFO: renamed from: a */
    public static final uil0 f230729a;

    /* JADX INFO: renamed from: b */
    public static final uil0 f230730b;

    /* JADX INFO: renamed from: c */
    public static final uil0 f230731c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ uil0[] f230732d;

    static {
        uil0 uil0Var = new uil0("PositiveButtonClicked", 0);
        f230729a = uil0Var;
        uil0 uil0Var2 = new uil0("NegativeButtonClicked", 1);
        f230730b = uil0Var2;
        uil0 uil0Var3 = new uil0("DismissButtonClicked", 2);
        f230731c = uil0Var3;
        f230732d = new uil0[]{uil0Var, uil0Var2, uil0Var3};
    }

    public static uil0 valueOf(String str) {
        return (uil0) Enum.valueOf(uil0.class, str);
    }

    public static uil0[] values() {
        return (uil0[]) f230732d.clone();
    }
}
