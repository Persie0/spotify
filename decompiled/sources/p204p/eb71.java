package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class eb71 {

    /* JADX INFO: renamed from: a */
    public final db71 f57846a;

    /* JADX INFO: renamed from: b */
    public jo70 f57847b = null;

    /* JADX INFO: renamed from: c */
    public jo70 f57848c;

    public eb71(db71 db71Var, jo70 jo70Var) {
        this.f57846a = db71Var;
        this.f57848c = jo70Var;
    }

    /* JADX INFO: renamed from: a */
    public final long m38355a(long j) {
        tiv0 tiv0VarMo30001I;
        jo70 jo70Var = this.f57847b;
        tiv0 tiv0Var = tiv0.f220750e;
        if (jo70Var != null) {
            if (jo70Var.mo30016a()) {
                jo70 jo70Var2 = this.f57848c;
                tiv0VarMo30001I = jo70Var2 != null ? jo70Var2.mo30001I(jo70Var, true) : null;
            } else {
                tiv0VarMo30001I = tiv0Var;
            }
            if (tiv0VarMo30001I != null) {
                tiv0Var = tiv0VarMo30001I;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = tiv0Var.f220751a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = tiv0Var.f220753c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = tiv0Var.f220752b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = tiv0Var.f220754d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
    }

    /* JADX INFO: renamed from: b */
    public final int m38356b(long j, boolean z) {
        if (z) {
            j = m38355a(j);
        }
        return this.f57846a.f47231b.m95500g(m38358d(j));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m38357c(long j) {
        long jM38358d = m38358d(m38355a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jM38358d));
        db71 db71Var = this.f57846a;
        int iM95498e = db71Var.f47231b.m95498e(fIntBitsToFloat);
        int i = (int) (jM38358d >> 32);
        return Float.intBitsToFloat(i) >= db71Var.m35536g(iM95498e) && Float.intBitsToFloat(i) <= db71Var.m35537h(iM95498e);
    }

    /* JADX INFO: renamed from: d */
    public final long m38358d(long j) {
        jo70 jo70Var;
        jo70 jo70Var2 = this.f57847b;
        if (jo70Var2 == null) {
            return j;
        }
        if (!jo70Var2.mo30016a()) {
            jo70Var2 = null;
        }
        if (jo70Var2 == null || (jo70Var = this.f57848c) == null) {
            return j;
        }
        jo70 jo70Var3 = jo70Var.mo30016a() ? jo70Var : null;
        return jo70Var3 == null ? j : jo70Var2.mo29996F(jo70Var3, j);
    }

    /* JADX INFO: renamed from: e */
    public final long m38359e(long j) {
        jo70 jo70Var;
        jo70 jo70Var2 = this.f57847b;
        if (jo70Var2 == null) {
            return j;
        }
        if (!jo70Var2.mo30016a()) {
            jo70Var2 = null;
        }
        if (jo70Var2 == null || (jo70Var = this.f57848c) == null) {
            return j;
        }
        jo70 jo70Var3 = jo70Var.mo30016a() ? jo70Var : null;
        return jo70Var3 == null ? j : jo70Var3.mo29996F(jo70Var2, j);
    }
}
