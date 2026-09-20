package p204p;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes3.dex */
public final class j75 extends k290 implements l75 {

    /* JADX INFO: renamed from: Z0 */
    public CharSequence f109487Z0;

    /* JADX INFO: renamed from: a1 */
    public ListAdapter f109488a1;

    /* JADX INFO: renamed from: b1 */
    public final Rect f109489b1;

    /* JADX INFO: renamed from: c1 */
    public int f109490c1;

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ m75 f109491d1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j75(m75 m75Var, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.f109491d1 = m75Var;
        this.f109489b1 = new Rect();
        this.f118557M0 = m75Var;
        this.f118566V0 = true;
        this.f118567W0.setFocusable(true);
        this.f118558N0 = new h75(this, 0);
    }

    @Override // p204p.l75
    /* JADX INFO: renamed from: e */
    public final CharSequence mo40953e() {
        return this.f109487Z0;
    }

    @Override // p204p.l75
    /* JADX INFO: renamed from: f */
    public final void mo40954f(CharSequence charSequence) {
        this.f109487Z0 = charSequence;
    }

    @Override // p204p.l75
    /* JADX INFO: renamed from: h */
    public final void mo40956h(int i) {
        this.f109490c1 = i;
    }

    @Override // p204p.l75
    /* JADX INFO: renamed from: i */
    public final void mo40957i(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        v65 v65Var = this.f118567W0;
        boolean zIsShowing = v65Var.isShowing();
        m52599s();
        v65Var.setInputMethodMode(2);
        mo42575m();
        rhs rhsVar = this.f118573c;
        rhsVar.setChoiceMode(1);
        d75.m35183d(rhsVar, i);
        d75.m35182c(rhsVar, i2);
        m75 m75Var = this.f109491d1;
        int selectedItemPosition = m75Var.getSelectedItemPosition();
        rhs rhsVar2 = this.f118573c;
        if (v65Var.isShowing() && rhsVar2 != null) {
            rhsVar2.setListSelectionHidden(false);
            rhsVar2.setSelection(selectedItemPosition);
            if (rhsVar2.getChoiceMode() != 0) {
                rhsVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = m75Var.getViewTreeObserver()) == null) {
            return;
        }
        zx1 zx1Var = new zx1(this, 2);
        viewTreeObserver.addOnGlobalLayoutListener(zx1Var);
        v65Var.setOnDismissListener(new i75(this, zx1Var));
    }

    @Override // p204p.k290, p204p.l75
    /* JADX INFO: renamed from: k */
    public final void mo40959k(ListAdapter listAdapter) {
        super.mo40959k(listAdapter);
        this.f109488a1 = listAdapter;
    }

    /* JADX INFO: renamed from: s */
    public final void m52599s() {
        int i;
        m75 m75Var = this.f109491d1;
        Rect rect = m75Var.f140668h;
        v65 v65Var = this.f118567W0;
        Drawable background = v65Var.getBackground();
        if (background != null) {
            background.getPadding(rect);
            i = cpc1.m33562a(m75Var) ? rect.right : -rect.left;
        } else {
            i = 0;
            rect.right = 0;
            rect.left = 0;
        }
        int paddingLeft = m75Var.getPaddingLeft();
        int paddingRight = m75Var.getPaddingRight();
        int width = m75Var.getWidth();
        int i2 = m75Var.f140667g;
        if (i2 == -2) {
            int iM61045a = m75Var.m61045a((SpinnerAdapter) this.f109488a1, v65Var.getBackground());
            int i3 = (m75Var.getContext().getResources().getDisplayMetrics().widthPixels - rect.left) - rect.right;
            if (iM61045a > i3) {
                iM61045a = i3;
            }
            m55159r(Math.max(iM61045a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m55159r((width - paddingLeft) - paddingRight);
        } else {
            m55159r(i2);
        }
        this.f118576f = cpc1.m33562a(m75Var) ? (((width - paddingRight) - this.f118575e) - this.f109490c1) + i : paddingLeft + this.f109490c1 + i;
    }
}
