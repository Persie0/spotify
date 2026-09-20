package com.spotify.legacyglue.gluelib.patterns.header;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.model.Alert;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.GlueHeaderAccessoryBehavior;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.GlueNoHeaderBehavior;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.HeaderBehavior;
import p204p.fh10;
import p204p.gi10;
import p204p.hny0;
import p204p.hqk;
import p204p.iqk;
import p204p.ofj0;
import p204p.wh10;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class GlueHeaderLayout extends ofj0 {
    public GlueHeaderLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public final void m12564B() {
        KeyEvent.Callback callbackM12565C = m12565C(false);
        callbackM12565C.getClass();
        fh10 fh10Var = (fh10) callbackM12565C;
        HeaderBehavior headerBehavior = (HeaderBehavior) ((hqk) fh10Var.getView().getLayoutParams()).f94198a;
        if (headerBehavior == null || headerBehavior.m59146u() <= (-fh10Var.getTotalScrollRange()) - headerBehavior.f5064k) {
            return;
        }
        ValueAnimator valueAnimator = headerBehavior.f5063j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            headerBehavior.f5063j = null;
        }
        View view = (View) fh10Var;
        int i = (-fh10Var.getTotalScrollRange()) - headerBehavior.f5064k;
        int iMax = Math.max(Integer.MIN_VALUE, Math.min(i, Alert.DURATION_SHOW_INDEFINITELY));
        fh10 fh10Var2 = (fh10) view;
        int i2 = (-fh10Var2.getTotalScrollRange()) - headerBehavior.f5064k;
        headerBehavior.m12571x(view);
        int iM59146u = headerBehavior.m59146u();
        int iMax2 = Math.max(i2, Math.min(i, 0));
        if (iM59146u < i2 || iM59146u > 0 || iM59146u == iMax2) {
            return;
        }
        headerBehavior.m59146u();
        headerBehavior.m59147v(iMax);
        view.setAlpha(1.0f);
        int iMin = Math.min(-iMax, fh10Var2.getTotalScrollRange());
        ((hny0) view).mo32831a(iMin / fh10Var2.getTotalScrollRange(), iMin);
        m372c(view);
    }

    /* JADX INFO: renamed from: C */
    public final View m12565C(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof fh10) {
                return childAt;
            }
        }
        if (z) {
            return null;
        }
        throw new IllegalStateException("Must have a Behaving header");
    }

    /* JADX INFO: renamed from: D */
    public final void m12566D(View view, boolean z) {
        View childAt;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i);
            if (((hqk) childAt.getLayoutParams()).f94198a instanceof GlueHeaderAccessoryBehavior) {
                break;
            } else {
                i++;
            }
        }
        if (childAt != null) {
            removeView(childAt);
        }
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            hqk hqkVar = (layoutParams == null || !z) ? new hqk(-2, -2) : CoordinatorLayout.m366d(layoutParams);
            hqkVar.m48293b(new GlueHeaderAccessoryBehavior());
            addView(view, hqkVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public final void m12567E(View view, HeaderBehavior headerBehavior, boolean z) {
        View viewM12565C = m12565C(true);
        if (z || viewM12565C != view) {
            View viewM12565C2 = m12565C(true);
            if (viewM12565C2 != null) {
                removeView(viewM12565C2);
            }
            View view2 = ((fh10) view).getView();
            hqk hqkVar = new hqk(-1, -2);
            hqkVar.m48293b(headerBehavior);
            addView(view2, 1, hqkVar);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (m12565C(true) == null) {
            m12567E(new gi10(getContext()), new GlueNoHeaderBehavior(), true);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof wh10) {
            super.onRestoreInstanceState(((wh10) parcelable).f251225a);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final Parcelable onSaveInstanceState() {
        iqk iqkVar = (iqk) super.onSaveInstanceState();
        wh10 wh10Var = new wh10(AbsSavedState.EMPTY_STATE);
        wh10Var.f251225a = iqkVar;
        return wh10Var;
    }

    public void setAccessory(View view) {
        m12566D(view, false);
    }

    public GlueHeaderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlueHeaderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
