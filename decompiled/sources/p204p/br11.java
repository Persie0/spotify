package p204p;

import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: classes9.dex */
public final class br11 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f29936a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nlv0 f29937b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ObservableEmitter f29938c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qgu0 f29939d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ br11(nlv0 nlv0Var, ObservableEmitter observableEmitter, qgu0 qgu0Var, int i) {
        super(0);
        this.f29936a = i;
        this.f29937b = nlv0Var;
        this.f29938c = observableEmitter;
        this.f29939d = qgu0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f29936a) {
            case 0:
                this.f29937b.f155174a = true;
                this.f29938c.onNext(new bhu0(this.f29939d.f188571a));
                break;
            default:
                if (!this.f29937b.f155174a) {
                    qgu0 qgu0Var = this.f29939d;
                    this.f29938c.onNext(new chu0(qgu0Var.f188571a, qgu0Var.f188573c));
                }
                break;
        }
        return w2a1.f247311a;
    }
}
