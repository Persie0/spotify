package com.spotify.podcastplaybackspeed.uiusecases.wheelcontrol;

import android.view.View;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import p204p.d531;
import p204p.vjv0;
import p204p.zjv0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/podcastplaybackspeed/uiusecases/wheelcontrol/WheelControlLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "src_main_java_com_spotify_podcastplaybackspeed_uiusecases_wheelcontrol-wheelcontrol"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class WheelControlLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: e1 */
    public final int f6492e1;

    /* JADX INFO: renamed from: f1 */
    public RecyclerView f6493f1;

    public WheelControlLayoutManager(int i) {
        super(0);
        this.f6492e1 = i;
    }

    /* JADX INFO: renamed from: D1 */
    public final void m19486D1() {
        float f = this.f1288M0 / 2.0f;
        int iM1097I = m1097I();
        for (int i = 0; i < iM1097I; i++) {
            View viewM1096H = m1096H(i);
            if (viewM1096H != null) {
                float fPow = (float) Math.pow((2 * Math.abs(f - ((AbstractC0110a.m1081P(viewM1096H) + AbstractC0110a.m1079M(viewM1096H)) / 2.0f))) / this.f1288M0, 2);
                viewM1096H.setAlpha(fPow >= 0.0f ? 1 - fPow : 0.0f);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: H0 */
    public final int mo892H0(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        int iMo892H0 = super.mo892H0(i, vjv0Var, zjv0Var);
        m19486D1();
        return iMo892H0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: S0 */
    public final void mo926S0(RecyclerView recyclerView, zjv0 zjv0Var, int i) {
        d531 d531Var = new d531(recyclerView.getContext(), 1);
        d531Var.f103318a = i;
        m1108T0(d531Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: h0 */
    public final void mo1113h0(RecyclerView recyclerView) {
        this.f6493f1 = recyclerView;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: u0 */
    public final void mo915u0(vjv0 vjv0Var, zjv0 zjv0Var) {
        RecyclerView recyclerView = this.f6493f1;
        if (recyclerView != null) {
            View view = (View) recyclerView.getParent();
            if (view.getWidth() > 0 && recyclerView.getPaddingLeft() == 0) {
                int width = (view.getWidth() / 2) - (recyclerView.getContext().getResources().getDimensionPixelSize(this.f6492e1) / 2);
                recyclerView.setPadding(width, 0, width, 0);
            }
        }
        super.mo915u0(vjv0Var, zjv0Var);
        m19486D1();
    }
}
