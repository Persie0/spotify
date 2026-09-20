package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class hev {

    /* JADX INFO: renamed from: a */
    public static final hev f90510a;

    /* JADX INFO: renamed from: b */
    public static final hev f90511b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ hev[] f90512c;

    static {
        hev hevVar = new hev("CardClicked", 0);
        f90510a = hevVar;
        hev hevVar2 = new hev("CardLongClicked", 1);
        f90511b = hevVar2;
        f90512c = new hev[]{hevVar, hevVar2};
    }

    public static hev valueOf(String str) {
        return (hev) Enum.valueOf(hev.class, str);
    }

    public static hev[] values() {
        return (hev[]) f90512c.clone();
    }
}
