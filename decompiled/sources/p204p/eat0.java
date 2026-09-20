package p204p;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: classes10.dex */
public final class eat0 implements q5m0 {

    /* JADX INFO: renamed from: a */
    public final l2m f57725a;

    /* JADX INFO: renamed from: b */
    public final lwr f57726b = new lwr();

    public eat0(l2m l2mVar) {
        this.f57725a = l2mVar;
    }

    @Override // p204p.q5m0
    /* JADX INFO: renamed from: c */
    public final void mo38320c() {
        this.f57726b.m60127a(((Completable) this.f57725a.invoke()).subscribe());
    }

    @Override // p204p.q5m0
    /* JADX INFO: renamed from: d */
    public final void mo38321d() {
        this.f57726b.m60129c();
    }
}
