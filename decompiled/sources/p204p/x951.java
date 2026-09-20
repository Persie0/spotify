package p204p;

import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: classes5.dex */
public final class x951 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f259280a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ObservableEmitter f259281b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x951(ObservableEmitter observableEmitter, int i) {
        super(1);
        this.f259280a = i;
        this.f259281b = observableEmitter;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f259280a) {
            case 0:
                this.f259281b.onNext(((Boolean) obj).booleanValue() ? xua1.f266041a : hva1.f95641a);
                break;
            default:
                this.f259281b.onNext(((Boolean) obj).booleanValue() ? zua1.f286398a : dva1.f53408a);
                break;
        }
        return w2a1.f247311a;
    }
}
