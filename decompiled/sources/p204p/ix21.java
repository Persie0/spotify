package p204p;

import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes7.dex */
public final class ix21 implements jt50 {

    /* JADX INFO: renamed from: a */
    public final String f106575a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f106576b;

    /* JADX INFO: renamed from: c */
    public final i431 f106577c;

    /* JADX INFO: renamed from: d */
    public final Flowable f106578d;

    /* JADX INFO: renamed from: e */
    public final k331 f106579e;

    /* JADX INFO: renamed from: f */
    public final iwr f106580f = new iwr();

    /* JADX INFO: renamed from: g */
    public final PublishSubject f106581g = new PublishSubject();

    public ix21(String str, Scheduler scheduler, i431 i431Var, Flowable flowable, k331 k331Var) {
        this.f106575a = str;
        this.f106576b = scheduler;
        this.f106577c = i431Var;
        this.f106578d = flowable;
        this.f106579e = k331Var;
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: a */
    public final void mo26656a() {
        this.f106580f.m51847a();
    }

    @Override // p204p.ap80
    /* JADX INFO: renamed from: b */
    public final void mo26657b() {
        if (this.f106579e.m55226b()) {
            return;
        }
        this.f106580f.m51848b(this.f106581g.switchMapCompletable(new b9v0(this, 26)).m23303t(this.f106576b).subscribe());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.jt50
    /* JADX INFO: renamed from: i */
    public final Enum mo33214i(vs50 vs50Var, ibk ibkVar) {
        hx21 hx21Var;
        CompletableSource completableFromAction;
        if (ibkVar instanceof hx21) {
            hx21Var = (hx21) ibkVar;
            int i = hx21Var.f96123c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hx21Var.f96123c = i - Integer.MIN_VALUE;
            } else {
                hx21Var = new hx21(this, ibkVar);
            }
        } else {
            hx21Var = new hx21(this, ibkVar);
        }
        Object obj = hx21Var.f96121a;
        int i2 = hx21Var.f96123c;
        if (i2 == 0) {
            bga.m29073P(obj);
            if (vs50Var instanceof ss50) {
                nw80 nw80Var = ((ss50) vs50Var).f213490b;
                if (nw80Var.f159052f.contains(new q121("tap"))) {
                    completableFromAction = new CompletableFromAction(new jn10(27, this, nw80Var));
                } else {
                    completableFromAction = CompletableEmpty.f7437a;
                    wj50.m88279p(completableFromAction);
                }
                hx21Var.f96123c = 1;
                Object objM96565n = zn91.m96565n(completableFromAction, hx21Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return it50.f105436a;
    }
}
