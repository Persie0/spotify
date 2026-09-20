package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes8.dex */
public final class ehz0 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59752a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lhz0 f59753b;

    public /* synthetic */ ehz0(lhz0 lhz0Var, int i) {
        this.f59752a = i;
        this.f59753b = lhz0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f59752a) {
            case 0:
                gls.m45181b(this.f59753b.f133677c);
                break;
            case 1:
                this.f59753b.f133676b.accept(qny0.f190718a);
                break;
            default:
                this.f59753b.f133676b.accept(sny0.f211054a);
                break;
        }
    }
}
