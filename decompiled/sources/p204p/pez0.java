package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes8.dex */
public final class pez0 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f176892a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qez0 f176893b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wq81 f176894c;

    public /* synthetic */ pez0(qez0 qez0Var, wq81 wq81Var, int i) {
        this.f176892a = i;
        this.f176893b = qez0Var;
        this.f176894c = wq81Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f176892a) {
            case 0:
                qez0 qez0Var = this.f176893b;
                qez0Var.f188068d.accept(new rny0((int) ((uq81) this.f176894c).f232946a));
                qez0Var.f188072h.onNext(Boolean.TRUE);
                break;
            default:
                qez0 qez0Var2 = this.f176893b;
                qez0Var2.f188068d.accept(new rny0((int) ((tq81) this.f176894c).f222775a));
                qez0Var2.f188068d.accept(qny0.f190718a);
                qez0Var2.f188072h.onNext(Boolean.FALSE);
                break;
        }
    }
}
