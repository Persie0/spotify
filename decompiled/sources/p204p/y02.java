package p204p;

import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes9.dex */
public final class y02 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f267870a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PublishSubject f267871b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y02(PublishSubject publishSubject, int i) {
        super(0);
        this.f267870a = i;
        this.f267871b = publishSubject;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f267870a) {
            case 0:
                PublishSubject publishSubject = this.f267871b;
                w2a1 w2a1Var = w2a1.f247311a;
                publishSubject.onNext(w2a1Var);
                return w2a1Var;
            default:
                PublishSubject publishSubject2 = this.f267871b;
                w2a1 w2a1Var2 = w2a1.f247311a;
                publishSubject2.onNext(w2a1Var2);
                return w2a1Var2;
        }
    }
}
