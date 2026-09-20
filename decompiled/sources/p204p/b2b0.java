package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class b2b0 extends xdr0 {

    /* JADX INFO: renamed from: c */
    public static final b2b0 f22560c = new b2b0(u2b0.f226058a);

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: d */
    public final int mo24520d(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // p204p.i4f, p204p.AbstractC2327r6
    /* JADX INFO: renamed from: f */
    public final void mo24521f(frh frhVar, int i, Object obj) {
        x1b0 x1b0Var = (x1b0) obj;
        long jMo39227i0 = frhVar.mo39227i0(this.f260527b, i);
        x1b0Var.mo33760b(x1b0Var.mo33761d() + 1);
        long[] jArr = x1b0Var.f257123a;
        int i2 = x1b0Var.f257124b;
        x1b0Var.f257124b = i2 + 1;
        jArr[i2] = jMo39227i0;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: g */
    public final Object mo24522g(Object obj) {
        long[] jArr = (long[]) obj;
        x1b0 x1b0Var = new x1b0();
        x1b0Var.f257123a = jArr;
        x1b0Var.f257124b = jArr.length;
        x1b0Var.mo33760b(10);
        return x1b0Var;
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: j */
    public final Object mo24523j() {
        return new long[0];
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: k */
    public final void mo24524k(hrh hrhVar, Object obj, int i) {
        long[] jArr = (long[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            hrhVar.mo44942l(this.f260527b, i2, jArr[i2]);
        }
    }
}
