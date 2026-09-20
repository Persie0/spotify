package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes8.dex */
public final class sln0 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f210445a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pqk0 f210446b;

    public /* synthetic */ sln0(pqk0 pqk0Var, int i) {
        this.f210445a = i;
        this.f210446b = pqk0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f210445a) {
            case 0:
                pqk0.m70653a(this.f210446b, 4);
                break;
            default:
                pqk0.m70653a(this.f210446b, 5);
                break;
        }
    }
}
