package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class l0m0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f128472a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vw90 f128473b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0m0(vw90 vw90Var, int i) {
        super(0);
        this.f128472a = i;
        this.f128473b = vw90Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f128472a) {
            case 0:
                ((View) this.f128473b.f245441b).setVisibility(4);
                break;
            case 1:
                ((View) this.f128473b.f245441b).setVisibility(0);
                break;
            default:
                vw90 vw90Var = this.f128473b;
                View view = (View) vw90Var.f245441b;
                kk00 kk00Var = (kk00) vw90Var.f245442c;
                view.removeCallbacks(kk00Var);
                view.postDelayed(kk00Var, 3500L);
                break;
        }
        return w2a1.f247311a;
    }
}
