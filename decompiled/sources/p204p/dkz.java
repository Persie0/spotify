package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class dkz implements fiz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fiz f50068a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f50069b;

    public dkz(fiz fizVar, int i) {
        this.f50068a = fizVar;
        this.f50069b = i;
    }

    @Override // p204p.fiz
    public final Object collect(niz nizVar, fbk fbkVar) {
        Object objCollect = this.f50068a.collect(new fkz(new plv0(), this.f50069b, nizVar), fbkVar);
        return objCollect == yuk.f276404a ? objCollect : w2a1.f247311a;
    }
}
