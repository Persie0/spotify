package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class djv0 extends hjv0 {

    /* JADX INFO: renamed from: d */
    public final View f49750d;

    /* JADX INFO: renamed from: e */
    public final boolean f49751e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f49752f;

    /* JADX INFO: renamed from: g */
    public final int f49753g;

    public djv0(View view, boolean z) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f49750d = view;
        view.setLayoutParams(layoutParams);
        this.f49751e = z;
        m47720w(true);
        this.f49753g = 1;
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: e */
    public final int mo1617e() {
        return 1;
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: f */
    public final long mo1618f(int i) {
        return this.f49750d.hashCode();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: g */
    public final int mo28437g(int i) {
        return this.f49750d.hashCode();
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: n */
    public final void mo1619n(int i, dkv0 dkv0Var) {
        dkv0Var.f50039a.setEnabled(this.f49751e);
    }

    @Override // p204p.hjv0
    /* JADX INFO: renamed from: p */
    public final dkv0 mo1620p(int i, ViewGroup viewGroup) {
        FrameLayout frameLayout = this.f49752f;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
        this.f49752f = frameLayout2;
        int i2 = this.f49753g;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(i2 == 1 ? -1 : -2, i2 != 1 ? -1 : -2));
        this.f49752f.addView(this.f49750d);
        return new a8u(this.f49752f);
    }
}
