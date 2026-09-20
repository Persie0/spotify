package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class rln0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f200343a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pqk0 f200344b;

    public /* synthetic */ rln0(pqk0 pqk0Var, int i) {
        this.f200343a = i;
        this.f200344b = pqk0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f200343a) {
            case 0:
                pqk0.m70653a(this.f200344b, 1);
                break;
            case 1:
                pqk0.m70653a(this.f200344b, 2);
                break;
            default:
                pqk0.m70653a(this.f200344b, 3);
                break;
        }
    }
}
