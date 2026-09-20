package p204p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class moj implements pjv0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f145690a;

    public /* synthetic */ moj(int i) {
        this.f145690a = i;
    }

    @Override // p204p.pjv0
    /* JADX INFO: renamed from: a */
    public final void mo32996a(View view) {
        int i = this.f145690a;
    }

    @Override // p204p.pjv0
    /* JADX INFO: renamed from: b */
    public final void mo32997b(View view) {
        switch (this.f145690a) {
            case 0:
                view.setFocusable(true);
                view.setFocusableInTouchMode(false);
                return;
            case 1:
                zxc.m97188h(view);
                return;
            default:
                ojv0 ojv0Var = (ojv0) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) ojv0Var).width != -1 || ((ViewGroup.MarginLayoutParams) ojv0Var).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
                return;
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m62403c(View view) {
    }

    /* JADX INFO: renamed from: d */
    private final void m62404d(View view) {
    }

    /* JADX INFO: renamed from: e */
    private final void m62405e(View view) {
    }
}
