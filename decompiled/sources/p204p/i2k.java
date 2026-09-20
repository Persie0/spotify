package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class i2k {

    /* JADX INFO: renamed from: a */
    public static final i2k f97857a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ i2k[] f97858b;

    static {
        i2k i2kVar = new i2k("OnClicked", 0);
        f97857a = i2kVar;
        f97858b = new i2k[]{i2kVar};
    }

    public static i2k valueOf(String str) {
        return (i2k) Enum.valueOf(i2k.class, str);
    }

    public static i2k[] values() {
        return (i2k[]) f97858b.clone();
    }
}
