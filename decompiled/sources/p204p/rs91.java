package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rs91 extends xdr0 {

    /* JADX INFO: renamed from: c */
    public static final rs91 f202240c = new rs91(ss91.f213550a);

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: d */
    public final int mo24520d(Object obj) {
        return ((ps91) obj).f180794a.length;
    }

    @Override // p204p.i4f, p204p.AbstractC2327r6
    /* JADX INFO: renamed from: f */
    public final void mo24521f(frh frhVar, int i, Object obj) {
        qs91 qs91Var = (qs91) obj;
        short sMo39212C = frhVar.mo39231t(this.f260527b, i).mo39212C();
        qs91Var.mo33760b(qs91Var.mo33761d() + 1);
        short[] sArr = qs91Var.f192047a;
        int i2 = qs91Var.f192048b;
        qs91Var.f192048b = i2 + 1;
        sArr[i2] = sMo39212C;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: g */
    public final Object mo24522g(Object obj) {
        short[] sArr = ((ps91) obj).f180794a;
        qs91 qs91Var = new qs91();
        qs91Var.f192047a = sArr;
        qs91Var.f192048b = sArr.length;
        qs91Var.mo33760b(10);
        return qs91Var;
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: j */
    public final Object mo24523j() {
        return new ps91(new short[0]);
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: k */
    public final void mo24524k(hrh hrhVar, Object obj, int i) {
        short[] sArr = ((ps91) obj).f180794a;
        for (int i2 = 0; i2 < i; i2++) {
            hrhVar.mo44933L(this.f260527b, i2).mo35814O(sArr[i2]);
        }
    }
}
