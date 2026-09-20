package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class q6y0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f185960a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r6y0 f185961b;

    public /* synthetic */ q6y0(r6y0 r6y0Var, int i) {
        this.f185960a = i;
        this.f185961b = r6y0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f185960a) {
            case 0:
                r6y0 r6y0Var = this.f185961b;
                r6y0Var.f196389n = true;
                r6y0Var.m74878a();
                break;
            default:
                s6y0 s6y0Var = (s6y0) obj;
                int i = s6y0Var.f206220a;
                float f = s6y0Var.f206221b;
                r6y0 r6y0Var2 = this.f185961b;
                if (i == 2) {
                    r6y0Var2.f196388m = true;
                }
                if (i == 1 && r6y0Var2.f196388m) {
                    r6y0Var2.f196388m = false;
                    r6y0Var2.f196387l = false;
                    r6y0Var2.m74878a();
                }
                r6y0Var2.f196383h.onNext(new t6y0(i, f));
                break;
        }
    }
}
