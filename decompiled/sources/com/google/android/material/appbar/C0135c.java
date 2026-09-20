package com.google.android.material.appbar;

import android.view.View;
import p204p.InterfaceC1667ah;

/* JADX INFO: renamed from: com.google.android.material.appbar.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C0135c implements InterfaceC1667ah {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppBarLayout f1988a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f1989b;

    public C0135c(AppBarLayout appBarLayout, boolean z) {
        this.f1988a = appBarLayout;
        this.f1989b = z;
    }

    @Override // p204p.InterfaceC1667ah
    /* JADX INFO: renamed from: q */
    public final boolean mo1561q(View view) {
        this.f1988a.setExpanded(this.f1989b);
        return true;
    }
}
