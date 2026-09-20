package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class ad1 {

    /* JADX INFO: renamed from: a */
    public static final ad1 f14488a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ad1[] f14489b;

    static {
        ad1 ad1Var = new ad1("ButtonClicked", 0);
        f14488a = ad1Var;
        f14489b = new ad1[]{ad1Var};
    }

    public static ad1 valueOf(String str) {
        return (ad1) Enum.valueOf(ad1.class, str);
    }

    public static ad1[] values() {
        return (ad1[]) f14489b.clone();
    }
}
