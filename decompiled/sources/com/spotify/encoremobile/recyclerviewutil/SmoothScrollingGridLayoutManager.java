package com.spotify.encoremobile.recyclerviewutil;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p204p.qom0;
import p204p.zjv0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class SmoothScrollingGridLayoutManager extends GridLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: S0 */
    public final void mo926S0(RecyclerView recyclerView, zjv0 zjv0Var, int i) {
        qom0 qom0Var = new qom0(this, recyclerView.getContext(), 1);
        qom0Var.f103318a = i;
        m1108T0(qom0Var);
    }
}
