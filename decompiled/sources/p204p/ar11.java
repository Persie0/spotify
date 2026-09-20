package p204p;

import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: classes9.dex */
public final class ar11 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18904a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nlv0 f18905b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ObservableEmitter f18906c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uju0 f18907d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar11(nlv0 nlv0Var, ObservableEmitter observableEmitter, uju0 uju0Var, int i) {
        super(0);
        this.f18904a = i;
        this.f18905b = nlv0Var;
        this.f18906c = observableEmitter;
        this.f18907d = uju0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f18904a) {
            case 0:
                this.f18905b.f155174a = true;
                this.f18906c.onNext(new nku0(this.f18907d.f231150a));
                break;
            default:
                if (!this.f18905b.f155174a) {
                    this.f18906c.onNext(new oku0(this.f18907d.f231150a));
                }
                break;
        }
        return w2a1.f247311a;
    }
}
