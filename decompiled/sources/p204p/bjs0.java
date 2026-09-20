package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class bjs0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27763a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x1p0 f27764b;

    public /* synthetic */ bjs0(x1p0 x1p0Var, int i) {
        this.f27763a = i;
        this.f27764b = x1p0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f27763a) {
            case 0:
                ((hz0) this.f27764b.f257250e).accept(egs0.f59399a);
                break;
            default:
                ((hz0) this.f27764b.f257250e).accept(xfs0.f261092a);
                break;
        }
    }
}
