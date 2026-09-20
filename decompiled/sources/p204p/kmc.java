package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class kmc {

    /* JADX INFO: renamed from: a */
    public static final kmc f124106a;

    /* JADX INFO: renamed from: b */
    public static final kmc f124107b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ kmc[] f124108c;

    static {
        kmc kmcVar = new kmc("PUSH", 0);
        f124106a = kmcVar;
        kmc kmcVar2 = new kmc("EMAIL", 1);
        f124107b = kmcVar2;
        f124108c = new kmc[]{kmcVar, kmcVar2};
    }

    public static kmc valueOf(String str) {
        return (kmc) Enum.valueOf(kmc.class, str);
    }

    public static kmc[] values() {
        return (kmc[]) f124108c.clone();
    }
}
