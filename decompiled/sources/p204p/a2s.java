package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class a2s extends xdr0 {

    /* JADX INFO: renamed from: c */
    public static final a2s f11719c = new a2s(h2s.f87054a);

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: d */
    public final int mo24520d(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // p204p.i4f, p204p.AbstractC2327r6
    /* JADX INFO: renamed from: f */
    public final void mo24521f(frh frhVar, int i, Object obj) {
        x1s x1sVar = (x1s) obj;
        double dMo39213D = frhVar.mo39213D(this.f260527b, i);
        x1sVar.mo33760b(x1sVar.mo33761d() + 1);
        double[] dArr = x1sVar.f257264a;
        int i2 = x1sVar.f257265b;
        x1sVar.f257265b = i2 + 1;
        dArr[i2] = dMo39213D;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: g */
    public final Object mo24522g(Object obj) {
        double[] dArr = (double[]) obj;
        x1s x1sVar = new x1s();
        x1sVar.f257264a = dArr;
        x1sVar.f257265b = dArr.length;
        x1sVar.mo33760b(10);
        return x1sVar;
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: j */
    public final Object mo24523j() {
        return new double[0];
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: k */
    public final void mo24524k(hrh hrhVar, Object obj, int i) {
        double[] dArr = (double[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            hrhVar.mo44940g(this.f260527b, i2, dArr[i2]);
        }
    }
}
