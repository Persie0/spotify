package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes8.dex */
public final class oez0 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f164587a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qez0 f164588b;

    public /* synthetic */ oez0(qez0 qez0Var, int i) {
        this.f164587a = i;
        this.f164588b = qez0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f164587a) {
            case 0:
                qez0 qez0Var = this.f164588b;
                qez0Var.f188068d.accept(sny0.f211054a);
                qez0Var.f188072h.onNext(Boolean.TRUE);
                break;
            case 1:
                qez0 qez0Var2 = this.f164588b;
                qez0Var2.f188068d.accept(qny0.f190718a);
                qez0Var2.f188072h.onNext(Boolean.FALSE);
                break;
            default:
                gls.m45181b(this.f164588b.f188071g);
                break;
        }
    }
}
