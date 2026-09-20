package p204p;

import android.view.View;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public final class d3d0 extends C2647ze {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ f3d0 f44852d;

    public d3d0(f3d0 f3d0Var) {
        this.f44852d = f3d0Var;
    }

    @Override // p204p.C2647ze
    /* JADX INFO: renamed from: d */
    public final void mo1668d(View view, C2374sf c2374sf) {
        this.f281839a.onInitializeAccessibilityNodeInfo(view, c2374sf.f208417a);
        f3d0 f3d0Var = this.f44852d;
        c2374sf.m77983r(f3d0Var.f65481J1.getVisibility() == 0 ? f3d0Var.m49722u0(R.string.mtrl_picker_toggle_to_year_selection) : f3d0Var.m49722u0(R.string.mtrl_picker_toggle_to_day_selection));
    }
}
