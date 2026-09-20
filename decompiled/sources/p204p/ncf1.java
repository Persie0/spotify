package p204p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ncf1 {

    /* JADX INFO: renamed from: a */
    public static final q32 f152507a;

    static {
        xbf1 xbf1VarM93259y = ybf1.m93259y();
        xbf1VarM93259y.m90319i(-62135596800L);
        xbf1VarM93259y.m90320j(0);
        xbf1 xbf1VarM93259y2 = ybf1.m93259y();
        xbf1VarM93259y2.m90319i(253402300799L);
        xbf1VarM93259y2.m90320j(999999999);
        xbf1 xbf1VarM93259y3 = ybf1.m93259y();
        xbf1VarM93259y3.m90319i(0L);
        xbf1VarM93259y3.m90320j(0);
        f152507a = new q32(19);
        try {
            Class.forName("j$.time.Instant").getMethod("now", null);
        } catch (Exception unused) {
        }
        try {
            Class.forName("j$.time.Instant").getMethod("getEpochSecond", null);
        } catch (Exception unused2) {
        }
        try {
            Class.forName("j$.time.Instant").getMethod("getNano", null);
        } catch (Exception unused3) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m64134a(ybf1 ybf1Var) {
        long jM93261w = ybf1Var.m93261w();
        boolean z = jM93261w >= -62135596800L && jM93261w <= 253402300799L;
        int iM93262x = ybf1Var.m93262x();
        if (!z || iM93262x < 0 || iM93262x >= 1000000000) {
            StringBuilder sb = new StringBuilder(String.valueOf(iM93262x).length() + String.valueOf(jM93261w).length() + 135 + 37);
            sb.append("Timestamp is not valid. See proto definition for valid values. Seconds (");
            sb.append(jM93261w);
            sb.append(") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (");
            throw new IllegalArgumentException(klh.m56832d(iM93262x, ") must be in range [0, +999,999,999].", sb));
        }
    }

    /* JADX INFO: renamed from: b */
    public static ybf1 m64135b(int i, long j) {
        if (j < -62135596800L || j > 253402300799L) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 117);
            sb.append("Timestamp is not valid. Input seconds is too large. Seconds (");
            sb.append(j);
            sb.append(") must be in range [-62,135,596,800, +253,402,300,799]. ");
            throw new IllegalArgumentException(sb.toString());
        }
        if (i <= -1000000000 || i >= 1000000000) {
            j = Math.addExact(j, i / 1000000000);
            i %= 1000000000;
        }
        if (i < 0) {
            i += 1000000000;
            j = Math.subtractExact(j, 1L);
        }
        xbf1 xbf1VarM93259y = ybf1.m93259y();
        xbf1VarM93259y.m90319i(j);
        xbf1VarM93259y.m90320j(i);
        ybf1 ybf1Var = (ybf1) xbf1VarM93259y.m52814g();
        m64134a(ybf1Var);
        return ybf1Var;
    }
}
