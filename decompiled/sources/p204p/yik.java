package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class yik {

    /* JADX INFO: renamed from: a */
    public static final yik f273132a;

    /* JADX INFO: renamed from: b */
    public static final yik f273133b;

    /* JADX INFO: renamed from: c */
    public static final yik f273134c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ yik[] f273135d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ nzv f273136e;

    static {
        yik yikVar = new yik("USER", 0);
        f273132a = yikVar;
        yik yikVar2 = new yik("EDITORIAL", 1);
        f273133b = yikVar2;
        yik yikVar3 = new yik("UNKNOWN", 2);
        f273134c = yikVar3;
        yik[] yikVarArr = {yikVar, yikVar2, yikVar3};
        f273135d = yikVarArr;
        f273136e = new nzv(yikVarArr);
    }

    public static yik valueOf(String str) {
        return (yik) Enum.valueOf(yik.class, str);
    }

    public static yik[] values() {
        return (yik[]) f273135d.clone();
    }
}
