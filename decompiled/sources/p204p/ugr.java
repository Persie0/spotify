package p204p;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class ugr extends i500 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: A1 */
    public Handler f230233A1;

    /* JADX INFO: renamed from: J1 */
    public boolean f230242J1;

    /* JADX INFO: renamed from: L1 */
    public Dialog f230244L1;

    /* JADX INFO: renamed from: M1 */
    public boolean f230245M1;

    /* JADX INFO: renamed from: N1 */
    public boolean f230246N1;

    /* JADX INFO: renamed from: O1 */
    public boolean f230247O1;

    /* JADX INFO: renamed from: B1 */
    public final eph f230234B1 = new eph(this, 15);

    /* JADX INFO: renamed from: C1 */
    public final fic f230235C1 = new fic(this, 3);

    /* JADX INFO: renamed from: D1 */
    public final xyo f230236D1 = new xyo(this, 1);

    /* JADX INFO: renamed from: E1 */
    public int f230237E1 = 0;

    /* JADX INFO: renamed from: F1 */
    public int f230238F1 = 0;

    /* JADX INFO: renamed from: G1 */
    public boolean f230239G1 = true;

    /* JADX INFO: renamed from: H1 */
    public boolean f230240H1 = true;

    /* JADX INFO: renamed from: I1 */
    public int f230241I1 = -1;

    /* JADX INFO: renamed from: K1 */
    public final u0p f230243K1 = new u0p(this, 1);

    /* JADX INFO: renamed from: P1 */
    public boolean f230248P1 = false;

    /* JADX INFO: renamed from: C */
    public void m83050C() {
        mo83051h1();
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: C0 */
    public final void mo49694C0() {
        this.f98702f1 = true;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: E0 */
    public void mo875E0(Context context) {
        super.mo875E0(context);
        this.f98718s1.m33100g(this.f230243K1);
        if (this.f230247O1) {
            return;
        }
        this.f230246N1 = false;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: F0 */
    public void mo876F0(Bundle bundle) {
        super.mo876F0(bundle);
        this.f230233A1 = new Handler();
        this.f230240H1 = this.f98686X0 == 0;
        if (bundle != null) {
            this.f230237E1 = bundle.getInt("android:style", 0);
            this.f230238F1 = bundle.getInt("android:theme", 0);
            this.f230239G1 = bundle.getBoolean("android:cancelable", true);
            this.f230240H1 = bundle.getBoolean("android:showsDialog", this.f230240H1);
            this.f230241I1 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: I0 */
    public void mo878I0() {
        this.f98702f1 = true;
        Dialog dialog = this.f230244L1;
        if (dialog != null) {
            this.f230245M1 = true;
            dialog.setOnDismissListener(null);
            this.f230244L1.dismiss();
            if (!this.f230246N1) {
                onDismiss(this.f230244L1);
            }
            this.f230244L1 = null;
            this.f230248P1 = false;
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: J0 */
    public void mo29537J0() {
        this.f98702f1 = true;
        if (!this.f230247O1 && !this.f230246N1) {
            this.f230246N1 = true;
        }
        this.f98718s1.mo33102k(this.f230243K1);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: K0 */
    public final LayoutInflater mo49695K0(Bundle bundle) {
        LayoutInflater layoutInflaterMo49695K0 = super.mo49695K0(bundle);
        boolean z = this.f230240H1;
        if (z && !this.f230242J1) {
            if (z && !this.f230248P1) {
                try {
                    this.f230242J1 = true;
                    Dialog dialogMo25833l1 = mo25833l1(bundle);
                    this.f230244L1 = dialogMo25833l1;
                    if (this.f230240H1) {
                        mo66330o1(dialogMo25833l1, this.f230237E1);
                        Context contextM49717p0 = m49717p0();
                        if (contextM49717p0 != null) {
                            this.f230244L1.setOwnerActivity((Activity) contextM49717p0);
                        }
                        this.f230244L1.setCancelable(this.f230239G1);
                        this.f230244L1.setOnCancelListener(this.f230235C1);
                        this.f230244L1.setOnDismissListener(this.f230236D1);
                        this.f230248P1 = true;
                    } else {
                        this.f230244L1 = null;
                    }
                    this.f230242J1 = false;
                } catch (Throwable th) {
                    this.f230242J1 = false;
                    throw th;
                }
            }
            if (c700.m31595O(2)) {
                toString();
            }
            Dialog dialog = this.f230244L1;
            if (dialog != null) {
                return layoutInflaterMo49695K0.cloneInContext(dialog.getContext());
            }
        } else if (c700.m31595O(2)) {
            toString();
        }
        return layoutInflaterMo49695K0;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: O0 */
    public void mo880O0(Bundle bundle) {
        Dialog dialog = this.f230244L1;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.f230237E1;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f230238F1;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f230239G1;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f230240H1;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f230241I1;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: P0 */
    public void mo3104P0() {
        this.f98702f1 = true;
        Dialog dialog = this.f230244L1;
        if (dialog != null) {
            this.f230245M1 = false;
            dialog.show();
            View decorView = this.f230244L1.getWindow().getDecorView();
            eug1.m40073o(decorView, this);
            lug1.m59989F(decorView, this);
            y85.m93047D(decorView, this);
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: Q0 */
    public void mo3105Q0() {
        this.f98702f1 = true;
        Dialog dialog = this.f230244L1;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: S0 */
    public final void mo49696S0(Bundle bundle) {
        Bundle bundle2;
        this.f98702f1 = true;
        if (this.f230244L1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f230244L1.onRestoreInstanceState(bundle2);
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: T0 */
    public final void mo49697T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo49697T0(layoutInflater, viewGroup, bundle);
        if (this.f98706h1 != null || this.f230244L1 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f230244L1.onRestoreInstanceState(bundle2);
    }

    public void dismiss() {
        m83052i1(false, false);
    }

    /* JADX INFO: renamed from: h1 */
    public void mo83051h1() {
        m83052i1(true, false);
    }

    /* JADX INFO: renamed from: i1 */
    public final void m83052i1(boolean z, boolean z2) {
        if (this.f230246N1) {
            return;
        }
        this.f230246N1 = true;
        this.f230247O1 = false;
        Dialog dialog = this.f230244L1;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f230244L1.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.f230233A1.getLooper()) {
                    onDismiss(this.f230244L1);
                } else {
                    this.f230233A1.post(this.f230234B1);
                }
            }
        }
        this.f230245M1 = true;
        if (this.f230241I1 >= 0) {
            c700 c700VarM49720s0 = m49720s0();
            int i = this.f230241I1;
            if (i < 0) {
                throw new IllegalArgumentException(s571.m77246e(i, "Bad id: "));
            }
            c700VarM49720s0.m31656x(new z600(c700VarM49720s0, null, i, 1), z);
            this.f230241I1 = -1;
            return;
        }
        xi8 xi8Var = new xi8(m49720s0());
        xi8Var.f261810r = true;
        xi8Var.m91102m(this);
        if (z) {
            xi8Var.m91096g(true, true);
        } else {
            xi8Var.m91095f();
        }
    }

    /* JADX INFO: renamed from: j1 */
    public Dialog mo63161j1() {
        return this.f230244L1;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: k0 */
    public final q0f1 mo49712k0() {
        return new tgr(this, new c500(this));
    }

    /* JADX INFO: renamed from: k1 */
    public int mo33450k1() {
        return this.f230238F1;
    }

    /* JADX INFO: renamed from: l1 */
    public Dialog mo25833l1(Bundle bundle) {
        if (c700.m31595O(3)) {
            toString();
        }
        return new mwf(m49702X0(), mo33450k1());
    }

    /* JADX INFO: renamed from: m1 */
    public final Dialog m83053m1() {
        Dialog dialogMo63161j1 = mo63161j1();
        if (dialogMo63161j1 != null) {
            return dialogMo63161j1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    /* JADX INFO: renamed from: n1 */
    public final void m83054n1(int i, int i2) {
        if (c700.m31595O(2)) {
            toString();
        }
        this.f230237E1 = i;
        if (i == 2 || i == 3) {
            this.f230238F1 = R.style.Theme.Panel;
        }
        if (i2 != 0) {
            this.f230238F1 = i2;
        }
    }

    /* JADX INFO: renamed from: o1 */
    public void mo66330o1(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f230245M1) {
            return;
        }
        if (c700.m31595O(3)) {
            toString();
        }
        m83052i1(true, true);
    }

    /* JADX INFO: renamed from: p1 */
    public void mo63162p1(c700 c700Var, String str) {
        this.f230246N1 = false;
        this.f230247O1 = true;
        c700Var.getClass();
        xi8 xi8Var = new xi8(c700Var);
        xi8Var.f261810r = true;
        xi8Var.m91100k(0, this, str, 1);
        xi8Var.m91095f();
    }

    /* JADX INFO: renamed from: q1 */
    public void mo63163q1(c700 c700Var, String str) {
        this.f230246N1 = false;
        this.f230247O1 = true;
        c700Var.getClass();
        xi8 xi8Var = new xi8(c700Var);
        xi8Var.f261810r = true;
        xi8Var.m91100k(0, this, str, 1);
        xi8Var.m91097h();
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
