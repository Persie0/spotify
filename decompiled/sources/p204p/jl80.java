package p204p;

import android.graphics.PointF;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class jl80 extends qjv0 {

    /* JADX INFO: renamed from: a */
    public RecyclerView f113518a;

    /* JADX INFO: renamed from: b */
    public Scroller f113519b;

    /* JADX INFO: renamed from: c */
    public final da31 f113520c = new da31(this);

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f113521d;

    /* JADX INFO: renamed from: e */
    public yvl0 f113522e;

    /* JADX INFO: renamed from: f */
    public xvl0 f113523f;

    public jl80(int i) {
        this.f113521d = i;
    }

    /* JADX INFO: renamed from: e */
    public static int m53653e(View view, d180 d180Var) {
        return ((d180Var.mo34596e(view) / 2) + d180Var.mo34598g(view)) - ((d180Var.mo34605n() / 2) + d180Var.mo34604m());
    }

    /* JADX INFO: renamed from: g */
    public static View m53654g(AbstractC0110a abstractC0110a, d180 d180Var) {
        int iM1097I = abstractC0110a.m1097I();
        View view = null;
        if (iM1097I == 0) {
            return null;
        }
        int iMo34605n = (d180Var.mo34605n() / 2) + d180Var.mo34604m();
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i2 = 0; i2 < iM1097I; i2++) {
            View viewM1096H = abstractC0110a.m1096H(i2);
            int iAbs = Math.abs(((d180Var.mo34596e(viewM1096H) / 2) + d180Var.mo34598g(viewM1096H)) - iMo34605n);
            if (iAbs < i) {
                view = viewM1096H;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: h */
    public static View m53655h(AbstractC0110a abstractC0110a, d180 d180Var) {
        int iM1097I = abstractC0110a.m1097I();
        View view = null;
        if (iM1097I == 0) {
            return null;
        }
        int iMo34605n = (d180Var.mo34605n() / 2) + d180Var.mo34604m();
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i2 = 0; i2 < iM1097I; i2++) {
            View viewM1096H = abstractC0110a.m1096H(i2);
            int iAbs = Math.abs(((d180Var.mo34596e(viewM1096H) / 2) + d180Var.mo34598g(viewM1096H)) - iMo34605n);
            if (iAbs < i) {
                view = viewM1096H;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // p204p.qjv0
    /* JADX INFO: renamed from: a */
    public final boolean mo53656a(int i, int i2) {
        il80 il80VarM53658d;
        int iMo53660j;
        AbstractC0110a layoutManager = this.f113518a.getLayoutManager();
        if (layoutManager == null || this.f113518a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f113518a.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !(layoutManager instanceof yjv0) || (il80VarM53658d = m53658d(layoutManager)) == null || (iMo53660j = mo53660j(layoutManager, i, i2)) == -1) {
            return false;
        }
        il80VarM53658d.f103318a = iMo53660j;
        layoutManager.m1108T0(il80VarM53658d);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void mo53657b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f113518a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        da31 da31Var = this.f113520c;
        if (recyclerView2 != null) {
            recyclerView2.m1026q0(da31Var);
            this.f113518a.setOnFlingListener(null);
        }
        this.f113518a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f113518a.m1018m(da31Var);
            this.f113518a.setOnFlingListener(this);
            this.f113519b = new Scroller(this.f113518a.getContext(), new DecelerateInterpolator());
            m53665o();
        }
    }

    /* JADX INFO: renamed from: c */
    public int[] mo45855c(AbstractC0110a abstractC0110a, View view) {
        switch (this.f113521d) {
            case 0:
                int[] iArr = new int[2];
                if (abstractC0110a.mo951q()) {
                    d180 d180VarM53661k = m53661k(abstractC0110a);
                    iArr[0] = ((d180VarM53661k.mo34596e(view) / 2) + d180VarM53661k.mo34598g(view)) - ((d180VarM53661k.mo34605n() / 2) + d180VarM53661k.mo34604m());
                } else {
                    iArr[0] = 0;
                }
                if (abstractC0110a.mo953r()) {
                    d180 d180VarM53663m = m53663m(abstractC0110a);
                    iArr[1] = ((d180VarM53663m.mo34596e(view) / 2) + d180VarM53663m.mo34598g(view)) - ((d180VarM53663m.mo34605n() / 2) + d180VarM53663m.mo34604m());
                } else {
                    iArr[1] = 0;
                }
                return iArr;
            default:
                int[] iArr2 = new int[2];
                if (abstractC0110a.mo951q()) {
                    iArr2[0] = m53653e(view, m53662l(abstractC0110a));
                } else {
                    iArr2[0] = 0;
                }
                if (abstractC0110a.mo953r()) {
                    iArr2[1] = m53653e(view, m53664n(abstractC0110a));
                } else {
                    iArr2[1] = 0;
                }
                return iArr2;
        }
    }

    /* JADX INFO: renamed from: d */
    public il80 m53658d(AbstractC0110a abstractC0110a) {
        switch (this.f113521d) {
            case 1:
                if (abstractC0110a instanceof yjv0) {
                    return new qom0(this, this.f113518a.getContext(), 0);
                }
                return null;
            default:
                if (abstractC0110a instanceof yjv0) {
                    return new qom0(this, this.f113518a.getContext(), 2);
                }
                return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public int m53659f(AbstractC0110a abstractC0110a, d180 d180Var, int i, int i2) {
        this.f113519b.fling(0, 0, i, i2, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
        int[] iArr = {this.f113519b.getFinalX(), this.f113519b.getFinalY()};
        int iM1097I = abstractC0110a.m1097I();
        float f = 1.0f;
        if (iM1097I != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < iM1097I; i5++) {
                View viewM1096H = abstractC0110a.m1096H(i5);
                int iM1083V = AbstractC0110a.m1083V(viewM1096H);
                if (iM1083V != -1) {
                    if (iM1083V < i4) {
                        view = viewM1096H;
                        i4 = iM1083V;
                    }
                    if (iM1083V > i3) {
                        view2 = viewM1096H;
                        i3 = iM1083V;
                    }
                }
            }
            if (view != null && view2 != null) {
                int iMax = Math.max(d180Var.mo34595d(view), d180Var.mo34595d(view2)) - Math.min(d180Var.mo34598g(view), d180Var.mo34598g(view2));
                if (iMax != 0) {
                    f = (iMax * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f);
    }

    /* JADX INFO: renamed from: i */
    public View mo45856i(AbstractC0110a abstractC0110a) {
        switch (this.f113521d) {
            case 0:
                if (abstractC0110a.mo953r()) {
                    return m53654g(abstractC0110a, m53663m(abstractC0110a));
                }
                if (abstractC0110a.mo951q()) {
                    return m53654g(abstractC0110a, m53661k(abstractC0110a));
                }
                return null;
            default:
                if (abstractC0110a.mo953r()) {
                    return m53655h(abstractC0110a, m53664n(abstractC0110a));
                }
                if (abstractC0110a.mo951q()) {
                    return m53655h(abstractC0110a, m53662l(abstractC0110a));
                }
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public int mo53660j(AbstractC0110a abstractC0110a, int i, int i2) {
        int iM1104R;
        View viewMo45856i;
        int iM1083V;
        int i3;
        PointF pointFMo932a;
        int iM53659f;
        int iM53659f2;
        PointF pointFMo932a2;
        switch (this.f113521d) {
            case 0:
                if (!(abstractC0110a instanceof yjv0) || (iM1104R = abstractC0110a.m1104R()) == 0 || (viewMo45856i = mo45856i(abstractC0110a)) == null || (iM1083V = AbstractC0110a.m1083V(viewMo45856i)) == -1 || (pointFMo932a = ((yjv0) abstractC0110a).mo932a((i3 = iM1104R - 1))) == null) {
                    return -1;
                }
                if (abstractC0110a.mo951q()) {
                    iM53659f = m53659f(abstractC0110a, m53661k(abstractC0110a), i, 0);
                    if (pointFMo932a.x < 0.0f) {
                        iM53659f = -iM53659f;
                    }
                } else {
                    iM53659f = 0;
                }
                if (abstractC0110a.mo953r()) {
                    iM53659f2 = m53659f(abstractC0110a, m53663m(abstractC0110a), 0, i2);
                    if (pointFMo932a.y < 0.0f) {
                        iM53659f2 = -iM53659f2;
                    }
                } else {
                    iM53659f2 = 0;
                }
                if (abstractC0110a.mo953r()) {
                    iM53659f = iM53659f2;
                }
                if (iM53659f == 0) {
                    return -1;
                }
                int i4 = iM1083V + iM53659f;
                int i5 = i4 < 0 ? 0 : i4;
                return i5 >= iM1104R ? i3 : i5;
            default:
                int iM1104R2 = abstractC0110a.m1104R();
                if (iM1104R2 == 0) {
                    return -1;
                }
                View view = null;
                d180 d180VarM53664n = abstractC0110a.mo953r() ? m53664n(abstractC0110a) : abstractC0110a.mo951q() ? m53662l(abstractC0110a) : null;
                if (d180VarM53664n == null) {
                    return -1;
                }
                int iM1097I = abstractC0110a.m1097I();
                boolean z = false;
                int i6 = Integer.MAX_VALUE;
                int i7 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i8 = 0; i8 < iM1097I; i8++) {
                    View viewM1096H = abstractC0110a.m1096H(i8);
                    if (viewM1096H != null) {
                        int iM53653e = m53653e(viewM1096H, d180VarM53664n);
                        if (iM53653e <= 0 && iM53653e > i7) {
                            view2 = viewM1096H;
                            i7 = iM53653e;
                        }
                        if (iM53653e >= 0 && iM53653e < i6) {
                            view = viewM1096H;
                            i6 = iM53653e;
                        }
                    }
                }
                boolean z2 = !abstractC0110a.mo951q() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return AbstractC0110a.m1083V(view);
                }
                if (!z2 && view2 != null) {
                    return AbstractC0110a.m1083V(view2);
                }
                if (z2) {
                    view = view2;
                }
                if (view == null) {
                    return -1;
                }
                int iM1083V2 = AbstractC0110a.m1083V(view);
                int iM1104R3 = abstractC0110a.m1104R();
                if ((abstractC0110a instanceof yjv0) && (pointFMo932a2 = ((yjv0) abstractC0110a).mo932a(iM1104R3 - 1)) != null && (pointFMo932a2.x < 0.0f || pointFMo932a2.y < 0.0f)) {
                    z = true;
                }
                int i9 = iM1083V2 + (z == z2 ? -1 : 1);
                if (i9 < 0 || i9 >= iM1104R2) {
                    return -1;
                }
                return i9;
        }
    }

    /* JADX INFO: renamed from: k */
    public d180 m53661k(AbstractC0110a abstractC0110a) {
        xvl0 xvl0Var = this.f113523f;
        if (xvl0Var == null || ((AbstractC0110a) xvl0Var.f44187b) != abstractC0110a) {
            this.f113523f = new xvl0(abstractC0110a);
        }
        return this.f113523f;
    }

    /* JADX INFO: renamed from: l */
    public d180 m53662l(AbstractC0110a abstractC0110a) {
        xvl0 xvl0Var = this.f113523f;
        if (xvl0Var == null || ((AbstractC0110a) xvl0Var.f44187b) != abstractC0110a) {
            this.f113523f = new xvl0(abstractC0110a);
        }
        return this.f113523f;
    }

    /* JADX INFO: renamed from: m */
    public d180 m53663m(AbstractC0110a abstractC0110a) {
        yvl0 yvl0Var = this.f113522e;
        if (yvl0Var == null || ((AbstractC0110a) yvl0Var.f44187b) != abstractC0110a) {
            this.f113522e = new yvl0(abstractC0110a);
        }
        return this.f113522e;
    }

    /* JADX INFO: renamed from: n */
    public d180 m53664n(AbstractC0110a abstractC0110a) {
        yvl0 yvl0Var = this.f113522e;
        if (yvl0Var == null || ((AbstractC0110a) yvl0Var.f44187b) != abstractC0110a) {
            this.f113522e = new yvl0(abstractC0110a);
        }
        return this.f113522e;
    }

    /* JADX INFO: renamed from: o */
    public final void m53665o() {
        AbstractC0110a layoutManager;
        View viewMo45856i;
        RecyclerView recyclerView = this.f113518a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo45856i = mo45856i(layoutManager)) == null) {
            return;
        }
        int[] iArrMo45855c = mo45855c(layoutManager, viewMo45856i);
        int i = iArrMo45855c[0];
        if (i == 0 && iArrMo45855c[1] == 0) {
            return;
        }
        this.f113518a.m1040y0(i, iArrMo45855c[1], null, false);
    }
}
