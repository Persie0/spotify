package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class yr91 extends xdr0 {

    /* JADX INFO: renamed from: c */
    public static final yr91 f275429c = new yr91(zr91.f285592a);

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: d */
    public final int mo24520d(Object obj) {
        return ((wr91) obj).f254297a.length;
    }

    @Override // p204p.i4f, p204p.AbstractC2327r6
    /* JADX INFO: renamed from: f */
    public final void mo24521f(frh frhVar, int i, Object obj) {
        xr91 xr91Var = (xr91) obj;
        int iMo39228n = frhVar.mo39231t(this.f260527b, i).mo39228n();
        xr91Var.mo33760b(xr91Var.mo33761d() + 1);
        int[] iArr = xr91Var.f265303a;
        int i2 = xr91Var.f265304b;
        xr91Var.f265304b = i2 + 1;
        iArr[i2] = iMo39228n;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: g */
    public final Object mo24522g(Object obj) {
        int[] iArr = ((wr91) obj).f254297a;
        xr91 xr91Var = new xr91();
        xr91Var.f265303a = iArr;
        xr91Var.f265304b = iArr.length;
        xr91Var.mo33760b(10);
        return xr91Var;
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: j */
    public final Object mo24523j() {
        return new wr91(new int[0]);
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: k */
    public final void mo24524k(hrh hrhVar, Object obj, int i) {
        int[] iArr = ((wr91) obj).f254297a;
        for (int i2 = 0; i2 < i; i2++) {
            hrhVar.mo44933L(this.f260527b, i2).mo35819a0(iArr[i2]);
        }
    }
}
