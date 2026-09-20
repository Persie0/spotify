package p204p;

import android.R;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes3.dex */
public final class lkc1 {

    /* JADX INFO: renamed from: a */
    public final kkc1 f134321a = new kkc1(this, 0);

    /* JADX INFO: renamed from: b */
    public final gc41 f134322b = new gc41(this, 23);

    /* JADX INFO: renamed from: c */
    public gkc1 f134323c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ViewPager2 f134324d;

    public lkc1(ViewPager2 viewPager2) {
        this.f134324d = viewPager2;
    }

    /* JADX INFO: renamed from: a */
    public boolean m59220a() {
        return this instanceof lkc1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m59221b(int i) {
        return i == 8192 || i == 4096;
    }

    /* JADX INFO: renamed from: c */
    public final void m59222c(hjv0 hjv0Var) {
        m59232m();
        if (hjv0Var != null) {
            hjv0Var.mo47719v(this.f134323c);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m59223d(hjv0 hjv0Var) {
        if (hjv0Var != null) {
            hjv0Var.mo47722z(this.f134323c);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m59224e(hj30 hj30Var) {
        hj30Var.setImportantForAccessibility(2);
        this.f134323c = new gkc1(this, 1);
        ViewPager2 viewPager2 = this.f134324d;
        if (viewPager2.getImportantForAccessibility() == 0) {
            viewPager2.setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m59225f(AccessibilityNodeInfo accessibilityNodeInfo) {
        int iMo1617e;
        int iMo1617e2;
        int iMo1617e3;
        ViewPager2 viewPager2 = this.f134324d;
        if (viewPager2.getAdapter() == null) {
            iMo1617e = 0;
            iMo1617e2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            iMo1617e = viewPager2.getAdapter().mo1617e();
            iMo1617e2 = 1;
        } else {
            iMo1617e2 = viewPager2.getAdapter().mo1617e();
            iMo1617e = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) yic1.m93704m(iMo1617e, iMo1617e2, 0, false).f273079b);
        hjv0 adapter = viewPager2.getAdapter();
        if (adapter == null || (iMo1617e3 = adapter.mo1617e()) == 0 || !viewPager2.f1388S0) {
            return;
        }
        if (viewPager2.f1394d > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.f1394d < iMo1617e3 - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    /* JADX INFO: renamed from: g */
    public final void m59226g(int i, Bundle bundle) {
        if (!m59221b(i)) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = this.f134324d;
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.f1388S0) {
            viewPager2.m1144e(currentItem, true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m59227h() {
        m59232m();
    }

    /* JADX INFO: renamed from: i */
    public final void m59228i() {
        m59232m();
    }

    /* JADX INFO: renamed from: j */
    public final void m59229j() {
        m59232m();
    }

    /* JADX INFO: renamed from: k */
    public final void m59230k() {
        m59232m();
    }

    /* JADX INFO: renamed from: l */
    public final void m59231l() {
        m59232m();
    }

    /* JADX INFO: renamed from: m */
    public final void m59232m() {
        int iMo1617e;
        ViewPager2 viewPager2 = this.f134324d;
        int i = R.id.accessibilityActionPageLeft;
        mec1.m61560l(viewPager2, R.id.accessibilityActionPageLeft);
        mec1.m61556h(viewPager2, 0);
        mec1.m61560l(viewPager2, R.id.accessibilityActionPageRight);
        mec1.m61556h(viewPager2, 0);
        mec1.m61560l(viewPager2, R.id.accessibilityActionPageUp);
        mec1.m61556h(viewPager2, 0);
        mec1.m61560l(viewPager2, R.id.accessibilityActionPageDown);
        mec1.m61556h(viewPager2, 0);
        if (viewPager2.getAdapter() == null || (iMo1617e = viewPager2.getAdapter().mo1617e()) == 0 || !viewPager2.f1388S0) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        gc41 gc41Var = this.f134322b;
        kkc1 kkc1Var = this.f134321a;
        if (orientation != 0) {
            if (viewPager2.f1394d < iMo1617e - 1) {
                mec1.m61561m(viewPager2, new C2212of(R.id.accessibilityActionPageDown, (CharSequence) null), null, kkc1Var);
            }
            if (viewPager2.f1394d > 0) {
                mec1.m61561m(viewPager2, new C2212of(R.id.accessibilityActionPageUp, (CharSequence) null), null, gc41Var);
                return;
            }
            return;
        }
        boolean z = viewPager2.f1397g.m1106S() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (viewPager2.f1394d < iMo1617e - 1) {
            mec1.m61561m(viewPager2, new C2212of(i2, (CharSequence) null), null, kkc1Var);
        }
        if (viewPager2.f1394d > 0) {
            mec1.m61561m(viewPager2, new C2212of(i, (CharSequence) null), null, gc41Var);
        }
    }
}
