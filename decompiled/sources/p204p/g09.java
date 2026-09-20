package p204p;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class g09 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f75312a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i09 f75313b;

    public /* synthetic */ g09(i09 i09Var, int i) {
        this.f75312a = i;
        this.f75313b = i09Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75312a) {
            case 0:
                i09 i09Var = this.f75313b;
                if (i09Var.f97161d > 0) {
                    SystemClock.uptimeMillis();
                }
                i09Var.setVisibility(0);
                break;
            default:
                i09 i09Var2 = this.f75313b;
                ((egs) i09Var2.getCurrentDrawable()).m38879e(false, false, true);
                if ((i09Var2.getProgressDrawable() == null || !i09Var2.getProgressDrawable().isVisible()) && (i09Var2.getIndeterminateDrawable() == null || !i09Var2.getIndeterminateDrawable().isVisible())) {
                    i09Var2.setVisibility(4);
                }
                i09Var2.getClass();
                break;
        }
    }
}
