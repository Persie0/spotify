package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class eay {

    /* JADX INFO: renamed from: a */
    public static final eay f57736a;

    /* JADX INFO: renamed from: b */
    public static final eay f57737b;

    /* JADX INFO: renamed from: c */
    public static final eay f57738c;

    /* JADX INFO: renamed from: d */
    public static final eay f57739d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ eay[] f57740e;

    static {
        eay eayVar = new eay("Upload", 0);
        f57736a = eayVar;
        eay eayVar2 = new eay("Image", 1);
        eay eayVar3 = new eay("RateLimited", 2);
        f57737b = eayVar3;
        eay eayVar4 = new eay("CapacityExceeded", 3);
        f57738c = eayVar4;
        eay eayVar5 = new eay("Processing", 4);
        f57739d = eayVar5;
        f57740e = new eay[]{eayVar, eayVar2, eayVar3, eayVar4, eayVar5};
    }

    public static eay valueOf(String str) {
        return (eay) Enum.valueOf(eay.class, str);
    }

    public static eay[] values() {
        return (eay[]) f57740e.clone();
    }
}
