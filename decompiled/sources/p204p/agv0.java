package p204p;

import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: classes7.dex */
public final class agv0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15534a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kz5 f15535b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ agv0(kz5 kz5Var, int i) {
        super(1);
        this.f15534a = i;
        this.f15535b = kz5Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f15534a) {
            case 0:
                return new CompletableFromAction(new zfv0(this.f15535b, 0));
            default:
                return new CompletableFromAction(new zfv0(this.f15535b, 1));
        }
    }
}
