package p204p;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h081 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f86178a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Toolbar f86179b;

    public /* synthetic */ h081(Toolbar toolbar, int i) {
        this.f86178a = i;
        this.f86179b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f86178a) {
            case 0:
                j081 j081Var = this.f86179b.f344n1;
                lhe0 lhe0Var = j081Var == null ? null : j081Var.f107383b;
                if (lhe0Var != null) {
                    lhe0Var.collapseActionView();
                }
                break;
            default:
                this.f86179b.m164k();
                break;
        }
    }
}
