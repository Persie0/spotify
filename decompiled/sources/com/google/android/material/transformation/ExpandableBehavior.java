package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p204p.eqk;
import p204p.mec1;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class ExpandableBehavior extends eqk {
    public ExpandableBehavior() {
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: b */
    public abstract boolean mo1550b(View view, View view2);

    @Override // p204p.eqk
    /* JADX INFO: renamed from: d */
    public final boolean mo1551d(View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: h */
    public final boolean mo1538h(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = mec1.f142677a;
        if (!view.isLaidOut()) {
            ArrayList arrayListM374m = coordinatorLayout.m374m(view);
            int size = arrayListM374m.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo1550b(view, (View) arrayListM374m.get(i2));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
