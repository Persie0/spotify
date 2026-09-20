package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class kkq {

    /* JADX INFO: renamed from: a */
    public static final kkq f123687a;

    /* JADX INFO: renamed from: b */
    public static final kkq f123688b;

    /* JADX INFO: renamed from: c */
    public static final kkq f123689c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ kkq[] f123690d;

    static {
        kkq kkqVar = new kkq("SHOWN", 0);
        f123687a = kkqVar;
        kkq kkqVar2 = new kkq("HIDDEN", 1);
        f123688b = kkqVar2;
        kkq kkqVar3 = new kkq("UNKNOWN", 2);
        f123689c = kkqVar3;
        f123690d = new kkq[]{kkqVar, kkqVar2, kkqVar3};
    }

    public static kkq valueOf(String str) {
        return (kkq) Enum.valueOf(kkq.class, str);
    }

    public static kkq[] values() {
        return (kkq[]) f123690d.clone();
    }
}
