package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class qyn0 {

    /* JADX INFO: renamed from: a */
    public final View f193949a;

    public qyn0(View view) {
        this.f193949a = view;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m74214a(int i) {
        View view = this.f193949a;
        View view2 = view;
        View viewFocusSearch = null;
        for (int i2 = 0; view2 != null && viewFocusSearch == null && i2 < 20; i2++) {
            viewFocusSearch = view2.focusSearch(i);
            if (wj50.m88271j(viewFocusSearch, view2) || wj50.m88271j(viewFocusSearch, view)) {
                viewFocusSearch = null;
            }
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        return viewFocusSearch != null && viewFocusSearch.requestFocus();
    }
}
