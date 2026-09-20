package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p204p.eqk;
import p204p.h1u0;
import p204p.hqk;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior */
/* JADX INFO: loaded from: classes4.dex */
public class C0143xe6e79f6<T> extends eqk {
    public C0143xe6e79f6() {
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean mo1621a(View view) {
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

    public C0143xe6e79f6(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1u0.f86740n);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
