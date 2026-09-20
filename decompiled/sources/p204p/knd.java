package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class knd {

    /* JADX INFO: renamed from: a */
    public static final knd f124385a;

    /* JADX INFO: renamed from: b */
    public static final knd f124386b;

    /* JADX INFO: renamed from: c */
    public static final knd f124387c;

    /* JADX INFO: renamed from: d */
    public static final knd f124388d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ knd[] f124389e;

    static {
        knd kndVar = new knd("Scheduled", 0);
        f124385a = kndVar;
        knd kndVar2 = new knd("Live", 1);
        f124386b = kndVar2;
        knd kndVar3 = new knd("Ended", 2);
        f124387c = kndVar3;
        knd kndVar4 = new knd("Cancelled", 3);
        f124388d = kndVar4;
        f124389e = new knd[]{kndVar, kndVar2, kndVar3, kndVar4};
    }

    public static knd valueOf(String str) {
        return (knd) Enum.valueOf(knd.class, str);
    }

    public static knd[] values() {
        return (knd[]) f124389e.clone();
    }
}
