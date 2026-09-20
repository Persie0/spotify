package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class hrb {

    /* JADX INFO: renamed from: a */
    public static final hrb f94384a;

    /* JADX INFO: renamed from: b */
    public static final hrb f94385b;

    /* JADX INFO: renamed from: c */
    public static final hrb f94386c;

    /* JADX INFO: renamed from: d */
    public static final hrb f94387d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ hrb[] f94388e;

    static {
        hrb hrbVar = new hrb("IMAGE", 0);
        f94384a = hrbVar;
        hrb hrbVar2 = new hrb("VIDEO", 1);
        f94385b = hrbVar2;
        hrb hrbVar3 = new hrb("VIDEO_LOOPING", 2);
        f94386c = hrbVar3;
        hrb hrbVar4 = new hrb("VIDEO_LOOPING_RANDOM", 3);
        f94387d = hrbVar4;
        f94388e = new hrb[]{hrbVar, hrbVar2, hrbVar3, hrbVar4};
    }

    public static hrb valueOf(String str) {
        return (hrb) Enum.valueOf(hrb.class, str);
    }

    public static hrb[] values() {
        return (hrb[]) f94388e.clone();
    }
}
