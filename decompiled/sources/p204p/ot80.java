package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ot80 {

    /* JADX INFO: renamed from: a */
    public static final ot80 f168997a;

    /* JADX INFO: renamed from: b */
    public static final ot80 f168998b;

    /* JADX INFO: renamed from: c */
    public static final ot80 f168999c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ot80[] f169000d;

    static {
        ot80 ot80Var = new ot80("NO_LENGTH_RESTRICTION", 0);
        f168997a = ot80Var;
        ot80 ot80Var2 = new ot80("RESTRICT_SOURCE_LENGTH_TO_50", 1);
        f168998b = ot80Var2;
        ot80 ot80Var3 = new ot80("RESTRICT_SOURCE_LENGTH_TO_500", 2);
        f168999c = ot80Var3;
        f169000d = new ot80[]{ot80Var, ot80Var2, ot80Var3};
    }

    public static ot80 valueOf(String str) {
        return (ot80) Enum.valueOf(ot80.class, str);
    }

    public static ot80[] values() {
        return (ot80[]) f169000d.clone();
    }
}
