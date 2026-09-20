package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes9.dex */
public final class jor0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f114502a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ngr f114503b;

    public /* synthetic */ jor0(ngr ngrVar, int i) {
        this.f114502a = i;
        this.f114503b = ngrVar;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f114502a) {
            case 0:
                this.f114503b.mo64403L();
                break;
            default:
                this.f114503b.mo64405h0(((znr0) obj).f284550a);
                break;
        }
    }
}
