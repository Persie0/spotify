package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class jbf1 {

    /* JADX INFO: renamed from: a */
    public static final jbf1 f110794a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ jbf1[] f110795b;

    static {
        jbf1 jbf1Var = new jbf1("DEFAULT", 0);
        f110794a = jbf1Var;
        f110795b = new jbf1[]{jbf1Var, new jbf1("SIGNED", 1), new jbf1("FIXED", 2)};
    }

    public static jbf1[] values() {
        return (jbf1[]) f110795b.clone();
    }
}
