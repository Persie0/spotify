package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class p350 extends xdr0 {

    /* JADX INFO: renamed from: c */
    public static final p350 f173558c = new p350(e450.f55982a);

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: d */
    public final int mo24520d(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // p204p.i4f, p204p.AbstractC2327r6
    /* JADX INFO: renamed from: f */
    public final void mo24521f(frh frhVar, int i, Object obj) {
        m350 m350Var = (m350) obj;
        int iMo39229o = frhVar.mo39229o(this.f260527b, i);
        m350Var.mo33760b(m350Var.mo33761d() + 1);
        int[] iArr = m350Var.f139532a;
        int i2 = m350Var.f139533b;
        m350Var.f139533b = i2 + 1;
        iArr[i2] = iMo39229o;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: g */
    public final Object mo24522g(Object obj) {
        int[] iArr = (int[]) obj;
        m350 m350Var = new m350();
        m350Var.f139532a = iArr;
        m350Var.f139533b = iArr.length;
        m350Var.mo33760b(10);
        return m350Var;
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: j */
    public final Object mo24523j() {
        return new int[0];
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: k */
    public final void mo24524k(hrh hrhVar, Object obj, int i) {
        int[] iArr = (int[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            hrhVar.mo44938e(i2, iArr[i2], this.f260527b);
        }
    }
}
