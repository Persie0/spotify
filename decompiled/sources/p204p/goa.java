package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class goa {

    /* JADX INFO: renamed from: a */
    public final View f82920a;

    public goa(View view) {
        this.f82920a = view;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m45331a(int i) {
        View view = this.f82920a;
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
