package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes9.dex */
public final class cxk0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43054a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dxk0 f43055b;

    public /* synthetic */ cxk0(dxk0 dxk0Var, int i) {
        this.f43054a = i;
        this.f43055b = dxk0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f43054a) {
            case 0:
                this.f43055b.f54014n = ((Boolean) obj).booleanValue();
                break;
            case 1:
                this.f43055b.f54014n = false;
                break;
            case 2:
                this.f43055b.f54013m = (icc0) obj;
                break;
            case 3:
                this.f43055b.f54013m = hcc0.f89751a;
                break;
            case 4:
                this.f43055b.f54011k = ((String) obj).equals("premium");
                break;
            default:
                this.f43055b.f54012l = ((String) obj).equals("1");
                break;
        }
    }
}
