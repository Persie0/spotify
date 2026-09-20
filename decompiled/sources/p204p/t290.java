package p204p;

import io.reactivex.rxjava3.subjects.Subject;

/* JADX INFO: loaded from: classes11.dex */
public final class t290 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Subject f216462a;

    public t290(Subject subject) {
        this.f216462a = subject;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        this.f216462a.onNext((ig3) obj);
        return w2a1.f247311a;
    }
}
