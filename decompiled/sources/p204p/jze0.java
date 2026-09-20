package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class jze0 {

    /* JADX INFO: renamed from: a */
    public static final jze0 f117707a;

    /* JADX INFO: renamed from: b */
    public static final jze0 f117708b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ jze0[] f117709c;

    static {
        jze0 jze0Var = new jze0("CancelButtonClicked", 0);
        f117707a = jze0Var;
        jze0 jze0Var2 = new jze0("EnableMixButtonClicked", 1);
        f117708b = jze0Var2;
        f117709c = new jze0[]{jze0Var, jze0Var2};
    }

    public static jze0 valueOf(String str) {
        return (jze0) Enum.valueOf(jze0.class, str);
    }

    public static jze0[] values() {
        return (jze0[]) f117709c.clone();
    }
}
