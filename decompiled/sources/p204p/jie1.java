package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jie1 {

    /* JADX INFO: renamed from: a */
    public static final jie1 f112743a;

    /* JADX INFO: renamed from: b */
    public static final jie1 f112744b;

    /* JADX INFO: renamed from: c */
    public static final jie1 f112745c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ jie1[] f112746d;

    static {
        jie1 jie1Var = new jie1("NotConnected", 0);
        f112743a = jie1Var;
        jie1 jie1Var2 = new jie1("ConnectedWithDisplay", 1);
        f112744b = jie1Var2;
        jie1 jie1Var3 = new jie1("ConnectedWithoutDisplay", 2);
        f112745c = jie1Var3;
        f112746d = new jie1[]{jie1Var, jie1Var2, jie1Var3};
    }

    public static jie1 valueOf(String str) {
        return (jie1) Enum.valueOf(jie1.class, str);
    }

    public static jie1[] values() {
        return (jie1[]) f112746d.clone();
    }
}
