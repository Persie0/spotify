package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class kwz {

    /* JADX INFO: renamed from: a */
    public static final kwz f127273a;

    /* JADX INFO: renamed from: b */
    public static final kwz f127274b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ kwz[] f127275c;

    static {
        kwz kwzVar = new kwz("SHOWN", 0);
        f127273a = kwzVar;
        kwz kwzVar2 = new kwz("POSITIVE_BUTTON_CLICKED", 1);
        f127274b = kwzVar2;
        f127275c = new kwz[]{kwzVar, kwzVar2};
    }

    public static kwz valueOf(String str) {
        return (kwz) Enum.valueOf(kwz.class, str);
    }

    public static kwz[] values() {
        return (kwz[]) f127275c.clone();
    }
}
