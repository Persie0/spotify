package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class zfe0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282290a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ age0 f282291b;

    public /* synthetic */ zfe0(age0 age0Var, int i) {
        this.f282290a = i;
        this.f282291b = age0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f282290a) {
            case 0:
                age0 age0Var = this.f282291b;
                age0Var.f15351g = (yfe0) obj;
                age0Var.m35106i();
                break;
            default:
                this.f282291b.m35105h((Throwable) obj);
                break;
        }
    }
}
