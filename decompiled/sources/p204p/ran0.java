package p204p;

import android.os.Bundle;

/* JADX INFO: loaded from: classes7.dex */
public final class ran0 extends pan0 {

    /* JADX INFO: renamed from: b */
    public dme f197347b;

    /* JADX INFO: renamed from: c */
    public cbm0 f197348c;

    /* JADX INFO: renamed from: d */
    public fnm0 f197349d;

    /* JADX INFO: renamed from: e */
    public boolean f197350e;

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        cbm0 cbm0Var;
        super.onAttachedToWindow();
        dme dmeVar = this.f197347b;
        if (dmeVar == null || (cbm0Var = this.f197348c) == null || this.f197350e) {
            return;
        }
        dmeVar.mo3255V(cbm0Var, this.f197349d);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        cbm0 cbm0Var;
        super.onDetachedFromWindow();
        dme dmeVar = this.f197347b;
        if (dmeVar == null || (cbm0Var = this.f197348c) == null) {
            return;
        }
        dmeVar.mo3256n(cbm0Var, this.f197349d);
    }

    @Override // android.app.Dialog
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f197350e = true;
    }
}
