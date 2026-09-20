package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import java.util.Arrays;
import p204p.C2374sf;
import p204p.c961;
import p204p.dl80;
import p204p.dq60;
import p204p.el80;
import p204p.gx8;
import p204p.klh;
import p204p.njx;
import p204p.ojv0;
import p204p.s571;
import p204p.uz10;
import p204p.vjv0;
import p204p.vz10;
import p204p.wz10;
import p204p.zjv0;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: e1 */
    public boolean f1155e1;

    /* JADX INFO: renamed from: f1 */
    public int f1156f1;

    /* JADX INFO: renamed from: g1 */
    public int[] f1157g1;

    /* JADX INFO: renamed from: h1 */
    public View[] f1158h1;

    /* JADX INFO: renamed from: i1 */
    public final SparseIntArray f1159i1;

    /* JADX INFO: renamed from: j1 */
    public final SparseIntArray f1160j1;

    /* JADX INFO: renamed from: k1 */
    public wz10 f1161k1;

    /* JADX INFO: renamed from: l1 */
    public final Rect f1162l1;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1155e1 = false;
        this.f1156f1 = -1;
        this.f1159i1 = new SparseIntArray();
        this.f1160j1 = new SparseIntArray();
        this.f1161k1 = new uz10();
        this.f1162l1 = new Rect();
        mo898K1(AbstractC0110a.m1084W(context, attributeSet, i, i2).f88402b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: A */
    public final int mo883A(zjv0 zjv0Var) {
        return m929Y0(zjv0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: B */
    public final int mo884B(zjv0 zjv0Var) {
        return m931Z0(zjv0Var);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m885D1(int i) {
        int i2;
        int[] iArr = this.f1157g1;
        int i3 = this.f1156f1;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f1157g1 = iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: E */
    public final ojv0 mo886E() {
        return this.f1163O0 == 0 ? new vz10(-2, -1) : new vz10(-1, -2);
    }

    /* JADX INFO: renamed from: E1 */
    public final void m887E1() {
        View[] viewArr = this.f1158h1;
        if (viewArr == null || viewArr.length != this.f1156f1) {
            this.f1158h1 = new View[this.f1156f1];
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: F */
    public final ojv0 mo888F(Context context, AttributeSet attributeSet) {
        return new vz10(context, attributeSet);
    }

    /* JADX INFO: renamed from: F1 */
    public final int m889F1(int i, int i2) {
        if (this.f1163O0 != 1 || !m952q1()) {
            int[] iArr = this.f1157g1;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f1157g1;
        int i3 = this.f1156f1;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: G */
    public final ojv0 mo890G(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new vz10((ViewGroup.MarginLayoutParams) layoutParams) : new vz10(layoutParams);
    }

    /* JADX INFO: renamed from: G1 */
    public final int m891G1(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        if (!zjv0Var.f283550g) {
            return this.f1161k1.m89391b(i, this.f1156f1);
        }
        int iM85779b = vjv0Var.m85779b(i);
        if (iM85779b == -1) {
            return 0;
        }
        return this.f1161k1.m89391b(iM85779b, this.f1156f1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: H0 */
    public final int mo892H0(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        m899L1();
        m887E1();
        return super.mo892H0(i, vjv0Var, zjv0Var);
    }

    /* JADX INFO: renamed from: H1 */
    public final int m893H1(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        if (!zjv0Var.f283550g) {
            return this.f1161k1.m89392c(i, this.f1156f1);
        }
        int i2 = this.f1160j1.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM85779b = vjv0Var.m85779b(i);
        if (iM85779b == -1) {
            return 0;
        }
        return this.f1161k1.m89392c(iM85779b, this.f1156f1);
    }

    /* JADX INFO: renamed from: I1 */
    public final int m894I1(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        if (!zjv0Var.f283550g) {
            return this.f1161k1.mo34488f(i);
        }
        int i2 = this.f1159i1.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM85779b = vjv0Var.m85779b(i);
        if (iM85779b == -1) {
            return 1;
        }
        return this.f1161k1.mo34488f(iM85779b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: J0 */
    public final int mo895J0(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        m899L1();
        m887E1();
        return super.mo895J0(i, vjv0Var, zjv0Var);
    }

    /* JADX INFO: renamed from: J1 */
    public final void m896J1(View view, int i, boolean z) {
        int iM1077J;
        int iM1077J2;
        vz10 vz10Var = (vz10) view.getLayoutParams();
        Rect rect = vz10Var.f166148b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) vz10Var).topMargin + ((ViewGroup.MarginLayoutParams) vz10Var).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) vz10Var).leftMargin + ((ViewGroup.MarginLayoutParams) vz10Var).rightMargin;
        int iM889F1 = m889F1(vz10Var.f246359e, vz10Var.f246360f);
        if (this.f1163O0 == 1) {
            iM1077J2 = AbstractC0110a.m1077J(false, iM889F1, i, i3, ((ViewGroup.MarginLayoutParams) vz10Var).width);
            iM1077J = AbstractC0110a.m1077J(true, this.f1165Q0.mo34605n(), this.f1287L0, i2, ((ViewGroup.MarginLayoutParams) vz10Var).height);
        } else {
            int iM1077J3 = AbstractC0110a.m1077J(false, iM889F1, i, i2, ((ViewGroup.MarginLayoutParams) vz10Var).height);
            int iM1077J4 = AbstractC0110a.m1077J(true, this.f1165Q0.mo34605n(), this.f1292Z, i3, ((ViewGroup.MarginLayoutParams) vz10Var).width);
            iM1077J = iM1077J3;
            iM1077J2 = iM1077J4;
        }
        ojv0 ojv0Var = (ojv0) view.getLayoutParams();
        if (z ? m1105R0(view, iM1077J2, iM1077J, ojv0Var) : m1103P0(view, iM1077J2, iM1077J, ojv0Var)) {
            view.measure(iM1077J2, iM1077J);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: K */
    public final int mo897K(vjv0 vjv0Var, zjv0 zjv0Var) {
        if (this.f1163O0 == 1) {
            return this.f1156f1;
        }
        if (zjv0Var.m96246b() < 1) {
            return 0;
        }
        return m891G1(zjv0Var.m96246b() - 1, vjv0Var, zjv0Var) + 1;
    }

    /* JADX INFO: renamed from: K1 */
    public void mo898K1(int i) {
        if (i == this.f1156f1) {
            return;
        }
        this.f1155e1 = true;
        if (i < 1) {
            throw new IllegalArgumentException(s571.m77246e(i, "Span count should be at least 1. Provided "));
        }
        this.f1156f1 = i;
        this.f1161k1.m89395h();
        m1095G0();
    }

    /* JADX INFO: renamed from: L1 */
    public final void m899L1() {
        int paddingBottom;
        int paddingTop;
        if (this.f1163O0 == 1) {
            paddingBottom = this.f1288M0 - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.f1289N0 - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        m885D1(paddingBottom - paddingTop);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: M0 */
    public final void mo900M0(int i, int i2, Rect rect) {
        int iM1087t;
        int iM1087t2;
        if (this.f1157g1 == null) {
            super.mo900M0(i, i2, rect);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f1163O0 == 1) {
            iM1087t2 = AbstractC0110a.m1087t(i2, rect.height() + paddingBottom, m1107T());
            int[] iArr = this.f1157g1;
            iM1087t = AbstractC0110a.m1087t(i, iArr[iArr.length - 1] + paddingRight, m1109U());
        } else {
            iM1087t = AbstractC0110a.m1087t(i, rect.width() + paddingRight, m1109U());
            int[] iArr2 = this.f1157g1;
            iM1087t2 = AbstractC0110a.m1087t(i2, iArr2[iArr2.length - 1] + paddingBottom, m1107T());
        }
        this.f1294b.setMeasuredDimension(iM1087t, iM1087t2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: U0 */
    public final boolean mo901U0() {
        return this.f1174Z0 == null && !this.f1155e1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: W0 */
    public final void mo902W0(zjv0 zjv0Var, el80 el80Var, gx8 gx8Var) {
        int i;
        int iMo34488f = this.f1156f1;
        for (int i2 = 0; i2 < this.f1156f1 && (i = el80Var.f60643d) >= 0 && i < zjv0Var.m96246b() && iMo34488f > 0; i2++) {
            int i3 = el80Var.f60643d;
            gx8Var.m46027a(i3, Math.max(0, el80Var.f60646g));
            iMo34488f -= this.f1161k1.mo34488f(i3);
            el80Var.f60643d += el80Var.f60644e;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: X */
    public final int mo903X(vjv0 vjv0Var, zjv0 zjv0Var) {
        if (this.f1163O0 == 0) {
            return this.f1156f1;
        }
        if (zjv0Var.m96246b() < 1) {
            return 0;
        }
        return m891G1(zjv0Var.m96246b() - 1, vjv0Var, zjv0Var) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: j0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo904j0(View view, int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        View viewM990I;
        int iM1097I;
        int i2;
        int iM1097I2;
        View view2;
        View view3;
        int i3;
        int i4;
        vjv0 vjv0Var2 = vjv0Var;
        zjv0 zjv0Var2 = zjv0Var;
        RecyclerView recyclerView = this.f1294b;
        if (recyclerView == null || (viewM990I = recyclerView.m990I(view)) == null || this.f1293a.f205271c.contains(viewM990I)) {
            viewM990I = null;
        }
        if (viewM990I != null) {
            vz10 vz10Var = (vz10) viewM990I.getLayoutParams();
            int i5 = vz10Var.f246359e;
            int i6 = vz10Var.f246360f + i5;
            if (super.mo904j0(view, i, vjv0Var, zjv0Var) != null) {
                if ((m933a1(i) == 1) != this.f1168T0) {
                    iM1097I2 = m1097I() - 1;
                    iM1097I = -1;
                    i2 = -1;
                } else {
                    iM1097I = m1097I();
                    i2 = 1;
                    iM1097I2 = 0;
                }
                boolean z = this.f1163O0 == 1 && m952q1();
                int iM891G1 = m891G1(iM1097I2, vjv0Var2, zjv0Var2);
                View view4 = null;
                int i7 = -1;
                int i8 = -1;
                int iMin = 0;
                int i9 = iM1097I2;
                int iMin2 = 0;
                View view5 = null;
                while (true) {
                    view2 = view5;
                    if (i9 == iM1097I) {
                        break;
                    }
                    int iM891G2 = m891G1(i9, vjv0Var2, zjv0Var2);
                    View viewM1096H = m1096H(i9);
                    if (viewM1096H == viewM990I) {
                        break;
                    }
                    if (!viewM1096H.hasFocusable() || iM891G2 == iM891G1) {
                        vz10 vz10Var2 = (vz10) viewM1096H.getLayoutParams();
                        int i10 = vz10Var2.f246359e;
                        view3 = viewM990I;
                        int i11 = vz10Var2.f246360f + i10;
                        if (viewM1096H.hasFocusable() && i10 == i5 && i11 == i6) {
                            return viewM1096H;
                        }
                        if (!(viewM1096H.hasFocusable() && view4 == null) && (viewM1096H.hasFocusable() || view2 != null)) {
                            i3 = iM1097I;
                            int iMin3 = Math.min(i11, i6) - Math.max(i10, i5);
                            if (viewM1096H.hasFocusable()) {
                                if (iMin3 <= iMin) {
                                    if (iMin3 == iMin) {
                                    }
                                    i4 = iMin;
                                }
                                i4 = iMin;
                            } else if (view4 == null) {
                                i4 = iMin;
                                if (!this.f1295c.m83242r(viewM1096H) || !this.f1296d.m83242r(viewM1096H)) {
                                    if (iMin3 <= iMin2) {
                                        if (iMin3 == iMin2) {
                                            if (z == (i10 > i7)) {
                                            }
                                        }
                                    }
                                }
                            } else {
                                i4 = iMin;
                            }
                            i9 += i2;
                            vjv0Var2 = vjv0Var;
                            zjv0Var2 = zjv0Var;
                            viewM990I = view3;
                            iM1097I = i3;
                        } else {
                            i4 = iMin;
                            i3 = iM1097I;
                        }
                        if (viewM1096H.hasFocusable()) {
                            int i12 = vz10Var2.f246359e;
                            iMin = Math.min(i11, i6) - Math.max(i10, i5);
                            view4 = viewM1096H;
                            i8 = i12;
                            view5 = view2;
                        } else {
                            int i13 = vz10Var2.f246359e;
                            view5 = viewM1096H;
                            i7 = i13;
                            iMin = i4;
                            iMin2 = Math.min(i11, i6) - Math.max(i10, i5);
                        }
                        i9 += i2;
                        vjv0Var2 = vjv0Var;
                        zjv0Var2 = zjv0Var;
                        viewM990I = view3;
                        iM1097I = i3;
                    } else {
                        if (view4 != null) {
                            break;
                        }
                        view3 = viewM990I;
                        i4 = iMin;
                        i3 = iM1097I;
                    }
                    view5 = view2;
                    iMin = i4;
                    i9 += i2;
                    vjv0Var2 = vjv0Var;
                    zjv0Var2 = zjv0Var;
                    viewM990I = view3;
                    iM1097I = i3;
                }
                return view4 != null ? view4 : view2;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: l0 */
    public final void mo905l0(vjv0 vjv0Var, zjv0 zjv0Var, C2374sf c2374sf) {
        super.mo905l0(vjv0Var, zjv0Var, c2374sf);
        c2374sf.m77978m(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: l1 */
    public final View mo906l1(vjv0 vjv0Var, zjv0 zjv0Var, boolean z, boolean z2) {
        int i;
        int iM1097I;
        int iM1097I2 = m1097I();
        int i2 = 1;
        if (z2) {
            iM1097I = m1097I() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM1097I2;
            iM1097I = 0;
        }
        int iM96246b = zjv0Var.m96246b();
        m934b1();
        int iMo34604m = this.f1165Q0.mo34604m();
        int iMo34600i = this.f1165Q0.mo34600i();
        View view = null;
        View view2 = null;
        while (iM1097I != i) {
            View viewM1096H = m1096H(iM1097I);
            int iM1083V = AbstractC0110a.m1083V(viewM1096H);
            if (iM1083V >= 0 && iM1083V < iM96246b && m893H1(iM1083V, vjv0Var, zjv0Var) == 0) {
                if (((ojv0) viewM1096H.getLayoutParams()).f166147a.m36330t()) {
                    if (view2 == null) {
                        view2 = viewM1096H;
                    }
                } else {
                    if (this.f1165Q0.mo34598g(viewM1096H) < iMo34600i && this.f1165Q0.mo34595d(viewM1096H) >= iMo34604m) {
                        return viewM1096H;
                    }
                    if (view == null) {
                        view = viewM1096H;
                    }
                }
            }
            iM1097I += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: n0 */
    public final void mo907n0(vjv0 vjv0Var, zjv0 zjv0Var, View view, C2374sf c2374sf) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof vz10)) {
            m1116m0(view, c2374sf);
            return;
        }
        vz10 vz10Var = (vz10) layoutParams;
        int iM891G1 = m891G1(vz10Var.f166147a.m36324n(), vjv0Var, zjv0Var);
        if (this.f1163O0 == 0) {
            c2374sf.m77980o(c961.m31864c(false, vz10Var.m86865c(), vz10Var.m86866g(), iM891G1, 1));
        } else {
            c2374sf.m77980o(c961.m31864c(false, iM891G1, 1, vz10Var.m86865c(), vz10Var.m86866g()));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: o0 */
    public void mo908o0(RecyclerView recyclerView, int i, int i2) {
        this.f1161k1.m89395h();
        this.f1161k1.m89394g();
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: p0 */
    public void mo909p0(RecyclerView recyclerView) {
        this.f1161k1.m89395h();
        this.f1161k1.m89394g();
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: q0 */
    public void mo910q0(RecyclerView recyclerView, int i, int i2) {
        this.f1161k1.m89395h();
        this.f1161k1.m89394g();
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: r0 */
    public void mo911r0(RecyclerView recyclerView, int i, int i2) {
        this.f1161k1.m89395h();
        this.f1161k1.m89394g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: r1 */
    public final void mo912r1(vjv0 vjv0Var, zjv0 zjv0Var, el80 el80Var, dl80 dl80Var) {
        int i;
        int i2;
        int i3;
        int iMo34597f;
        int paddingLeft;
        int paddingTop;
        int iMo34597f2;
        int iM1077J;
        int iM1077J2;
        boolean z;
        int i4;
        View viewM39358b;
        int iMo34603l = this.f1165Q0.mo34603l();
        boolean z2 = iMo34603l != 1073741824;
        int i5 = m1097I() > 0 ? this.f1157g1[this.f1156f1] : 0;
        if (z2) {
            m899L1();
        }
        boolean z3 = el80Var.f60644e == 1;
        int iM893H1 = this.f1156f1;
        if (!z3) {
            iM893H1 = m893H1(el80Var.f60643d, vjv0Var, zjv0Var) + m894I1(el80Var.f60643d, vjv0Var, zjv0Var);
        }
        int i6 = 0;
        while (i6 < this.f1156f1 && (i4 = el80Var.f60643d) >= 0 && i4 < zjv0Var.m96246b() && iM893H1 > 0) {
            int i7 = el80Var.f60643d;
            int iM894I1 = m894I1(i7, vjv0Var, zjv0Var);
            if (iM894I1 > this.f1156f1) {
                throw new IllegalArgumentException(klh.m56832d(this.f1156f1, " spans.", dq60.m36619s(i7, iM894I1, "Item at position ", " requires ", " spans but GridLayoutManager has only ")));
            }
            iM893H1 -= iM894I1;
            if (iM893H1 < 0 || (viewM39358b = el80Var.m39358b(vjv0Var)) == null) {
                break;
            }
            this.f1158h1[i6] = viewM39358b;
            i6++;
        }
        if (i6 == 0) {
            dl80Var.f50142b = true;
            return;
        }
        if (z3) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.f1158h1[i];
            vz10 vz10Var = (vz10) view.getLayoutParams();
            int iM894I2 = m894I1(AbstractC0110a.m1083V(view), vjv0Var, zjv0Var);
            vz10Var.f246360f = iM894I2;
            vz10Var.f246359e = i8;
            i8 += iM894I2;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.f1158h1[i10];
            if (el80Var.f60650k != null) {
                z = false;
                if (z3) {
                    m1115m(view2, -1, true);
                } else {
                    m1115m(view2, 0, true);
                }
            } else if (z3) {
                m1114l(view2);
                z = false;
            } else {
                z = false;
                m1115m(view2, 0, false);
            }
            m1118p(this.f1162l1, view2);
            m896J1(view2, iMo34603l, z);
            int iMo34596e = this.f1165Q0.mo34596e(view2);
            if (iMo34596e > i9) {
                i9 = iMo34596e;
            }
            float fMo34597f = (this.f1165Q0.mo34597f(view2) * 1.0f) / ((vz10) view2.getLayoutParams()).f246360f;
            if (fMo34597f > f) {
                f = fMo34597f;
            }
        }
        if (z2) {
            m885D1(Math.max(Math.round(f * this.f1156f1), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.f1158h1[i11];
                m896J1(view3, 1073741824, true);
                int iMo34596e2 = this.f1165Q0.mo34596e(view3);
                if (iMo34596e2 > i9) {
                    i9 = iMo34596e2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.f1158h1[i12];
            if (this.f1165Q0.mo34596e(view4) != i9) {
                vz10 vz10Var2 = (vz10) view4.getLayoutParams();
                Rect rect = vz10Var2.f166148b;
                int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) vz10Var2).topMargin + ((ViewGroup.MarginLayoutParams) vz10Var2).bottomMargin;
                int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) vz10Var2).leftMargin + ((ViewGroup.MarginLayoutParams) vz10Var2).rightMargin;
                int iM889F1 = m889F1(vz10Var2.f246359e, vz10Var2.f246360f);
                if (this.f1163O0 == 1) {
                    iM1077J2 = AbstractC0110a.m1077J(false, iM889F1, 1073741824, i14, ((ViewGroup.MarginLayoutParams) vz10Var2).width);
                    iM1077J = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iM1077J = AbstractC0110a.m1077J(false, iM889F1, 1073741824, i13, ((ViewGroup.MarginLayoutParams) vz10Var2).height);
                    iM1077J2 = iMakeMeasureSpec;
                }
                if (m1105R0(view4, iM1077J2, iM1077J, (ojv0) view4.getLayoutParams())) {
                    view4.measure(iM1077J2, iM1077J);
                }
            }
        }
        dl80Var.f50141a = i9;
        if (this.f1163O0 != 1) {
            if (el80Var.f60645f == -1) {
                int i15 = el80Var.f60641b;
                paddingLeft = i15 - i9;
                iMo34597f = i15;
            } else {
                int i16 = el80Var.f60641b;
                iMo34597f = i16 + i9;
                paddingLeft = i16;
            }
            paddingTop = 0;
            iMo34597f2 = 0;
        } else if (el80Var.f60645f == -1) {
            iMo34597f2 = el80Var.f60641b;
            paddingTop = iMo34597f2 - i9;
            paddingLeft = 0;
            iMo34597f = 0;
        } else {
            int i17 = el80Var.f60641b;
            paddingTop = i17;
            iMo34597f = 0;
            iMo34597f2 = i17 + i9;
            paddingLeft = 0;
        }
        for (int i18 = 0; i18 < i6; i18++) {
            View view5 = this.f1158h1[i18];
            vz10 vz10Var3 = (vz10) view5.getLayoutParams();
            if (this.f1163O0 != 1) {
                paddingTop = getPaddingTop() + this.f1157g1[vz10Var3.f246359e];
                iMo34597f2 = this.f1165Q0.mo34597f(view5) + paddingTop;
            } else if (m952q1()) {
                int paddingLeft2 = getPaddingLeft() + this.f1157g1[this.f1156f1 - vz10Var3.f246359e];
                iMo34597f = paddingLeft2;
                paddingLeft = paddingLeft2 - this.f1165Q0.mo34597f(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.f1157g1[vz10Var3.f246359e];
                iMo34597f = this.f1165Q0.mo34597f(view5) + paddingLeft;
            }
            AbstractC0110a.m1086b0(view5, paddingLeft, paddingTop, iMo34597f, iMo34597f2);
            if (vz10Var3.f166147a.m36330t() || vz10Var3.f166147a.m36333w()) {
                dl80Var.f50143c = true;
            }
            dl80Var.f50144d = view5.hasFocusable() | dl80Var.f50144d;
        }
        Arrays.fill(this.f1158h1, (Object) null);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: s */
    public final boolean mo593s(ojv0 ojv0Var) {
        return ojv0Var instanceof vz10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: s1 */
    public final void mo913s1(vjv0 vjv0Var, zjv0 zjv0Var, njx njxVar, int i) {
        m899L1();
        if (zjv0Var.m96246b() > 0 && !zjv0Var.f283550g) {
            boolean z = i == 1;
            int iM893H1 = m893H1(njxVar.f154664b, vjv0Var, zjv0Var);
            if (z) {
                while (iM893H1 > 0) {
                    int i2 = njxVar.f154664b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    njxVar.f154664b = i3;
                    iM893H1 = m893H1(i3, vjv0Var, zjv0Var);
                }
            } else {
                int iM96246b = zjv0Var.m96246b() - 1;
                int i4 = njxVar.f154664b;
                while (i4 < iM96246b) {
                    int i5 = i4 + 1;
                    int iM893H2 = m893H1(i5, vjv0Var, zjv0Var);
                    if (iM893H2 <= iM893H1) {
                        break;
                    }
                    i4 = i5;
                    iM893H1 = iM893H2;
                }
                njxVar.f154664b = i4;
            }
        }
        m887E1();
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: t0 */
    public void mo914t0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f1161k1.m89395h();
        this.f1161k1.m89394g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: u0 */
    public void mo915u0(vjv0 vjv0Var, zjv0 zjv0Var) {
        boolean z = zjv0Var.f283550g;
        SparseIntArray sparseIntArray = this.f1160j1;
        SparseIntArray sparseIntArray2 = this.f1159i1;
        if (z) {
            int iM1097I = m1097I();
            for (int i = 0; i < iM1097I; i++) {
                vz10 vz10Var = (vz10) m1096H(i).getLayoutParams();
                int iM36324n = vz10Var.f166147a.m36324n();
                sparseIntArray2.put(iM36324n, vz10Var.m86866g());
                sparseIntArray.put(iM36324n, vz10Var.m86865c());
            }
        }
        super.mo915u0(vjv0Var, zjv0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: v0 */
    public final void mo916v0(zjv0 zjv0Var) {
        super.mo916v0(zjv0Var);
        this.f1155e1 = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: x */
    public final int mo917x(zjv0 zjv0Var) {
        return m929Y0(zjv0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: y */
    public final int mo918y(zjv0 zjv0Var) {
        return m931Z0(zjv0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: z1 */
    public final void mo919z1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.mo919z1(false);
    }

    public GridLayoutManager(int i, int i2) {
        super(1);
        this.f1155e1 = false;
        this.f1156f1 = -1;
        this.f1159i1 = new SparseIntArray();
        this.f1160j1 = new SparseIntArray();
        this.f1161k1 = new uz10();
        this.f1162l1 = new Rect();
        mo898K1(i);
    }

    public GridLayoutManager(int i) {
        super(1);
        this.f1155e1 = false;
        this.f1156f1 = -1;
        this.f1159i1 = new SparseIntArray();
        this.f1160j1 = new SparseIntArray();
        this.f1161k1 = new uz10();
        this.f1162l1 = new Rect();
        mo898K1(i);
    }
}
