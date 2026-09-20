package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class z7r {

    /* JADX INFO: renamed from: a */
    public static final z7r f280272a;

    /* JADX INFO: renamed from: b */
    public static final z7r f280273b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ z7r[] f280274c;

    static {
        z7r z7rVar = new z7r("CONSENT_ONLY", 0);
        f280272a = z7rVar;
        z7r z7rVar2 = new z7r("CONSENT_AND_PERMISSION", 1);
        f280273b = z7rVar2;
        f280274c = new z7r[]{z7rVar, z7rVar2};
    }

    public static z7r valueOf(String str) {
        return (z7r) Enum.valueOf(z7r.class, str);
    }

    public static z7r[] values() {
        return (z7r[]) f280274c.clone();
    }
}
