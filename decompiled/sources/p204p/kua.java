package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kua extends xdr0 {

    /* JADX INFO: renamed from: c */
    public static final kua f126493c = new kua(oua.f170236a);

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: d */
    public final int mo24520d(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // p204p.i4f, p204p.AbstractC2327r6
    /* JADX INFO: renamed from: f */
    public final void mo24521f(frh frhVar, int i, Object obj) {
        ((eua) obj).m40050e(frhVar.mo39230q(this.f260527b, i));
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: g */
    public final Object mo24522g(Object obj) {
        return new eua((byte[]) obj);
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: j */
    public final Object mo24523j() {
        return new byte[0];
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: k */
    public final void mo24524k(hrh hrhVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            hrhVar.mo44932I(this.f260527b, i2, bArr[i2]);
        }
    }
}
