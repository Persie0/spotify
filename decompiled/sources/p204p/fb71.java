package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fb71 {

    /* JADX INFO: renamed from: a */
    public final n771 f67736a;

    /* JADX INFO: renamed from: b */
    public th00 f67737b;

    /* JADX INFO: renamed from: c */
    public final n771 f67738c;

    /* JADX INFO: renamed from: d */
    public final yum0 f67739d;

    /* JADX INFO: renamed from: e */
    public final yum0 f67740e;

    /* JADX INFO: renamed from: f */
    public final yum0 f67741f;

    /* JADX INFO: renamed from: g */
    public final yum0 f67742g;

    /* JADX INFO: renamed from: h */
    public final rka f67743h;

    public fb71() {
        n771 n771Var = new n771();
        this.f67736a = n771Var;
        this.f67738c = n771Var;
        zhi0 zhi0Var = zhi0.f282936c;
        this.f67739d = new yum0(null, zhi0Var);
        this.f67740e = new yum0(null, zhi0Var);
        this.f67741f = new yum0(null, zhi0Var);
        this.f67742g = sam.m77645B(new ybs(0));
        this.f67743h = new rka();
    }

    /* JADX INFO: renamed from: a */
    public final long m41217a(long j) {
        tiv0 tiv0VarMo30001I;
        jo70 jo70VarM41221e = m41221e();
        tiv0 tiv0Var = tiv0.f220750e;
        if (jo70VarM41221e != null) {
            if (jo70VarM41221e.mo30016a()) {
                jo70 jo70VarM41218b = m41218b();
                tiv0VarMo30001I = jo70VarM41218b != null ? jo70VarM41218b.mo30001I(jo70VarM41221e, true) : null;
            } else {
                tiv0VarMo30001I = tiv0Var;
            }
            if (tiv0VarMo30001I != null) {
                tiv0Var = tiv0VarMo30001I;
            }
        }
        return lug1.m60015y(j, tiv0Var);
    }

    /* JADX INFO: renamed from: b */
    public final jo70 m41218b() {
        return (jo70) this.f67741f.getValue();
    }

    /* JADX INFO: renamed from: c */
    public final db71 m41219c() {
        return (db71) this.f67738c.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final int m41220d(long j, boolean z) {
        db71 db71VarM41219c = m41219c();
        if (db71VarM41219c == null) {
            return -1;
        }
        if (z) {
            j = m41217a(j);
        }
        return db71VarM41219c.f47231b.m95500g(lug1.m59985B(this, j));
    }

    /* JADX INFO: renamed from: e */
    public final jo70 m41221e() {
        return (jo70) this.f67739d.getValue();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m41222f(long j) {
        db71 db71VarM41219c = m41219c();
        if (db71VarM41219c == null) {
            return false;
        }
        long jM59985B = lug1.m59985B(this, m41217a(j));
        int iM95498e = db71VarM41219c.f47231b.m95498e(Float.intBitsToFloat((int) (4294967295L & jM59985B)));
        int i = (int) (jM59985B >> 32);
        return Float.intBitsToFloat(i) >= db71VarM41219c.m35536g(iM95498e) && Float.intBitsToFloat(i) <= db71VarM41219c.m35537h(iM95498e);
    }
}
