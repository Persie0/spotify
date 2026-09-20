package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p204p.ahz;
import p204p.bhz;
import p204p.d180;
import p204p.h7c;
import p204p.hjv0;
import p204p.il80;
import p204p.ojv0;
import p204p.pgz;
import p204p.rgz;
import p204p.sgz;
import p204p.ugz;
import p204p.vjv0;
import p204p.xgz;
import p204p.xvl0;
import p204p.yjv0;
import p204p.yvl0;
import p204p.zgz;
import p204p.zjv0;

/* JADX INFO: loaded from: classes3.dex */
public class FlexboxLayoutManager extends AbstractC0110a implements pgz, yjv0 {

    /* JADX INFO: renamed from: n1 */
    public static final Rect f1690n1 = new Rect();

    /* JADX INFO: renamed from: O0 */
    public int f1691O0;

    /* JADX INFO: renamed from: P0 */
    public int f1692P0;

    /* JADX INFO: renamed from: Q0 */
    public int f1693Q0;

    /* JADX INFO: renamed from: R0 */
    public int f1694R0;

    /* JADX INFO: renamed from: T0 */
    public boolean f1696T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f1697U0;

    /* JADX INFO: renamed from: X0 */
    public vjv0 f1700X0;

    /* JADX INFO: renamed from: Y0 */
    public zjv0 f1701Y0;

    /* JADX INFO: renamed from: Z0 */
    public ahz f1702Z0;

    /* JADX INFO: renamed from: b1 */
    public d180 f1704b1;

    /* JADX INFO: renamed from: c1 */
    public d180 f1705c1;

    /* JADX INFO: renamed from: d1 */
    public bhz f1706d1;

    /* JADX INFO: renamed from: j1 */
    public final Context f1712j1;

    /* JADX INFO: renamed from: k1 */
    public View f1713k1;

    /* JADX INFO: renamed from: S0 */
    public final int f1695S0 = -1;

    /* JADX INFO: renamed from: V0 */
    public List f1698V0 = new ArrayList();

    /* JADX INFO: renamed from: W0 */
    public final ugz f1699W0 = new ugz(this);

    /* JADX INFO: renamed from: a1 */
    public final xgz f1703a1 = new xgz(this);

    /* JADX INFO: renamed from: e1 */
    public int f1707e1 = -1;

    /* JADX INFO: renamed from: f1 */
    public int f1708f1 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: g1 */
    public int f1709g1 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: h1 */
    public int f1710h1 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: i1 */
    public final SparseArray f1711i1 = new SparseArray();

    /* JADX INFO: renamed from: l1 */
    public int f1714l1 = -1;

    /* JADX INFO: renamed from: m1 */
    public final sgz f1715m1 = new sgz((char) 0, 0);

    public FlexboxLayoutManager(Context context) {
        m1470m1(0);
        m1471n1(1);
        m1469l1(4);
        this.f1300h = true;
        this.f1712j1 = context;
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m1452a0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: A */
    public final int mo883A(zjv0 zjv0Var) {
        return m1454W0(zjv0Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: B */
    public final int mo884B(zjv0 zjv0Var) {
        return m1455X0(zjv0Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: E */
    public final ojv0 mo886E() {
        zgz zgzVar = new zgz(-2, -2);
        zgzVar.f282742e = 0.0f;
        zgzVar.f282743f = 1.0f;
        zgzVar.f282744g = -1;
        zgzVar.f282745h = -1.0f;
        zgzVar.f282739X = 16777215;
        zgzVar.f282740Y = 16777215;
        return zgzVar;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: F */
    public final ojv0 mo888F(Context context, AttributeSet attributeSet) {
        zgz zgzVar = new zgz(context, attributeSet);
        zgzVar.f282742e = 0.0f;
        zgzVar.f282743f = 1.0f;
        zgzVar.f282744g = -1;
        zgzVar.f282745h = -1.0f;
        zgzVar.f282739X = 16777215;
        zgzVar.f282740Y = 16777215;
        return zgzVar;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: H0 */
    public final int mo892H0(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        if (!mo1441k() || (this.f1692P0 == 0 && mo1441k())) {
            int iM1466i1 = m1466i1(i, vjv0Var, zjv0Var);
            this.f1711i1.clear();
            return iM1466i1;
        }
        int iM1467j1 = m1467j1(i);
        this.f1703a1.f261398d += iM1467j1;
        this.f1705c1.mo34609r(-iM1467j1);
        return iM1467j1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: I0 */
    public final void mo924I0(int i) {
        this.f1707e1 = i;
        this.f1708f1 = Integer.MIN_VALUE;
        bhz bhzVar = this.f1706d1;
        if (bhzVar != null) {
            bhzVar.f27270a = -1;
        }
        m1095G0();
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: J0 */
    public final int mo895J0(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        if (mo1441k() || (this.f1692P0 == 0 && !mo1441k())) {
            int iM1466i1 = m1466i1(i, vjv0Var, zjv0Var);
            this.f1711i1.clear();
            return iM1466i1;
        }
        int iM1467j1 = m1467j1(i);
        this.f1703a1.f261398d += iM1467j1;
        this.f1705c1.mo34609r(-iM1467j1);
        return iM1467j1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: S0 */
    public final void mo926S0(RecyclerView recyclerView, zjv0 zjv0Var, int i) {
        il80 il80Var = new il80(recyclerView.getContext());
        il80Var.f103318a = i;
        m1108T0(il80Var);
    }

    /* JADX INFO: renamed from: V0 */
    public final int m1453V0(zjv0 zjv0Var) {
        if (m1097I() == 0) {
            return 0;
        }
        int iM96246b = zjv0Var.m96246b();
        m1456Y0();
        View viewM1458a1 = m1458a1(iM96246b);
        View viewM1460c1 = m1460c1(iM96246b);
        if (zjv0Var.m96246b() == 0 || viewM1458a1 == null || viewM1460c1 == null) {
            return 0;
        }
        return Math.min(this.f1704b1.mo34605n(), this.f1704b1.mo34595d(viewM1460c1) - this.f1704b1.mo34598g(viewM1458a1));
    }

    /* JADX INFO: renamed from: W0 */
    public final int m1454W0(zjv0 zjv0Var) {
        if (m1097I() == 0) {
            return 0;
        }
        int iM96246b = zjv0Var.m96246b();
        View viewM1458a1 = m1458a1(iM96246b);
        View viewM1460c1 = m1460c1(iM96246b);
        if (zjv0Var.m96246b() == 0 || viewM1458a1 == null || viewM1460c1 == null) {
            return 0;
        }
        int iM1083V = AbstractC0110a.m1083V(viewM1458a1);
        int iM1083V2 = AbstractC0110a.m1083V(viewM1460c1);
        int iAbs = Math.abs(this.f1704b1.mo34595d(viewM1460c1) - this.f1704b1.mo34598g(viewM1458a1));
        int[] iArr = (int[]) this.f1699W0.f230292d;
        int i = iArr[iM1083V];
        if (i == 0 || i == -1) {
            return 0;
        }
        return Math.round((i * (iAbs / ((iArr[iM1083V2] - i) + 1))) + (this.f1704b1.mo34604m() - this.f1704b1.mo34598g(viewM1458a1)));
    }

    /* JADX INFO: renamed from: X0 */
    public final int m1455X0(zjv0 zjv0Var) {
        if (m1097I() != 0) {
            int iM96246b = zjv0Var.m96246b();
            View viewM1458a1 = m1458a1(iM96246b);
            View viewM1460c1 = m1460c1(iM96246b);
            if (zjv0Var.m96246b() != 0 && viewM1458a1 != null && viewM1460c1 != null) {
                View viewM1462e1 = m1462e1(0, m1097I());
                int iM1083V = viewM1462e1 == null ? -1 : AbstractC0110a.m1083V(viewM1462e1);
                View viewM1462e2 = m1462e1(m1097I() - 1, -1);
                return (int) ((Math.abs(this.f1704b1.mo34595d(viewM1460c1) - this.f1704b1.mo34598g(viewM1458a1)) / (((viewM1462e2 != null ? AbstractC0110a.m1083V(viewM1462e2) : -1) - iM1083V) + 1)) * zjv0Var.m96246b());
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m1456Y0() {
        if (this.f1704b1 != null) {
            return;
        }
        if (mo1441k()) {
            if (this.f1692P0 == 0) {
                this.f1704b1 = new xvl0(this);
                this.f1705c1 = new yvl0(this);
                return;
            } else {
                this.f1704b1 = new yvl0(this);
                this.f1705c1 = new xvl0(this);
                return;
            }
        }
        if (this.f1692P0 == 0) {
            this.f1704b1 = new yvl0(this);
            this.f1705c1 = new xvl0(this);
        } else {
            this.f1704b1 = new xvl0(this);
            this.f1705c1 = new yvl0(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:122:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:123:0x030a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0326  */
    /* JADX WARN: Code duplicated, block: B:128:0x0352  */
    /* JADX WARN: Code duplicated, block: B:129:0x035e  */
    /* JADX WARN: Code duplicated, block: B:132:0x038b  */
    /* JADX WARN: Code duplicated, block: B:134:0x038f  */
    /* JADX WARN: Code duplicated, block: B:135:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:136:0x03da  */
    /* JADX WARN: Code duplicated, block: B:138:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:139:0x0401  */
    /* JADX WARN: Code duplicated, block: B:63:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:66:0x0137  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:70:0x0148  */
    /* JADX WARN: Code duplicated, block: B:73:0x016a  */
    /* JADX WARN: Code duplicated, block: B:76:0x019e  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c8  */
    /* JADX INFO: renamed from: Z0 */
    public final int m1457Z0(vjv0 vjv0Var, zjv0 zjv0Var, ahz ahzVar) {
        int i;
        boolean z;
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        float fMax;
        int i4;
        float measuredHeight;
        int i5;
        int i6;
        int i7;
        int i8;
        View viewMo1433c;
        int i9;
        int i10;
        int i11;
        zgz zgzVar;
        float f5;
        float f6;
        Rect rect;
        int i12;
        int i13;
        boolean z2;
        int i14;
        int i15;
        int i16;
        boolean z3;
        int i17;
        float f7;
        float f8;
        float f9;
        float f10;
        float measuredWidth;
        float fMax2;
        int i18;
        int i19;
        int i20;
        View viewMo1433c2;
        int i21;
        int i22;
        zgz zgzVar2;
        float f11;
        float f12;
        int i23;
        Rect rect2;
        View view;
        int i24 = ahzVar.f15831f;
        if (i24 != Integer.MIN_VALUE) {
            int i25 = ahzVar.f15826a;
            if (i25 < 0) {
                ahzVar.f15831f = i24 + i25;
            }
            m1468k1(vjv0Var, ahzVar);
        }
        int i26 = ahzVar.f15826a;
        boolean zMo1441k = mo1441k();
        int i27 = i26;
        int i28 = 0;
        while (true) {
            if (i27 <= 0 && !this.f1702Z0.f15827b) {
                break;
            }
            List list = this.f1698V0;
            int i29 = ahzVar.f15829d;
            if (i29 < 0 || i29 >= zjv0Var.m96246b() || (i = ahzVar.f15828c) < 0 || i >= list.size()) {
                break;
            }
            rgz rgzVar = (rgz) this.f1698V0.get(ahzVar.f15828c);
            ahzVar.f15829d = rgzVar.f199064o;
            boolean zMo1441k2 = mo1441k();
            xgz xgzVar = this.f1703a1;
            Rect rect3 = f1690n1;
            ugz ugzVar = this.f1699W0;
            if (zMo1441k2) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i30 = this.f1288M0;
                int i31 = ahzVar.f15830e;
                if (ahzVar.f15833h == -1) {
                    i31 -= rgzVar.f199056g;
                }
                int i32 = i31;
                int i33 = ahzVar.f15829d;
                int i34 = this.f1693Q0;
                if (i34 != 0) {
                    i17 = i32;
                    if (i34 != 1) {
                        if (i34 == 2) {
                            float f13 = paddingLeft;
                            float f14 = (i30 - rgzVar.f199054e) / 2.0f;
                            f8 = (i30 - paddingRight) - f14;
                            f7 = f13 + f14;
                        } else if (i34 == 3) {
                            f7 = paddingLeft;
                            int i35 = rgzVar.f199057h;
                            f9 = (i30 - rgzVar.f199054e) / (i35 != 1 ? i35 - 1 : 1.0f);
                            f8 = i30 - paddingRight;
                        } else if (i34 == 4) {
                            int i36 = rgzVar.f199057h;
                            f9 = i36 != 0 ? (i30 - rgzVar.f199054e) / i36 : 0.0f;
                            float f15 = f9 / 2.0f;
                            f7 = paddingLeft + f15;
                            f8 = (i30 - paddingRight) - f15;
                        } else {
                            if (i34 != 5) {
                                throw new IllegalStateException("Invalid justifyContent is set: " + this.f1693Q0);
                            }
                            int i37 = rgzVar.f199057h;
                            f9 = i37 != 0 ? (i30 - rgzVar.f199054e) / (i37 + 1) : 0.0f;
                            f7 = paddingLeft + f9;
                            f8 = (i30 - paddingRight) - f9;
                        }
                        float f16 = xgzVar.f261398d;
                        f10 = f7 - f16;
                        measuredWidth = f8 - f16;
                        fMax2 = Math.max(f9, 0.0f);
                        i18 = rgzVar.f199057h;
                        i19 = i33;
                        i20 = 0;
                        while (i19 < i33 + i18) {
                            viewMo1433c2 = mo1433c(i19);
                            if (viewMo1433c2 == null) {
                                i18 = i18;
                                ugzVar = ugzVar;
                                i19 = i19;
                                rect2 = rect3;
                            } else {
                                float f17 = measuredWidth;
                                if (ahzVar.f15833h == 1) {
                                    m1118p(rect3, viewMo1433c2);
                                    m1114l(viewMo1433c2);
                                } else {
                                    m1118p(rect3, viewMo1433c2);
                                    m1115m(viewMo1433c2, i20, false);
                                    i20++;
                                }
                                int i38 = i20;
                                long j = ((long[]) ugzVar.f230293e)[i19];
                                i21 = (int) j;
                                i22 = (int) (j >> 32);
                                zgzVar2 = (zgz) viewMo1433c2.getLayoutParams();
                                if (m1472o1(viewMo1433c2, i21, i22, zgzVar2)) {
                                    viewMo1433c2.measure(i21, i22);
                                }
                                f11 = f10 + ((ViewGroup.MarginLayoutParams) zgzVar2).leftMargin + ((ojv0) viewMo1433c2.getLayoutParams()).f166148b.left;
                                f12 = f17 - (((ViewGroup.MarginLayoutParams) zgzVar2).rightMargin + ((ojv0) viewMo1433c2.getLayoutParams()).f166148b.right);
                                i23 = i17 + ((ojv0) viewMo1433c2.getLayoutParams()).f166148b.top;
                                if (this.f1696T0) {
                                    view = viewMo1433c2;
                                    rect2 = rect3;
                                    this.f1699W0.m83073O(view, rgzVar, Math.round(f12) - viewMo1433c2.getMeasuredWidth(), i23, Math.round(f12), viewMo1433c2.getMeasuredHeight() + i23);
                                } else {
                                    rect2 = rect3;
                                    view = viewMo1433c2;
                                    this.f1699W0.m83073O(view, rgzVar, Math.round(f11), i23, view.getMeasuredWidth() + Math.round(f11), view.getMeasuredHeight() + i23);
                                }
                                float measuredWidth2 = view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) zgzVar2).rightMargin + ((ojv0) view.getLayoutParams()).f166148b.right + fMax2 + f11;
                                i20 = i38;
                                measuredWidth = f12 - (((view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) zgzVar2).leftMargin) + ((ojv0) view.getLayoutParams()).f166148b.left) + fMax2);
                                f10 = measuredWidth2;
                            }
                            i19++;
                            i33 = i33;
                            i18 = i18;
                            zMo1441k = zMo1441k;
                            rect3 = rect2;
                            ugzVar = ugzVar;
                        }
                        z = zMo1441k;
                        ahzVar.f15828c += this.f1702Z0.f15833h;
                        i7 = rgzVar.f199056g;
                    } else {
                        int i39 = rgzVar.f199054e;
                        float f18 = (i30 - i39) + paddingRight;
                        float f19 = i39 - paddingLeft;
                        f7 = f18;
                        f8 = f19;
                    }
                } else {
                    i17 = i32;
                    f7 = paddingLeft;
                    f8 = i30 - paddingRight;
                }
                f9 = 0.0f;
                float f110 = xgzVar.f261398d;
                f10 = f7 - f110;
                measuredWidth = f8 - f110;
                fMax2 = Math.max(f9, 0.0f);
                i18 = rgzVar.f199057h;
                i19 = i33;
                i20 = 0;
                while (i19 < i33 + i18) {
                    viewMo1433c2 = mo1433c(i19);
                    if (viewMo1433c2 == null) {
                        i18 = i18;
                        ugzVar = ugzVar;
                        i19 = i19;
                        rect2 = rect3;
                    } else {
                        float f111 = measuredWidth;
                        if (ahzVar.f15833h == 1) {
                            m1118p(rect3, viewMo1433c2);
                            m1114l(viewMo1433c2);
                        } else {
                            m1118p(rect3, viewMo1433c2);
                            m1115m(viewMo1433c2, i20, false);
                            i20++;
                        }
                        int i310 = i20;
                        long j2 = ((long[]) ugzVar.f230293e)[i19];
                        i21 = (int) j2;
                        i22 = (int) (j2 >> 32);
                        zgzVar2 = (zgz) viewMo1433c2.getLayoutParams();
                        if (m1472o1(viewMo1433c2, i21, i22, zgzVar2)) {
                            viewMo1433c2.measure(i21, i22);
                        }
                        f11 = f10 + ((ViewGroup.MarginLayoutParams) zgzVar2).leftMargin + ((ojv0) viewMo1433c2.getLayoutParams()).f166148b.left;
                        f12 = f111 - (((ViewGroup.MarginLayoutParams) zgzVar2).rightMargin + ((ojv0) viewMo1433c2.getLayoutParams()).f166148b.right);
                        i23 = i17 + ((ojv0) viewMo1433c2.getLayoutParams()).f166148b.top;
                        if (this.f1696T0) {
                            view = viewMo1433c2;
                            rect2 = rect3;
                            this.f1699W0.m83073O(view, rgzVar, Math.round(f12) - viewMo1433c2.getMeasuredWidth(), i23, Math.round(f12), viewMo1433c2.getMeasuredHeight() + i23);
                        } else {
                            rect2 = rect3;
                            view = viewMo1433c2;
                            this.f1699W0.m83073O(view, rgzVar, Math.round(f11), i23, view.getMeasuredWidth() + Math.round(f11), view.getMeasuredHeight() + i23);
                        }
                        float measuredWidth3 = view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) zgzVar2).rightMargin + ((ojv0) view.getLayoutParams()).f166148b.right + fMax2 + f11;
                        i20 = i310;
                        measuredWidth = f12 - (((view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) zgzVar2).leftMargin) + ((ojv0) view.getLayoutParams()).f166148b.left) + fMax2);
                        f10 = measuredWidth3;
                    }
                    i19++;
                    i33 = i33;
                    i18 = i18;
                    zMo1441k = zMo1441k;
                    rect3 = rect2;
                    ugzVar = ugzVar;
                }
                z = zMo1441k;
                ahzVar.f15828c += this.f1702Z0.f15833h;
                i7 = rgzVar.f199056g;
            } else {
                z = zMo1441k;
                Rect rect4 = rect3;
                boolean z4 = true;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i40 = this.f1289N0;
                int i41 = ahzVar.f15830e;
                if (ahzVar.f15833h == -1) {
                    int i42 = rgzVar.f199056g;
                    i3 = i41 + i42;
                    i2 = i41 - i42;
                } else {
                    i2 = i41;
                    i3 = i2;
                }
                int i43 = ahzVar.f15829d;
                int i44 = this.f1693Q0;
                if (i44 == 0) {
                    f = paddingTop;
                    f2 = i40 - paddingBottom;
                } else if (i44 != 1) {
                    if (i44 == 2) {
                        float f20 = (i40 - rgzVar.f199054e) / 2.0f;
                        f = paddingTop + f20;
                        f2 = (i40 - paddingBottom) - f20;
                    } else if (i44 == 3) {
                        f = paddingTop;
                        int i45 = rgzVar.f199057h;
                        f3 = (i40 - rgzVar.f199054e) / (i45 != 1 ? i45 - 1 : 1.0f);
                        f2 = i40 - paddingBottom;
                    } else if (i44 == 4) {
                        int i46 = rgzVar.f199057h;
                        f3 = i46 != 0 ? (i40 - rgzVar.f199054e) / i46 : 0.0f;
                        float f21 = f3 / 2.0f;
                        f = paddingTop + f21;
                        f2 = (i40 - paddingBottom) - f21;
                    } else {
                        if (i44 != 5) {
                            throw new IllegalStateException("Invalid justifyContent is set: " + this.f1693Q0);
                        }
                        int i47 = rgzVar.f199057h;
                        f3 = i47 != 0 ? (i40 - rgzVar.f199054e) / (i47 + 1) : 0.0f;
                        f = paddingTop + f3;
                        f2 = (i40 - paddingBottom) - f3;
                    }
                    float f22 = xgzVar.f261398d;
                    f4 = f - f22;
                    float f23 = f2 - f22;
                    fMax = Math.max(f3, 0.0f);
                    i4 = rgzVar.f199057h;
                    measuredHeight = f23;
                    i5 = i43;
                    i6 = 0;
                    while (i5 < i43 + i4) {
                        i8 = i43;
                        viewMo1433c = mo1433c(i5);
                        if (viewMo1433c == null) {
                            i9 = i2;
                            i14 = i4;
                            i15 = i5;
                            i16 = i8;
                            rect = rect4;
                            z3 = z4;
                        } else {
                            float f24 = f4;
                            long j3 = ((long[]) ugzVar.f230293e)[i5];
                            i9 = i2;
                            i10 = (int) j3;
                            i11 = (int) (j3 >> 32);
                            zgzVar = (zgz) viewMo1433c.getLayoutParams();
                            if (m1472o1(viewMo1433c, i10, i11, zgzVar)) {
                                viewMo1433c.measure(i10, i11);
                            }
                            f5 = f24 + ((ViewGroup.MarginLayoutParams) zgzVar).topMargin + ((ojv0) viewMo1433c.getLayoutParams()).f166148b.top;
                            f6 = measuredHeight - (((ViewGroup.MarginLayoutParams) zgzVar).rightMargin + ((ojv0) viewMo1433c.getLayoutParams()).f166148b.bottom);
                            if (ahzVar.f15833h == 1) {
                                rect = rect4;
                                m1118p(rect, viewMo1433c);
                                m1114l(viewMo1433c);
                            } else {
                                rect = rect4;
                                m1118p(rect, viewMo1433c);
                                m1115m(viewMo1433c, i6, false);
                                i6++;
                            }
                            i12 = i9 + ((ojv0) viewMo1433c.getLayoutParams()).f166148b.left;
                            i13 = i3 - ((ojv0) viewMo1433c.getLayoutParams()).f166148b.right;
                            z2 = this.f1696T0;
                            if (z2) {
                                i14 = i4;
                                i15 = i5;
                                i16 = i8;
                                z3 = true;
                                if (this.f1697U0) {
                                    this.f1699W0.m83074P(viewMo1433c, rgzVar, z2, i12, Math.round(f6) - viewMo1433c.getMeasuredHeight(), viewMo1433c.getMeasuredWidth() + i12, Math.round(f6));
                                } else {
                                    this.f1699W0.m83074P(viewMo1433c, rgzVar, z2, i12, Math.round(f5), viewMo1433c.getMeasuredWidth() + i12, viewMo1433c.getMeasuredHeight() + Math.round(f5));
                                }
                            } else if (this.f1697U0) {
                                i14 = i4;
                                i16 = i8;
                                z3 = true;
                                i15 = i5;
                                this.f1699W0.m83074P(viewMo1433c, rgzVar, z2, i13 - viewMo1433c.getMeasuredWidth(), Math.round(f6) - viewMo1433c.getMeasuredHeight(), i13, Math.round(f6));
                            } else {
                                i14 = i4;
                                i15 = i5;
                                i16 = i8;
                                z3 = true;
                                this.f1699W0.m83074P(viewMo1433c, rgzVar, z2, i13 - viewMo1433c.getMeasuredWidth(), Math.round(f5), i13, viewMo1433c.getMeasuredHeight() + Math.round(f5));
                            }
                            float measuredHeight2 = viewMo1433c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) zgzVar).topMargin + ((ojv0) viewMo1433c.getLayoutParams()).f166148b.bottom + fMax + f5;
                            measuredHeight = f6 - (((viewMo1433c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) zgzVar).bottomMargin) + ((ojv0) viewMo1433c.getLayoutParams()).f166148b.top) + fMax);
                            f4 = measuredHeight2;
                        }
                        i5 = i15 + 1;
                        i43 = i16;
                        i4 = i14;
                        z4 = z3;
                        rect4 = rect;
                        i2 = i9;
                    }
                    ahzVar.f15828c += this.f1702Z0.f15833h;
                    i7 = rgzVar.f199056g;
                } else {
                    int i48 = rgzVar.f199054e;
                    float f25 = (i40 - i48) + paddingBottom;
                    f2 = i48 - paddingTop;
                    f = f25;
                }
                f3 = 0.0f;
                float f26 = xgzVar.f261398d;
                f4 = f - f26;
                float f27 = f2 - f26;
                fMax = Math.max(f3, 0.0f);
                i4 = rgzVar.f199057h;
                measuredHeight = f27;
                i5 = i43;
                i6 = 0;
                while (i5 < i43 + i4) {
                    i8 = i43;
                    viewMo1433c = mo1433c(i5);
                    if (viewMo1433c == null) {
                        i9 = i2;
                        i14 = i4;
                        i15 = i5;
                        i16 = i8;
                        rect = rect4;
                        z3 = z4;
                    } else {
                        float f28 = f4;
                        long j4 = ((long[]) ugzVar.f230293e)[i5];
                        i9 = i2;
                        i10 = (int) j4;
                        i11 = (int) (j4 >> 32);
                        zgzVar = (zgz) viewMo1433c.getLayoutParams();
                        if (m1472o1(viewMo1433c, i10, i11, zgzVar)) {
                            viewMo1433c.measure(i10, i11);
                        }
                        f5 = f28 + ((ViewGroup.MarginLayoutParams) zgzVar).topMargin + ((ojv0) viewMo1433c.getLayoutParams()).f166148b.top;
                        f6 = measuredHeight - (((ViewGroup.MarginLayoutParams) zgzVar).rightMargin + ((ojv0) viewMo1433c.getLayoutParams()).f166148b.bottom);
                        if (ahzVar.f15833h == 1) {
                            rect = rect4;
                            m1118p(rect, viewMo1433c);
                            m1114l(viewMo1433c);
                        } else {
                            rect = rect4;
                            m1118p(rect, viewMo1433c);
                            m1115m(viewMo1433c, i6, false);
                            i6++;
                        }
                        i12 = i9 + ((ojv0) viewMo1433c.getLayoutParams()).f166148b.left;
                        i13 = i3 - ((ojv0) viewMo1433c.getLayoutParams()).f166148b.right;
                        z2 = this.f1696T0;
                        if (z2) {
                            i14 = i4;
                            i15 = i5;
                            i16 = i8;
                            z3 = true;
                            if (this.f1697U0) {
                                this.f1699W0.m83074P(viewMo1433c, rgzVar, z2, i12, Math.round(f6) - viewMo1433c.getMeasuredHeight(), viewMo1433c.getMeasuredWidth() + i12, Math.round(f6));
                            } else {
                                this.f1699W0.m83074P(viewMo1433c, rgzVar, z2, i12, Math.round(f5), viewMo1433c.getMeasuredWidth() + i12, viewMo1433c.getMeasuredHeight() + Math.round(f5));
                            }
                        } else if (this.f1697U0) {
                            i14 = i4;
                            i16 = i8;
                            z3 = true;
                            i15 = i5;
                            this.f1699W0.m83074P(viewMo1433c, rgzVar, z2, i13 - viewMo1433c.getMeasuredWidth(), Math.round(f6) - viewMo1433c.getMeasuredHeight(), i13, Math.round(f6));
                        } else {
                            i14 = i4;
                            i15 = i5;
                            i16 = i8;
                            z3 = true;
                            this.f1699W0.m83074P(viewMo1433c, rgzVar, z2, i13 - viewMo1433c.getMeasuredWidth(), Math.round(f5), i13, viewMo1433c.getMeasuredHeight() + Math.round(f5));
                        }
                        float measuredHeight3 = viewMo1433c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) zgzVar).topMargin + ((ojv0) viewMo1433c.getLayoutParams()).f166148b.bottom + fMax + f5;
                        measuredHeight = f6 - (((viewMo1433c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) zgzVar).bottomMargin) + ((ojv0) viewMo1433c.getLayoutParams()).f166148b.top) + fMax);
                        f4 = measuredHeight3;
                    }
                    i5 = i15 + 1;
                    i43 = i16;
                    i4 = i14;
                    z4 = z3;
                    rect4 = rect;
                    i2 = i9;
                }
                ahzVar.f15828c += this.f1702Z0.f15833h;
                i7 = rgzVar.f199056g;
            }
            i28 += i7;
            if (z || !this.f1696T0) {
                ahzVar.f15830e = (rgzVar.f199056g * ahzVar.f15833h) + ahzVar.f15830e;
            } else {
                ahzVar.f15830e -= rgzVar.f199056g * ahzVar.f15833h;
            }
            i27 -= rgzVar.f199056g;
            zMo1441k = z;
            i26 = i26;
        }
        int i49 = i26;
        int i50 = ahzVar.f15826a - i28;
        ahzVar.f15826a = i50;
        int i51 = ahzVar.f15831f;
        if (i51 != Integer.MIN_VALUE) {
            int i52 = i51 + i28;
            ahzVar.f15831f = i52;
            if (i50 < 0) {
                ahzVar.f15831f = i52 + i50;
            }
            m1468k1(vjv0Var, ahzVar);
        }
        return i49 - ahzVar.f15826a;
    }

    @Override // p204p.yjv0
    /* JADX INFO: renamed from: a */
    public final PointF mo932a(int i) {
        if (m1097I() == 0) {
            return null;
        }
        int i2 = i < AbstractC0110a.m1083V(m1096H(0)) ? -1 : 1;
        return mo1441k() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    /* JADX INFO: renamed from: a1 */
    public final View m1458a1(int i) {
        View viewM1463f1 = m1463f1(0, m1097I(), i);
        if (viewM1463f1 == null) {
            return null;
        }
        int i2 = ((int[]) this.f1699W0.f230292d)[AbstractC0110a.m1083V(viewM1463f1)];
        if (i2 == -1) {
            return null;
        }
        return m1459b1(viewM1463f1, (rgz) this.f1698V0.get(i2));
    }

    @Override // p204p.pgz
    /* JADX INFO: renamed from: b */
    public final int mo1432b(int i, int i2, int i3) {
        return AbstractC0110a.m1077J(mo951q(), this.f1288M0, this.f1292Z, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX INFO: renamed from: b1 */
    public final View m1459b1(View view, rgz rgzVar) {
        boolean zMo1441k = mo1441k();
        int i = rgzVar.f199057h;
        for (int i2 = 1; i2 < i; i2++) {
            View viewM1096H = m1096H(i2);
            if (viewM1096H != null && viewM1096H.getVisibility() != 8) {
                if (!this.f1696T0 || zMo1441k) {
                    if (this.f1704b1.mo34598g(view) > this.f1704b1.mo34598g(viewM1096H)) {
                        view = viewM1096H;
                    }
                } else if (this.f1704b1.mo34595d(view) < this.f1704b1.mo34595d(viewM1096H)) {
                    view = viewM1096H;
                }
            }
        }
        return view;
    }

    @Override // p204p.pgz
    /* JADX INFO: renamed from: c */
    public final View mo1433c(int i) {
        View view = (View) this.f1711i1.get(i);
        return view != null ? view : this.f1700X0.m85781d(i);
    }

    /* JADX INFO: renamed from: c1 */
    public final View m1460c1(int i) {
        View viewM1463f1 = m1463f1(m1097I() - 1, -1, i);
        if (viewM1463f1 == null) {
            return null;
        }
        return m1461d1(viewM1463f1, (rgz) this.f1698V0.get(((int[]) this.f1699W0.f230292d)[AbstractC0110a.m1083V(viewM1463f1)]));
    }

    @Override // p204p.pgz
    /* JADX INFO: renamed from: d */
    public final int mo1434d(int i, int i2, int i3) {
        return AbstractC0110a.m1077J(mo953r(), this.f1289N0, this.f1287L0, i2, i3);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    /* JADX INFO: renamed from: d1 */
    public final View m1461d1(View view, rgz rgzVar) {
        boolean zMo1441k = mo1441k();
        int iM1097I = (m1097I() - rgzVar.f199057h) - 1;
        for (int iM1097I2 = m1097I() - 2; iM1097I2 > iM1097I; iM1097I2--) {
            View viewM1096H = m1096H(iM1097I2);
            if (viewM1096H != null && viewM1096H.getVisibility() != 8) {
                if (!this.f1696T0 || zMo1441k) {
                    if (this.f1704b1.mo34595d(view) < this.f1704b1.mo34595d(viewM1096H)) {
                        view = viewM1096H;
                    }
                } else if (this.f1704b1.mo34598g(view) > this.f1704b1.mo34598g(viewM1096H)) {
                    view = viewM1096H;
                }
            }
        }
        return view;
    }

    @Override // p204p.pgz
    /* JADX INFO: renamed from: e */
    public final void mo1435e(View view, int i) {
        this.f1711i1.put(i, view);
    }

    /* JADX INFO: renamed from: e1 */
    public final View m1462e1(int i, int i2) {
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View viewM1096H = m1096H(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.f1288M0 - getPaddingRight();
            int paddingBottom = this.f1289N0 - getPaddingBottom();
            int iM1079M = AbstractC0110a.m1079M(viewM1096H) - ((ViewGroup.MarginLayoutParams) ((ojv0) viewM1096H.getLayoutParams())).leftMargin;
            int iM1082Q = AbstractC0110a.m1082Q(viewM1096H) - ((ViewGroup.MarginLayoutParams) ((ojv0) viewM1096H.getLayoutParams())).topMargin;
            int iM1081P = AbstractC0110a.m1081P(viewM1096H) + ((ViewGroup.MarginLayoutParams) ((ojv0) viewM1096H.getLayoutParams())).rightMargin;
            int iM1078L = AbstractC0110a.m1078L(viewM1096H) + ((ViewGroup.MarginLayoutParams) ((ojv0) viewM1096H.getLayoutParams())).bottomMargin;
            boolean z = iM1079M >= paddingRight || iM1081P >= paddingLeft;
            boolean z2 = iM1082Q >= paddingBottom || iM1078L >= paddingTop;
            if (z && z2) {
                return viewM1096H;
            }
            i += i3;
        }
        return null;
    }

    @Override // p204p.pgz
    /* JADX INFO: renamed from: f */
    public final int mo1436f(View view) {
        int i;
        int i2;
        if (mo1441k()) {
            i = ((ojv0) view.getLayoutParams()).f166148b.top;
            i2 = ((ojv0) view.getLayoutParams()).f166148b.bottom;
        } else {
            i = ((ojv0) view.getLayoutParams()).f166148b.left;
            i2 = ((ojv0) view.getLayoutParams()).f166148b.right;
        }
        return i + i2;
    }

    /* JADX INFO: renamed from: f1 */
    public final View m1463f1(int i, int i2, int i3) {
        m1456Y0();
        if (this.f1702Z0 == null) {
            ahz ahzVar = new ahz();
            ahzVar.f15833h = 1;
            this.f1702Z0 = ahzVar;
        }
        int iMo34604m = this.f1704b1.mo34604m();
        int iMo34600i = this.f1704b1.mo34600i();
        int i4 = i2 <= i ? -1 : 1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View viewM1096H = m1096H(i);
            int iM1083V = AbstractC0110a.m1083V(viewM1096H);
            if (iM1083V >= 0 && iM1083V < i3) {
                if (((ojv0) viewM1096H.getLayoutParams()).f166147a.m36330t()) {
                    if (view2 == null) {
                        view2 = viewM1096H;
                    }
                } else {
                    if (this.f1704b1.mo34598g(viewM1096H) >= iMo34604m && this.f1704b1.mo34595d(viewM1096H) <= iMo34600i) {
                        return viewM1096H;
                    }
                    if (view == null) {
                        view = viewM1096H;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    @Override // p204p.pgz
    /* JADX INFO: renamed from: g */
    public final View mo1437g(int i) {
        return mo1433c(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: g0 */
    public final void mo1057g0(hjv0 hjv0Var, hjv0 hjv0Var2) {
        m1089B0();
    }

    /* JADX INFO: renamed from: g1 */
    public final int m1464g1(int i, vjv0 vjv0Var, zjv0 zjv0Var, boolean z) {
        int iM1466i1;
        int iMo34600i;
        if (mo1441k() || !this.f1696T0) {
            int iMo34600i2 = this.f1704b1.mo34600i() - i;
            if (iMo34600i2 <= 0) {
                return 0;
            }
            iM1466i1 = -m1466i1(-iMo34600i2, vjv0Var, zjv0Var);
        } else {
            int iMo34604m = i - this.f1704b1.mo34604m();
            if (iMo34604m <= 0) {
                return 0;
            }
            iM1466i1 = m1466i1(iMo34604m, vjv0Var, zjv0Var);
        }
        int i2 = i + iM1466i1;
        if (!z || (iMo34600i = this.f1704b1.mo34600i() - i2) <= 0) {
            return iM1466i1;
        }
        this.f1704b1.mo34609r(iMo34600i);
        return iMo34600i + iM1466i1;
    }

    @Override // p204p.pgz
    public final int getAlignContent() {
        return 5;
    }

    @Override // p204p.pgz
    public final int getAlignItems() {
        return this.f1694R0;
    }

    @Override // p204p.pgz
    public final int getFlexDirection() {
        return this.f1691O0;
    }

    @Override // p204p.pgz
    public final int getFlexItemCount() {
        return this.f1701Y0.m96246b();
    }

    @Override // p204p.pgz
    public final List getFlexLinesInternal() {
        return this.f1698V0;
    }

    @Override // p204p.pgz
    public final int getFlexWrap() {
        return this.f1692P0;
    }

    @Override // p204p.pgz
    public final int getLargestMainSize() {
        if (this.f1698V0.size() == 0) {
            return 0;
        }
        int size = this.f1698V0.size();
        int iMax = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            iMax = Math.max(iMax, ((rgz) this.f1698V0.get(i)).f199054e);
        }
        return iMax;
    }

    @Override // p204p.pgz
    public final int getMaxLine() {
        return this.f1695S0;
    }

    @Override // p204p.pgz
    public final int getSumOfCrossSize() {
        int size = this.f1698V0.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((rgz) this.f1698V0.get(i2)).f199056g;
        }
        return i;
    }

    @Override // p204p.pgz
    /* JADX INFO: renamed from: h */
    public final void mo1438h(View view, int i, int i2, rgz rgzVar) {
        m1118p(f1690n1, view);
        if (mo1441k()) {
            int i3 = ((ojv0) view.getLayoutParams()).f166148b.left + ((ojv0) view.getLayoutParams()).f166148b.right;
            rgzVar.f199054e += i3;
            rgzVar.f199055f += i3;
        } else {
            int i4 = ((ojv0) view.getLayoutParams()).f166148b.top + ((ojv0) view.getLayoutParams()).f166148b.bottom;
            rgzVar.f199054e += i4;
            rgzVar.f199055f += i4;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: h0 */
    public final void mo1113h0(RecyclerView recyclerView) {
        this.f1713k1 = (View) recyclerView.getParent();
    }

    /* JADX INFO: renamed from: h1 */
    public final int m1465h1(int i, vjv0 vjv0Var, zjv0 zjv0Var, boolean z) {
        int iM1466i1;
        int iMo34604m;
        if (mo1441k() || !this.f1696T0) {
            int iMo34604m2 = i - this.f1704b1.mo34604m();
            if (iMo34604m2 <= 0) {
                return 0;
            }
            iM1466i1 = -m1466i1(iMo34604m2, vjv0Var, zjv0Var);
        } else {
            int iMo34600i = this.f1704b1.mo34600i() - i;
            if (iMo34600i <= 0) {
                return 0;
            }
            iM1466i1 = m1466i1(-iMo34600i, vjv0Var, zjv0Var);
        }
        int i2 = i + iM1466i1;
        if (!z || (iMo34604m = i2 - this.f1704b1.mo34604m()) <= 0) {
            return iM1466i1;
        }
        this.f1704b1.mo34609r(-iMo34604m);
        return iM1466i1 - iMo34604m;
    }

    @Override // p204p.pgz
    /* JADX INFO: renamed from: i */
    public final int mo1439i(View view, int i, int i2) {
        int i3;
        int i4;
        if (mo1441k()) {
            i3 = ((ojv0) view.getLayoutParams()).f166148b.left;
            i4 = ((ojv0) view.getLayoutParams()).f166148b.right;
        } else {
            i3 = ((ojv0) view.getLayoutParams()).f166148b.top;
            i4 = ((ojv0) view.getLayoutParams()).f166148b.bottom;
        }
        return i3 + i4;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01e9  */
    /* JADX INFO: renamed from: i1 */
    public final int m1466i1(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        int i2;
        if (m1097I() != 0 && i != 0) {
            m1456Y0();
            this.f1702Z0.f15834i = true;
            boolean z = !mo1441k() && this.f1696T0;
            int i3 = (!z ? i > 0 : i < 0) ? -1 : 1;
            int iAbs = Math.abs(i);
            this.f1702Z0.f15833h = i3;
            boolean zMo1441k = mo1441k();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1288M0, this.f1292Z);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f1289N0, this.f1287L0);
            boolean z2 = !zMo1441k && this.f1696T0;
            ugz ugzVar = this.f1699W0;
            if (i3 == 1) {
                View viewM1096H = m1096H(m1097I() - 1);
                this.f1702Z0.f15830e = this.f1704b1.mo34595d(viewM1096H);
                int iM1083V = AbstractC0110a.m1083V(viewM1096H);
                View viewM1461d1 = m1461d1(viewM1096H, (rgz) this.f1698V0.get(((int[]) ugzVar.f230292d)[iM1083V]));
                ahz ahzVar = this.f1702Z0;
                ahzVar.getClass();
                int i4 = iM1083V + 1;
                ahzVar.f15829d = i4;
                int[] iArr = (int[]) ugzVar.f230292d;
                if (iArr.length <= i4) {
                    ahzVar.f15828c = -1;
                } else {
                    ahzVar.f15828c = iArr[i4];
                }
                if (z2) {
                    ahzVar.f15830e = this.f1704b1.mo34598g(viewM1461d1);
                    this.f1702Z0.f15831f = this.f1704b1.mo34604m() + (-this.f1704b1.mo34598g(viewM1461d1));
                    ahz ahzVar2 = this.f1702Z0;
                    int i5 = ahzVar2.f15831f;
                    if (i5 < 0) {
                        i5 = 0;
                    }
                    ahzVar2.f15831f = i5;
                } else {
                    ahzVar.f15830e = this.f1704b1.mo34595d(viewM1461d1);
                    this.f1702Z0.f15831f = this.f1704b1.mo34595d(viewM1461d1) - this.f1704b1.mo34600i();
                }
                int i6 = this.f1702Z0.f15828c;
                if ((i6 == -1 || i6 > this.f1698V0.size() - 1) && this.f1702Z0.f15829d <= this.f1701Y0.m96246b()) {
                    ahz ahzVar3 = this.f1702Z0;
                    int i7 = iAbs - ahzVar3.f15831f;
                    sgz sgzVar = this.f1715m1;
                    sgzVar.f208959c = null;
                    sgzVar.f208958b = 0;
                    if (i7 > 0) {
                        if (zMo1441k) {
                            this.f1699W0.m83107r(sgzVar, iMakeMeasureSpec, iMakeMeasureSpec2, i7, ahzVar3.f15829d, -1, this.f1698V0);
                        } else {
                            this.f1699W0.m83107r(sgzVar, iMakeMeasureSpec2, iMakeMeasureSpec, i7, ahzVar3.f15829d, -1, this.f1698V0);
                            iMakeMeasureSpec2 = iMakeMeasureSpec2;
                            iMakeMeasureSpec = iMakeMeasureSpec;
                        }
                        ugzVar.m83059A(iMakeMeasureSpec, iMakeMeasureSpec2, this.f1702Z0.f15829d);
                        ugzVar.m83097j0(this.f1702Z0.f15829d);
                    }
                }
            } else {
                View viewM1096H2 = m1096H(0);
                this.f1702Z0.f15830e = this.f1704b1.mo34598g(viewM1096H2);
                int iM1083V2 = AbstractC0110a.m1083V(viewM1096H2);
                View viewM1459b1 = m1459b1(viewM1096H2, (rgz) this.f1698V0.get(((int[]) ugzVar.f230292d)[iM1083V2]));
                ahz ahzVar4 = this.f1702Z0;
                ahzVar4.getClass();
                int i8 = ((int[]) ugzVar.f230292d)[iM1083V2];
                if (i8 == -1) {
                    i8 = 0;
                }
                if (i8 > 0) {
                    this.f1702Z0.f15829d = iM1083V2 - ((rgz) this.f1698V0.get(i8 - 1)).f199057h;
                } else {
                    ahzVar4.f15829d = -1;
                }
                ahz ahzVar5 = this.f1702Z0;
                ahzVar5.f15828c = i8 > 0 ? i8 - 1 : 0;
                if (z2) {
                    ahzVar5.f15830e = this.f1704b1.mo34595d(viewM1459b1);
                    this.f1702Z0.f15831f = this.f1704b1.mo34595d(viewM1459b1) - this.f1704b1.mo34600i();
                    ahz ahzVar6 = this.f1702Z0;
                    int i9 = ahzVar6.f15831f;
                    if (i9 < 0) {
                        i9 = 0;
                    }
                    ahzVar6.f15831f = i9;
                } else {
                    ahzVar5.f15830e = this.f1704b1.mo34598g(viewM1459b1);
                    this.f1702Z0.f15831f = this.f1704b1.mo34604m() + (-this.f1704b1.mo34598g(viewM1459b1));
                }
            }
            ahz ahzVar7 = this.f1702Z0;
            int i10 = ahzVar7.f15831f;
            ahzVar7.f15826a = iAbs - i10;
            int iM1457Z0 = m1457Z0(vjv0Var, zjv0Var, ahzVar7) + i10;
            if (iM1457Z0 >= 0) {
                if (z) {
                    if (iAbs > iM1457Z0) {
                        i2 = (-i3) * iM1457Z0;
                    } else {
                        i2 = i;
                    }
                } else if (iAbs > iM1457Z0) {
                    i2 = i3 * iM1457Z0;
                } else {
                    i2 = i;
                }
                this.f1704b1.mo34609r(-i2);
                this.f1702Z0.f15832g = i2;
                return i2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: j1 */
    public final int m1467j1(int i) {
        if (m1097I() == 0 || i == 0) {
            return 0;
        }
        m1456Y0();
        boolean zMo1441k = mo1441k();
        View view = this.f1713k1;
        int width = zMo1441k ? view.getWidth() : view.getHeight();
        int i2 = zMo1441k ? this.f1288M0 : this.f1289N0;
        int iM1106S = m1106S();
        xgz xgzVar = this.f1703a1;
        if (iM1106S == 1) {
            int iAbs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + xgzVar.f261398d) - width, iAbs);
            }
            int i3 = xgzVar.f261398d;
            if (i3 + i > 0) {
                return -i3;
            }
        } else {
            if (i > 0) {
                return Math.min((i2 - xgzVar.f261398d) - width, i);
            }
            int i4 = xgzVar.f261398d;
            if (i4 + i < 0) {
                return -i4;
            }
        }
        return i;
    }

    @Override // p204p.pgz
    /* JADX INFO: renamed from: k */
    public final boolean mo1441k() {
        int i = this.f1691O0;
        return i == 0 || i == 1;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0067  */
    /* JADX WARN: Code duplicated, block: B:29:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x0101  */
    /* JADX WARN: Code duplicated, block: B:74:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0080 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x010e A[SYNTHETIC] */
    /* JADX INFO: renamed from: k1 */
    public final void m1468k1(vjv0 vjv0Var, ahz ahzVar) {
        int iM1097I;
        if (ahzVar.f15834i) {
            int i = ahzVar.f15833h;
            ugz ugzVar = this.f1699W0;
            int i2 = -1;
            if (i != -1) {
                if (ahzVar.f15831f >= 0 && (iM1097I = m1097I()) != 0) {
                    int i3 = ((int[]) ugzVar.f230292d)[AbstractC0110a.m1083V(m1096H(0))];
                    if (i3 == -1) {
                        return;
                    }
                    rgz rgzVar = (rgz) this.f1698V0.get(i3);
                    for (int i4 = 0; i4 < iM1097I; i4++) {
                        View viewM1096H = m1096H(i4);
                        int i5 = ahzVar.f15831f;
                        if (!mo1441k() && this.f1696T0) {
                            if (this.f1704b1.mo34599h() - this.f1704b1.mo34598g(viewM1096H) > i5) {
                                break;
                            }
                            if (rgzVar.f199065p != AbstractC0110a.m1083V(viewM1096H)) {
                                if (i3 >= this.f1698V0.size() - 1) {
                                    i2 = i4;
                                    break;
                                } else {
                                    i3 += ahzVar.f15833h;
                                    rgzVar = (rgz) this.f1698V0.get(i3);
                                    i2 = i4;
                                }
                            }
                        } else {
                            if (this.f1704b1.mo34595d(viewM1096H) > i5) {
                                break;
                            }
                            if (rgzVar.f199065p != AbstractC0110a.m1083V(viewM1096H)) {
                                if (i3 >= this.f1698V0.size() - 1) {
                                    i2 = i4;
                                    break;
                                } else {
                                    i3 += ahzVar.f15833h;
                                    rgzVar = (rgz) this.f1698V0.get(i3);
                                    i2 = i4;
                                }
                            }
                        }
                    }
                    while (i2 >= 0) {
                        View viewM1096H2 = m1096H(i2);
                        if (m1096H(i2) != null) {
                            this.f1293a.m77132f(i2);
                        }
                        vjv0Var.m85786i(viewM1096H2);
                        i2--;
                    }
                    return;
                }
                return;
            }
            if (ahzVar.f15831f < 0) {
                return;
            }
            this.f1704b1.mo34599h();
            int iM1097I2 = m1097I();
            if (iM1097I2 == 0) {
                return;
            }
            int i6 = iM1097I2 - 1;
            int i7 = ((int[]) ugzVar.f230292d)[AbstractC0110a.m1083V(m1096H(i6))];
            if (i7 == -1) {
                return;
            }
            rgz rgzVar2 = (rgz) this.f1698V0.get(i7);
            for (int i8 = i6; i8 >= 0; i8--) {
                View viewM1096H3 = m1096H(i8);
                int i9 = ahzVar.f15831f;
                if (!mo1441k() && this.f1696T0) {
                    if (this.f1704b1.mo34595d(viewM1096H3) > i9) {
                        break;
                    }
                    if (rgzVar2.f199064o != AbstractC0110a.m1083V(viewM1096H3)) {
                        if (i7 <= 0) {
                            iM1097I2 = i8;
                            break;
                        } else {
                            i7 += ahzVar.f15833h;
                            rgzVar2 = (rgz) this.f1698V0.get(i7);
                            iM1097I2 = i8;
                        }
                    }
                } else {
                    if (this.f1704b1.mo34598g(viewM1096H3) < this.f1704b1.mo34599h() - i9) {
                        break;
                    }
                    if (rgzVar2.f199064o != AbstractC0110a.m1083V(viewM1096H3)) {
                        if (i7 <= 0) {
                            iM1097I2 = i8;
                            break;
                        } else {
                            i7 += ahzVar.f15833h;
                            rgzVar2 = (rgz) this.f1698V0.get(i7);
                            iM1097I2 = i8;
                        }
                    }
                }
            }
            while (i6 >= iM1097I2) {
                View viewM1096H4 = m1096H(i6);
                if (m1096H(i6) != null) {
                    this.f1293a.m77132f(i6);
                }
                vjv0Var.m85786i(viewM1096H4);
                i6--;
            }
        }
    }

    /* JADX INFO: renamed from: l1 */
    public final void m1469l1(int i) {
        int i2 = this.f1694R0;
        if (i2 != i) {
            if (i2 == 4 || i == 4) {
                m1089B0();
                this.f1698V0.clear();
                xgz xgzVar = this.f1703a1;
                xgz.m90939b(xgzVar);
                xgzVar.f261398d = 0;
            }
            this.f1694R0 = i;
            m1095G0();
        }
    }

    /* JADX INFO: renamed from: m1 */
    public final void m1470m1(int i) {
        if (this.f1691O0 != i) {
            m1089B0();
            this.f1691O0 = i;
            this.f1704b1 = null;
            this.f1705c1 = null;
            this.f1698V0.clear();
            xgz xgzVar = this.f1703a1;
            xgz.m90939b(xgzVar);
            xgzVar.f261398d = 0;
            m1095G0();
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final void m1471n1(int i) {
        int i2 = this.f1692P0;
        if (i2 != 1) {
            if (i2 == 0) {
                m1089B0();
                this.f1698V0.clear();
                xgz xgzVar = this.f1703a1;
                xgz.m90939b(xgzVar);
                xgzVar.f261398d = 0;
            }
            this.f1692P0 = 1;
            this.f1704b1 = null;
            this.f1705c1 = null;
            m1095G0();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: o0 */
    public final void mo908o0(RecyclerView recyclerView, int i, int i2) {
        m1473p1(i);
    }

    /* JADX INFO: renamed from: o1 */
    public final boolean m1472o1(View view, int i, int i2, zgz zgzVar) {
        return (!view.isLayoutRequested() && this.f1301i && m1452a0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) zgzVar).width) && m1452a0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) zgzVar).height)) ? false : true;
    }

    /* JADX INFO: renamed from: p1 */
    public final void m1473p1(int i) {
        View viewM1462e1 = m1462e1(m1097I() - 1, -1);
        if (i >= (viewM1462e1 != null ? AbstractC0110a.m1083V(viewM1462e1) : -1)) {
            return;
        }
        int iM1097I = m1097I();
        ugz ugzVar = this.f1699W0;
        ugzVar.m83061C(iM1097I);
        ugzVar.m83062D(iM1097I);
        ugzVar.m83060B(iM1097I);
        if (i >= ((int[]) ugzVar.f230292d).length) {
            return;
        }
        this.f1714l1 = i;
        View viewM1096H = m1096H(0);
        if (viewM1096H == null) {
            return;
        }
        this.f1707e1 = AbstractC0110a.m1083V(viewM1096H);
        if (mo1441k() || !this.f1696T0) {
            this.f1708f1 = this.f1704b1.mo34598g(viewM1096H) - this.f1704b1.mo34604m();
        } else {
            this.f1708f1 = this.f1704b1.mo34601j() + this.f1704b1.mo34595d(viewM1096H);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: q */
    public final boolean mo951q() {
        if (this.f1692P0 == 0) {
            return mo1441k();
        }
        if (!mo1441k()) {
            return true;
        }
        int i = this.f1288M0;
        View view = this.f1713k1;
        return i > (view != null ? view.getWidth() : 0);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: q0 */
    public final void mo910q0(RecyclerView recyclerView, int i, int i2) {
        m1473p1(Math.min(i, i2));
    }

    /* JADX INFO: renamed from: q1 */
    public final void m1474q1(xgz xgzVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            int i2 = mo1441k() ? this.f1287L0 : this.f1292Z;
            this.f1702Z0.f15827b = i2 == 0 || i2 == Integer.MIN_VALUE;
        } else {
            this.f1702Z0.f15827b = false;
        }
        if (mo1441k() || !this.f1696T0) {
            this.f1702Z0.f15826a = this.f1704b1.mo34600i() - xgzVar.f261397c;
        } else {
            this.f1702Z0.f15826a = xgzVar.f261397c - getPaddingRight();
        }
        ahz ahzVar = this.f1702Z0;
        ahzVar.f15829d = xgzVar.f261395a;
        ahzVar.f15833h = 1;
        ahzVar.f15830e = xgzVar.f261397c;
        ahzVar.f15831f = Integer.MIN_VALUE;
        ahzVar.f15828c = xgzVar.f261396b;
        if (!z || this.f1698V0.size() <= 1 || (i = xgzVar.f261396b) < 0 || i >= this.f1698V0.size() - 1) {
            return;
        }
        rgz rgzVar = (rgz) this.f1698V0.get(xgzVar.f261396b);
        ahz ahzVar2 = this.f1702Z0;
        ahzVar2.f15828c++;
        ahzVar2.f15829d += rgzVar.f199057h;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: r */
    public final boolean mo953r() {
        if (this.f1692P0 == 0) {
            return !mo1441k();
        }
        if (!mo1441k()) {
            int i = this.f1289N0;
            View view = this.f1713k1;
            if (i <= (view != null ? view.getHeight() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: r0 */
    public final void mo911r0(RecyclerView recyclerView, int i, int i2) {
        m1473p1(i);
    }

    /* JADX INFO: renamed from: r1 */
    public final void m1475r1(xgz xgzVar, boolean z, boolean z2) {
        if (z2) {
            int i = mo1441k() ? this.f1287L0 : this.f1292Z;
            this.f1702Z0.f15827b = i == 0 || i == Integer.MIN_VALUE;
        } else {
            this.f1702Z0.f15827b = false;
        }
        if (mo1441k() || !this.f1696T0) {
            this.f1702Z0.f15826a = xgzVar.f261397c - this.f1704b1.mo34604m();
        } else {
            this.f1702Z0.f15826a = (this.f1713k1.getWidth() - xgzVar.f261397c) - this.f1704b1.mo34604m();
        }
        ahz ahzVar = this.f1702Z0;
        ahzVar.f15829d = xgzVar.f261395a;
        ahzVar.f15833h = -1;
        ahzVar.f15830e = xgzVar.f261397c;
        ahzVar.f15831f = Integer.MIN_VALUE;
        int i2 = xgzVar.f261396b;
        ahzVar.f15828c = i2;
        if (!z || i2 <= 0) {
            return;
        }
        int size = this.f1698V0.size();
        int i3 = xgzVar.f261396b;
        if (size > i3) {
            rgz rgzVar = (rgz) this.f1698V0.get(i3);
            ahz ahzVar2 = this.f1702Z0;
            ahzVar2.f15828c--;
            ahzVar2.f15829d -= rgzVar.f199057h;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: s */
    public final boolean mo593s(ojv0 ojv0Var) {
        return ojv0Var instanceof zgz;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: s0 */
    public final void mo1119s0(int i) {
        m1473p1(i);
    }

    @Override // p204p.pgz
    public final void setFlexLines(List list) {
        this.f1698V0 = list;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: t0 */
    public final void mo914t0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m1473p1(i);
        m1473p1(i);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0192  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:111:0x01af  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:126:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:129:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0215  */
    /* JADX WARN: Code duplicated, block: B:137:0x021b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0228  */
    /* JADX WARN: Code duplicated, block: B:141:0x0235  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x0108  */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:82:0x011c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0128  */
    /* JADX WARN: Code duplicated, block: B:85:0x0137  */
    /* JADX WARN: Code duplicated, block: B:86:0x0143  */
    /* JADX WARN: Code duplicated, block: B:88:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x0155  */
    /* JADX WARN: Code duplicated, block: B:91:0x015f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0165  */
    /* JADX WARN: Code duplicated, block: B:95:0x0171  */
    /* JADX WARN: Code duplicated, block: B:96:0x0173  */
    /* JADX WARN: Code duplicated, block: B:99:0x017b  */
    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: u0 */
    public final void mo915u0(vjv0 vjv0Var, zjv0 zjv0Var) {
        View viewM1458a1;
        FlexboxLayoutManager flexboxLayoutManager;
        d180 d180Var;
        int iM1083V;
        int i;
        int size;
        int i2;
        int i3;
        View viewMo923D;
        boolean z;
        int iMo34598g;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        this.f1700X0 = vjv0Var;
        this.f1701Y0 = zjv0Var;
        int iM96246b = zjv0Var.m96246b();
        if (iM96246b == 0 && zjv0Var.f283550g) {
            return;
        }
        int iM1106S = m1106S();
        int i8 = this.f1691O0;
        if (i8 == 0) {
            this.f1696T0 = iM1106S == 1;
            this.f1697U0 = this.f1692P0 == 2;
        } else if (i8 == 1) {
            this.f1696T0 = iM1106S != 1;
            this.f1697U0 = this.f1692P0 == 2;
        } else if (i8 == 2) {
            boolean z4 = iM1106S == 1;
            this.f1696T0 = z4;
            if (this.f1692P0 == 2) {
                this.f1696T0 = !z4;
            }
            this.f1697U0 = false;
        } else if (i8 != 3) {
            this.f1696T0 = false;
            this.f1697U0 = false;
        } else {
            boolean z5 = iM1106S == 1;
            this.f1696T0 = z5;
            if (this.f1692P0 == 2) {
                this.f1696T0 = !z5;
            }
            this.f1697U0 = true;
        }
        m1456Y0();
        if (this.f1702Z0 == null) {
            ahz ahzVar = new ahz();
            ahzVar.f15833h = 1;
            this.f1702Z0 = ahzVar;
        }
        ugz ugzVar = this.f1699W0;
        ugzVar.m83061C(iM96246b);
        ugzVar.m83062D(iM96246b);
        ugzVar.m83060B(iM96246b);
        this.f1702Z0.f15834i = false;
        bhz bhzVar = this.f1706d1;
        if (bhzVar != null && (i7 = bhzVar.f27270a) >= 0 && i7 < iM96246b) {
            this.f1707e1 = i7;
        }
        xgz xgzVar = this.f1703a1;
        if (!xgzVar.f261400f || this.f1707e1 != -1 || bhzVar != null) {
            xgz.m90939b(xgzVar);
            bhz bhzVar2 = this.f1706d1;
            if (zjv0Var.f283550g || (i3 = this.f1707e1) == -1) {
                if (m1097I() != 0) {
                    if (xgzVar.f261399e) {
                        viewM1458a1 = m1460c1(zjv0Var.m96246b());
                    } else {
                        viewM1458a1 = m1458a1(zjv0Var.m96246b());
                    }
                    if (viewM1458a1 != null) {
                        flexboxLayoutManager = xgzVar.f261402h;
                        if (flexboxLayoutManager.f1692P0 == 0) {
                            d180Var = flexboxLayoutManager.f1705c1;
                        } else {
                            d180Var = flexboxLayoutManager.f1704b1;
                        }
                        if (flexboxLayoutManager.mo1441k() && flexboxLayoutManager.f1696T0) {
                            if (xgzVar.f261399e) {
                                xgzVar.f261397c = d180Var.m34606o() + d180Var.mo34598g(viewM1458a1);
                            } else {
                                xgzVar.f261397c = d180Var.mo34595d(viewM1458a1);
                            }
                        } else if (xgzVar.f261399e) {
                            xgzVar.f261397c = d180Var.m34606o() + d180Var.mo34595d(viewM1458a1);
                        } else {
                            xgzVar.f261397c = d180Var.mo34598g(viewM1458a1);
                        }
                        iM1083V = AbstractC0110a.m1083V(viewM1458a1);
                        xgzVar.f261395a = iM1083V;
                        xgzVar.f261401g = false;
                        int[] iArr = (int[]) flexboxLayoutManager.f1699W0.f230292d;
                        if (iM1083V == -1) {
                            iM1083V = 0;
                        }
                        i = iArr[iM1083V];
                        if (i == -1) {
                            i = 0;
                        }
                        xgzVar.f261396b = i;
                        size = flexboxLayoutManager.f1698V0.size();
                        i2 = xgzVar.f261396b;
                        if (size > i2) {
                            xgzVar.f261395a = ((rgz) flexboxLayoutManager.f1698V0.get(i2)).f199064o;
                        }
                    } else {
                        xgz.m90938a(xgzVar);
                        xgzVar.f261395a = 0;
                        xgzVar.f261396b = 0;
                    }
                } else {
                    xgz.m90938a(xgzVar);
                    xgzVar.f261395a = 0;
                    xgzVar.f261396b = 0;
                }
            } else if (i3 < 0 || i3 >= zjv0Var.m96246b()) {
                this.f1707e1 = -1;
                this.f1708f1 = Integer.MIN_VALUE;
                if (m1097I() != 0) {
                    if (xgzVar.f261399e) {
                        viewM1458a1 = m1460c1(zjv0Var.m96246b());
                    } else {
                        viewM1458a1 = m1458a1(zjv0Var.m96246b());
                    }
                    if (viewM1458a1 != null) {
                        flexboxLayoutManager = xgzVar.f261402h;
                        if (flexboxLayoutManager.f1692P0 == 0) {
                            d180Var = flexboxLayoutManager.f1705c1;
                        } else {
                            d180Var = flexboxLayoutManager.f1704b1;
                        }
                        if (flexboxLayoutManager.mo1441k()) {
                            if (xgzVar.f261399e) {
                                xgzVar.f261397c = d180Var.m34606o() + d180Var.mo34595d(viewM1458a1);
                            } else {
                                xgzVar.f261397c = d180Var.mo34598g(viewM1458a1);
                            }
                        } else if (xgzVar.f261399e) {
                            xgzVar.f261397c = d180Var.m34606o() + d180Var.mo34595d(viewM1458a1);
                        } else {
                            xgzVar.f261397c = d180Var.mo34598g(viewM1458a1);
                        }
                        iM1083V = AbstractC0110a.m1083V(viewM1458a1);
                        xgzVar.f261395a = iM1083V;
                        xgzVar.f261401g = false;
                        int[] iArr2 = (int[]) flexboxLayoutManager.f1699W0.f230292d;
                        if (iM1083V == -1) {
                            iM1083V = 0;
                        }
                        i = iArr2[iM1083V];
                        if (i == -1) {
                            i = 0;
                        }
                        xgzVar.f261396b = i;
                        size = flexboxLayoutManager.f1698V0.size();
                        i2 = xgzVar.f261396b;
                        if (size > i2) {
                            xgzVar.f261395a = ((rgz) flexboxLayoutManager.f1698V0.get(i2)).f199064o;
                        }
                    } else {
                        xgz.m90938a(xgzVar);
                        xgzVar.f261395a = 0;
                        xgzVar.f261396b = 0;
                    }
                } else {
                    xgz.m90938a(xgzVar);
                    xgzVar.f261395a = 0;
                    xgzVar.f261396b = 0;
                }
            } else {
                int i9 = this.f1707e1;
                xgzVar.f261395a = i9;
                xgzVar.f261396b = ((int[]) ugzVar.f230292d)[i9];
                bhz bhzVar3 = this.f1706d1;
                if (bhzVar3 != null) {
                    int iM96246b2 = zjv0Var.m96246b();
                    int i10 = bhzVar3.f27270a;
                    if (i10 >= 0 && i10 < iM96246b2) {
                        xgzVar.f261397c = this.f1704b1.mo34604m() + bhzVar2.f27271b;
                        xgzVar.f261401g = true;
                        xgzVar.f261396b = -1;
                    } else if (this.f1708f1 == Integer.MIN_VALUE) {
                        viewMo923D = mo923D(this.f1707e1);
                        if (viewMo923D != null) {
                            if (m1097I() > 0) {
                                if (this.f1707e1 < AbstractC0110a.m1083V(m1096H(0))) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                xgzVar.f261399e = z;
                            }
                            xgz.m90938a(xgzVar);
                        } else if (this.f1704b1.mo34596e(viewMo923D) > this.f1704b1.mo34605n()) {
                            xgz.m90938a(xgzVar);
                        } else if (this.f1704b1.mo34598g(viewMo923D) - this.f1704b1.mo34604m() < 0) {
                            xgzVar.f261397c = this.f1704b1.mo34604m();
                            xgzVar.f261399e = false;
                        } else if (this.f1704b1.mo34600i() - this.f1704b1.mo34595d(viewMo923D) < 0) {
                            xgzVar.f261397c = this.f1704b1.mo34600i();
                            xgzVar.f261399e = true;
                        } else {
                            if (xgzVar.f261399e) {
                                iMo34598g = this.f1704b1.m34606o() + this.f1704b1.mo34595d(viewMo923D);
                            } else {
                                iMo34598g = this.f1704b1.mo34598g(viewMo923D);
                            }
                            xgzVar.f261397c = iMo34598g;
                        }
                    } else if (mo1441k() && this.f1696T0) {
                        xgzVar.f261397c = this.f1708f1 - this.f1704b1.mo34601j();
                    } else {
                        xgzVar.f261397c = this.f1704b1.mo34604m() + this.f1708f1;
                    }
                } else if (this.f1708f1 == Integer.MIN_VALUE) {
                    viewMo923D = mo923D(this.f1707e1);
                    if (viewMo923D != null) {
                        if (m1097I() > 0) {
                            if (this.f1707e1 < AbstractC0110a.m1083V(m1096H(0))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            xgzVar.f261399e = z;
                        }
                        xgz.m90938a(xgzVar);
                    } else if (this.f1704b1.mo34596e(viewMo923D) > this.f1704b1.mo34605n()) {
                        xgz.m90938a(xgzVar);
                    } else if (this.f1704b1.mo34598g(viewMo923D) - this.f1704b1.mo34604m() < 0) {
                        xgzVar.f261397c = this.f1704b1.mo34604m();
                        xgzVar.f261399e = false;
                    } else if (this.f1704b1.mo34600i() - this.f1704b1.mo34595d(viewMo923D) < 0) {
                        xgzVar.f261397c = this.f1704b1.mo34600i();
                        xgzVar.f261399e = true;
                    } else {
                        if (xgzVar.f261399e) {
                            iMo34598g = this.f1704b1.m34606o() + this.f1704b1.mo34595d(viewMo923D);
                        } else {
                            iMo34598g = this.f1704b1.mo34598g(viewMo923D);
                        }
                        xgzVar.f261397c = iMo34598g;
                    }
                } else if (mo1441k()) {
                    xgzVar.f261397c = this.f1704b1.mo34604m() + this.f1708f1;
                } else {
                    xgzVar.f261397c = this.f1704b1.mo34604m() + this.f1708f1;
                }
            }
            xgzVar.f261400f = true;
        }
        m1090C(vjv0Var);
        if (xgzVar.f261399e) {
            m1475r1(xgzVar, false, true);
        } else {
            m1474q1(xgzVar, false, true);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1288M0, this.f1292Z);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f1289N0, this.f1287L0);
        int i11 = this.f1288M0;
        int i12 = this.f1289N0;
        boolean zMo1441k = mo1441k();
        Context context = this.f1712j1;
        if (zMo1441k) {
            int i13 = this.f1709g1;
            z2 = (i13 == Integer.MIN_VALUE || i13 == i11) ? false : true;
            ahz ahzVar2 = this.f1702Z0;
            i4 = ahzVar2.f15827b ? context.getResources().getDisplayMetrics().heightPixels : ahzVar2.f15826a;
        } else {
            int i14 = this.f1710h1;
            z2 = (i14 == Integer.MIN_VALUE || i14 == i12) ? false : true;
            ahz ahzVar3 = this.f1702Z0;
            i4 = ahzVar3.f15827b ? context.getResources().getDisplayMetrics().widthPixels : ahzVar3.f15826a;
        }
        int i15 = i4;
        this.f1709g1 = i11;
        this.f1710h1 = i12;
        int i16 = this.f1714l1;
        sgz sgzVar = this.f1715m1;
        if (i16 != -1 || (this.f1707e1 == -1 && !z2)) {
            int iMin = i16 != -1 ? Math.min(i16, xgzVar.f261395a) : xgzVar.f261395a;
            sgzVar.f208959c = null;
            sgzVar.f208958b = 0;
            if (mo1441k()) {
                if (this.f1698V0.size() > 0) {
                    ugzVar.m83109t(iMin, this.f1698V0);
                    this.f1699W0.m83107r(this.f1715m1, iMakeMeasureSpec, iMakeMeasureSpec2, i15, iMin, xgzVar.f261395a, this.f1698V0);
                } else {
                    ugzVar.m83060B(iM96246b);
                    this.f1699W0.m83107r(this.f1715m1, iMakeMeasureSpec, iMakeMeasureSpec2, i15, 0, -1, this.f1698V0);
                }
            } else if (this.f1698V0.size() > 0) {
                ugzVar.m83109t(iMin, this.f1698V0);
                int i17 = iMin;
                this.f1699W0.m83107r(this.f1715m1, iMakeMeasureSpec2, iMakeMeasureSpec, i15, i17, xgzVar.f261395a, this.f1698V0);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
                iMin = i17;
            } else {
                ugzVar.m83060B(iM96246b);
                this.f1699W0.m83107r(this.f1715m1, iMakeMeasureSpec2, iMakeMeasureSpec, i15, 0, -1, this.f1698V0);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.f1698V0 = (List) sgzVar.f208959c;
            ugzVar.m83059A(iMakeMeasureSpec, iMakeMeasureSpec2, iMin);
            ugzVar.m83097j0(iMin);
        } else if (!xgzVar.f261399e) {
            this.f1698V0.clear();
            sgzVar.f208959c = null;
            sgzVar.f208958b = 0;
            if (mo1441k()) {
                this.f1699W0.m83107r(this.f1715m1, iMakeMeasureSpec, iMakeMeasureSpec2, i15, 0, xgzVar.f261395a, this.f1698V0);
            } else {
                this.f1699W0.m83107r(this.f1715m1, iMakeMeasureSpec2, iMakeMeasureSpec, i15, 0, xgzVar.f261395a, this.f1698V0);
                iMakeMeasureSpec2 = iMakeMeasureSpec2;
                iMakeMeasureSpec = iMakeMeasureSpec;
            }
            this.f1698V0 = (List) sgzVar.f208959c;
            ugzVar.m83059A(iMakeMeasureSpec, iMakeMeasureSpec2, 0);
            ugzVar.m83097j0(0);
            int i18 = ((int[]) ugzVar.f230292d)[xgzVar.f261395a];
            xgzVar.f261396b = i18;
            this.f1702Z0.f15828c = i18;
        }
        if (xgzVar.f261399e) {
            m1457Z0(vjv0Var, zjv0Var, this.f1702Z0);
            i6 = this.f1702Z0.f15830e;
            z3 = true;
            m1474q1(xgzVar, true, false);
            m1457Z0(vjv0Var, zjv0Var, this.f1702Z0);
            i5 = this.f1702Z0.f15830e;
        } else {
            z3 = true;
            m1457Z0(vjv0Var, zjv0Var, this.f1702Z0);
            i5 = this.f1702Z0.f15830e;
            m1475r1(xgzVar, true, false);
            m1457Z0(vjv0Var, zjv0Var, this.f1702Z0);
            i6 = this.f1702Z0.f15830e;
        }
        if (m1097I() > 0) {
            if (xgzVar.f261399e) {
                m1465h1(m1464g1(i5, vjv0Var, zjv0Var, z3) + i6, vjv0Var, zjv0Var, false);
            } else {
                m1464g1(m1465h1(i6, vjv0Var, zjv0Var, z3) + i5, vjv0Var, zjv0Var, false);
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: v0 */
    public final void mo916v0(zjv0 zjv0Var) {
        this.f1706d1 = null;
        this.f1707e1 = -1;
        this.f1708f1 = Integer.MIN_VALUE;
        this.f1714l1 = -1;
        xgz.m90939b(this.f1703a1);
        this.f1711i1.clear();
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: w */
    public final int mo959w(zjv0 zjv0Var) {
        return m1453V0(zjv0Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: x */
    public final int mo917x(zjv0 zjv0Var) {
        return m1454W0(zjv0Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: x0 */
    public final void mo961x0(Parcelable parcelable) {
        if (parcelable instanceof bhz) {
            this.f1706d1 = (bhz) parcelable;
            m1095G0();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: y */
    public final int mo918y(zjv0 zjv0Var) {
        return m1455X0(zjv0Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: y0 */
    public final Parcelable mo963y0() {
        bhz bhzVar = this.f1706d1;
        if (bhzVar != null) {
            bhz bhzVar2 = new bhz();
            bhzVar2.f27270a = bhzVar.f27270a;
            bhzVar2.f27271b = bhzVar.f27271b;
            return bhzVar2;
        }
        bhz bhzVar3 = new bhz();
        if (m1097I() <= 0) {
            bhzVar3.f27270a = -1;
            return bhzVar3;
        }
        View viewM1096H = m1096H(0);
        bhzVar3.f27270a = AbstractC0110a.m1083V(viewM1096H);
        bhzVar3.f27271b = this.f1704b1.mo34598g(viewM1096H) - this.f1704b1.mo34604m();
        return bhzVar3;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: z */
    public final int mo965z(zjv0 zjv0Var) {
        return m1453V0(zjv0Var);
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        h7c h7cVarM1084W = AbstractC0110a.m1084W(context, attributeSet, i, i2);
        int i3 = h7cVarM1084W.f88401a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (h7cVarM1084W.f88403c) {
                    m1470m1(3);
                } else {
                    m1470m1(2);
                }
            }
        } else if (h7cVarM1084W.f88403c) {
            m1470m1(1);
        } else {
            m1470m1(0);
        }
        m1471n1(1);
        m1469l1(4);
        this.f1300h = true;
        this.f1712j1 = context;
    }

    @Override // p204p.pgz
    /* JADX INFO: renamed from: j */
    public final void mo1440j(rgz rgzVar) {
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: i0 */
    public final void mo941i0(RecyclerView recyclerView, vjv0 vjv0Var) {
    }
}
