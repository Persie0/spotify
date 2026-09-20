package com.spotify.creativeworkplatform.headerelement;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.music.R;
import kotlin.Metadata;
import p204p.eqk;
import p204p.p1b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m24212d2 = {"Lcom/spotify/creativeworkplatform/headerelement/CreativeWorkHeaderStickyBehavior;", "Lp/eqk;", "Landroid/view/View;", "src_main_java_com_spotify_creativeworkplatform_headerelement-headerelement"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class CreativeWorkHeaderStickyBehavior extends eqk {

    /* JADX INFO: renamed from: a */
    public final View f3551a;

    /* JADX INFO: renamed from: b */
    public Toolbar f3552b;

    /* JADX INFO: renamed from: c */
    public final int[] f3553c = {0, 0};

    public CreativeWorkHeaderStickyBehavior(View view) {
        this.f3551a = view;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: b */
    public final boolean mo1550b(View view, View view2) {
        if (!(view2 instanceof AppBarLayout)) {
            return false;
        }
        if (this.f3552b == null) {
            this.f3552b = (Toolbar) view2.findViewById(R.id.toolbar);
        }
        return this.f3552b != null;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: d */
    public final boolean mo1551d(View view, View view2) {
        Toolbar toolbar = this.f3552b;
        if (toolbar == null) {
            return false;
        }
        m9053t(view, toolbar);
        return false;
    }

    @Override // p204p.eqk
    /* JADX INFO: renamed from: h */
    public final boolean mo1538h(CoordinatorLayout coordinatorLayout, View view, int i) {
        View childAt;
        int i2 = 0;
        while (true) {
            if (!(i2 < coordinatorLayout.getChildCount())) {
                childAt = null;
                break;
            }
            int i3 = i2 + 1;
            childAt = coordinatorLayout.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt instanceof AppBarLayout) {
                break;
            }
            i2 = i3;
        }
        if (childAt != null) {
            if (this.f3552b == null) {
                this.f3552b = (Toolbar) childAt.findViewById(R.id.toolbar);
            }
            Toolbar toolbar = this.f3552b;
            if (toolbar != null) {
                if (!view.isLaidOut() || view.isLayoutRequested()) {
                    view.addOnLayoutChangeListener(new p1b(this, view, toolbar, 2));
                } else {
                    m9053t(view, toolbar);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m9053t(View view, Toolbar toolbar) {
        View view2 = this.f3551a;
        int[] iArr = this.f3553c;
        view2.getLocationInWindow(iArr);
        float height = (iArr[1] + (view2.getHeight() / 2)) - (view.getHeight() / 2);
        int[] iArr2 = {0, 0};
        ((CoordinatorLayout) view.getParent()).getLocationInWindow(iArr2);
        int[] iArr3 = {0, 0};
        toolbar.getLocationInWindow(iArr3);
        float height2 = (iArr3[1] - iArr2[1]) + toolbar.getHeight();
        float height3 = height2 - (view.getHeight() / 2);
        float height4 = height - iArr2[1];
        if (height4 <= height3) {
            height4 = height2 - (view.getHeight() / 2);
        }
        view.setTranslationY(height4);
    }
}
