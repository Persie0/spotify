package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class baj {

    /* JADX INFO: renamed from: a */
    public static final baj f25218a;

    /* JADX INFO: renamed from: b */
    public static final baj f25219b;

    /* JADX INFO: renamed from: c */
    public static final baj f25220c;

    /* JADX INFO: renamed from: d */
    public static final baj f25221d;

    /* JADX INFO: renamed from: e */
    public static final baj f25222e;

    /* JADX INFO: renamed from: f */
    public static final baj f25223f;

    /* JADX INFO: renamed from: g */
    public static final baj f25224g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ baj[] f25225h;

    static {
        baj bajVar = new baj("Unspecified", 0);
        f25218a = bajVar;
        baj bajVar2 = new baj("Audio", 1);
        f25219b = bajVar2;
        baj bajVar3 = new baj("Video", 2);
        f25220c = bajVar3;
        baj bajVar4 = new baj("Parrot", 3);
        f25221d = bajVar4;
        baj bajVar5 = new baj("Lossless", 4);
        f25222e = bajVar5;
        baj bajVar6 = new baj("Generated", 5);
        f25223f = bajVar6;
        baj bajVar7 = new baj("Unrecognized", 6);
        f25224g = bajVar7;
        f25225h = new baj[]{bajVar, bajVar2, bajVar3, bajVar4, bajVar5, bajVar6, bajVar7};
    }

    public static baj valueOf(String str) {
        return (baj) Enum.valueOf(baj.class, str);
    }

    public static baj[] values() {
        return (baj[]) f25225h.clone();
    }
}
