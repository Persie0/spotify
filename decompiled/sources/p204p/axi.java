package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class axi {

    /* JADX INFO: renamed from: a */
    public static final axi f20872a;

    /* JADX INFO: renamed from: b */
    public static final axi f20873b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ axi[] f20874c;

    static {
        axi axiVar = new axi("NPV", 0);
        f20872a = axiVar;
        axi axiVar2 = new axi("NPB", 1);
        f20873b = axiVar2;
        f20874c = new axi[]{axiVar, axiVar2};
    }

    public static axi valueOf(String str) {
        return (axi) Enum.valueOf(axi.class, str);
    }

    public static axi[] values() {
        return (axi[]) f20874c.clone();
    }
}
