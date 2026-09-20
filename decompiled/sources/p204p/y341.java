package p204p;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class y341 extends ugr {

    /* JADX INFO: renamed from: Q1 */
    public final t531 f268749Q1;

    /* JADX INFO: renamed from: R1 */
    public xjp f268750R1;

    /* JADX INFO: renamed from: S1 */
    public daq f268751S1;

    /* JADX INFO: renamed from: T1 */
    public cdn f268752T1;

    /* JADX INFO: renamed from: U1 */
    public Rect f268753U1;

    public y341(t531 t531Var) {
        this.f268749Q1 = t531Var;
    }

    /* JADX INFO: renamed from: r1 */
    public static final void m92725r1(y341 y341Var, View view, jaq0 jaq0Var, float f, float f2) {
        n3d0 n3d0Var = new n3d0();
        qyy0 qyy0Var = new qyy0();
        qyy0Var.m74238E(f2);
        int iM52853a = jaq0Var.m52853a();
        w341 w341Var = new w341(f, jaq0Var.m52856d());
        int iM38547C = edb.m38547C(iM52853a);
        if (iM38547C == 0) {
            qyy0Var.m74239F(w341Var);
        } else if (iM38547C == 1) {
            qyy0Var.m74244K(w341Var);
        } else if (iM38547C == 2) {
            qyy0Var.m74246M(w341Var);
        } else {
            if (iM38547C != 3) {
                throw new NoWhenBranchMatchedException();
            }
            qyy0Var.m74245L(w341Var);
        }
        n3d0Var.setShapeAppearanceModel(qyy0Var.m74257d());
        n3d0Var.m63601l(ColorStateList.valueOf(vtg1.m86386m(y341Var.m49702X0(), R.attr.backgroundHighlight, 0)));
        view.setBackground(n3d0Var);
    }

    /* JADX INFO: renamed from: s1 */
    public static final void m92726s1(y341 y341Var, View view, jaq0 jaq0Var, float f) {
        view.setTranslationX(jaq0Var.m52854b());
        view.setTranslationY(jaq0Var.m52855c());
        int iM38547C = edb.m38547C(jaq0Var.m52853a());
        if (iM38547C == 0) {
            view.setTranslationY(view.getTranslationY() - f);
            return;
        }
        if (iM38547C == 1) {
            view.setTranslationX(view.getTranslationX() + f);
        } else if (iM38547C == 2) {
            view.setTranslationY(view.getTranslationY() + f);
        } else {
            if (iM38547C != 3) {
                throw new NoWhenBranchMatchedException();
            }
            view.setTranslationX(view.getTranslationX() - f);
        }
    }

    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: E0 */
    public final void mo875E0(Context context) {
        this.f268749Q1.mo24367f(this);
        super.mo875E0(context);
    }

    @Override // p204p.ugr, p204p.i500
    /* JADX INFO: renamed from: F0 */
    public final void mo876F0(Bundle bundle) {
        super.mo876F0(bundle);
        if (bundle != null) {
            m83052i1(false, false);
        }
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        xjp xjpVar = this.f268750R1;
        if (xjpVar == null) {
            wj50.m88260d0("viewBinderFactory");
            throw null;
        }
        fin finVarM91238m = xjpVar.m91238m(m49702X0(), layoutInflater);
        finVarM91238m.m41759h();
        daq daqVar = this.f268751S1;
        if (daqVar == null) {
            wj50.m88260d0("mobiusControllerProvider");
            throw null;
        }
        MobiusLoop.Controller controllerM35508a = daqVar.m35508a();
        c241.m31316a(controllerM35508a, this.f98716q1);
        b541 b541Var = new b541(finVarM91238m);
        FrameLayout frameLayout = new FrameLayout(m49702X0());
        frameLayout.setClipChildren(false);
        frameLayout.setOnClickListener(new zg11(this, 4));
        ConstraintLayout constraintLayoutM41758g = finVarM91238m.m41758g();
        constraintLayoutM41758g.setLayoutParams(new FrameLayout.LayoutParams(constraintLayoutM41758g.getContext().getResources().getDimensionPixelOffset(R.dimen.speed_control_max_width), -2));
        float dimension = constraintLayoutM41758g.getContext().getResources().getDimension(R.dimen.speed_control_popup_corner_radius);
        float dimension2 = constraintLayoutM41758g.getContext().getResources().getDimension(R.dimen.speed_control_popup_triangle_size);
        if (!constraintLayoutM41758g.isLaidOut() || constraintLayoutM41758g.isLayoutRequested()) {
            constraintLayoutM41758g.addOnLayoutChangeListener(new x341(this, dimension2, dimension));
        } else {
            Rect rect = this.f268753U1;
            if (rect == null) {
                wj50.m88260d0("anchorRect");
                throw null;
            }
            jaq0 jaq0VarM69833n = pft0.m69833n(constraintLayoutM41758g, rect, m49699V0());
            m92726s1(this, constraintLayoutM41758g, jaq0VarM69833n, dimension2);
            m92725r1(this, constraintLayoutM41758g, jaq0VarM69833n, dimension2, dimension);
        }
        frameLayout.addView(finVarM91238m.m41758g());
        controllerM35508a.mo15604c(b541Var);
        return frameLayout;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: N0 */
    public final void mo3095N0() {
        this.f98702f1 = true;
        View view = this.f98706h1;
        if (view != null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
    }

    @Override // p204p.ugr
    /* JADX INFO: renamed from: k1 */
    public final int mo33450k1() {
        return R.style.SpeedControlPopupTheme;
    }

    @Override // p204p.ugr
    /* JADX INFO: renamed from: l1 */
    public final Dialog mo25833l1(Bundle bundle) {
        Dialog dialogMo25833l1 = super.mo25833l1(bundle);
        Window window = dialogMo25833l1.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 8388659;
            attributes.flags |= 512;
            window.setAttributes(attributes);
            ds4.m36749d(window, false);
        }
        dialogMo25833l1.setOnShowListener(new w5m0(this, 3));
        return dialogMo25833l1;
    }

    @Override // p204p.ugr, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        cdn cdnVar = this.f268752T1;
        if (cdnVar == null) {
            wj50.m88260d0("ubiLogger");
            throw null;
        }
        cdnVar.m32447i();
        super.onDismiss(dialogInterface);
    }
}
