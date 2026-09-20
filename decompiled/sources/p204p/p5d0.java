package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class p5d0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f174149a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nlv0 f174150b;

    public /* synthetic */ p5d0(nlv0 nlv0Var, int i) {
        this.f174149a = i;
        this.f174150b = nlv0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f174149a) {
            case 0:
                this.f174150b.f155174a = true;
                break;
            default:
                this.f174150b.f155174a = false;
                break;
        }
    }
}
