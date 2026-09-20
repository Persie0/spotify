package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ufr {

    /* JADX INFO: renamed from: a */
    public static final ufr f229860a;

    /* JADX INFO: renamed from: b */
    public static final ufr f229861b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ufr[] f229862c;

    static {
        ufr ufrVar = new ufr("HOURS_12", 0);
        f229860a = ufrVar;
        ufr ufrVar2 = new ufr("HOURS_24", 1);
        f229861b = ufrVar2;
        f229862c = new ufr[]{ufrVar, ufrVar2};
    }

    public static ufr valueOf(String str) {
        return (ufr) Enum.valueOf(ufr.class, str);
    }

    public static ufr[] values() {
        return (ufr[]) f229862c.clone();
    }
}
