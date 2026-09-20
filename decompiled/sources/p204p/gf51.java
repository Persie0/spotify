package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes5.dex */
public final class gf51 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79283a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ esa0 f79284b;

    public /* synthetic */ gf51(esa0 esa0Var, int i) {
        this.f79283a = i;
        this.f79284b = esa0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f79283a) {
            case 0:
                this.f79284b.m39901b(hdn0.f90166a);
                break;
            default:
                this.f79284b.m39901b(hdn0.f90167b);
                break;
        }
    }
}
