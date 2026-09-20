package p204p;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class o3d0<S> extends gxn0 {

    /* JADX INFO: renamed from: B1 */
    public int f161342B1;

    /* JADX INFO: renamed from: C1 */
    public o8b f161343C1;

    @Override // p204p.i500
    /* JADX INFO: renamed from: F0 */
    public final void mo876F0(Bundle bundle) {
        super.mo876F0(bundle);
        if (bundle == null) {
            bundle = this.f98701f;
        }
        this.f161342B1 = bundle.getInt("THEME_RES_ID_KEY");
        this.f161343C1 = (o8b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: G0 */
    public final View mo877G0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m49717p0(), this.f161342B1));
        throw null;
    }

    @Override // p204p.i500
    /* JADX INFO: renamed from: O0 */
    public final void mo880O0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f161342B1);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f161343C1);
    }
}
