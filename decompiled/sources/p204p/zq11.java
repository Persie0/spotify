package p204p;

import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: classes9.dex */
public final class zq11 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f285282a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nlv0 f285283b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ObservableEmitter f285284c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ liu0 f285285d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zq11(nlv0 nlv0Var, ObservableEmitter observableEmitter, liu0 liu0Var, int i) {
        super(0);
        this.f285282a = i;
        this.f285283b = nlv0Var;
        this.f285284c = observableEmitter;
        this.f285285d = liu0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f285282a) {
            case 0:
                this.f285283b.f155174a = true;
                this.f285284c.onNext(new eju0(this.f285285d.f133898a));
                break;
            default:
                if (!this.f285283b.f155174a) {
                    this.f285284c.onNext(new fju0(this.f285285d.f133898a));
                }
                break;
        }
        return w2a1.f247311a;
    }
}
