package p204p;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes3.dex */
public final class hkc1 extends jkc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f92418a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPager2 f92419b;

    public /* synthetic */ hkc1(ViewPager2 viewPager2, int i) {
        this.f92418a = i;
        this.f92419b = viewPager2;
    }

    @Override // p204p.jkc1
    /* JADX INFO: renamed from: a */
    public void mo26274a(int i) {
        switch (this.f92418a) {
            case 0:
                if (i == 0) {
                    this.f92419b.m1145f();
                }
                break;
        }
    }

    @Override // p204p.jkc1
    /* JADX INFO: renamed from: c */
    public final void mo26276c(int i) {
        switch (this.f92418a) {
            case 0:
                ViewPager2 viewPager2 = this.f92419b;
                if (viewPager2.f1394d != i) {
                    viewPager2.f1394d = i;
                    viewPager2.f1390U0.m59232m();
                }
                break;
            default:
                ViewPager2 viewPager3 = this.f92419b;
                viewPager3.clearFocus();
                if (viewPager3.hasFocus()) {
                    viewPager3.f1400t.requestFocus(2);
                }
                break;
        }
    }
}
