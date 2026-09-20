package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j8u {

    /* JADX INFO: renamed from: a */
    public static final j8u f110007a;

    /* JADX INFO: renamed from: b */
    public static final j8u f110008b;

    /* JADX INFO: renamed from: c */
    public static final j8u f110009c;

    /* JADX INFO: renamed from: d */
    public static final j8u f110010d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ j8u[] f110011e;

    static {
        j8u j8uVar = new j8u("FLAT", 0);
        f110007a = j8uVar;
        j8u j8uVar2 = new j8u("SQUARE", 1);
        f110008b = j8uVar2;
        j8u j8uVar3 = new j8u("SQUARE_WITH_SKIN_TONE_CIRCLE", 2);
        f110009c = j8uVar3;
        j8u j8uVar4 = new j8u("BIDIRECTIONAL", 3);
        f110010d = j8uVar4;
        f110011e = new j8u[]{j8uVar, j8uVar2, j8uVar3, j8uVar4};
    }

    public static j8u valueOf(String str) {
        return (j8u) Enum.valueOf(j8u.class, str);
    }

    public static j8u[] values() {
        return (j8u[]) f110011e.clone();
    }
}
