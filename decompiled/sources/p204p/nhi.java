package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class nhi {

    /* JADX INFO: renamed from: a */
    public static final nhi f154011a;

    /* JADX INFO: renamed from: b */
    public static final nhi f154012b;

    /* JADX INFO: renamed from: c */
    public static final nhi f154013c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ nhi[] f154014d;

    static {
        nhi nhiVar = new nhi("ALWAYS_OVERRIDE", 0);
        f154011a = nhiVar;
        nhi nhiVar2 = new nhi("HIGH_PRIORITY_REQUIRED", 1);
        nhi nhiVar3 = new nhi("REQUIRED", 2);
        f154012b = nhiVar3;
        nhi nhiVar4 = new nhi("OPTIONAL", 3);
        f154013c = nhiVar4;
        f154014d = new nhi[]{nhiVar, nhiVar2, nhiVar3, nhiVar4};
    }

    public static nhi valueOf(String str) {
        return (nhi) Enum.valueOf(nhi.class, str);
    }

    public static nhi[] values() {
        return (nhi[]) f154014d.clone();
    }
}
