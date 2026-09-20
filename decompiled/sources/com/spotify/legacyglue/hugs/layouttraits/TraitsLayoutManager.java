package com.spotify.legacyglue.hugs.layouttraits;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p204p.d020;
import p204p.d501;
import p204p.hjv0;
import p204p.ix81;
import p204p.skp;
import p204p.uz10;
import p204p.vjv0;
import p204p.wiy0;

/* JADX INFO: loaded from: classes7.dex */
public class TraitsLayoutManager extends GridLayoutManager {

    /* JADX INFO: renamed from: m1 */
    public final d501 f5071m1;

    /* JADX INFO: renamed from: n1 */
    public final ix81 f5072n1;

    /* JADX INFO: renamed from: o1 */
    public final skp f5073o1;

    /* JADX INFO: renamed from: p1 */
    public wiy0 f5074p1;

    public TraitsLayoutManager(skp skpVar, int i) {
        super(i);
        this.f5071m1 = new d501(this, 21);
        this.f5072n1 = new ix81(this);
        this.f5073o1 = skpVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager
    /* JADX INFO: renamed from: K1 */
    public final void mo898K1(int i) {
        skp skpVar = this.f5073o1;
        if (skpVar != null && i != this.f1156f1) {
            skpVar.m78382g();
        }
        super.mo898K1(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: g0 */
    public final void mo1057g0(hjv0 hjv0Var, hjv0 hjv0Var2) {
        if (hjv0Var2 != null) {
            this.f5074p1 = new wiy0(hjv0Var2, 29);
        } else {
            this.f5074p1 = null;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: h0 */
    public final void mo1113h0(RecyclerView recyclerView) {
        d020 d020Var = new d020(this, recyclerView);
        d020Var.f256437c = true;
        this.f1161k1 = d020Var;
        recyclerView.m1011i(this.f5072n1);
        hjv0 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            this.f5074p1 = new wiy0(adapter, 29);
        } else {
            this.f5074p1 = null;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: i0 */
    public final void mo941i0(RecyclerView recyclerView, vjv0 vjv0Var) {
        super.mo941i0(recyclerView, vjv0Var);
        this.f1161k1 = new uz10();
        recyclerView.m1022o0(this.f5072n1);
        hjv0 adapter = recyclerView.getAdapter();
        if (adapter != null) {
            this.f5074p1 = new wiy0(adapter, 29);
        } else {
            this.f5074p1 = null;
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: o0 */
    public final void mo908o0(RecyclerView recyclerView, int i, int i2) {
        super.mo908o0(recyclerView, i, i2);
        this.f5073o1.m78382g();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: p0 */
    public final void mo909p0(RecyclerView recyclerView) {
        super.mo909p0(recyclerView);
        this.f5073o1.m78382g();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: q0 */
    public final void mo910q0(RecyclerView recyclerView, int i, int i2) {
        super.mo910q0(recyclerView, i, i2);
        this.f5073o1.m78382g();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: r0 */
    public final void mo911r0(RecyclerView recyclerView, int i, int i2) {
        super.mo911r0(recyclerView, i, i2);
        this.f5073o1.m78382g();
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: t0 */
    public final void mo914t0(RecyclerView recyclerView, int i, int i2, Object obj) {
        super.mo914t0(recyclerView, i, i2, obj);
        this.f5073o1.m78382g();
    }
}
