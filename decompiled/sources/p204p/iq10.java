package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class iq10 {

    /* JADX INFO: renamed from: a */
    public static final iq10 f104599a;

    /* JADX INFO: renamed from: b */
    public static final iq10 f104600b;

    /* JADX INFO: renamed from: c */
    public static final iq10 f104601c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ iq10[] f104602d;

    static {
        iq10 iq10Var = new iq10("GRAB", 0);
        f104599a = iq10Var;
        iq10 iq10Var2 = new iq10("DO_NOT_GRAB", 1);
        f104600b = iq10Var2;
        iq10 iq10Var3 = new iq10("INDIFFERENT", 2);
        f104601c = iq10Var3;
        f104602d = new iq10[]{iq10Var, iq10Var2, iq10Var3};
    }

    public static iq10 valueOf(String str) {
        return (iq10) Enum.valueOf(iq10.class, str);
    }

    public static iq10[] values() {
        return (iq10[]) f104602d.clone();
    }
}
