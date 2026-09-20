package p204p;

import com.spotify.mainlayout.p106ui.view.MainLayout;
import com.spotify.mainlayout.p106ui.view.containers.MainLayoutContentContainerView;
import com.spotify.music.R;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public final class nwb0 {

    /* JADX INFO: renamed from: a */
    public final ub80 f159081a;

    /* JADX INFO: renamed from: b */
    public final MainLayout f159082b;

    /* JADX INFO: renamed from: c */
    public final ayb0 f159083c;

    /* JADX INFO: renamed from: d */
    public final ofm0 f159084d;

    /* JADX INFO: renamed from: e */
    public final r250 f159085e;

    /* JADX INFO: renamed from: f */
    public final oei0 f159086f;

    public nwb0(ub80 ub80Var, MainLayout mainLayout, ayb0 ayb0Var, ofm0 ofm0Var, r250 r250Var, oei0 oei0Var) {
        this.f159081a = ub80Var;
        this.f159082b = mainLayout;
        this.f159083c = ayb0Var;
        this.f159084d = ofm0Var;
        this.f159085e = r250Var;
        this.f159086f = oei0Var;
    }

    /* JADX INFO: renamed from: c */
    public static void m65758c(nwb0 nwb0Var, MainLayoutContentContainerView mainLayoutContentContainerView, String str, owb0 owb0Var, Object obj, gh00 gh00Var, int i) {
        mainLayoutContentContainerView.m13399E(str, owb0Var, jag1.m52819d(obj), nwb0Var.f159084d, nwb0Var.f159085e, nwb0Var.f159086f, nwb0Var.f159082b.getInsets$src_main_java_com_spotify_mainlayout_ui_view_view(), (i & 8) != 0 ? vlb0.f242437a1 : gh00Var, cxh0.f43038a);
    }

    /* JADX INFO: renamed from: a */
    public final float m65759a(int i) {
        MainLayout mainLayout = this.f159082b;
        return mainLayout.getResources().getDimension(i) / mainLayout.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: renamed from: b */
    public final float m65760b() {
        int i;
        int iOrdinal = this.f159082b.getMode().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            i = R.dimen.main_layout_vertical_floating_corner_radius;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.dimen.main_layout_large_floating_corner_radius;
        }
        return m65759a(i);
    }
}
