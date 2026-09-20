package p204p;

import io.reactivex.rxjava3.core.ObservableEmitter;

/* JADX INFO: loaded from: classes9.dex */
public final class cr11 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41155a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nlv0 f41156b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ObservableEmitter f41157c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ikf f41158d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cr11(nlv0 nlv0Var, ObservableEmitter observableEmitter, ikf ikfVar, int i) {
        super(0);
        this.f41155a = i;
        this.f41156b = nlv0Var;
        this.f41157c = observableEmitter;
        this.f41158d = ikfVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f41155a) {
            case 0:
                this.f41156b.f155174a = true;
                this.f41157c.onNext(new plf(this.f41158d.f103112a));
                break;
            default:
                if (!this.f41156b.f155174a) {
                    this.f41157c.onNext(new qlf(this.f41158d.f103112a));
                }
                break;
        }
        return w2a1.f247311a;
    }
}
