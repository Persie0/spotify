package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class kzk {

    /* JADX INFO: renamed from: a */
    public static final kzk f128150a;

    /* JADX INFO: renamed from: b */
    public static final kzk f128151b;

    /* JADX INFO: renamed from: c */
    public static final kzk f128152c;

    /* JADX INFO: renamed from: d */
    public static final kzk f128153d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ kzk[] f128154e;

    static {
        kzk kzkVar = new kzk("UNKNOWN", 0);
        f128150a = kzkVar;
        kzk kzkVar2 = new kzk("UP", 1);
        f128151b = kzkVar2;
        kzk kzkVar3 = new kzk("DOWN", 2);
        f128152c = kzkVar3;
        kzk kzkVar4 = new kzk("NEW", 3);
        f128153d = kzkVar4;
        f128154e = new kzk[]{kzkVar, kzkVar2, kzkVar3, kzkVar4, new kzk("EQUAL", 4)};
    }

    public static kzk valueOf(String str) {
        return (kzk) Enum.valueOf(kzk.class, str);
    }

    public static kzk[] values() {
        return (kzk[]) f128154e.clone();
    }
}
