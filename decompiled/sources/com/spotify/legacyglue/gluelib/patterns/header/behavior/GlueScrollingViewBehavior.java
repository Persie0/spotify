package com.spotify.legacyglue.gluelib.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p204p.eqk;
import p204p.fh10;
import p204p.hqk;
import p204p.ljc1;
import p204p.mec1;

/* JADX INFO: loaded from: classes7.dex */
public class GlueScrollingViewBehavior extends ljc1 {

    /* JADX INFO: renamed from: d */
    public View f5056d;

    public GlueScrollingViewBehavior() {
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: b */
    public final boolean mo1550b(View view, View view2) {
        return (view2 instanceof fh10) || (((hqk) view2.getLayoutParams()).f94198a instanceof GlueHeaderAccessoryBehavior);
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: d */
    public final boolean mo1551d(View view, View view2) {
        eqk eqkVar = ((hqk) view2.getLayoutParams()).f94198a;
        if (!(eqkVar instanceof HeaderBehavior)) {
            return true;
        }
        int height = view2.getHeight() + ((HeaderBehavior) eqkVar).m59146u();
        View view3 = this.f5056d;
        m59147v((view3 != null ? view3.getMeasuredHeight() / 2 : 0) + height);
        return true;
    }

    @Override // p204p.ljc1, p204p.eqk
    /* JADX INFO: renamed from: h */
    public final boolean mo1538h(CoordinatorLayout coordinatorLayout, View view, int i) {
        View view2;
        Iterator it = coordinatorLayout.m374m(view).iterator();
        do {
            if (!it.hasNext()) {
                view2 = null;
                break;
            }
            view2 = (View) it.next();
        } while (!(view2 instanceof fh10));
        super.mo1538h(coordinatorLayout, view, i);
        if (view2 != null) {
            hqk hqkVar = (hqk) view2.getLayoutParams();
            eqk eqkVar = hqkVar != null ? hqkVar.f94198a : null;
            if (eqkVar instanceof HeaderBehavior) {
                int height = view2.getHeight() + ((HeaderBehavior) eqkVar).m59146u();
                View view3 = this.f5056d;
                m59147v((view3 != null ? view3.getMeasuredHeight() / 2 : 0) + height);
            }
        }
        return true;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: i */
    public final boolean mo1539i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        View view2;
        View view3;
        ArrayList<View> arrayListM374m = coordinatorLayout.m374m(view);
        Iterator it = arrayListM374m.iterator();
        do {
            view2 = null;
            if (!it.hasNext()) {
                view3 = null;
                break;
            }
            view3 = (View) it.next();
        } while (!(((hqk) view3.getLayoutParams()).f94198a instanceof GlueHeaderAccessoryBehavior));
        this.f5056d = view3;
        int i4 = view.getLayoutParams().height;
        if ((i4 != -1 && i4 != -2) || arrayListM374m.isEmpty()) {
            return false;
        }
        for (View view4 : arrayListM374m) {
            if (view4 instanceof fh10) {
                view2 = view4;
                break;
            }
        }
        fh10 fh10Var = (fh10) view2;
        if (fh10Var == null) {
            return false;
        }
        WeakHashMap weakHashMap = mec1.f142677a;
        if (view2.getFitsSystemWindows()) {
            view.setFitsSystemWindows(true);
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.m379t(i, i2, View.MeasureSpec.makeMeasureSpec(size - (view2.getMeasuredHeight() - fh10Var.getTotalScrollRange()), i4 == -1 ? 1073741824 : Integer.MIN_VALUE), view);
        return true;
    }

    public GlueScrollingViewBehavior(Context context, AttributeSet attributeSet) {
    }
}
