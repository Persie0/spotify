package com.spotify.encoremobile.recyclerviewutil;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0110a;
import p204p.ojv0;
import p204p.vjv0;
import p204p.zjv0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class FrameLayoutManager extends AbstractC0110a {
    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: E */
    public final ojv0 mo886E() {
        return new ojv0(-1, -1);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: I0 */
    public final void mo924I0(int i) {
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: u0 */
    public final void mo915u0(vjv0 vjv0Var, zjv0 zjv0Var) {
        m1090C(vjv0Var);
        int iM1104R = m1104R();
        for (int i = 0; i < iM1104R; i++) {
            View viewM85781d = vjv0Var.m85781d(i);
            m1111c0(viewM85781d);
            m1114l(viewM85781d);
            ojv0 ojv0Var = (ojv0) viewM85781d.getLayoutParams();
            int i2 = this.f1289N0;
            int i3 = this.f1288M0;
            int paddingTop = getPaddingTop();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int paddingBottom = getPaddingBottom();
            int iM1080N = (((i2 - paddingTop) - paddingBottom) - AbstractC0110a.m1080N(viewM85781d)) / 2;
            int iM1101O = (((i3 - paddingLeft) - paddingRight) - m1101O(viewM85781d)) / 2;
            int i4 = paddingLeft + iM1101O + ((ViewGroup.MarginLayoutParams) ojv0Var).leftMargin;
            int i5 = paddingTop + iM1080N + ((ViewGroup.MarginLayoutParams) ojv0Var).topMargin;
            int i6 = ((i3 - paddingRight) - ((ViewGroup.MarginLayoutParams) ojv0Var).rightMargin) - iM1101O;
            int i7 = ((i2 - paddingBottom) - ((ViewGroup.MarginLayoutParams) ojv0Var).bottomMargin) - iM1080N;
            Rect rect = ((ojv0) viewM85781d.getLayoutParams()).f166148b;
            viewM85781d.layout(i4 + rect.left, i5 + rect.top, i6 - rect.right, i7 - rect.bottom);
        }
    }
}
