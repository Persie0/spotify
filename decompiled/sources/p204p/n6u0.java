package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class n6u0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f150953a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ o6u0 f150954b;

    public /* synthetic */ n6u0(o6u0 o6u0Var, int i) {
        this.f150953a = i;
        this.f150954b = o6u0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f150953a) {
            case 0:
                wra0 wra0Var = this.f150954b.f162418b;
                ((Throwable) obj).getMessage();
                wra0Var.mo46852b();
                break;
            case 1:
                wra0 wra0Var2 = this.f150954b.f162418b;
                if (!((Boolean) obj).booleanValue()) {
                    wra0Var2.mo46852b();
                } else {
                    wra0Var2.mo46852b();
                }
                break;
            default:
                wra0 wra0Var3 = this.f150954b.f162418b;
                ((Throwable) obj).getMessage();
                wra0Var3.mo46852b();
                break;
        }
    }
}
