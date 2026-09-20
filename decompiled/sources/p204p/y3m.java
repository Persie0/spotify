package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class y3m implements dut {

    /* JADX INFO: renamed from: a */
    public final v5m f268962a;

    /* JADX INFO: renamed from: b */
    public final wxh0 f268963b;

    /* JADX INFO: renamed from: c */
    public final i5x f268964c;

    /* JADX INFO: renamed from: d */
    public final b60 f268965d;

    public y3m(v5m v5mVar, juk jukVar) {
        this.f268962a = v5mVar;
        this.f268963b = uuf1.m83998r(j3m.f108437c, jukVar, null, new hpk(this, 10), 4);
        this.f268964c = new i5x("CurationButtonElement", kvl.f126874L0, kvl.f126875M0);
        this.f268965d = new b60(4);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f268964c;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f268965d;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f268963b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y3m(v5m v5mVar) {
        this(v5mVar, pvb0.f181680a);
        n5q n5qVar = xsr.f265651a;
    }
}
