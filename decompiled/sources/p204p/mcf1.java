package p204p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mcf1 {
    static {
        faf1 faf1VarM44159y = gaf1.m44159y();
        faf1VarM44159y.m41148i(-315576000000L);
        faf1VarM44159y.m41149j(-999999999);
        faf1 faf1VarM44159y2 = gaf1.m44159y();
        faf1VarM44159y2.m41148i(315576000000L);
        faf1VarM44159y2.m41149j(999999999);
        faf1 faf1VarM44159y3 = gaf1.m44159y();
        faf1VarM44159y3.m41148i(0L);
        faf1VarM44159y3.m41149j(0);
    }

    /* JADX INFO: renamed from: a */
    public static void m61460a(gaf1 gaf1Var) {
        long jM44163w = gaf1Var.m44163w();
        int iM44164x = gaf1Var.m44164x();
        if (jM44163w >= -315576000000L && jM44163w <= 315576000000L && iM44164x >= -999999999 && iM44164x < 1000000000) {
            if (jM44163w >= 0 && iM44164x >= 0) {
                return;
            }
            if (jM44163w <= 0 && iM44164x <= 0) {
                return;
            }
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iM44164x).length() + String.valueOf(jM44163w).length() + 135 + 89);
        sb.append("Duration is not valid. See proto definition for valid values. Seconds (");
        sb.append(jM44163w);
        sb.append(") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (");
        throw new IllegalArgumentException(klh.m56832d(iM44164x, ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", sb));
    }

    /* JADX INFO: renamed from: b */
    public static long m61461b(gaf1 gaf1Var) {
        m61460a(gaf1Var);
        return Math.addExact(Math.multiplyExact(gaf1Var.m44163w(), 1000L), gaf1Var.m44164x() / 1000000);
    }

    /* JADX INFO: renamed from: c */
    public static gaf1 m61462c(int i, long j) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = Math.addExact(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        faf1 faf1VarM44159y = gaf1.m44159y();
        faf1VarM44159y.m41148i(j);
        faf1VarM44159y.m41149j(i);
        gaf1 gaf1Var = (gaf1) faf1VarM44159y.m52814g();
        m61460a(gaf1Var);
        return gaf1Var;
    }
}
