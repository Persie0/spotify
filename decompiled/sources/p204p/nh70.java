package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes7.dex */
public final class nh70 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f153890a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oh70 f153891b;

    public /* synthetic */ nh70(oh70 oh70Var, int i) {
        this.f153890a = i;
        this.f153891b = oh70Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f153890a) {
            case 0:
                uh70 uh70Var = (uh70) obj;
                boolean z = uh70Var instanceof qh70;
                oh70 oh70Var = this.f153891b;
                if (z) {
                    oh70Var.f165364j = ((qh70) uh70Var).f188664a;
                }
                oh70Var.f165362h.mo33104m(uh70Var);
                break;
            default:
                this.f153891b.f165362h.mo33104m(rh70.f199166a);
                break;
        }
    }
}
