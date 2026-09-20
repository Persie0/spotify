package p204p;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.SnackbarContentLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes4.dex */
public final class c631 extends p19 {

    /* JADX INFO: renamed from: t */
    public static final int[] f34359t = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};

    /* JADX INFO: renamed from: r */
    public final AccessibilityManager f34360r;

    /* JADX INFO: renamed from: s */
    public boolean f34361s;

    public c631(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.f34360r = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:31:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:3:0x0002->B:35:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: i */
    public static c631 m31505i(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        Object parent;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (!(view instanceof FrameLayout)) {
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f34359t);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        c631 c631Var = new c631(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) c631Var.f172994c.getChildAt(0)).getMessageView().setText(charSequence);
        c631Var.f172996e = i;
        return c631Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m31506g() {
        m68776b(3);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m31507h() {
        boolean zM30721v;
        bwt0 bwt0VarM30706t = bwt0.m30706t();
        j19 j19Var = this.f173006o;
        synchronized (bwt0VarM30706t.f31729b) {
            zM30721v = bwt0VarM30706t.m30721v(j19Var);
        }
        return zM30721v;
    }

    /* JADX INFO: renamed from: j */
    public final void m31508j(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button actionView = ((SnackbarContentLayout) this.f172994c.getChildAt(0)).getActionView();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            actionView.setVisibility(8);
            actionView.setOnClickListener(null);
            this.f34361s = false;
        } else {
            this.f34361s = true;
            actionView.setVisibility(0);
            actionView.setText(charSequence);
            actionView.setOnClickListener(new g8q(this, onClickListener, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX INFO: renamed from: k */
    public final void m31509k() {
        bwt0 bwt0VarM30706t = bwt0.m30706t();
        AccessibilityManager accessibilityManager = this.f34360r;
        int recommendedTimeoutMillis = this.f172996e;
        boolean z = false;
        if (recommendedTimeoutMillis == -2) {
            recommendedTimeoutMillis = -2;
        } else if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(recommendedTimeoutMillis, (this.f34361s ? 4 : 0) | 3);
        } else if (this.f34361s && accessibilityManager.isTouchExplorationEnabled()) {
            recommendedTimeoutMillis = -2;
        }
        j19 j19Var = this.f173006o;
        synchronized (bwt0VarM30706t.f31729b) {
            try {
                if (bwt0VarM30706t.m30721v(j19Var)) {
                    j831 j831Var = (j831) bwt0VarM30706t.f31731d;
                    j831Var.f109785b = recommendedTimeoutMillis;
                    ((Handler) bwt0VarM30706t.f31730c).removeCallbacksAndMessages(j831Var);
                    bwt0VarM30706t.m30712G((j831) bwt0VarM30706t.f31731d);
                    return;
                }
                j831 j831Var2 = (j831) bwt0VarM30706t.f31732e;
                if (j831Var2 != null && j831Var2.f109784a.get() == j19Var) {
                    z = true;
                }
                if (z) {
                    ((j831) bwt0VarM30706t.f31732e).f109785b = recommendedTimeoutMillis;
                } else {
                    bwt0VarM30706t.f31732e = new j831(recommendedTimeoutMillis, j19Var);
                }
                j831 j831Var3 = (j831) bwt0VarM30706t.f31731d;
                if (j831Var3 == null || !bwt0VarM30706t.m30715g(j831Var3, 4)) {
                    bwt0VarM30706t.f31731d = null;
                    bwt0VarM30706t.m30713H();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
