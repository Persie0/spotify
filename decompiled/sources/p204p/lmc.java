package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class lmc {

    /* JADX INFO: renamed from: a */
    public static final lmc f134853a;

    /* JADX INFO: renamed from: b */
    public static final lmc f134854b;

    /* JADX INFO: renamed from: c */
    public static final lmc f134855c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ lmc[] f134856d;

    static {
        lmc lmcVar = new lmc("EMAIL", 0);
        f134853a = lmcVar;
        lmc lmcVar2 = new lmc("PUSH", 1);
        f134854b = lmcVar2;
        lmc lmcVar3 = new lmc("ALL", 2);
        f134855c = lmcVar3;
        f134856d = new lmc[]{lmcVar, lmcVar2, lmcVar3};
    }

    public static lmc valueOf(String str) {
        return (lmc) Enum.valueOf(lmc.class, str);
    }

    public static lmc[] values() {
        return (lmc[]) f134856d.clone();
    }
}
