package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import p204p.d180;
import p204p.dkv0;
import p204p.dl80;
import p204p.el80;
import p204p.fl80;
import p204p.g9g1;
import p204p.gx8;
import p204p.h7c;
import p204p.il80;
import p204p.njx;
import p204p.ojv0;
import p204p.s571;
import p204p.vjv0;
import p204p.yjv0;
import p204p.zjv0;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0110a implements yjv0 {

    /* JADX INFO: renamed from: O0 */
    public int f1163O0;

    /* JADX INFO: renamed from: P0 */
    public el80 f1164P0;

    /* JADX INFO: renamed from: Q0 */
    public d180 f1165Q0;

    /* JADX INFO: renamed from: R0 */
    public boolean f1166R0;

    /* JADX INFO: renamed from: S0 */
    public final boolean f1167S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f1168T0;

    /* JADX INFO: renamed from: U0 */
    public boolean f1169U0;

    /* JADX INFO: renamed from: V0 */
    public final boolean f1170V0;

    /* JADX INFO: renamed from: W0 */
    public int f1171W0;

    /* JADX INFO: renamed from: X0 */
    public int f1172X0;

    /* JADX INFO: renamed from: Y0 */
    public boolean f1173Y0;

    /* JADX INFO: renamed from: Z0 */
    public fl80 f1174Z0;

    /* JADX INFO: renamed from: a1 */
    public final njx f1175a1;

    /* JADX INFO: renamed from: b1 */
    public final dl80 f1176b1;

    /* JADX INFO: renamed from: c1 */
    public int f1177c1;

    /* JADX INFO: renamed from: d1 */
    public final int[] f1178d1;

    public LinearLayoutManager(int i) {
        this.f1163O0 = 1;
        this.f1167S0 = false;
        this.f1168T0 = false;
        this.f1169U0 = false;
        this.f1170V0 = true;
        this.f1171W0 = -1;
        this.f1172X0 = Integer.MIN_VALUE;
        this.f1174Z0 = null;
        this.f1175a1 = new njx();
        this.f1176b1 = new dl80();
        this.f1177c1 = 2;
        this.f1178d1 = new int[2];
        m964y1(i);
        mo947n(null);
        if (this.f1167S0) {
            this.f1167S0 = false;
            m1095G0();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: A */
    public int mo883A(zjv0 zjv0Var) {
        return m929Y0(zjv0Var);
    }

    /* JADX INFO: renamed from: A1 */
    public final void m920A1(int i, int i2, boolean z, zjv0 zjv0Var) {
        int iMo34604m;
        this.f1164P0.f60651l = this.f1165Q0.mo34602k() == 0 && this.f1165Q0.mo34599h() == 0;
        this.f1164P0.f60645f = i;
        int[] iArr = this.f1178d1;
        iArr[0] = 0;
        iArr[1] = 0;
        mo927V0(zjv0Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z2 = i == 1;
        el80 el80Var = this.f1164P0;
        int i3 = z2 ? iMax2 : iMax;
        el80Var.f60647h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        el80Var.f60648i = iMax;
        if (z2) {
            el80Var.f60647h = this.f1165Q0.mo34601j() + i3;
            View viewM949o1 = m949o1();
            el80 el80Var2 = this.f1164P0;
            el80Var2.f60644e = this.f1168T0 ? -1 : 1;
            int iM1083V = AbstractC0110a.m1083V(viewM949o1);
            el80 el80Var3 = this.f1164P0;
            el80Var2.f60643d = iM1083V + el80Var3.f60644e;
            el80Var3.f60641b = this.f1165Q0.mo34595d(viewM949o1);
            iMo34604m = this.f1165Q0.mo34595d(viewM949o1) - this.f1165Q0.mo34600i();
        } else {
            View viewM950p1 = m950p1();
            el80 el80Var4 = this.f1164P0;
            el80Var4.f60647h = this.f1165Q0.mo34604m() + el80Var4.f60647h;
            el80 el80Var5 = this.f1164P0;
            el80Var5.f60644e = this.f1168T0 ? 1 : -1;
            int iM1083V2 = AbstractC0110a.m1083V(viewM950p1);
            el80 el80Var6 = this.f1164P0;
            el80Var5.f60643d = iM1083V2 + el80Var6.f60644e;
            el80Var6.f60641b = this.f1165Q0.mo34598g(viewM950p1);
            iMo34604m = (-this.f1165Q0.mo34598g(viewM950p1)) + this.f1165Q0.mo34604m();
        }
        el80 el80Var7 = this.f1164P0;
        el80Var7.f60642c = i2;
        if (z) {
            el80Var7.f60642c = i2 - iMo34604m;
        }
        el80Var7.f60646g = iMo34604m;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: B */
    public int mo884B(zjv0 zjv0Var) {
        return m931Z0(zjv0Var);
    }

    /* JADX INFO: renamed from: B1 */
    public final void m921B1(int i, int i2) {
        this.f1164P0.f60642c = this.f1165Q0.mo34600i() - i2;
        el80 el80Var = this.f1164P0;
        el80Var.f60644e = this.f1168T0 ? -1 : 1;
        el80Var.f60643d = i;
        el80Var.f60645f = 1;
        el80Var.f60641b = i2;
        el80Var.f60646g = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: C1 */
    public final void m922C1(int i, int i2) {
        this.f1164P0.f60642c = i2 - this.f1165Q0.mo34604m();
        el80 el80Var = this.f1164P0;
        el80Var.f60643d = i;
        el80Var.f60644e = this.f1168T0 ? 1 : -1;
        el80Var.f60645f = -1;
        el80Var.f60641b = i2;
        el80Var.f60646g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: D */
    public final View mo923D(int i) {
        int iM1097I = m1097I();
        if (iM1097I == 0) {
            return null;
        }
        int iM1083V = i - AbstractC0110a.m1083V(m1096H(0));
        if (iM1083V >= 0 && iM1083V < iM1097I) {
            View viewM1096H = m1096H(iM1083V);
            if (AbstractC0110a.m1083V(viewM1096H) == i) {
                return viewM1096H;
            }
        }
        return super.mo923D(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: E */
    public ojv0 mo886E() {
        return new ojv0(-2, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: H0 */
    public int mo892H0(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        if (this.f1163O0 == 1) {
            return 0;
        }
        return m960w1(i, vjv0Var, zjv0Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: I0 */
    public void mo924I0(int i) {
        this.f1171W0 = i;
        this.f1172X0 = Integer.MIN_VALUE;
        fl80 fl80Var = this.f1174Z0;
        if (fl80Var != null) {
            fl80Var.f70722a = -1;
        }
        m1095G0();
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: J0 */
    public int mo895J0(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        if (this.f1163O0 == 0) {
            return 0;
        }
        return m960w1(i, vjv0Var, zjv0Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: Q0 */
    public final boolean mo925Q0() {
        if (this.f1287L0 != 1073741824 && this.f1292Z != 1073741824) {
            int iM1097I = m1097I();
            for (int i = 0; i < iM1097I; i++) {
                ViewGroup.LayoutParams layoutParams = m1096H(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: S0 */
    public void mo926S0(RecyclerView recyclerView, zjv0 zjv0Var, int i) {
        il80 il80Var = new il80(recyclerView.getContext());
        il80Var.m50997k(i);
        m1108T0(il80Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: U0 */
    public boolean mo901U0() {
        return this.f1174Z0 == null && this.f1166R0 == this.f1169U0;
    }

    /* JADX INFO: renamed from: V0 */
    public void mo927V0(zjv0 zjv0Var, int[] iArr) {
        int i;
        int iMo34605n = zjv0Var.f283544a != -1 ? this.f1165Q0.mo34605n() : 0;
        if (this.f1164P0.f60645f == -1) {
            i = 0;
        } else {
            i = iMo34605n;
            iMo34605n = 0;
        }
        iArr[0] = iMo34605n;
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: W0 */
    public void mo902W0(zjv0 zjv0Var, el80 el80Var, gx8 gx8Var) {
        int i = el80Var.f60643d;
        if (i < 0 || i >= zjv0Var.m96246b()) {
            return;
        }
        gx8Var.m46027a(i, Math.max(0, el80Var.f60646g));
    }

    /* JADX INFO: renamed from: X0 */
    public final int m928X0(zjv0 zjv0Var) {
        if (m1097I() == 0) {
            return 0;
        }
        m934b1();
        d180 d180Var = this.f1165Q0;
        boolean z = !this.f1170V0;
        return g9g1.m44030f(zjv0Var, d180Var, m938f1(z), m937e1(z), this, this.f1170V0);
    }

    /* JADX INFO: renamed from: Y0 */
    public final int m929Y0(zjv0 zjv0Var) {
        if (m1097I() == 0) {
            return 0;
        }
        m934b1();
        d180 d180Var = this.f1165Q0;
        boolean z = !this.f1170V0;
        return g9g1.m44031g(zjv0Var, d180Var, m938f1(z), m937e1(z), this, this.f1170V0, this.f1168T0);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: Z */
    public final boolean mo930Z() {
        return true;
    }

    /* JADX INFO: renamed from: Z0 */
    public final int m931Z0(zjv0 zjv0Var) {
        if (m1097I() == 0) {
            return 0;
        }
        m934b1();
        d180 d180Var = this.f1165Q0;
        boolean z = !this.f1170V0;
        return g9g1.m44032h(zjv0Var, d180Var, m938f1(z), m937e1(z), this, this.f1170V0);
    }

    @Override // p204p.yjv0
    /* JADX INFO: renamed from: a */
    public PointF mo932a(int i) {
        if (m1097I() == 0) {
            return null;
        }
        int i2 = (i < AbstractC0110a.m1083V(m1096H(0))) != this.f1168T0 ? -1 : 1;
        return this.f1163O0 == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    /* JADX INFO: renamed from: a1 */
    public final int m933a1(int i) {
        if (i == 1) {
            return (this.f1163O0 != 1 && m952q1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f1163O0 != 1 && m952q1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.f1163O0 == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f1163O0 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.f1163O0 == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f1163O0 == 0 ? 1 : Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: b1 */
    public final void m934b1() {
        if (this.f1164P0 == null) {
            el80 el80Var = new el80();
            el80Var.f60640a = true;
            el80Var.f60647h = 0;
            el80Var.f60648i = 0;
            el80Var.f60650k = null;
            this.f1164P0 = el80Var;
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final int m935c1(vjv0 vjv0Var, el80 el80Var, zjv0 zjv0Var, boolean z) {
        int i;
        int i2 = el80Var.f60642c;
        int i3 = el80Var.f60646g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                el80Var.f60646g = i3 + i2;
            }
            m954t1(vjv0Var, el80Var);
        }
        int i4 = el80Var.f60642c + el80Var.f60647h;
        while (true) {
            if ((!el80Var.f60651l && i4 <= 0) || (i = el80Var.f60643d) < 0 || i >= zjv0Var.m96246b()) {
                break;
            }
            dl80 dl80Var = this.f1176b1;
            dl80Var.f50141a = 0;
            dl80Var.f50142b = false;
            dl80Var.f50143c = false;
            dl80Var.f50144d = false;
            mo912r1(vjv0Var, zjv0Var, el80Var, dl80Var);
            if (!dl80Var.f50142b) {
                int i5 = el80Var.f60641b;
                int i6 = dl80Var.f50141a;
                el80Var.f60641b = (el80Var.f60645f * i6) + i5;
                if (!dl80Var.f50143c || el80Var.f60650k != null || !zjv0Var.f283550g) {
                    el80Var.f60642c -= i6;
                    i4 -= i6;
                }
                int i7 = el80Var.f60646g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    el80Var.f60646g = i8;
                    int i9 = el80Var.f60642c;
                    if (i9 < 0) {
                        el80Var.f60646g = i8 + i9;
                    }
                    m954t1(vjv0Var, el80Var);
                }
                if (z && dl80Var.f50144d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - el80Var.f60642c;
    }

    /* JADX INFO: renamed from: d1 */
    public final int m936d1() {
        View viewM945k1 = m945k1(0, m1097I(), true, false);
        if (viewM945k1 == null) {
            return -1;
        }
        return AbstractC0110a.m1083V(viewM945k1);
    }

    /* JADX INFO: renamed from: e1 */
    public final View m937e1(boolean z) {
        return this.f1168T0 ? m945k1(0, m1097I(), z, true) : m945k1(m1097I() - 1, -1, z, true);
    }

    /* JADX INFO: renamed from: f1 */
    public final View m938f1(boolean z) {
        return this.f1168T0 ? m945k1(m1097I() - 1, -1, z, true) : m945k1(0, m1097I(), z, true);
    }

    /* JADX INFO: renamed from: g1 */
    public final int m939g1() {
        View viewM945k1 = m945k1(0, m1097I(), false, true);
        if (viewM945k1 == null) {
            return -1;
        }
        return AbstractC0110a.m1083V(viewM945k1);
    }

    /* JADX INFO: renamed from: h1 */
    public final int m940h1() {
        View viewM945k1 = m945k1(m1097I() - 1, -1, true, false);
        if (viewM945k1 == null) {
            return -1;
        }
        return AbstractC0110a.m1083V(viewM945k1);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: i0 */
    public void mo941i0(RecyclerView recyclerView, vjv0 vjv0Var) {
        if (this.f1173Y0) {
            m1091C0(vjv0Var);
            vjv0Var.f242060a.clear();
            vjv0Var.m85784g();
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final int m942i1() {
        View viewM945k1 = m945k1(m1097I() - 1, -1, false, true);
        if (viewM945k1 == null) {
            return -1;
        }
        return AbstractC0110a.m1083V(viewM945k1);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: j0 */
    public View mo904j0(View view, int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        int iM933a1;
        View viewM943j1;
        m958v1();
        if (m1097I() != 0 && (iM933a1 = m933a1(i)) != Integer.MIN_VALUE) {
            m934b1();
            m920A1(iM933a1, (int) (this.f1165Q0.mo34605n() * 0.33333334f), false, zjv0Var);
            el80 el80Var = this.f1164P0;
            el80Var.f60646g = Integer.MIN_VALUE;
            el80Var.f60640a = false;
            m935c1(vjv0Var, el80Var, zjv0Var, true);
            if (iM933a1 == -1) {
                viewM943j1 = this.f1168T0 ? m943j1(m1097I() - 1, -1) : m943j1(0, m1097I());
            } else {
                viewM943j1 = this.f1168T0 ? m943j1(0, m1097I()) : m943j1(m1097I() - 1, -1);
            }
            View viewM950p1 = iM933a1 == -1 ? m950p1() : m949o1();
            if (!viewM950p1.hasFocusable()) {
                return viewM943j1;
            }
            if (viewM943j1 != null) {
                return viewM950p1;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j1 */
    public final View m943j1(int i, int i2) {
        int i3;
        int i4;
        m934b1();
        if (i2 <= i && i2 >= i) {
            return m1096H(i);
        }
        if (this.f1165Q0.mo34598g(m1096H(i)) < this.f1165Q0.mo34604m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f1163O0 == 0 ? this.f1295c.m83239n(i, i2, i3, i4) : this.f1296d.m83239n(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: k0 */
    public final void mo944k0(AccessibilityEvent accessibilityEvent) {
        super.mo944k0(accessibilityEvent);
        if (m1097I() > 0) {
            accessibilityEvent.setFromIndex(m939g1());
            accessibilityEvent.setToIndex(m942i1());
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final View m945k1(int i, int i2, boolean z, boolean z2) {
        m934b1();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.f1163O0 == 0 ? this.f1295c.m83239n(i, i2, i3, i4) : this.f1296d.m83239n(i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    /* JADX INFO: renamed from: l1 */
    public View mo906l1(vjv0 vjv0Var, zjv0 zjv0Var, boolean z, boolean z2) {
        int i;
        int iM1097I;
        int i2;
        m934b1();
        int iM1097I2 = m1097I();
        if (z2) {
            iM1097I = m1097I() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = iM1097I2;
            iM1097I = 0;
            i2 = 1;
        }
        int iM96246b = zjv0Var.m96246b();
        int iMo34604m = this.f1165Q0.mo34604m();
        int iMo34600i = this.f1165Q0.mo34600i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM1097I != i) {
            View viewM1096H = m1096H(iM1097I);
            int iM1083V = AbstractC0110a.m1083V(viewM1096H);
            int iMo34598g = this.f1165Q0.mo34598g(viewM1096H);
            int iMo34595d = this.f1165Q0.mo34595d(viewM1096H);
            if (iM1083V >= 0 && iM1083V < iM96246b) {
                if (!((ojv0) viewM1096H.getLayoutParams()).f166147a.m36330t()) {
                    boolean z3 = iMo34595d <= iMo34604m && iMo34598g < iMo34604m;
                    boolean z4 = iMo34598g >= iMo34600i && iMo34595d > iMo34600i;
                    if (!z3 && !z4) {
                        return viewM1096H;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewM1096H;
                        } else if (view == null) {
                            view = viewM1096H;
                        }
                    } else if (z3) {
                        view2 = viewM1096H;
                    } else if (view == null) {
                        view = viewM1096H;
                    }
                } else if (view3 == null) {
                    view3 = viewM1096H;
                }
            }
            iM1097I += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    /* JADX INFO: renamed from: m1 */
    public final int m946m1(int i, vjv0 vjv0Var, zjv0 zjv0Var, boolean z) {
        int iMo34600i;
        int iMo34600i2 = this.f1165Q0.mo34600i() - i;
        if (iMo34600i2 <= 0) {
            return 0;
        }
        int i2 = -m960w1(-iMo34600i2, vjv0Var, zjv0Var);
        int i3 = i + i2;
        if (!z || (iMo34600i = this.f1165Q0.mo34600i() - i3) <= 0) {
            return i2;
        }
        this.f1165Q0.mo34609r(iMo34600i);
        return iMo34600i + i2;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: n */
    public final void mo947n(String str) {
        if (this.f1174Z0 == null) {
            super.mo947n(str);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final int m948n1(int i, vjv0 vjv0Var, zjv0 zjv0Var, boolean z) {
        int iMo34604m;
        int iMo34604m2 = i - this.f1165Q0.mo34604m();
        if (iMo34604m2 <= 0) {
            return 0;
        }
        int i2 = -m960w1(iMo34604m2, vjv0Var, zjv0Var);
        int i3 = i + i2;
        if (!z || (iMo34604m = i3 - this.f1165Q0.mo34604m()) <= 0) {
            return i2;
        }
        this.f1165Q0.mo34609r(-iMo34604m);
        return i2 - iMo34604m;
    }

    /* JADX INFO: renamed from: o1 */
    public final View m949o1() {
        return m1096H(this.f1168T0 ? 0 : m1097I() - 1);
    }

    /* JADX INFO: renamed from: p1 */
    public final View m950p1() {
        return m1096H(this.f1168T0 ? m1097I() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: q */
    public boolean mo951q() {
        return this.f1163O0 == 0;
    }

    /* JADX INFO: renamed from: q1 */
    public final boolean m952q1() {
        return m1106S() == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: r */
    public boolean mo953r() {
        return this.f1163O0 == 1;
    }

    /* JADX INFO: renamed from: r1 */
    public void mo912r1(vjv0 vjv0Var, zjv0 zjv0Var, el80 el80Var, dl80 dl80Var) {
        int paddingLeft;
        int i;
        int i2;
        int iMo34597f;
        View viewM39358b = el80Var.m39358b(vjv0Var);
        if (viewM39358b == null) {
            dl80Var.f50142b = true;
            return;
        }
        ojv0 ojv0Var = (ojv0) viewM39358b.getLayoutParams();
        if (el80Var.f60650k == null) {
            if (this.f1168T0 == (el80Var.f60645f == -1)) {
                m1114l(viewM39358b);
            } else {
                m1115m(viewM39358b, 0, false);
            }
        } else {
            if (this.f1168T0 == (el80Var.f60645f == -1)) {
                m1115m(viewM39358b, -1, true);
            } else {
                m1115m(viewM39358b, 0, true);
            }
        }
        mo1112d0(viewM39358b, 0);
        dl80Var.f50141a = this.f1165Q0.mo34596e(viewM39358b);
        if (this.f1163O0 == 1) {
            if (m952q1()) {
                iMo34597f = this.f1288M0 - getPaddingRight();
                paddingLeft = iMo34597f - this.f1165Q0.mo34597f(viewM39358b);
            } else {
                paddingLeft = getPaddingLeft();
                iMo34597f = this.f1165Q0.mo34597f(viewM39358b) + paddingLeft;
            }
            if (el80Var.f60645f == -1) {
                i = el80Var.f60641b;
                i2 = i - dl80Var.f50141a;
            } else {
                i2 = el80Var.f60641b;
                i = dl80Var.f50141a + i2;
            }
        } else {
            int paddingTop = getPaddingTop();
            int iMo34597f2 = this.f1165Q0.mo34597f(viewM39358b) + paddingTop;
            if (el80Var.f60645f == -1) {
                int i3 = el80Var.f60641b;
                int i4 = i3 - dl80Var.f50141a;
                iMo34597f = i3;
                i = iMo34597f2;
                paddingLeft = i4;
                i2 = paddingTop;
            } else {
                int i5 = el80Var.f60641b;
                int i6 = dl80Var.f50141a + i5;
                paddingLeft = i5;
                i = iMo34597f2;
                i2 = paddingTop;
                iMo34597f = i6;
            }
        }
        AbstractC0110a.m1086b0(viewM39358b, paddingLeft, i2, iMo34597f, i);
        if (ojv0Var.f166147a.m36330t() || ojv0Var.f166147a.m36333w()) {
            dl80Var.f50143c = true;
        }
        dl80Var.f50144d = viewM39358b.hasFocusable();
    }

    /* JADX INFO: renamed from: t1 */
    public final void m954t1(vjv0 vjv0Var, el80 el80Var) {
        if (!el80Var.f60640a || el80Var.f60651l) {
            return;
        }
        int i = el80Var.f60646g;
        int i2 = el80Var.f60648i;
        if (el80Var.f60645f == -1) {
            int iM1097I = m1097I();
            if (i < 0) {
                return;
            }
            int iMo34599h = (this.f1165Q0.mo34599h() - i) + i2;
            if (this.f1168T0) {
                for (int i3 = 0; i3 < iM1097I; i3++) {
                    View viewM1096H = m1096H(i3);
                    if (this.f1165Q0.mo34598g(viewM1096H) < iMo34599h || this.f1165Q0.mo34608q(viewM1096H) < iMo34599h) {
                        m956u1(vjv0Var, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM1097I - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM1096H2 = m1096H(i5);
                if (this.f1165Q0.mo34598g(viewM1096H2) < iMo34599h || this.f1165Q0.mo34608q(viewM1096H2) < iMo34599h) {
                    m956u1(vjv0Var, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM1097I2 = m1097I();
        if (!this.f1168T0) {
            for (int i7 = 0; i7 < iM1097I2; i7++) {
                View viewM1096H3 = m1096H(i7);
                if (this.f1165Q0.mo34595d(viewM1096H3) > i6 || this.f1165Q0.mo34607p(viewM1096H3) > i6) {
                    m956u1(vjv0Var, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM1097I2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM1096H4 = m1096H(i9);
            if (this.f1165Q0.mo34595d(viewM1096H4) > i6 || this.f1165Q0.mo34607p(viewM1096H4) > i6) {
                m956u1(vjv0Var, i8, i9);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: u */
    public final void mo955u(int i, int i2, zjv0 zjv0Var, gx8 gx8Var) {
        if (this.f1163O0 != 0) {
            i = i2;
        }
        if (m1097I() == 0 || i == 0) {
            return;
        }
        m934b1();
        m920A1(i > 0 ? 1 : -1, Math.abs(i), true, zjv0Var);
        mo902W0(zjv0Var, this.f1164P0, gx8Var);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:114:0x01ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:125:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:127:0x0202  */
    /* JADX WARN: Code duplicated, block: B:129:0x0209  */
    /* JADX WARN: Code duplicated, block: B:130:0x020f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0189  */
    /* JADX WARN: Code duplicated, block: B:98:0x019e  */
    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: u0 */
    public void mo915u0(vjv0 vjv0Var, zjv0 zjv0Var) {
        View focusedChild;
        int iM96246b;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z;
        boolean z2;
        View viewMo906l1;
        int iMo34598g;
        int iMo34595d;
        int iMo34604m;
        int iMo34600i;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        List list;
        int i4;
        int i5;
        int iM946m1;
        int i6;
        View viewMo923D;
        int iMo34598g2;
        int iMo34600i2;
        int i7;
        int i8 = -1;
        if (!(this.f1174Z0 == null && this.f1171W0 == -1) && zjv0Var.m96246b() == 0) {
            m1091C0(vjv0Var);
            return;
        }
        fl80 fl80Var = this.f1174Z0;
        if (fl80Var != null && (i7 = fl80Var.f70722a) >= 0) {
            this.f1171W0 = i7;
        }
        m934b1();
        this.f1164P0.f60640a = false;
        m958v1();
        RecyclerView recyclerView2 = this.f1294b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || this.f1293a.f205271c.contains(focusedChild)) {
            focusedChild = null;
        }
        njx njxVar = this.f1175a1;
        if (!njxVar.f154667e || this.f1171W0 != -1 || this.f1174Z0 != null) {
            njxVar.m64651g();
            njxVar.f154666d = this.f1168T0 ^ this.f1169U0;
            if (zjv0Var.f283550g || (i = this.f1171W0) == -1) {
                if (m1097I() != 0) {
                    recyclerView = this.f1294b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || this.f1293a.f205271c.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 == null && njx.m64645f(focusedChild2, zjv0Var)) {
                        njxVar.m64648c(focusedChild2, AbstractC0110a.m1083V(focusedChild2));
                    } else {
                        z = this.f1166R0;
                        z2 = this.f1169U0;
                        if (z == z2 || (viewMo906l1 = mo906l1(vjv0Var, zjv0Var, njxVar.f154666d, z2)) == null) {
                            njxVar.m64646a();
                            if (this.f1169U0) {
                                iM96246b = zjv0Var.m96246b() - 1;
                            } else {
                                iM96246b = 0;
                            }
                            njxVar.f154664b = iM96246b;
                        } else {
                            njxVar.m64647b(viewMo906l1, AbstractC0110a.m1083V(viewMo906l1));
                            if (!zjv0Var.f283550g && mo901U0()) {
                                iMo34598g = this.f1165Q0.mo34598g(viewMo906l1);
                                iMo34595d = this.f1165Q0.mo34595d(viewMo906l1);
                                iMo34604m = this.f1165Q0.mo34604m();
                                iMo34600i = this.f1165Q0.mo34600i();
                                if (iMo34595d <= iMo34604m || iMo34598g >= iMo34604m) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                                if (iMo34598g >= iMo34600i || iMo34595d <= iMo34600i) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                if (z3 || z4) {
                                    if (njxVar.f154666d) {
                                        iMo34604m = iMo34600i;
                                    }
                                    njxVar.f154665c = iMo34604m;
                                }
                            }
                        }
                    }
                } else {
                    njxVar.m64646a();
                    if (this.f1169U0) {
                        iM96246b = zjv0Var.m96246b() - 1;
                    } else {
                        iM96246b = 0;
                    }
                    njxVar.f154664b = iM96246b;
                }
            } else if (i < 0 || i >= zjv0Var.m96246b()) {
                this.f1171W0 = -1;
                this.f1172X0 = Integer.MIN_VALUE;
                if (m1097I() != 0) {
                    recyclerView = this.f1294b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 == null) {
                        z = this.f1166R0;
                        z2 = this.f1169U0;
                        if (z == z2) {
                            njxVar.m64646a();
                            if (this.f1169U0) {
                                iM96246b = zjv0Var.m96246b() - 1;
                            } else {
                                iM96246b = 0;
                            }
                            njxVar.f154664b = iM96246b;
                        } else {
                            njxVar.m64647b(viewMo906l1, AbstractC0110a.m1083V(viewMo906l1));
                            if (!zjv0Var.f283550g) {
                                iMo34598g = this.f1165Q0.mo34598g(viewMo906l1);
                                iMo34595d = this.f1165Q0.mo34595d(viewMo906l1);
                                iMo34604m = this.f1165Q0.mo34604m();
                                iMo34600i = this.f1165Q0.mo34600i();
                                if (iMo34595d <= iMo34604m) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (iMo34598g >= iMo34600i) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z3) {
                                    if (njxVar.f154666d) {
                                        iMo34604m = iMo34600i;
                                    }
                                    njxVar.f154665c = iMo34604m;
                                } else {
                                    if (njxVar.f154666d) {
                                        iMo34604m = iMo34600i;
                                    }
                                    njxVar.f154665c = iMo34604m;
                                }
                            }
                        }
                    } else {
                        z = this.f1166R0;
                        z2 = this.f1169U0;
                        if (z == z2) {
                            njxVar.m64646a();
                            if (this.f1169U0) {
                                iM96246b = zjv0Var.m96246b() - 1;
                            } else {
                                iM96246b = 0;
                            }
                            njxVar.f154664b = iM96246b;
                        } else {
                            njxVar.m64647b(viewMo906l1, AbstractC0110a.m1083V(viewMo906l1));
                            if (!zjv0Var.f283550g) {
                                iMo34598g = this.f1165Q0.mo34598g(viewMo906l1);
                                iMo34595d = this.f1165Q0.mo34595d(viewMo906l1);
                                iMo34604m = this.f1165Q0.mo34604m();
                                iMo34600i = this.f1165Q0.mo34600i();
                                if (iMo34595d <= iMo34604m) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (iMo34598g >= iMo34600i) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z3) {
                                    if (njxVar.f154666d) {
                                        iMo34604m = iMo34600i;
                                    }
                                    njxVar.f154665c = iMo34604m;
                                } else {
                                    if (njxVar.f154666d) {
                                        iMo34604m = iMo34600i;
                                    }
                                    njxVar.f154665c = iMo34604m;
                                }
                            }
                        }
                    }
                } else {
                    njxVar.m64646a();
                    if (this.f1169U0) {
                        iM96246b = zjv0Var.m96246b() - 1;
                    } else {
                        iM96246b = 0;
                    }
                    njxVar.f154664b = iM96246b;
                }
            } else {
                int i9 = this.f1171W0;
                njxVar.f154664b = i9;
                fl80 fl80Var2 = this.f1174Z0;
                if (fl80Var2 != null && fl80Var2.f70722a >= 0) {
                    boolean z5 = fl80Var2.f70724c;
                    njxVar.f154666d = z5;
                    if (z5) {
                        njxVar.f154665c = this.f1165Q0.mo34600i() - this.f1174Z0.f70723b;
                    } else {
                        njxVar.f154665c = this.f1165Q0.mo34604m() + this.f1174Z0.f70723b;
                    }
                } else if (this.f1172X0 == Integer.MIN_VALUE) {
                    View viewMo923D2 = mo923D(i9);
                    if (viewMo923D2 == null) {
                        if (m1097I() > 0) {
                            njxVar.f154666d = (this.f1171W0 < AbstractC0110a.m1083V(m1096H(0))) == this.f1168T0;
                        }
                        njxVar.m64646a();
                    } else if (this.f1165Q0.mo34596e(viewMo923D2) > this.f1165Q0.mo34605n()) {
                        njxVar.m64646a();
                    } else if (this.f1165Q0.mo34598g(viewMo923D2) - this.f1165Q0.mo34604m() < 0) {
                        njxVar.f154665c = this.f1165Q0.mo34604m();
                        njxVar.f154666d = false;
                    } else if (this.f1165Q0.mo34600i() - this.f1165Q0.mo34595d(viewMo923D2) < 0) {
                        njxVar.f154665c = this.f1165Q0.mo34600i();
                        njxVar.f154666d = true;
                    } else {
                        njxVar.f154665c = njxVar.f154666d ? this.f1165Q0.m34606o() + this.f1165Q0.mo34595d(viewMo923D2) : this.f1165Q0.mo34598g(viewMo923D2);
                    }
                } else {
                    boolean z6 = this.f1168T0;
                    njxVar.f154666d = z6;
                    if (z6) {
                        njxVar.f154665c = this.f1165Q0.mo34600i() - this.f1172X0;
                    } else {
                        njxVar.f154665c = this.f1165Q0.mo34604m() + this.f1172X0;
                    }
                }
            }
            njxVar.f154667e = true;
        } else if (focusedChild != null && (this.f1165Q0.mo34598g(focusedChild) >= this.f1165Q0.mo34600i() || this.f1165Q0.mo34595d(focusedChild) <= this.f1165Q0.mo34604m())) {
            njxVar.m64648c(focusedChild, AbstractC0110a.m1083V(focusedChild));
        }
        el80 el80Var = this.f1164P0;
        el80Var.f60645f = el80Var.f60649j >= 0 ? 1 : -1;
        int[] iArr = this.f1178d1;
        iArr[0] = 0;
        iArr[1] = 0;
        mo927V0(zjv0Var, iArr);
        int iMo34604m2 = this.f1165Q0.mo34604m() + Math.max(0, iArr[0]);
        int iMo34601j = this.f1165Q0.mo34601j() + Math.max(0, iArr[1]);
        if (zjv0Var.f283550g && (i6 = this.f1171W0) != -1 && this.f1172X0 != Integer.MIN_VALUE && (viewMo923D = mo923D(i6)) != null) {
            if (this.f1168T0) {
                iMo34600i2 = this.f1165Q0.mo34600i() - this.f1165Q0.mo34595d(viewMo923D);
                iMo34598g2 = this.f1172X0;
            } else {
                iMo34598g2 = this.f1165Q0.mo34598g(viewMo923D) - this.f1165Q0.mo34604m();
                iMo34600i2 = this.f1172X0;
            }
            int i10 = iMo34600i2 - iMo34598g2;
            if (i10 > 0) {
                iMo34604m2 += i10;
            } else {
                iMo34601j -= i10;
            }
        }
        if (!njxVar.f154666d ? !this.f1168T0 : this.f1168T0) {
            i8 = 1;
        }
        mo913s1(vjv0Var, zjv0Var, njxVar, i8);
        m1090C(vjv0Var);
        this.f1164P0.f60651l = this.f1165Q0.mo34602k() == 0 && this.f1165Q0.mo34599h() == 0;
        this.f1164P0.getClass();
        this.f1164P0.f60648i = 0;
        if (njxVar.f154666d) {
            m922C1(njxVar.f154664b, njxVar.f154665c);
            el80 el80Var2 = this.f1164P0;
            el80Var2.f60647h = iMo34604m2;
            m935c1(vjv0Var, el80Var2, zjv0Var, false);
            el80 el80Var3 = this.f1164P0;
            i3 = el80Var3.f60641b;
            int i11 = el80Var3.f60643d;
            int i12 = el80Var3.f60642c;
            if (i12 > 0) {
                iMo34601j += i12;
            }
            m921B1(njxVar.f154664b, njxVar.f154665c);
            el80 el80Var4 = this.f1164P0;
            el80Var4.f60647h = iMo34601j;
            el80Var4.f60643d += el80Var4.f60644e;
            m935c1(vjv0Var, el80Var4, zjv0Var, false);
            el80 el80Var5 = this.f1164P0;
            i2 = el80Var5.f60641b;
            int i13 = el80Var5.f60642c;
            if (i13 > 0) {
                m922C1(i11, i3);
                el80 el80Var6 = this.f1164P0;
                el80Var6.f60647h = i13;
                m935c1(vjv0Var, el80Var6, zjv0Var, false);
                i3 = this.f1164P0.f60641b;
            }
        } else {
            m921B1(njxVar.f154664b, njxVar.f154665c);
            el80 el80Var7 = this.f1164P0;
            el80Var7.f60647h = iMo34601j;
            m935c1(vjv0Var, el80Var7, zjv0Var, false);
            el80 el80Var8 = this.f1164P0;
            i2 = el80Var8.f60641b;
            int i14 = el80Var8.f60643d;
            int i15 = el80Var8.f60642c;
            if (i15 > 0) {
                iMo34604m2 += i15;
            }
            m922C1(njxVar.f154664b, njxVar.f154665c);
            el80 el80Var9 = this.f1164P0;
            el80Var9.f60647h = iMo34604m2;
            el80Var9.f60643d += el80Var9.f60644e;
            m935c1(vjv0Var, el80Var9, zjv0Var, false);
            el80 el80Var10 = this.f1164P0;
            int i16 = el80Var10.f60641b;
            int i17 = el80Var10.f60642c;
            if (i17 > 0) {
                m921B1(i14, i2);
                el80 el80Var11 = this.f1164P0;
                el80Var11.f60647h = i17;
                m935c1(vjv0Var, el80Var11, zjv0Var, false);
                i2 = this.f1164P0.f60641b;
            }
            i3 = i16;
        }
        if (m1097I() > 0) {
            if (this.f1168T0 ^ this.f1169U0) {
                int iM946m2 = m946m1(i2, vjv0Var, zjv0Var, true);
                i4 = i3 + iM946m2;
                i5 = i2 + iM946m2;
                iM946m1 = m948n1(i4, vjv0Var, zjv0Var, false);
            } else {
                int iM948n1 = m948n1(i3, vjv0Var, zjv0Var, true);
                i4 = i3 + iM948n1;
                i5 = i2 + iM948n1;
                iM946m1 = m946m1(i5, vjv0Var, zjv0Var, false);
            }
            i3 = i4 + iM946m1;
            i2 = i5 + iM946m1;
        }
        if (zjv0Var.f283554k && m1097I() != 0 && !zjv0Var.f283550g && mo901U0()) {
            List list2 = vjv0Var.f242063d;
            int size = list2.size();
            int iM1083V = AbstractC0110a.m1083V(m1096H(0));
            int iMo34596e = 0;
            int iMo34596e2 = 0;
            for (int i18 = 0; i18 < size; i18++) {
                dkv0 dkv0Var = (dkv0) list2.get(i18);
                boolean zM36330t = dkv0Var.m36330t();
                View view = dkv0Var.f50039a;
                if (!zM36330t) {
                    if ((dkv0Var.m36324n() < iM1083V) != this.f1168T0) {
                        iMo34596e += this.f1165Q0.mo34596e(view);
                    } else {
                        iMo34596e2 += this.f1165Q0.mo34596e(view);
                    }
                }
            }
            this.f1164P0.f60650k = list2;
            if (iMo34596e > 0) {
                m922C1(AbstractC0110a.m1083V(m950p1()), i3);
                el80 el80Var12 = this.f1164P0;
                el80Var12.f60647h = iMo34596e;
                el80Var12.f60642c = 0;
                el80Var12.m39357a(null);
                m935c1(vjv0Var, this.f1164P0, zjv0Var, false);
            }
            if (iMo34596e2 > 0) {
                m921B1(AbstractC0110a.m1083V(m949o1()), i2);
                el80 el80Var13 = this.f1164P0;
                el80Var13.f60647h = iMo34596e2;
                el80Var13.f60642c = 0;
                list = null;
                el80Var13.m39357a(null);
                m935c1(vjv0Var, this.f1164P0, zjv0Var, false);
            } else {
                list = null;
            }
            this.f1164P0.f60650k = list;
        }
        if (zjv0Var.f283550g) {
            njxVar.m64651g();
        } else {
            this.f1165Q0.m34610t();
        }
        this.f1166R0 = this.f1169U0;
    }

    /* JADX INFO: renamed from: u1 */
    public final void m956u1(vjv0 vjv0Var, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View viewM1096H = m1096H(i);
                if (m1096H(i) != null) {
                    this.f1293a.m77132f(i);
                }
                vjv0Var.m85786i(viewM1096H);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            View viewM1096H2 = m1096H(i3);
            if (m1096H(i3) != null) {
                this.f1293a.m77132f(i3);
            }
            vjv0Var.m85786i(viewM1096H2);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: v */
    public final void mo957v(int i, gx8 gx8Var) {
        boolean z;
        int i2;
        fl80 fl80Var = this.f1174Z0;
        if (fl80Var == null || (i2 = fl80Var.f70722a) < 0) {
            m958v1();
            z = this.f1168T0;
            i2 = this.f1171W0;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = fl80Var.f70724c;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f1177c1 && i2 >= 0 && i2 < i; i4++) {
            gx8Var.m46027a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: v0 */
    public void mo916v0(zjv0 zjv0Var) {
        this.f1174Z0 = null;
        this.f1171W0 = -1;
        this.f1172X0 = Integer.MIN_VALUE;
        this.f1175a1.m64651g();
    }

    /* JADX INFO: renamed from: v1 */
    public final void m958v1() {
        if (this.f1163O0 == 1 || !m952q1()) {
            this.f1168T0 = this.f1167S0;
        } else {
            this.f1168T0 = !this.f1167S0;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: w */
    public int mo959w(zjv0 zjv0Var) {
        return m928X0(zjv0Var);
    }

    /* JADX INFO: renamed from: w1 */
    public final int m960w1(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        if (m1097I() != 0 && i != 0) {
            m934b1();
            this.f1164P0.f60640a = true;
            int i2 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            m920A1(i2, iAbs, true, zjv0Var);
            el80 el80Var = this.f1164P0;
            int iM935c1 = m935c1(vjv0Var, el80Var, zjv0Var, false) + el80Var.f60646g;
            if (iM935c1 >= 0) {
                if (iAbs > iM935c1) {
                    i = i2 * iM935c1;
                }
                this.f1165Q0.mo34609r(-i);
                this.f1164P0.f60649j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: x */
    public int mo917x(zjv0 zjv0Var) {
        return m929Y0(zjv0Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: x0 */
    public void mo961x0(Parcelable parcelable) {
        if (parcelable instanceof fl80) {
            fl80 fl80Var = (fl80) parcelable;
            this.f1174Z0 = fl80Var;
            if (this.f1171W0 != -1) {
                fl80Var.f70722a = -1;
            }
            m1095G0();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void mo962x1(int i, int i2) {
        this.f1171W0 = i;
        this.f1172X0 = i2;
        fl80 fl80Var = this.f1174Z0;
        if (fl80Var != null) {
            fl80Var.f70722a = -1;
        }
        m1095G0();
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: y */
    public int mo918y(zjv0 zjv0Var) {
        return m931Z0(zjv0Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: y0 */
    public Parcelable mo963y0() {
        fl80 fl80Var = this.f1174Z0;
        if (fl80Var != null) {
            fl80 fl80Var2 = new fl80();
            fl80Var2.f70722a = fl80Var.f70722a;
            fl80Var2.f70723b = fl80Var.f70723b;
            fl80Var2.f70724c = fl80Var.f70724c;
            return fl80Var2;
        }
        fl80 fl80Var3 = new fl80();
        if (m1097I() <= 0) {
            fl80Var3.f70722a = -1;
            return fl80Var3;
        }
        m934b1();
        boolean z = this.f1166R0 ^ this.f1168T0;
        fl80Var3.f70724c = z;
        if (z) {
            View viewM949o1 = m949o1();
            fl80Var3.f70723b = this.f1165Q0.mo34600i() - this.f1165Q0.mo34595d(viewM949o1);
            fl80Var3.f70722a = AbstractC0110a.m1083V(viewM949o1);
            return fl80Var3;
        }
        View viewM950p1 = m950p1();
        fl80Var3.f70722a = AbstractC0110a.m1083V(viewM950p1);
        fl80Var3.f70723b = this.f1165Q0.mo34598g(viewM950p1) - this.f1165Q0.mo34604m();
        return fl80Var3;
    }

    /* JADX INFO: renamed from: y1 */
    public final void m964y1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(s571.m77246e(i, "invalid orientation:"));
        }
        mo947n(null);
        if (i != this.f1163O0 || this.f1165Q0 == null) {
            d180 d180VarM34594b = d180.m34594b(this, i);
            this.f1165Q0 = d180VarM34594b;
            this.f1175a1.f154668f = d180VarM34594b;
            this.f1163O0 = i;
            m1095G0();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: z */
    public int mo965z(zjv0 zjv0Var) {
        return m928X0(zjv0Var);
    }

    /* JADX INFO: renamed from: z1 */
    public void mo919z1(boolean z) {
        mo947n(null);
        if (this.f1169U0 == z) {
            return;
        }
        this.f1169U0 = z;
        m1095G0();
    }

    @SuppressLint({"UnknownNullness"})
    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1163O0 = 1;
        this.f1167S0 = false;
        this.f1168T0 = false;
        this.f1169U0 = false;
        this.f1170V0 = true;
        this.f1171W0 = -1;
        this.f1172X0 = Integer.MIN_VALUE;
        this.f1174Z0 = null;
        this.f1175a1 = new njx();
        this.f1176b1 = new dl80();
        this.f1177c1 = 2;
        this.f1178d1 = new int[2];
        h7c h7cVarM1084W = AbstractC0110a.m1084W(context, attributeSet, i, i2);
        m964y1(h7cVarM1084W.f88401a);
        boolean z = h7cVarM1084W.f88403c;
        mo947n(null);
        if (z != this.f1167S0) {
            this.f1167S0 = z;
            m1095G0();
        }
        mo919z1(h7cVarM1084W.f88404d);
    }

    /* JADX INFO: renamed from: s1 */
    public void mo913s1(vjv0 vjv0Var, zjv0 zjv0Var, njx njxVar, int i) {
    }
}
