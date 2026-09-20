package com.google.android.material.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p204p.eqk;
import p204p.r05;
import p204p.z10;

/* JADX INFO: loaded from: classes4.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends eqk {

    /* JADX INFO: renamed from: a */
    public int f1994a = 0;

    /* JADX INFO: renamed from: b */
    public int f1995b = 2;

    /* JADX INFO: renamed from: c */
    public ViewPropertyAnimator f1996c;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: h */
    public boolean mo1538h(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f1994a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return false;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: m */
    public final void mo1541m(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.f1995b == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f1996c;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f1995b = 1;
            this.f1996c = view.animate().translationY(this.f1994a).setInterpolator(r05.f194385c).setDuration(175L).setListener(new z10(this, 7));
            return;
        }
        if (i2 >= 0 || this.f1995b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.f1996c;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f1995b = 2;
        this.f1996c = view.animate().translationY(0).setInterpolator(r05.f194386d).setDuration(225L).setListener(new z10(this, 7));
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: q */
    public boolean mo1544q(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
