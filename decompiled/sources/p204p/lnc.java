package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lnc extends knc {
    public lnc(fiz fizVar, juk jukVar, int i, int i2, int i3) {
        super((i3 & 4) != 0 ? -3 : i, (i3 & 8) != 0 ? 1 : i2, (i3 & 2) != 0 ? dau.f47107a : jukVar, fizVar);
    }

    @Override // p204p.enc
    /* JADX INFO: renamed from: h */
    public final enc mo39487h(juk jukVar, int i, int i2) {
        return new lnc(i, i2, jukVar, this.f124376d);
    }

    @Override // p204p.enc
    /* JADX INFO: renamed from: i */
    public final fiz mo39488i() {
        return this.f124376d;
    }

    @Override // p204p.knc
    /* JADX INFO: renamed from: k */
    public final Object mo56939k(niz nizVar, fbk fbkVar) {
        Object objCollect = this.f124376d.collect(nizVar, fbkVar);
        return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
    }
}
