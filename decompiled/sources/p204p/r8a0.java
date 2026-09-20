package p204p;

import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class r8a0 implements bbm0, zam0 {

    /* JADX INFO: renamed from: a */
    public zam0 f196745a;

    /* JADX INFO: renamed from: b */
    public final Disposable f196746b;

    public r8a0(eam eamVar) {
        AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
        this.f196745a = xgg1.m90662N1("PODCAST_SHOW_LOADING", "podcast/show/loading", 1444, "podcast");
        this.f196746b = eamVar.f57699a.filter(ily.f103534X).map(mly.f144960Y).subscribe(new dh30(this, 22));
    }

    @Override // p204p.zam0
    /* JADX INFO: renamed from: a */
    public final String mo32181a() {
        return this.f196745a.mo32181a();
    }

    /* JADX INFO: renamed from: b */
    public final void m74976b() {
        this.f196746b.dispose();
    }

    @Override // p204p.bbm0
    /* JADX INFO: renamed from: c */
    public final zam0 mo3039c() {
        return this.f196745a;
    }

    @Override // p204p.zam0
    public final String path() {
        return this.f196745a.path();
    }
}
