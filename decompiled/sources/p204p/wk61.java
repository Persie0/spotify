package p204p;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class wk61 implements ekc1 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f252147a;

    /* JADX INFO: renamed from: b */
    public int f252148b;

    /* JADX INFO: renamed from: c */
    public int f252149c;

    public wk61(TabLayout tabLayout) {
        this.f252147a = new WeakReference(tabLayout);
    }

    @Override // p204p.ekc1
    /* JADX INFO: renamed from: e */
    public final void mo3277e(float f, int i) {
        TabLayout tabLayout = (TabLayout) this.f252147a.get();
        if (tabLayout != null) {
            int i2 = this.f252149c;
            tabLayout.m1636k(f, i, i2 != 2 || this.f252148b == 1, (i2 == 2 && this.f252148b == 0) ? false : true);
        }
    }

    @Override // p204p.ekc1
    /* JADX INFO: renamed from: g */
    public final void mo3278g(int i) {
        this.f252148b = this.f252149c;
        this.f252149c = i;
    }
}
