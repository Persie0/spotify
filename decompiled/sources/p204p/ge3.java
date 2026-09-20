package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class ge3 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f79008a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sgr f79009b;

    public /* synthetic */ ge3(sgr sgrVar, int i) {
        this.f79008a = i;
        this.f79009b = sgrVar;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f79008a) {
            case 0:
                this.f79009b.m78112a();
                break;
            case 1:
                this.f79009b.m78112a();
                break;
            default:
                this.f79009b.m78112a();
                break;
        }
    }
}
