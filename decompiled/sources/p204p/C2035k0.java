package p204p;

import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: renamed from: p.k0 */
/* JADX INFO: loaded from: classes16.dex */
public final class C2035k0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ObservableEmitter f117830a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2035k0(ObservableEmitter observableEmitter) {
        super(1);
        this.f117830a = observableEmitter;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        this.f117830a.tryOnError((Exception) obj);
        return w2a1.f247311a;
    }
}
