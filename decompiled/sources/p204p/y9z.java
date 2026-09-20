package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class y9z {

    /* JADX INFO: renamed from: a */
    public static final y9z f270693a;

    /* JADX INFO: renamed from: b */
    public static final y9z f270694b;

    /* JADX INFO: renamed from: c */
    public static final y9z f270695c;

    /* JADX INFO: renamed from: d */
    public static final y9z f270696d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ y9z[] f270697e;

    static {
        y9z y9zVar = new y9z("AD_STORAGE", 0);
        f270693a = y9zVar;
        y9z y9zVar2 = new y9z("ANALYTICS_STORAGE", 1);
        f270694b = y9zVar2;
        y9z y9zVar3 = new y9z("AD_USER_DATA", 2);
        f270695c = y9zVar3;
        y9z y9zVar4 = new y9z("AD_PERSONALIZATION", 3);
        f270696d = y9zVar4;
        f270697e = new y9z[]{y9zVar, y9zVar2, y9zVar3, y9zVar4};
    }

    public static y9z valueOf(String str) {
        return (y9z) Enum.valueOf(y9z.class, str);
    }

    public static y9z[] values() {
        return (y9z[]) f270697e.clone();
    }
}
