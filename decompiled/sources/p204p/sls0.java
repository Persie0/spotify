package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class sls0 {

    /* JADX INFO: renamed from: a */
    public static final sls0 f210481a;

    /* JADX INFO: renamed from: b */
    public static final sls0 f210482b;

    /* JADX INFO: renamed from: c */
    public static final sls0 f210483c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ sls0[] f210484d;

    static {
        sls0 sls0Var = new sls0("PROMPTED_PLAYLIST", 0);
        f210481a = sls0Var;
        sls0 sls0Var2 = new sls0("BLUEJAY", 1);
        f210482b = sls0Var2;
        sls0 sls0Var3 = new sls0("PERSONALIZED_SET", 2);
        f210483c = sls0Var3;
        f210484d = new sls0[]{sls0Var, sls0Var2, sls0Var3};
    }

    public static sls0 valueOf(String str) {
        return (sls0) Enum.valueOf(sls0.class, str);
    }

    public static sls0[] values() {
        return (sls0[]) f210484d.clone();
    }
}
