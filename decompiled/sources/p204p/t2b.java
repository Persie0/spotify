package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class t2b extends p3x0 {

    /* JADX INFO: renamed from: b */
    public final rqr f216471b;

    /* JADX INFO: renamed from: c */
    public final String f216472c;

    /* JADX INFO: renamed from: d */
    public final String f216473d;

    /* JADX INFO: renamed from: e */
    public final vuu0 f216474e;

    public t2b(rqr rqrVar, String str, String str2) {
        this.f216471b = rqrVar;
        this.f216472c = str;
        this.f216473d = str2;
        this.f216474e = kif1.m56500i(new s2b((wt31) rqrVar.f201874c.get(1), this));
    }

    @Override // p204p.p3x0
    /* JADX INFO: renamed from: C1 */
    public final gqa mo28080C1() {
        return this.f216474e;
    }

    @Override // p204p.p3x0
    /* JADX INFO: renamed from: e */
    public final long mo28081e() {
        String str = this.f216473d;
        if (str == null) {
            return -1L;
        }
        byte[] bArr = a0f1.f11072a;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // p204p.p3x0
    /* JADX INFO: renamed from: f */
    public final ayd0 mo28082f() {
        String str = this.f216472c;
        if (str == null) {
            return null;
        }
        urv0 urv0Var = ayd0.f21209e;
        try {
            return zn91.m96520H(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
