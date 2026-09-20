package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.spotify.music.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class pm41 extends whe0 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: L0 */
    public gie0 f178879L0;

    /* JADX INFO: renamed from: M0 */
    public ViewTreeObserver f178880M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f178881N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f178882O0;

    /* JADX INFO: renamed from: P0 */
    public int f178883P0;

    /* JADX INFO: renamed from: R0 */
    public boolean f178885R0;

    /* JADX INFO: renamed from: X */
    public PopupWindow.OnDismissListener f178886X;

    /* JADX INFO: renamed from: Y */
    public View f178887Y;

    /* JADX INFO: renamed from: Z */
    public View f178888Z;

    /* JADX INFO: renamed from: b */
    public final Context f178889b;

    /* JADX INFO: renamed from: c */
    public final zge0 f178890c;

    /* JADX INFO: renamed from: d */
    public final wge0 f178891d;

    /* JADX INFO: renamed from: e */
    public final boolean f178892e;

    /* JADX INFO: renamed from: f */
    public final int f178893f;

    /* JADX INFO: renamed from: g */
    public final int f178894g;

    /* JADX INFO: renamed from: h */
    public final die0 f178895h;

    /* JADX INFO: renamed from: i */
    public final zx1 f178896i = new zx1(this, 7);

    /* JADX INFO: renamed from: t */
    public final ay1 f178897t = new ay1(this, 17);

    /* JADX INFO: renamed from: Q0 */
    public int f178884Q0 = 0;

    public pm41(Context context, zge0 zge0Var, View view, int i, boolean z) {
        this.f178889b = context;
        this.f178890c = zge0Var;
        this.f178892e = z;
        this.f178891d = new wge0(zge0Var, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.f178894g = i;
        Resources resources = context.getResources();
        this.f178893f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f178887Y = view;
        this.f178895h = new die0(context, null, i, 0);
        zge0Var.m96063c(this, context);
    }

    @Override // p204p.ft11
    /* JADX INFO: renamed from: a */
    public final boolean mo42574a() {
        return !this.f178881N0 && this.f178895h.f118567W0.isShowing();
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: b */
    public final void mo28112b(zge0 zge0Var, boolean z) {
        if (zge0Var != this.f178890c) {
            return;
        }
        dismiss();
        gie0 gie0Var = this.f178879L0;
        if (gie0Var != null) {
            gie0Var.mo29244b(zge0Var, z);
        }
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: d */
    public final void mo28114d(gie0 gie0Var) {
        this.f178879L0 = gie0Var;
    }

    @Override // p204p.ft11
    public final void dismiss() {
        if (mo42574a()) {
            this.f178895h.dismiss();
        }
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: e */
    public final void mo28115e() {
        this.f178882O0 = false;
        wge0 wge0Var = this.f178891d;
        if (wge0Var != null) {
            wge0Var.notifyDataSetChanged();
        }
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: h */
    public final boolean mo28118h() {
        return false;
    }

    @Override // p204p.hie0
    /* JADX INFO: renamed from: i */
    public final boolean mo28119i(gr51 gr51Var) {
        boolean z;
        if (gr51Var.hasVisibleItems()) {
            yhe0 yhe0Var = new yhe0(this.f178889b, gr51Var, this.f178888Z, this.f178892e, this.f178894g, 0);
            gie0 gie0Var = this.f178879L0;
            yhe0Var.f272850h = gie0Var;
            whe0 whe0Var = (whe0) yhe0Var.f272851i;
            if (whe0Var != null) {
                whe0Var.mo28114d(gie0Var);
            }
            int size = gr51Var.f282605f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = gr51Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            yhe0Var.f272844b = z;
            whe0 whe0Var2 = (whe0) yhe0Var.f272851i;
            if (whe0Var2 != null) {
                whe0Var2.mo61204o(z);
            }
            yhe0Var.f272852t = this.f178886X;
            this.f178886X = null;
            this.f178890c.m96064d(false);
            die0 die0Var = this.f178895h;
            int width = die0Var.f118576f;
            int iM55157j = die0Var.m55157j();
            int i2 = this.f178884Q0;
            View view = this.f178887Y;
            WeakHashMap weakHashMap = mec1.f142677a;
            if ((Gravity.getAbsoluteGravity(i2, view.getLayoutDirection()) & 7) == 5) {
                width += this.f178887Y.getWidth();
            }
            if (!yhe0Var.m93651b()) {
                if (((View) yhe0Var.f272849g) != null) {
                    yhe0Var.m93655g(width, iM55157j, true, true);
                }
            }
            gie0 gie0Var2 = this.f178879L0;
            if (gie0Var2 != null) {
                gie0Var2.mo29245f(gr51Var);
            }
            return true;
        }
        return false;
    }

    @Override // p204p.whe0
    /* JADX INFO: renamed from: l */
    public final void mo61203l(View view) {
        this.f178887Y = view;
    }

    @Override // p204p.ft11
    /* JADX INFO: renamed from: m */
    public final void mo42575m() {
        View view;
        if (mo42574a()) {
            return;
        }
        if (this.f178881N0 || (view = this.f178887Y) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f178888Z = view;
        die0 die0Var = this.f178895h;
        v65 v65Var = die0Var.f118567W0;
        v65 v65Var2 = die0Var.f118567W0;
        v65Var.setOnDismissListener(this);
        die0Var.f118558N0 = this;
        die0Var.f118566V0 = true;
        v65Var2.setFocusable(true);
        View view2 = this.f178888Z;
        boolean z = this.f178880M0 == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f178880M0 = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f178896i);
        }
        view2.addOnAttachStateChangeListener(this.f178897t);
        die0Var.f118557M0 = view2;
        die0Var.f118569Y = this.f178884Q0;
        boolean z2 = this.f178882O0;
        Context context = this.f178889b;
        wge0 wge0Var = this.f178891d;
        if (!z2) {
            this.f178883P0 = whe0.m88127k(wge0Var, context, this.f178893f);
            this.f178882O0 = true;
        }
        die0Var.m55159r(this.f178883P0);
        v65Var2.setInputMethodMode(2);
        Rect rect = this.f251340a;
        die0Var.f118565U0 = rect != null ? new Rect(rect) : null;
        die0Var.mo42575m();
        rhs rhsVar = die0Var.f118573c;
        rhsVar.setOnKeyListener(this);
        if (this.f178885R0) {
            zge0 zge0Var = this.f178890c;
            if (zge0Var.f282612m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) rhsVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(zge0Var.f282612m);
                }
                frameLayout.setEnabled(false);
                rhsVar.addHeaderView(frameLayout, null, false);
            }
        }
        die0Var.mo40959k(wge0Var);
        die0Var.mo42575m();
    }

    @Override // p204p.ft11
    /* JADX INFO: renamed from: n */
    public final rhs mo42576n() {
        return this.f178895h.f118573c;
    }

    @Override // p204p.whe0
    /* JADX INFO: renamed from: o */
    public final void mo61204o(boolean z) {
        this.f178891d.f251048c = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f178881N0 = true;
        this.f178890c.m96064d(true);
        ViewTreeObserver viewTreeObserver = this.f178880M0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f178880M0 = this.f178888Z.getViewTreeObserver();
            }
            this.f178880M0.removeGlobalOnLayoutListener(this.f178896i);
            this.f178880M0 = null;
        }
        this.f178888Z.removeOnAttachStateChangeListener(this.f178897t);
        PopupWindow.OnDismissListener onDismissListener = this.f178886X;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p204p.whe0
    /* JADX INFO: renamed from: p */
    public final void mo61205p(int i) {
        this.f178884Q0 = i;
    }

    @Override // p204p.whe0
    /* JADX INFO: renamed from: q */
    public final void mo61206q(int i) {
        this.f178895h.f118576f = i;
    }

    @Override // p204p.whe0
    /* JADX INFO: renamed from: r */
    public final void mo61207r(PopupWindow.OnDismissListener onDismissListener) {
        this.f178886X = onDismissListener;
    }

    @Override // p204p.whe0
    /* JADX INFO: renamed from: s */
    public final void mo61208s(boolean z) {
        this.f178885R0 = z;
    }

    @Override // p204p.whe0
    /* JADX INFO: renamed from: t */
    public final void mo61209t(int i) {
        this.f178895h.m55156g(i);
    }

    @Override // p204p.whe0
    /* JADX INFO: renamed from: j */
    public final void mo61202j(zge0 zge0Var) {
    }
}
