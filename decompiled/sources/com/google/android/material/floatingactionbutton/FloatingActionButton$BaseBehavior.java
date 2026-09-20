package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p204p.eqk;
import p204p.h1u0;
import p204p.hqk;

/* JADX INFO: loaded from: classes4.dex */
public class FloatingActionButton$BaseBehavior<T> extends eqk {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: a */
    public final boolean mo1621a(View view) {
        throw new ClassCastException();
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: c */
    public final void mo1587c(hqk hqkVar) {
        if (hqkVar.f94205h == 0) {
            hqkVar.f94205h = 80;
        }
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: d */
    public final boolean mo1551d(View view, View view2) {
        throw new ClassCastException();
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: h */
    public final boolean mo1538h(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1u0.f86741o);
        typedArrayObtainStyledAttributes.getBoolean(0, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
