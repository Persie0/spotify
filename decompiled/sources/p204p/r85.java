package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class r85 {

    /* JADX INFO: renamed from: a */
    public static final r85 f196710a;

    /* JADX INFO: renamed from: b */
    public static final r85 f196711b;

    /* JADX INFO: renamed from: c */
    public static final r85 f196712c;

    /* JADX INFO: renamed from: d */
    public static final r85 f196713d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ r85[] f196714e;

    static {
        r85 r85Var = new r85("VALID", 0);
        f196710a = r85Var;
        r85 r85Var2 = new r85("INVALID_URI_PROVIDER", 1);
        f196711b = r85Var2;
        r85 r85Var3 = new r85("INVALID_REQUESTER_PACKAGE", 2);
        f196712c = r85Var3;
        r85 r85Var4 = new r85("SIGNATURE_CHECK_FAILED", 3);
        f196713d = r85Var4;
        f196714e = new r85[]{r85Var, r85Var2, r85Var3, r85Var4};
    }

    public static r85 valueOf(String str) {
        return (r85) Enum.valueOf(r85.class, str);
    }

    public static r85[] values() {
        return (r85[]) f196714e.clone();
    }
}
