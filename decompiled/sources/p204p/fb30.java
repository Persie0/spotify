package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class fb30 {

    /* JADX INFO: renamed from: a */
    public static final fb30 f67699a;

    /* JADX INFO: renamed from: b */
    public static final fb30 f67700b;

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ fb30[] f67701c;

    static {
        fb30 fb30Var = new fb30("DISMISSED_SWIPED_DOWN", 0);
        f67699a = fb30Var;
        fb30 fb30Var2 = new fb30("DISMISSED_BACK_PRESSED", 1);
        f67700b = fb30Var2;
        f67701c = new fb30[]{fb30Var, fb30Var2};
    }

    public static fb30 valueOf(String str) {
        return (fb30) Enum.valueOf(fb30.class, str);
    }

    public static fb30[] values() {
        return (fb30[]) f67701c.clone();
    }
}
