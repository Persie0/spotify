package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class bmr {

    /* JADX INFO: renamed from: a */
    public static final bmr f28599a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ bmr[] f28600b;

    static {
        bmr bmrVar = new bmr("RowClicked", 0);
        f28599a = bmrVar;
        f28600b = new bmr[]{bmrVar};
    }

    public static bmr valueOf(String str) {
        return (bmr) Enum.valueOf(bmr.class, str);
    }

    public static bmr[] values() {
        return (bmr[]) f28600b.clone();
    }
}
