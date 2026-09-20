package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class hhw implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f91606a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ghw f91607b;

    public /* synthetic */ hhw(ghw ghwVar, int i) {
        this.f91606a = i;
        this.f91607b = ghwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f91606a) {
            case 0:
                this.f91607b.mo44765c();
                break;
            default:
                this.f91607b.mo44764b();
                break;
        }
    }
}
