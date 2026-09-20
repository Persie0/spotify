package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class ap21 {

    /* JADX INFO: renamed from: a */
    public static final ap21 f17818a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ap21[] f17819b;

    /* JADX INFO: Fake field, exist only in values array */
    ap21 EF0;

    static {
        ap21 ap21Var = new ap21("RequestFailed", 0);
        ap21 ap21Var2 = new ap21("UnsupportedDevice", 1);
        f17818a = ap21Var2;
        f17819b = new ap21[]{ap21Var, ap21Var2};
    }

    public static ap21 valueOf(String str) {
        return (ap21) Enum.valueOf(ap21.class, str);
    }

    public static ap21[] values() {
        return (ap21[]) f17819b.clone();
    }
}
