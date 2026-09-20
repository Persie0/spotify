package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class pyx {

    /* JADX INFO: renamed from: a */
    public static final pyx f183534a;

    /* JADX INFO: renamed from: b */
    public static final pyx f183535b;

    /* JADX INFO: renamed from: c */
    public static final pyx f183536c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ pyx[] f183537d;

    static {
        pyx pyxVar = new pyx("StaleCache", 0);
        f183534a = pyxVar;
        pyx pyxVar2 = new pyx("Cache", 1);
        f183535b = pyxVar2;
        pyx pyxVar3 = new pyx("Network", 2);
        f183536c = pyxVar3;
        f183537d = new pyx[]{pyxVar, pyxVar2, pyxVar3};
    }

    public static pyx valueOf(String str) {
        return (pyx) Enum.valueOf(pyx.class, str);
    }

    public static pyx[] values() {
        return (pyx[]) f183537d.clone();
    }
}
