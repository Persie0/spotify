package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p204p.InterfaceC1667ah;

/* JADX INFO: renamed from: com.google.android.material.appbar.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C0134b implements InterfaceC1667ah {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoordinatorLayout f1983a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppBarLayout f1984b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f1985c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1986d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AppBarLayout.BaseBehavior f1987e;

    public C0134b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f1987e = baseBehavior;
        this.f1983a = coordinatorLayout;
        this.f1984b = appBarLayout;
        this.f1985c = view;
        this.f1986d = i;
    }

    @Override // p204p.InterfaceC1667ah
    /* JADX INFO: renamed from: q */
    public final boolean mo1561q(View view) {
        this.f1987e.m1534B(this.f1983a, this.f1984b, this.f1985c, this.f1986d, new int[]{0, 0});
        return true;
    }
}
