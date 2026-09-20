package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class kaa0 {

    /* JADX INFO: renamed from: a */
    public static final kaa0 f120848a;

    /* JADX INFO: renamed from: b */
    public static final kaa0 f120849b;

    /* JADX INFO: renamed from: c */
    public static final kaa0 f120850c;

    /* JADX INFO: renamed from: d */
    public static final kaa0 f120851d;

    /* JADX INFO: renamed from: e */
    public static final kaa0 f120852e;

    /* JADX INFO: renamed from: f */
    public static final kaa0 f120853f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ kaa0[] f120854g;

    static {
        kaa0 kaa0Var = new kaa0("CACHE_FIRST", 0);
        f120848a = kaa0Var;
        kaa0 kaa0Var2 = new kaa0("RESTORE_OR_REVALIDATE", 1);
        f120849b = kaa0Var2;
        kaa0 kaa0Var3 = new kaa0("REVALIDATE", 2);
        f120850c = kaa0Var3;
        kaa0 kaa0Var4 = new kaa0("CUSTOM_TIMEOUT", 3);
        f120851d = kaa0Var4;
        kaa0 kaa0Var5 = new kaa0("OFFLINE_FALLBACK", 4);
        f120852e = kaa0Var5;
        kaa0 kaa0Var6 = new kaa0("REFRESH", 5);
        f120853f = kaa0Var6;
        f120854g = new kaa0[]{kaa0Var, kaa0Var2, kaa0Var3, kaa0Var4, kaa0Var5, kaa0Var6};
    }

    public static kaa0 valueOf(String str) {
        return (kaa0) Enum.valueOf(kaa0.class, str);
    }

    public static kaa0[] values() {
        return (kaa0[]) f120854g.clone();
    }
}
