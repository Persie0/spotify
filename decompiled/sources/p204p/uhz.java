package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class uhz extends xdr0 {

    /* JADX INFO: renamed from: c */
    public static final uhz f230549c = new uhz(yhz.f272997a);

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: d */
    public final int mo24520d(Object obj) {
        return ((float[]) obj).length;
    }

    @Override // p204p.i4f, p204p.AbstractC2327r6
    /* JADX INFO: renamed from: f */
    public final void mo24521f(frh frhVar, int i, Object obj) {
        rhz rhzVar = (rhz) obj;
        float fMo39219Q = frhVar.mo39219Q(this.f260527b, i);
        rhzVar.mo33760b(rhzVar.mo33761d() + 1);
        float[] fArr = rhzVar.f199400a;
        int i2 = rhzVar.f199401b;
        rhzVar.f199401b = i2 + 1;
        fArr[i2] = fMo39219Q;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: g */
    public final Object mo24522g(Object obj) {
        float[] fArr = (float[]) obj;
        rhz rhzVar = new rhz();
        rhzVar.f199400a = fArr;
        rhzVar.f199401b = fArr.length;
        rhzVar.mo33760b(10);
        return rhzVar;
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: j */
    public final Object mo24523j() {
        return new float[0];
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: k */
    public final void mo24524k(hrh hrhVar, Object obj, int i) {
        float[] fArr = (float[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            hrhVar.mo44936Z(this.f260527b, i2, fArr[i2]);
        }
    }
}
