package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class xq91 extends xdr0 {

    /* JADX INFO: renamed from: c */
    public static final xq91 f264927c = new xq91(yq91.f275172a);

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: d */
    public final int mo24520d(Object obj) {
        return ((vq91) obj).f243904a.length;
    }

    @Override // p204p.i4f, p204p.AbstractC2327r6
    /* JADX INFO: renamed from: f */
    public final void mo24521f(frh frhVar, int i, Object obj) {
        wq91 wq91Var = (wq91) obj;
        byte bMo39224c0 = frhVar.mo39231t(this.f260527b, i).mo39224c0();
        wq91Var.mo33760b(wq91Var.mo33761d() + 1);
        byte[] bArr = wq91Var.f253952a;
        int i2 = wq91Var.f253953b;
        wq91Var.f253953b = i2 + 1;
        bArr[i2] = bMo39224c0;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: g */
    public final Object mo24522g(Object obj) {
        byte[] bArr = ((vq91) obj).f243904a;
        wq91 wq91Var = new wq91();
        wq91Var.f253952a = bArr;
        wq91Var.f253953b = bArr.length;
        wq91Var.mo33760b(10);
        return wq91Var;
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: j */
    public final Object mo24523j() {
        return new vq91(new byte[0]);
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: k */
    public final void mo24524k(hrh hrhVar, Object obj, int i) {
        byte[] bArr = ((vq91) obj).f243904a;
        for (int i2 = 0; i2 < i; i2++) {
            hrhVar.mo44933L(this.f260527b, i2).mo35826j(bArr[i2]);
        }
    }
}
