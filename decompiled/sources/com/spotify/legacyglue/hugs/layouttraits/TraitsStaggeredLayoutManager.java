package com.spotify.legacyglue.hugs.layouttraits;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.Metadata;
import p204p.vjv0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/legacyglue/hugs/layouttraits/TraitsStaggeredLayoutManager;", "Landroidx/recyclerview/widget/StaggeredGridLayoutManager;", "src_main_java_com_spotify_legacyglue_hugs-hugs"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class TraitsStaggeredLayoutManager extends StaggeredGridLayoutManager {
    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: h0 */
    public final void mo1113h0(RecyclerView recyclerView) {
        recyclerView.m1011i(null);
        recyclerView.getAdapter();
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: i0 */
    public final void mo941i0(RecyclerView recyclerView, vjv0 vjv0Var) {
        super.mo941i0(recyclerView, vjv0Var);
        throw null;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: o0 */
    public final void mo908o0(RecyclerView recyclerView, int i, int i2) {
        m1060i1(i, i2, 1);
        throw null;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: p0 */
    public final void mo909p0(RecyclerView recyclerView) {
        super.mo909p0(recyclerView);
        throw null;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: q0 */
    public final void mo910q0(RecyclerView recyclerView, int i, int i2) {
        super.mo910q0(recyclerView, i, i2);
        throw null;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: r0 */
    public final void mo911r0(RecyclerView recyclerView, int i, int i2) {
        m1060i1(i, i2, 2);
        throw null;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: t0 */
    public final void mo914t0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m1060i1(i, i2, 4);
        throw null;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: y0 */
    public final Parcelable mo963y0() {
        mo924I0(0);
        return null;
    }
}
