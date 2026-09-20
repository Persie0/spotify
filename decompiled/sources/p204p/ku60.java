package p204p;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class ku60 extends exh0 implements ju60 {

    /* JADX INFO: renamed from: M0 */
    public gh00 f126464M0;

    /* JADX INFO: renamed from: N0 */
    public gh00 f126465N0;

    @Override // p204p.ju60
    /* JADX INFO: renamed from: I0 */
    public final boolean mo46182I0(KeyEvent keyEvent) {
        gh00 gh00Var = this.f126464M0;
        if (gh00Var != null) {
            return ((Boolean) gh00Var.invoke(eu60.m40036a(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p204p.ju60
    /* JADX INFO: renamed from: y0 */
    public final boolean mo46184y0(KeyEvent keyEvent) {
        gh00 gh00Var = this.f126465N0;
        if (gh00Var != null) {
            return ((Boolean) gh00Var.invoke(eu60.m40036a(keyEvent))).booleanValue();
        }
        return false;
    }
}
