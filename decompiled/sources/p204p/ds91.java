package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ds91 extends xdr0 {

    /* JADX INFO: renamed from: c */
    public static final ds91 f52524c = new ds91(es91.f62315a);

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: d */
    public final int mo24520d(Object obj) {
        return ((bs91) obj).f30263a.length;
    }

    @Override // p204p.i4f, p204p.AbstractC2327r6
    /* JADX INFO: renamed from: f */
    public final void mo24521f(frh frhVar, int i, Object obj) {
        cs91 cs91Var = (cs91) obj;
        long jMo39232u = frhVar.mo39231t(this.f260527b, i).mo39232u();
        cs91Var.mo33760b(cs91Var.mo33761d() + 1);
        long[] jArr = cs91Var.f41497a;
        int i2 = cs91Var.f41498b;
        cs91Var.f41498b = i2 + 1;
        jArr[i2] = jMo39232u;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: g */
    public final Object mo24522g(Object obj) {
        long[] jArr = ((bs91) obj).f30263a;
        cs91 cs91Var = new cs91();
        cs91Var.f41497a = jArr;
        cs91Var.f41498b = jArr.length;
        cs91Var.mo33760b(10);
        return cs91Var;
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: j */
    public final Object mo24523j() {
        return new bs91(new long[0]);
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: k */
    public final void mo24524k(hrh hrhVar, Object obj, int i) {
        long[] jArr = ((bs91) obj).f30263a;
        for (int i2 = 0; i2 < i; i2++) {
            hrhVar.mo44933L(this.f260527b, i2).mo35829z(jArr[i2]);
        }
    }
}
