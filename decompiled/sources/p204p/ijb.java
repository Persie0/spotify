package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ijb {

    /* JADX INFO: renamed from: a */
    public static final ijb f102771a;

    /* JADX INFO: renamed from: b */
    public static final ijb f102772b;

    /* JADX INFO: renamed from: c */
    public static final ijb f102773c;

    /* JADX INFO: renamed from: d */
    public static final ijb f102774d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ ijb[] f102775e;

    static {
        ijb ijbVar = new ijb("AGE_ASSURANCE_REQUIRED", 0);
        f102771a = ijbVar;
        ijb ijbVar2 = new ijb("UNDERAGE", 1);
        f102772b = ijbVar2;
        ijb ijbVar3 = new ijb("VERIFIED", 2);
        f102773c = ijbVar3;
        ijb ijbVar4 = new ijb("UNKNOWN", 3);
        f102774d = ijbVar4;
        f102775e = new ijb[]{ijbVar, ijbVar2, ijbVar3, ijbVar4};
    }

    public static ijb valueOf(String str) {
        return (ijb) Enum.valueOf(ijb.class, str);
    }

    public static ijb[] values() {
        return (ijb[]) f102775e.clone();
    }
}
