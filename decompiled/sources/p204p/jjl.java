package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class jjl {

    /* JADX INFO: renamed from: a */
    public static final jjl f113052a;

    /* JADX INFO: renamed from: b */
    public static final jjl f113053b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ jjl[] f113054c;

    static {
        jjl jjlVar = new jjl("OpenEntityPage", 0);
        f113052a = jjlVar;
        jjl jjlVar2 = new jjl("OpenDetailsPage", 1);
        f113053b = jjlVar2;
        f113054c = new jjl[]{jjlVar, jjlVar2};
    }

    public static jjl valueOf(String str) {
        return (jjl) Enum.valueOf(jjl.class, str);
    }

    public static jjl[] values() {
        return (jjl[]) f113054c.clone();
    }
}
