package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class mt91 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f146992a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ot91 f146993b;

    public /* synthetic */ mt91(ot91 ot91Var, int i) {
        this.f146992a = i;
        this.f146993b = ot91Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f146992a) {
            case 0:
                ot91.m67775a(this.f146993b, (Throwable) obj);
                break;
            case 1:
                ot91.m67775a(this.f146993b, (Throwable) obj);
                break;
            default:
                ot91.m67775a(this.f146993b, (Throwable) obj);
                break;
        }
    }
}
