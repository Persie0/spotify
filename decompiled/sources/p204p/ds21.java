package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ds21 {

    /* JADX INFO: renamed from: a */
    public static final ds21 f52473a;

    /* JADX INFO: renamed from: b */
    public static final ds21 f52474b;

    /* JADX INFO: renamed from: c */
    public static final ds21 f52475c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ds21[] f52476d;

    static {
        ds21 ds21Var = new ds21("Content", 0);
        f52473a = ds21Var;
        ds21 ds21Var2 = new ds21("Footer", 1);
        f52474b = ds21Var2;
        ds21 ds21Var3 = new ds21("BottomFade", 2);
        f52475c = ds21Var3;
        f52476d = new ds21[]{ds21Var, ds21Var2, ds21Var3};
    }

    public static ds21 valueOf(String str) {
        return (ds21) Enum.valueOf(ds21.class, str);
    }

    public static ds21[] values() {
        return (ds21[]) f52476d.clone();
    }
}
