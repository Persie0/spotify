package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class sg11 extends xdr0 {

    /* JADX INFO: renamed from: c */
    public static final sg11 f208685c = new sg11(ug11.f229951a);

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: d */
    public final int mo24520d(Object obj) {
        return ((short[]) obj).length;
    }

    @Override // p204p.i4f, p204p.AbstractC2327r6
    /* JADX INFO: renamed from: f */
    public final void mo24521f(frh frhVar, int i, Object obj) {
        rg11 rg11Var = (rg11) obj;
        short sMo39223b0 = frhVar.mo39223b0(this.f260527b, i);
        rg11Var.mo33760b(rg11Var.mo33761d() + 1);
        short[] sArr = rg11Var.f198798a;
        int i2 = rg11Var.f198799b;
        rg11Var.f198799b = i2 + 1;
        sArr[i2] = sMo39223b0;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: g */
    public final Object mo24522g(Object obj) {
        short[] sArr = (short[]) obj;
        rg11 rg11Var = new rg11();
        rg11Var.f198798a = sArr;
        rg11Var.f198799b = sArr.length;
        rg11Var.mo33760b(10);
        return rg11Var;
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: j */
    public final Object mo24523j() {
        return new short[0];
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: k */
    public final void mo24524k(hrh hrhVar, Object obj, int i) {
        short[] sArr = (short[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            hrhVar.mo44944y(this.f260527b, i2, sArr[i2]);
        }
    }
}
