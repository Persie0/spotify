package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes5.dex */
public final class ri6 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f199439a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ti6 f199440b;

    public /* synthetic */ ri6(ti6 ti6Var, int i) {
        this.f199439a = i;
        this.f199440b = ti6Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f199439a) {
            case 0:
                this.f199440b.f220561i = (ai6) obj;
                break;
            default:
                ai6 ai6Var = (ai6) obj;
                ti6 ti6Var = this.f199440b;
                ti6Var.f220560h.onNext(ai6Var);
                if (ai6Var.f15898g != 1) {
                    ti6Var.m35106i();
                }
                break;
        }
    }
}
