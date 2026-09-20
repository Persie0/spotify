package com.spotify.legacyglue.gluelib.patterns.header.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.car.app.model.Alert;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout;
import p204p.eqk;
import p204p.fh10;
import p204p.hqk;
import p204p.ljc1;
import p204p.njc1;

/* JADX INFO: loaded from: classes7.dex */
public class GlueHeaderAccessoryBehavior extends ljc1 {
    public GlueHeaderAccessoryBehavior() {
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: b */
    public final boolean mo1550b(View view, View view2) {
        return view2 instanceof fh10;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: d */
    public final boolean mo1551d(View view, View view2) {
        hqk hqkVar = (hqk) view2.getLayoutParams();
        eqk eqkVar = hqkVar != null ? hqkVar.f94198a : null;
        if (!(eqkVar instanceof HeaderBehavior)) {
            return false;
        }
        m59147v(view2.getHeight() + ((HeaderBehavior) eqkVar).m59146u());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.ljc1, p204p.eqk
    /* JADX INFO: renamed from: h */
    public final boolean mo1538h(CoordinatorLayout coordinatorLayout, View view, int i) {
        int paddingTop = coordinatorLayout.getPaddingTop();
        int measuredWidth = (coordinatorLayout.getMeasuredWidth() / 2) - (view.getMeasuredWidth() / 2);
        view.layout(measuredWidth, paddingTop - (view.getMeasuredHeight() / 2), view.getMeasuredWidth() + measuredWidth, (view.getMeasuredHeight() / 2) + paddingTop);
        m59145t(view);
        for (View view2 : coordinatorLayout.m374m(view)) {
            if (view2 instanceof fh10) {
                njc1 njc1Var = this.f134058a;
                njc1Var.f154564e = view2.getMeasuredHeight() - ((fh10) view2).getTotalScrollRange();
                njc1Var.f154565f = Alert.DURATION_SHOW_INDEFINITELY;
                njc1Var.f154566g = true;
                break;
            }
        }
        View viewM12565C = ((GlueHeaderLayout) coordinatorLayout).m12565C(true);
        if (viewM12565C != null) {
            hqk hqkVar = (hqk) viewM12565C.getLayoutParams();
            eqk eqkVar = hqkVar != null ? hqkVar.f94198a : null;
            if (eqkVar instanceof HeaderBehavior) {
                m59147v(viewM12565C.getHeight() + ((HeaderBehavior) eqkVar).m59146u());
            }
        }
        return true;
    }

    public GlueHeaderAccessoryBehavior(Context context, AttributeSet attributeSet) {
    }
}
