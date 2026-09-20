package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes.dex */
public final class dxo implements ssi {

    /* JADX INFO: renamed from: a */
    public final Observable f54035a;

    /* JADX INFO: renamed from: b */
    public final BehaviorSubject f54036b = BehaviorSubject.m23795f();

    /* JADX INFO: renamed from: c */
    public final iwr f54037c = new iwr();

    public dxo(Observable observable) {
        this.f54035a = observable;
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        this.f54037c.m51847a();
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        this.f54037c.m51848b(this.f54035a.map(d7f0.f46163c1).distinctUntilChanged().subscribe(new ir5(this.f54036b, 1)));
    }
}
