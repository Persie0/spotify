package p204p;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C0142c;

/* JADX INFO: loaded from: classes4.dex */
public final class f3d0<S> extends gxn0 {

    /* JADX INFO: renamed from: B1 */
    public int f65473B1;

    /* JADX INFO: renamed from: C1 */
    public o8b f65474C1;

    /* JADX INFO: renamed from: D1 */
    public fyh0 f65475D1;

    /* JADX INFO: renamed from: E1 */
    public int f65476E1;

    /* JADX INFO: renamed from: F1 */
    public i26 f65477F1;

    /* JADX INFO: renamed from: G1 */
    public RecyclerView f65478G1;

    /* JADX INFO: renamed from: H1 */
    public RecyclerView f65479H1;

    /* JADX INFO: renamed from: I1 */
    public View f65480I1;

    /* JADX INFO: renamed from: J1 */
    public View f65481J1;

    @Override // p204p.i500
    /* JADX INFO: renamed from: F0 */
    public final void mo876F0(Bundle bundle) {
        super.mo876F0(bundle);
        if (bundle == null) {
            bundle = this.f98701f;
        }
        this.f65473B1 = bundle.getInt("THEME_RES_ID_KEY");
        this.f65474C1 = (o8b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f65475D1 = (fyh0) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m49717p0(), this.f65473B1);
        this.f65477F1 = new i26(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        fyh0 fyh0Var = this.f65474C1.f162755a;
        if (k3d0.m55238t1(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = com.spotify.music.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.spotify.music.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = m49702X0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.spotify.music.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.spotify.music.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.spotify.music.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.spotify.music.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = gyh0.f85630d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.spotify.music.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.spotify.music.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.spotify.music.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.spotify.music.R.id.mtrl_calendar_days_of_week);
        mec1.m61564p(gridView, new b3d0());
        gridView.setAdapter((ListAdapter) new roo());
        gridView.setNumColumns(fyh0Var.f74748d);
        gridView.setEnabled(false);
        this.f65479H1 = (RecyclerView) viewInflate.findViewById(com.spotify.music.R.id.mtrl_calendar_months);
        this.f65479H1.setLayoutManager(new c3d0(this, i2, i2));
        this.f65479H1.setTag("MONTHS_VIEW_GROUP_TAG");
        C0142c c0142c = new C0142c(contextThemeWrapper, this.f65474C1, new mm90(this, 10));
        this.f65479H1.setAdapter(c0142c);
        int integer = contextThemeWrapper.getResources().getInteger(com.spotify.music.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.spotify.music.R.id.mtrl_calendar_year_selector_frame);
        this.f65478G1 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f65478G1.setLayoutManager(new GridLayoutManager(integer, 0));
            this.f65478G1.setAdapter(new xie1(this));
            this.f65478G1.m1011i(new y5c(this));
        }
        if (viewInflate.findViewById(com.spotify.music.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.spotify.music.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            mec1.m61564p(materialButton, new d3d0(this));
            MaterialButton materialButton2 = (MaterialButton) viewInflate.findViewById(com.spotify.music.R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) viewInflate.findViewById(com.spotify.music.R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.f65480I1 = viewInflate.findViewById(com.spotify.music.R.id.mtrl_calendar_year_selector_frame);
            this.f65481J1 = viewInflate.findViewById(com.spotify.music.R.id.mtrl_calendar_day_selector_frame);
            m40653j1(1);
            materialButton.setText(this.f65475D1.m43107k(viewInflate.getContext()));
            this.f65479H1.m1018m(new o8u(this, c0142c, materialButton));
            materialButton.setOnClickListener(new hta0(this, 2));
            materialButton3.setOnClickListener(new e3d0(this, c0142c, 0));
            materialButton2.setOnClickListener(new e3d0(this, c0142c, 1));
        }
        if (!k3d0.m55238t1(contextThemeWrapper, R.attr.windowFullscreen)) {
            new jl80(1).mo53657b(this.f65479H1);
        }
        this.f65479H1.mo1035v0(c0142c.f2121e.f162755a.m43108l(this.f65475D1));
        return viewInflate;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: O0 */
    public final void mo880O0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f65473B1);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f65474C1);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f65475D1);
    }

    /* JADX INFO: renamed from: i1 */
    public final void m40652i1(fyh0 fyh0Var) {
        C0142c c0142c = (C0142c) this.f65479H1.getAdapter();
        int iM43108l = c0142c.f2121e.f162755a.m43108l(fyh0Var);
        int iM43108l2 = iM43108l - c0142c.f2121e.f162755a.m43108l(this.f65475D1);
        boolean z = Math.abs(iM43108l2) > 3;
        boolean z2 = iM43108l2 > 0;
        this.f65475D1 = fyh0Var;
        if (z && z2) {
            this.f65479H1.mo1035v0(iM43108l - 3);
            this.f65479H1.post(new e9w(this, iM43108l, 2));
        } else if (!z) {
            this.f65479H1.post(new e9w(this, iM43108l, 2));
        } else {
            this.f65479H1.mo1035v0(iM43108l + 3);
            this.f65479H1.post(new e9w(this, iM43108l, 2));
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final void m40653j1(int i) {
        this.f65476E1 = i;
        if (i == 2) {
            this.f65478G1.getLayoutManager().mo924I0(this.f65475D1.f74747c - ((xie1) this.f65478G1.getAdapter()).f261860d.f65474C1.f162755a.f74747c);
            this.f65480I1.setVisibility(0);
            this.f65481J1.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f65480I1.setVisibility(8);
            this.f65481J1.setVisibility(0);
            m40652i1(this.f65475D1);
        }
    }
}
