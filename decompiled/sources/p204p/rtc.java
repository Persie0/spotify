package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class rtc extends xdr0 {

    /* JADX INFO: renamed from: c */
    public static final rtc f202559c = new rtc(luc.f137049a);

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: d */
    public final int mo24520d(Object obj) {
        return ((char[]) obj).length;
    }

    @Override // p204p.i4f, p204p.AbstractC2327r6
    /* JADX INFO: renamed from: f */
    public final void mo24521f(frh frhVar, int i, Object obj) {
        ntc ntcVar = (ntc) obj;
        char cMo39225e0 = frhVar.mo39225e0(this.f260527b, i);
        ntcVar.mo33760b(ntcVar.mo33761d() + 1);
        char[] cArr = ntcVar.f158043a;
        int i2 = ntcVar.f158044b;
        ntcVar.f158044b = i2 + 1;
        cArr[i2] = cMo39225e0;
    }

    @Override // p204p.AbstractC2327r6
    /* JADX INFO: renamed from: g */
    public final Object mo24522g(Object obj) {
        char[] cArr = (char[]) obj;
        ntc ntcVar = new ntc();
        ntcVar.f158043a = cArr;
        ntcVar.f158044b = cArr.length;
        ntcVar.mo33760b(10);
        return ntcVar;
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: j */
    public final Object mo24523j() {
        return new char[0];
    }

    @Override // p204p.xdr0
    /* JADX INFO: renamed from: k */
    public final void mo24524k(hrh hrhVar, Object obj, int i) {
        char[] cArr = (char[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            hrhVar.mo44939f0(this.f260527b, i2, cArr[i2]);
        }
    }
}
