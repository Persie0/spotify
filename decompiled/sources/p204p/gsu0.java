package p204p;

import android.app.Activity;
import android.os.Build;
import android.view.Window;

/* JADX INFO: loaded from: classes6.dex */
public final class gsu0 implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f84019a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f84020b;

    public /* synthetic */ gsu0(int i, Activity activity) {
        this.f84019a = i;
        this.f84020b = activity;
    }

    @Override // p204p.ewr
    public final void dispose() {
        Window window;
        m3h1 wwd1Var;
        switch (this.f84019a) {
            case 0:
                Activity activity = this.f84020b;
                if (activity != null && (window = activity.getWindow()) != null) {
                    gjv0 gjv0Var = new gjv0(window.getDecorView());
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 35) {
                        wwd1Var = new zwd1(window, gjv0Var);
                    } else if (i >= 30) {
                        wwd1Var = new xwd1(window, gjv0Var);
                    } else {
                        wwd1Var = i >= 26 ? new wwd1(window, gjv0Var) : new vwd1(window, gjv0Var);
                    }
                    wwd1Var.mo60688u(1);
                    break;
                }
                break;
            default:
                this.f84020b.getWindow().clearFlags(8192);
                break;
        }
    }
}
