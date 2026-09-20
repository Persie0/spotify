package p204p;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class die0 extends k290 implements khe0 {

    /* JADX INFO: renamed from: a1 */
    public static final Method f49333a1;

    /* JADX INFO: renamed from: Z0 */
    public vk9 f49334Z0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f49333a1 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    @Override // p204p.khe0
    /* JADX INFO: renamed from: l */
    public final void mo36080l(zge0 zge0Var, MenuItem menuItem) {
        vk9 vk9Var = this.f49334Z0;
        if (vk9Var != null) {
            vk9Var.mo36080l(zge0Var, menuItem);
        }
    }

    @Override // p204p.khe0
    /* JADX INFO: renamed from: p */
    public final void mo36081p(zge0 zge0Var, lhe0 lhe0Var) {
        vk9 vk9Var = this.f49334Z0;
        if (vk9Var != null) {
            vk9Var.mo36081p(zge0Var, lhe0Var);
        }
    }

    @Override // p204p.k290
    /* JADX INFO: renamed from: q */
    public final rhs mo36082q(Context context, boolean z) {
        cie0 cie0Var = new cie0(context, z);
        cie0Var.setHoverListener(this);
        return cie0Var;
    }
}
