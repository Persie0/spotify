package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class bcy {

    /* JADX INFO: renamed from: a */
    public static final bcy f25954a;

    /* JADX INFO: renamed from: b */
    public static final bcy f25955b;

    /* JADX INFO: renamed from: c */
    public static final bcy f25956c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ bcy[] f25957d;

    static {
        bcy bcyVar = new bcy("CardClicked", 0);
        f25954a = bcyVar;
        bcy bcyVar2 = new bcy("PremiumCtaButtonClicked", 1);
        f25955b = bcyVar2;
        bcy bcyVar3 = new bcy("FreeLockedCtaButtonClicked", 2);
        f25956c = bcyVar3;
        f25957d = new bcy[]{bcyVar, bcyVar2, bcyVar3};
    }

    public static bcy valueOf(String str) {
        return (bcy) Enum.valueOf(bcy.class, str);
    }

    public static bcy[] values() {
        return (bcy[]) f25957d.clone();
    }
}
