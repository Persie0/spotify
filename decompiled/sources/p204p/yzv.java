package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class yzv {

    /* JADX INFO: renamed from: a */
    public static final yzv f277903a;

    /* JADX INFO: renamed from: b */
    public static final yzv f277904b;

    /* JADX INFO: renamed from: c */
    public static final yzv f277905c;

    /* JADX INFO: renamed from: d */
    public static final yzv f277906d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ yzv[] f277907e;

    static {
        yzv yzvVar = new yzv("VODCAST", 0);
        f277903a = yzvVar;
        yzv yzvVar2 = new yzv("AUDIO", 1);
        f277904b = yzvVar2;
        yzv yzvVar3 = new yzv("VIDEO", 2);
        f277905c = yzvVar3;
        yzv yzvVar4 = new yzv("UNKNOWN", 3);
        f277906d = yzvVar4;
        f277907e = new yzv[]{yzvVar, yzvVar2, yzvVar3, yzvVar4};
        values();
    }

    public static yzv valueOf(String str) {
        return (yzv) Enum.valueOf(yzv.class, str);
    }

    public static yzv[] values() {
        return (yzv[]) f277907e.clone();
    }
}
