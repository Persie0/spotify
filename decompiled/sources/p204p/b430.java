package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class b430 {

    /* JADX INFO: renamed from: a */
    public final ppz f23210a;

    /* JADX INFO: renamed from: b */
    public final View f23211b;

    public b430(ppz ppzVar, View view) {
        this.f23210a = ppzVar;
        this.f23211b = view;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m28068a(int i) {
        View view = this.f23211b;
        View viewFocusSearch = null;
        while (view != null && viewFocusSearch == null) {
            viewFocusSearch = view.focusSearch(i);
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return viewFocusSearch != null && viewFocusSearch.requestFocus();
    }
}
