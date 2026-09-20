package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class h0q implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f86332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f86333b;

    public /* synthetic */ h0q(int i, gh00 gh00Var) {
        this.f86332a = i;
        this.f86333b = gh00Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f86332a) {
            case 0:
                this.f86333b.invoke(o2r0.f161135a);
                break;
            case 1:
                this.f86333b.invoke(y3x.f268993a);
                break;
            default:
                this.f86333b.invoke(mpc0.f145969a);
                break;
        }
    }
}
