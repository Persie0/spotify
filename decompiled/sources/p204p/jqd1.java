package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class jqd1 {

    /* JADX INFO: renamed from: a */
    public static final jqd1 f114895a;

    /* JADX INFO: renamed from: b */
    public static final jqd1 f114896b;

    /* JADX INFO: renamed from: c */
    public static final jqd1 f114897c;

    /* JADX INFO: renamed from: d */
    public static final jqd1 f114898d;

    /* JADX INFO: renamed from: e */
    public static final jqd1 f114899e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ jqd1[] f114900f;

    /* JADX INFO: Fake field, exist only in values array */
    jqd1 EF0;

    static {
        jqd1 jqd1Var = new jqd1("INTENT_IS_NOT_FROM_WHATSAPP", 0);
        jqd1 jqd1Var2 = new jqd1("OTP_CODE_NOT_RECEIVED", 1);
        f114895a = jqd1Var2;
        jqd1 jqd1Var3 = new jqd1("HANDSHAKE_ID_MISSING", 2);
        f114896b = jqd1Var3;
        jqd1 jqd1Var4 = new jqd1("HANDSHAKE_ID_INVALID_FORMAT", 3);
        f114897c = jqd1Var4;
        jqd1 jqd1Var5 = new jqd1("HANDSHAKE_ID_MISMATCH", 4);
        f114898d = jqd1Var5;
        jqd1 jqd1Var6 = new jqd1("GENERIC_EXCEPTION", 5);
        f114899e = jqd1Var6;
        f114900f = new jqd1[]{jqd1Var, jqd1Var2, jqd1Var3, jqd1Var4, jqd1Var5, jqd1Var6};
    }

    public static jqd1 valueOf(String str) {
        return (jqd1) Enum.valueOf(jqd1.class, str);
    }

    public static jqd1[] values() {
        return (jqd1[]) f114900f.clone();
    }
}
