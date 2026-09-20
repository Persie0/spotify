package p204p;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class al61 extends jkc1 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f16786a;

    /* JADX INFO: renamed from: c */
    public int f16788c = 0;

    /* JADX INFO: renamed from: b */
    public int f16787b = 0;

    public al61(TabLayout tabLayout) {
        this.f16786a = new WeakReference(tabLayout);
    }

    @Override // p204p.jkc1
    /* JADX INFO: renamed from: a */
    public final void mo26274a(int i) {
        this.f16787b = this.f16788c;
        this.f16788c = i;
    }

    @Override // p204p.jkc1
    /* JADX INFO: renamed from: b */
    public final void mo26275b(int i, int i2, float f) {
        TabLayout tabLayout = (TabLayout) this.f16786a.get();
        if (tabLayout != null) {
            int i3 = this.f16788c;
            tabLayout.m1636k(f, i, i3 != 2 || this.f16787b == 1, (i3 == 2 && this.f16787b == 0) ? false : true);
        }
    }

    @Override // p204p.jkc1
    /* JADX INFO: renamed from: c */
    public final void mo26276c(int i) {
        TabLayout tabLayout = (TabLayout) this.f16786a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i2 = this.f16788c;
        tabLayout.m1635j(tabLayout.m1632g(i), i2 == 0 || (i2 == 2 && this.f16787b == 0));
    }
}
