package p204p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public abstract class xn91 {

    /* JADX INFO: renamed from: a */
    public static final vn91 f263563a;

    /* JADX INFO: renamed from: b */
    public static final tn91 f263564b;

    /* JADX INFO: renamed from: c */
    public static final wn91 f263565c;

    /* JADX INFO: renamed from: d */
    public static final un91 f263566d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ xn91[] f263567e;

    static {
        vn91 vn91Var = new vn91();
        f263563a = vn91Var;
        tn91 tn91Var = new tn91();
        f263564b = tn91Var;
        wn91 wn91Var = new wn91();
        f263565c = wn91Var;
        un91 un91Var = new un91();
        f263566d = un91Var;
        f263567e = new xn91[]{vn91Var, tn91Var, wn91Var, un91Var};
    }

    /* JADX INFO: renamed from: b */
    public static xn91 m91500b(d6a1 d6a1Var) {
        if (d6a1Var.mo36064D0()) {
            return f263564b;
        }
        if (d6a1Var instanceof pkq) {
        }
        return qjg1.m72919k(unq0.f232220N0.m83588f0(), kvf1.m57480r(d6a1Var), in91.f103932d) ? f263566d : f263565c;
    }

    public static xn91 valueOf(String str) {
        return (xn91) Enum.valueOf(xn91.class, str);
    }

    public static xn91[] values() {
        return (xn91[]) f263567e.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract xn91 mo81169a(d6a1 d6a1Var);
}
