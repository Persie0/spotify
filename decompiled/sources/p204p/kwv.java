package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kwv {

    /* JADX INFO: renamed from: a */
    public static final kwv f127248a;

    /* JADX INFO: renamed from: b */
    public static final kwv f127249b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ kwv[] f127250c;

    static {
        kwv kwvVar = new kwv("SingleLine", 0);
        f127248a = kwvVar;
        kwv kwvVar2 = new kwv("TwoLines", 1);
        f127249b = kwvVar2;
        f127250c = new kwv[]{kwvVar, kwvVar2, new kwv("ThreeLines", 2), new kwv("Multiline", 3)};
    }

    public static kwv valueOf(String str) {
        return (kwv) Enum.valueOf(kwv.class, str);
    }

    public static kwv[] values() {
        return (kwv[]) f127250c.clone();
    }
}
