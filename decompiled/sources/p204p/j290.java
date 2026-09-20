package p204p;

import android.widget.AbsListView;

/* JADX INFO: loaded from: classes3.dex */
public final class j290 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ k290 f107981a;

    public j290(k290 k290Var) {
        this.f107981a = k290Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        k290 k290Var = this.f107981a;
        i290 i290Var = k290Var.f118559O0;
        v65 v65Var = k290Var.f118567W0;
        if (i != 1 || v65Var.getInputMethodMode() == 2 || v65Var.getContentView() == null) {
            return;
        }
        k290Var.f118563S0.removeCallbacks(i290Var);
        i290Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
