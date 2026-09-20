package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: com.google.android.material.appbar.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C0133a implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoordinatorLayout f1980a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppBarLayout f1981b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AppBarLayout.BaseBehavior f1982c;

    public C0133a(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f1982c = baseBehavior;
        this.f1980a = coordinatorLayout;
        this.f1981b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1982c.m82947y(this.f1980a, this.f1981b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
