package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class g8a extends xdr0 {

    /* JADX INFO: renamed from: c */
    public static final g8a f77445c = new g8a(l8a.f130828a);

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: d */
    public final int mo24520d(Object obj) {
        return ((boolean[]) obj).length;
    }

    @Override // p204p.i4f, p204p.AbstractC2327r6
    /* JADX INFO: renamed from: f */
    public final void mo24521f(frh frhVar, int i, Object obj) {
        d8a d8aVar = (d8a) obj;
        boolean zMo39217M = frhVar.mo39217M(this.f260527b, i);
        d8aVar.mo33760b(d8aVar.mo33761d() + 1);
        boolean[] zArr = d8aVar.f46414a;
        int i2 = d8aVar.f46415b;
        d8aVar.f46415b = i2 + 1;
        zArr[i2] = zMo39217M;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: g */
    public final Object mo24522g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        d8a d8aVar = new d8a();
        d8aVar.f46414a = zArr;
        d8aVar.f46415b = zArr.length;
        d8aVar.mo33760b(10);
        return d8aVar;
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: j */
    public final Object mo24523j() {
        return new boolean[0];
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: k */
    public final void mo24524k(hrh hrhVar, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            hrhVar.mo44930E(this.f260527b, i2, zArr[i2]);
        }
    }
}
