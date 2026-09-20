package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes9.dex */
public final class pvv0 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f181852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qvv0 f181853b;

    public /* synthetic */ pvv0(qvv0 qvv0Var, int i) {
        this.f181852a = i;
        this.f181853b = qvv0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f181852a) {
            case 0:
                gls.m45181b(this.f181853b.f193115Z);
                break;
            case 1:
                qvv0 qvv0Var = this.f181853b;
                qvv0Var.f193119d.accept(qny0.f190718a);
                qvv0Var.f193109L0.onNext(Boolean.FALSE);
                break;
            default:
                qvv0 qvv0Var2 = this.f181853b;
                qvv0Var2.f193119d.accept(sny0.f211054a);
                qvv0Var2.f193109L0.onNext(Boolean.TRUE);
                break;
        }
    }
}
