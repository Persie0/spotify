package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class c8r {

    /* JADX INFO: renamed from: a */
    public static final c8r f35305a;

    /* JADX INFO: renamed from: b */
    public static final c8r f35306b;

    /* JADX INFO: renamed from: c */
    public static final c8r f35307c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ c8r[] f35308d;

    static {
        c8r c8rVar = new c8r("USER_CONSENTED", 0);
        f35305a = c8rVar;
        c8r c8rVar2 = new c8r("USER_ACCEPTED_PERMISSION_DENIED", 1);
        f35306b = c8rVar2;
        c8r c8rVar3 = new c8r("USER_DISMISSED", 2);
        f35307c = c8rVar3;
        f35308d = new c8r[]{c8rVar, c8rVar2, c8rVar3};
    }

    public static c8r valueOf(String str) {
        return (c8r) Enum.valueOf(c8r.class, str);
    }

    public static c8r[] values() {
        return (c8r[]) f35308d.clone();
    }
}
