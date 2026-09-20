package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import p204p.cjs0;
import p204p.d180;
import p204p.edb;
import p204p.g9g1;
import p204p.gx8;
import p204p.h7c;
import p204p.hjv0;
import p204p.il80;
import p204p.nr21;
import p204p.ojv0;
import p204p.qh41;
import p204p.rh41;
import p204p.sh41;
import p204p.th41;
import p204p.vjv0;
import p204p.wq70;
import p204p.y3z0;
import p204p.yjv0;
import p204p.zjv0;

/* JADX INFO: loaded from: classes3.dex */
public class StaggeredGridLayoutManager extends AbstractC0110a implements yjv0 {

    /* JADX INFO: renamed from: O0 */
    public int f1265O0;

    /* JADX INFO: renamed from: P0 */
    public nr21[] f1266P0;

    /* JADX INFO: renamed from: Q0 */
    public final d180 f1267Q0;

    /* JADX INFO: renamed from: R0 */
    public final d180 f1268R0;

    /* JADX INFO: renamed from: S0 */
    public final int f1269S0;

    /* JADX INFO: renamed from: T0 */
    public int f1270T0;

    /* JADX INFO: renamed from: U0 */
    public final wq70 f1271U0;

    /* JADX INFO: renamed from: V0 */
    public boolean f1272V0;

    /* JADX INFO: renamed from: W0 */
    public boolean f1273W0;

    /* JADX INFO: renamed from: X0 */
    public BitSet f1274X0;

    /* JADX INFO: renamed from: Y0 */
    public int f1275Y0;

    /* JADX INFO: renamed from: Z0 */
    public int f1276Z0;

    /* JADX INFO: renamed from: a1 */
    public final y3z0 f1277a1;

    /* JADX INFO: renamed from: b1 */
    public final int f1278b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f1279c1;

    /* JADX INFO: renamed from: d1 */
    public boolean f1280d1;

    /* JADX INFO: renamed from: e1 */
    public th41 f1281e1;

    /* JADX INFO: renamed from: f1 */
    public final Rect f1282f1;

    /* JADX INFO: renamed from: g1 */
    public final qh41 f1283g1;

    /* JADX INFO: renamed from: h1 */
    public final boolean f1284h1;

    /* JADX INFO: renamed from: i1 */
    public int[] f1285i1;

    /* JADX INFO: renamed from: j1 */
    public final cjs0 f1286j1;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1265O0 = -1;
        this.f1272V0 = false;
        this.f1273W0 = false;
        this.f1275Y0 = -1;
        this.f1276Z0 = Integer.MIN_VALUE;
        this.f1277a1 = new y3z0(26);
        this.f1278b1 = 2;
        this.f1282f1 = new Rect();
        this.f1283g1 = new qh41(this);
        this.f1284h1 = true;
        this.f1286j1 = new cjs0(this, 24);
        h7c h7cVarM1084W = AbstractC0110a.m1084W(context, attributeSet, i, i2);
        int i3 = h7cVarM1084W.f88401a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo947n(null);
        if (i3 != this.f1269S0) {
            this.f1269S0 = i3;
            d180 d180Var = this.f1267Q0;
            this.f1267Q0 = this.f1268R0;
            this.f1268R0 = d180Var;
            m1095G0();
        }
        m1073v1(h7cVarM1084W.f88402b);
        boolean z = h7cVarM1084W.f88403c;
        mo947n(null);
        th41 th41Var = this.f1281e1;
        if (th41Var != null && th41Var.f220328h != z) {
            th41Var.f220328h = z;
        }
        this.f1272V0 = z;
        m1095G0();
        this.f1271U0 = new wq70();
        this.f1267Q0 = d180.m34594b(this, this.f1269S0);
        this.f1268R0 = d180.m34594b(this, 1 - this.f1269S0);
    }

    /* JADX INFO: renamed from: y1 */
    public static int m1043y1(int i, int i2, int i3) {
        int mode;
        return (!(i2 == 0 && i3 == 0) && ((mode = View.MeasureSpec.getMode(i)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: A */
    public final int mo883A(zjv0 zjv0Var) {
        return m1045W0(zjv0Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: B */
    public final int mo884B(zjv0 zjv0Var) {
        if (m1097I() == 0) {
            return 0;
        }
        boolean z = !this.f1284h1;
        return g9g1.m44032h(zjv0Var, this.f1267Q0, m1048Z0(z), m1047Y0(z), this, this.f1284h1);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: E */
    public final ojv0 mo886E() {
        return this.f1269S0 == 0 ? new rh41(-2, -1) : new rh41(-1, -2);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: F */
    public final ojv0 mo888F(Context context, AttributeSet attributeSet) {
        return new rh41(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: G */
    public final ojv0 mo890G(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new rh41((ViewGroup.MarginLayoutParams) layoutParams) : new rh41(layoutParams);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: H0 */
    public final int mo892H0(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        return m1071t1(i, vjv0Var, zjv0Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: I0 */
    public final void mo924I0(int i) {
        th41 th41Var = this.f1281e1;
        if (th41Var != null && th41Var.f220321a != i) {
            th41Var.f220324d = null;
            th41Var.f220323c = 0;
            th41Var.f220321a = -1;
            th41Var.f220322b = -1;
        }
        this.f1275Y0 = i;
        this.f1276Z0 = Integer.MIN_VALUE;
        m1095G0();
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: J0 */
    public final int mo895J0(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        return m1071t1(i, vjv0Var, zjv0Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: M0 */
    public final void mo900M0(int i, int i2, Rect rect) {
        int iM1087t;
        int iM1087t2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f1269S0 == 1) {
            iM1087t2 = AbstractC0110a.m1087t(i2, rect.height() + paddingBottom, m1107T());
            iM1087t = AbstractC0110a.m1087t(i, (this.f1270T0 * this.f1265O0) + paddingRight, m1109U());
        } else {
            iM1087t = AbstractC0110a.m1087t(i, rect.width() + paddingRight, m1109U());
            iM1087t2 = AbstractC0110a.m1087t(i2, (this.f1270T0 * this.f1265O0) + paddingBottom, m1107T());
        }
        this.f1294b.setMeasuredDimension(iM1087t, iM1087t2);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: S0 */
    public final void mo926S0(RecyclerView recyclerView, zjv0 zjv0Var, int i) {
        il80 il80Var = new il80(recyclerView.getContext());
        il80Var.f103318a = i;
        m1108T0(il80Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: U0 */
    public final boolean mo901U0() {
        return this.f1281e1 == null;
    }

    /* JADX INFO: renamed from: V0 */
    public final boolean m1044V0() {
        int iM1052d1;
        if (m1097I() != 0 && this.f1278b1 != 0 && this.f1299g) {
            if (this.f1273W0) {
                iM1052d1 = m1054e1();
                m1052d1();
            } else {
                iM1052d1 = m1052d1();
                m1054e1();
            }
            if (iM1052d1 == 0 && m1061j1() != null) {
                this.f1277a1.m92775b();
                this.f1298f = true;
                m1095G0();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: W0 */
    public final int m1045W0(zjv0 zjv0Var) {
        if (m1097I() == 0) {
            return 0;
        }
        boolean z = !this.f1284h1;
        return g9g1.m44031g(zjv0Var, this.f1267Q0, m1048Z0(z), m1047Y0(z), this, this.f1284h1, this.f1273W0);
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    /* JADX INFO: renamed from: X0 */
    public final int m1046X0(vjv0 vjv0Var, wq70 wq70Var, zjv0 zjv0Var) {
        nr21 nr21Var;
        ?? r6;
        int iM65467j;
        int iMo34596e;
        int iMo34604m;
        int iMo34596e2;
        int i;
        int i2;
        int i3 = 0;
        int i4 = 1;
        this.f1274X0.set(0, this.f1265O0, true);
        wq70 wq70Var2 = this.f1271U0;
        int i5 = wq70Var2.f253947i ? wq70Var.f253943e == 1 ? Alert.DURATION_SHOW_INDEFINITELY : Integer.MIN_VALUE : wq70Var.f253943e == 1 ? wq70Var.f253945g + wq70Var.f253940b : wq70Var.f253944f - wq70Var.f253940b;
        int i6 = wq70Var.f253943e;
        for (int i7 = 0; i7 < this.f1265O0; i7++) {
            if (!this.f1266P0[i7].f157429a.isEmpty()) {
                m1075x1(this.f1266P0[i7], i6, i5);
            }
        }
        int iMo34600i = this.f1273W0 ? this.f1267Q0.mo34600i() : this.f1267Q0.mo34604m();
        boolean z = false;
        while (true) {
            int i8 = wq70Var.f253941c;
            int i9 = -1;
            if (i8 < 0 || i8 >= zjv0Var.m96246b() || (!wq70Var2.f253947i && this.f1274X0.isEmpty())) {
                break;
            }
            View viewM85781d = vjv0Var.m85781d(wq70Var.f253941c);
            wq70Var.f253941c += wq70Var.f253942d;
            rh41 rh41Var = (rh41) viewM85781d.getLayoutParams();
            int iM36324n = rh41Var.f166147a.m36324n();
            y3z0 y3z0Var = this.f1277a1;
            int[] iArr = (int[]) y3z0Var.f269039b;
            int i10 = (iArr == null || iM36324n >= iArr.length) ? -1 : iArr[iM36324n];
            if (i10 == -1) {
                if (m1065n1(wq70Var.f253943e)) {
                    i = this.f1265O0 - i4;
                    i2 = -1;
                } else {
                    i9 = this.f1265O0;
                    i = i3;
                    i2 = i4;
                }
                nr21 nr21Var2 = null;
                if (wq70Var.f253943e == i4) {
                    int iMo34604m2 = this.f1267Q0.mo34604m();
                    int i11 = Alert.DURATION_SHOW_INDEFINITELY;
                    while (i != i9) {
                        nr21 nr21Var3 = this.f1266P0[i];
                        int i12 = i;
                        int iM65464g = nr21Var3.m65464g(iMo34604m2);
                        if (iM65464g < i11) {
                            nr21Var2 = nr21Var3;
                            i11 = iM65464g;
                        }
                        i = i12 + i2;
                    }
                } else {
                    int iMo34600i2 = this.f1267Q0.mo34600i();
                    int i13 = Integer.MIN_VALUE;
                    while (i != i9) {
                        nr21 nr21Var4 = this.f1266P0[i];
                        int i14 = i;
                        int iM65467j2 = nr21Var4.m65467j(iMo34600i2);
                        if (iM65467j2 > i13) {
                            nr21Var2 = nr21Var4;
                            i13 = iM65467j2;
                        }
                        i = i14 + i2;
                    }
                }
                nr21Var = nr21Var2;
                y3z0Var.m92776c(iM36324n);
                ((int[]) y3z0Var.f269039b)[iM36324n] = nr21Var.f157433e;
            } else {
                nr21Var = this.f1266P0[i10];
            }
            rh41Var.f199107e = nr21Var;
            if (wq70Var.f253943e == 1) {
                m1114l(viewM85781d);
                r6 = 0;
            } else {
                r6 = 0;
                m1115m(viewM85781d, 0, false);
            }
            if (this.f1269S0 == 1) {
                m1063l1(viewM85781d, AbstractC0110a.m1077J(r6, this.f1270T0, this.f1292Z, r6, ((ViewGroup.MarginLayoutParams) rh41Var).width), AbstractC0110a.m1077J(true, this.f1289N0, this.f1287L0, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) rh41Var).height));
            } else {
                m1063l1(viewM85781d, AbstractC0110a.m1077J(true, this.f1288M0, this.f1292Z, getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) rh41Var).width), AbstractC0110a.m1077J(false, this.f1270T0, this.f1287L0, 0, ((ViewGroup.MarginLayoutParams) rh41Var).height));
            }
            if (wq70Var.f253943e == 1) {
                iMo34596e = nr21Var.m65464g(iMo34600i);
                iM65467j = this.f1267Q0.mo34596e(viewM85781d) + iMo34596e;
            } else {
                iM65467j = nr21Var.m65467j(iMo34600i);
                iMo34596e = iM65467j - this.f1267Q0.mo34596e(viewM85781d);
            }
            if (wq70Var.f253943e == 1) {
                nr21 nr21Var5 = rh41Var.f199107e;
                nr21Var5.getClass();
                rh41 rh41Var2 = (rh41) viewM85781d.getLayoutParams();
                rh41Var2.f199107e = nr21Var5;
                ArrayList arrayList = nr21Var5.f157429a;
                arrayList.add(viewM85781d);
                nr21Var5.f157431c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    nr21Var5.f157430b = Integer.MIN_VALUE;
                }
                if (rh41Var2.f166147a.m36330t() || rh41Var2.f166147a.m36333w()) {
                    nr21Var5.f157432d = ((StaggeredGridLayoutManager) nr21Var5.f157434f).f1267Q0.mo34596e(viewM85781d) + nr21Var5.f157432d;
                }
            } else {
                nr21 nr21Var6 = rh41Var.f199107e;
                nr21Var6.getClass();
                rh41 rh41Var3 = (rh41) viewM85781d.getLayoutParams();
                rh41Var3.f199107e = nr21Var6;
                ArrayList arrayList2 = nr21Var6.f157429a;
                arrayList2.add(0, viewM85781d);
                nr21Var6.f157430b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    nr21Var6.f157431c = Integer.MIN_VALUE;
                }
                if (rh41Var3.f166147a.m36330t() || rh41Var3.f166147a.m36333w()) {
                    nr21Var6.f157432d = ((StaggeredGridLayoutManager) nr21Var6.f157434f).f1267Q0.mo34596e(viewM85781d) + nr21Var6.f157432d;
                }
            }
            if (m1062k1() && this.f1269S0 == 1) {
                iMo34596e2 = this.f1268R0.mo34600i() - (((this.f1265O0 - 1) - nr21Var.f157433e) * this.f1270T0);
                iMo34604m = iMo34596e2 - this.f1268R0.mo34596e(viewM85781d);
            } else {
                iMo34604m = this.f1268R0.mo34604m() + (nr21Var.f157433e * this.f1270T0);
                iMo34596e2 = this.f1268R0.mo34596e(viewM85781d) + iMo34604m;
            }
            if (this.f1269S0 == 1) {
                AbstractC0110a.m1086b0(viewM85781d, iMo34604m, iMo34596e, iMo34596e2, iM65467j);
            } else {
                AbstractC0110a.m1086b0(viewM85781d, iMo34596e, iMo34604m, iM65467j, iMo34596e2);
            }
            m1075x1(nr21Var, wq70Var2.f253943e, i5);
            m1067p1(vjv0Var, wq70Var2);
            if (wq70Var2.f253946h && viewM85781d.hasFocusable()) {
                this.f1274X0.set(nr21Var.f157433e, false);
            }
            i4 = 1;
            z = true;
            i3 = 0;
        }
        if (!z) {
            m1067p1(vjv0Var, wq70Var2);
        }
        int iMo34604m3 = wq70Var2.f253943e == -1 ? this.f1267Q0.mo34604m() - m1058g1(this.f1267Q0.mo34604m()) : m1056f1(this.f1267Q0.mo34600i()) - this.f1267Q0.mo34600i();
        if (iMo34604m3 > 0) {
            return Math.min(wq70Var.f253940b, iMo34604m3);
        }
        return 0;
    }

    /* JADX INFO: renamed from: Y0 */
    public final View m1047Y0(boolean z) {
        int iMo34604m = this.f1267Q0.mo34604m();
        int iMo34600i = this.f1267Q0.mo34600i();
        View view = null;
        for (int iM1097I = m1097I() - 1; iM1097I >= 0; iM1097I--) {
            View viewM1096H = m1096H(iM1097I);
            int iMo34598g = this.f1267Q0.mo34598g(viewM1096H);
            int iMo34595d = this.f1267Q0.mo34595d(viewM1096H);
            if (iMo34595d > iMo34604m && iMo34598g < iMo34600i) {
                if (iMo34595d <= iMo34600i || !z) {
                    return viewM1096H;
                }
                if (view == null) {
                    view = viewM1096H;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: Z */
    public final boolean mo930Z() {
        return this.f1278b1 != 0;
    }

    /* JADX INFO: renamed from: Z0 */
    public final View m1048Z0(boolean z) {
        int iMo34604m = this.f1267Q0.mo34604m();
        int iMo34600i = this.f1267Q0.mo34600i();
        int iM1097I = m1097I();
        View view = null;
        for (int i = 0; i < iM1097I; i++) {
            View viewM1096H = m1096H(i);
            int iMo34598g = this.f1267Q0.mo34598g(viewM1096H);
            if (this.f1267Q0.mo34595d(viewM1096H) > iMo34604m && iMo34598g < iMo34600i) {
                if (iMo34598g >= iMo34604m || !z) {
                    return viewM1096H;
                }
                if (view == null) {
                    view = viewM1096H;
                }
            }
        }
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // p204p.yjv0
    /* JADX INFO: renamed from: a */
    public final PointF mo932a(int i) {
        int i2 = -1;
        if (m1097I() != 0) {
            if ((i < m1052d1()) == this.f1273W0) {
                i2 = 1;
            }
        } else if (this.f1273W0) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        if (i2 == 0) {
            return null;
        }
        if (this.f1269S0 == 0) {
            pointF.x = i2;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = i2;
        return pointF;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m1049a1(int[] iArr) {
        if (iArr.length < this.f1265O0) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f1265O0 + ", array size:" + iArr.length);
        }
        for (int i = 0; i < this.f1265O0; i++) {
            nr21 nr21Var = this.f1266P0[i];
            ArrayList arrayList = nr21Var.f157429a;
            iArr[i] = ((StaggeredGridLayoutManager) nr21Var.f157434f).f1272V0 ? nr21Var.m65463f(arrayList.size() - 1, -1, true, false) : nr21Var.m65463f(0, arrayList.size(), true, false);
        }
    }

    /* JADX INFO: renamed from: b1 */
    public final void m1050b1(vjv0 vjv0Var, zjv0 zjv0Var, boolean z) {
        int iMo34600i;
        int iM1056f1 = m1056f1(Integer.MIN_VALUE);
        if (iM1056f1 != Integer.MIN_VALUE && (iMo34600i = this.f1267Q0.mo34600i() - iM1056f1) > 0) {
            int i = iMo34600i - (-m1071t1(-iMo34600i, vjv0Var, zjv0Var));
            if (!z || i <= 0) {
                return;
            }
            this.f1267Q0.mo34609r(i);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final void m1051c1(vjv0 vjv0Var, zjv0 zjv0Var, boolean z) {
        int iMo34604m;
        int iM1058g1 = m1058g1(Alert.DURATION_SHOW_INDEFINITELY);
        if (iM1058g1 != Integer.MAX_VALUE && (iMo34604m = iM1058g1 - this.f1267Q0.mo34604m()) > 0) {
            int iM1071t1 = iMo34604m - m1071t1(iMo34604m, vjv0Var, zjv0Var);
            if (!z || iM1071t1 <= 0) {
                return;
            }
            this.f1267Q0.mo34609r(-iM1071t1);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final int m1052d1() {
        if (m1097I() == 0) {
            return 0;
        }
        return AbstractC0110a.m1083V(m1096H(0));
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: e0 */
    public final void mo1053e0(int i) {
        super.mo1053e0(i);
        for (int i2 = 0; i2 < this.f1265O0; i2++) {
            nr21 nr21Var = this.f1266P0[i2];
            int i3 = nr21Var.f157430b;
            if (i3 != Integer.MIN_VALUE) {
                nr21Var.f157430b = i3 + i;
            }
            int i4 = nr21Var.f157431c;
            if (i4 != Integer.MIN_VALUE) {
                nr21Var.f157431c = i4 + i;
            }
        }
    }

    /* JADX INFO: renamed from: e1 */
    public final int m1054e1() {
        int iM1097I = m1097I();
        if (iM1097I == 0) {
            return 0;
        }
        return AbstractC0110a.m1083V(m1096H(iM1097I - 1));
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: f0 */
    public final void mo1055f0(int i) {
        super.mo1055f0(i);
        for (int i2 = 0; i2 < this.f1265O0; i2++) {
            nr21 nr21Var = this.f1266P0[i2];
            int i3 = nr21Var.f157430b;
            if (i3 != Integer.MIN_VALUE) {
                nr21Var.f157430b = i3 + i;
            }
            int i4 = nr21Var.f157431c;
            if (i4 != Integer.MIN_VALUE) {
                nr21Var.f157431c = i4 + i;
            }
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final int m1056f1(int i) {
        int iM65464g = this.f1266P0[0].m65464g(i);
        for (int i2 = 1; i2 < this.f1265O0; i2++) {
            int iM65464g2 = this.f1266P0[i2].m65464g(i);
            if (iM65464g2 > iM65464g) {
                iM65464g = iM65464g2;
            }
        }
        return iM65464g;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: g0 */
    public void mo1057g0(hjv0 hjv0Var, hjv0 hjv0Var2) {
        this.f1277a1.m92775b();
        for (int i = 0; i < this.f1265O0; i++) {
            this.f1266P0[i].m65460c();
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final int m1058g1(int i) {
        int iM65467j = this.f1266P0[0].m65467j(i);
        for (int i2 = 1; i2 < this.f1265O0; i2++) {
            int iM65467j2 = this.f1266P0[i2].m65467j(i);
            if (iM65467j2 < iM65467j) {
                iM65467j = iM65467j2;
            }
        }
        return iM65467j;
    }

    /* JADX INFO: renamed from: h1 */
    public final int m1059h1() {
        return this.f1265O0;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: i0 */
    public void mo941i0(RecyclerView recyclerView, vjv0 vjv0Var) {
        RecyclerView recyclerView2 = this.f1294b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f1286j1);
        }
        for (int i = 0; i < this.f1265O0; i++) {
            this.f1266P0[i].m65460c();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0039  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050 A[LOOP:0: B:25:0x003f->B:29:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[EDGE_INSN: B:30:0x0053->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077 A[LOOP:1: B:34:0x0066->B:38:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:63:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0054 A[EDGE_INSN: B:64:0x0054->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x007b A[EDGE_INSN: B:66:0x007b->B:40:0x007b BREAK  A[LOOP:1: B:34:0x0066->B:38:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: i1 */
    public final void m1060i1(int i, int i2, int i3) {
        int i4;
        int i5;
        y3z0 y3z0Var;
        int[] iArr;
        int iM1054e1;
        ArrayList arrayList;
        sh41 sh41Var;
        int size;
        int i6;
        int i7;
        int size2;
        int iM1054e2 = this.f1273W0 ? m1054e1() : m1052d1();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            y3z0Var = this.f1277a1;
            iArr = (int[]) y3z0Var.f269039b;
            if (iArr != null && i5 < iArr.length) {
                arrayList = (ArrayList) y3z0Var.f269040c;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                sh41Var = null;
                                break;
                            }
                            sh41Var = (sh41) ((ArrayList) y3z0Var.f269040c).get(size2);
                            if (sh41Var.f209092a == i5) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        sh41Var = null;
                        break;
                    }
                    if (sh41Var != null) {
                        ((ArrayList) y3z0Var.f269040c).remove(sh41Var);
                    }
                    size = ((ArrayList) y3z0Var.f269040c).size();
                    i6 = 0;
                    while (true) {
                        if (i6 < size) {
                            i6 = -1;
                            break;
                        } else if (((sh41) ((ArrayList) y3z0Var.f269040c).get(i6)).f209092a >= i5) {
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (i6 != -1) {
                        sh41 sh41Var2 = (sh41) ((ArrayList) y3z0Var.f269040c).get(i6);
                        ((ArrayList) y3z0Var.f269040c).remove(i6);
                        i7 = sh41Var2.f209092a;
                    } else {
                        i7 = -1;
                    }
                } else {
                    i7 = -1;
                }
                if (i7 == -1) {
                    int[] iArr2 = (int[]) y3z0Var.f269039b;
                    Arrays.fill(iArr2, i5, iArr2.length, -1);
                    int length = ((int[]) y3z0Var.f269039b).length;
                } else {
                    Arrays.fill((int[]) y3z0Var.f269039b, i5, Math.min(i7 + 1, ((int[]) y3z0Var.f269039b).length), -1);
                }
            }
            if (i3 != 1) {
                y3z0Var.m92779i(i, i2);
            } else if (i3 != 2) {
                y3z0Var.m92780j(i, i2);
            } else if (i3 == 8) {
                y3z0Var.m92780j(i, 1);
                y3z0Var.m92779i(i2, 1);
            }
            if (i4 <= iM1054e2) {
                return;
            }
            if (this.f1273W0) {
                iM1054e1 = m1052d1();
            } else {
                iM1054e1 = m1054e1();
            }
            if (i5 <= iM1054e1) {
                m1095G0();
            }
        }
        i4 = i + i2;
        i5 = i;
        y3z0Var = this.f1277a1;
        iArr = (int[]) y3z0Var.f269039b;
        if (iArr != null) {
            arrayList = (ArrayList) y3z0Var.f269040c;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            sh41Var = null;
                            break;
                        }
                        sh41Var = (sh41) ((ArrayList) y3z0Var.f269040c).get(size2);
                        if (sh41Var.f209092a == i5) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    sh41Var = null;
                    break;
                }
                if (sh41Var != null) {
                    ((ArrayList) y3z0Var.f269040c).remove(sh41Var);
                }
                size = ((ArrayList) y3z0Var.f269040c).size();
                i6 = 0;
                while (true) {
                    if (i6 < size) {
                        i6 = -1;
                        break;
                    } else {
                        if (((sh41) ((ArrayList) y3z0Var.f269040c).get(i6)).f209092a >= i5) {
                            break;
                            break;
                        }
                        i6++;
                    }
                }
                if (i6 != -1) {
                    sh41 sh41Var3 = (sh41) ((ArrayList) y3z0Var.f269040c).get(i6);
                    ((ArrayList) y3z0Var.f269040c).remove(i6);
                    i7 = sh41Var3.f209092a;
                } else {
                    i7 = -1;
                }
            } else {
                i7 = -1;
            }
            if (i7 == -1) {
                int[] iArr3 = (int[]) y3z0Var.f269039b;
                Arrays.fill(iArr3, i5, iArr3.length, -1);
                int length2 = ((int[]) y3z0Var.f269039b).length;
            } else {
                Arrays.fill((int[]) y3z0Var.f269039b, i5, Math.min(i7 + 1, ((int[]) y3z0Var.f269039b).length), -1);
            }
        }
        if (i3 != 1) {
            y3z0Var.m92779i(i, i2);
        } else if (i3 != 2) {
            y3z0Var.m92780j(i, i2);
        } else if (i3 == 8) {
            y3z0Var.m92780j(i, 1);
            y3z0Var.m92779i(i2, 1);
        }
        if (i4 <= iM1054e2) {
            return;
        }
        if (this.f1273W0) {
            iM1054e1 = m1052d1();
        } else {
            iM1054e1 = m1054e1();
        }
        if (i5 <= iM1054e1) {
            m1095G0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0046  */
    /* JADX WARN: Code duplicated, block: B:37:0x0051  */
    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: j0 */
    public final View mo904j0(View view, int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        View viewM990I;
        int i2;
        if (m1097I() != 0) {
            RecyclerView recyclerView = this.f1294b;
            if (recyclerView == null || (viewM990I = recyclerView.m990I(view)) == null || this.f1293a.f205271c.contains(viewM990I)) {
                viewM990I = null;
            }
            if (viewM990I != null) {
                m1070s1();
                if (i != 1) {
                    if (i != 2) {
                        if (i != 17) {
                            if (i != 33) {
                                if (i == 66 ? this.f1269S0 == 0 : !(i != 130 || this.f1269S0 != 1)) {
                                    i2 = 1;
                                }
                            } else if (this.f1269S0 == 1) {
                                i2 = -1;
                            }
                            i2 = Integer.MIN_VALUE;
                        } else if (this.f1269S0 == 0) {
                            i2 = -1;
                        } else {
                            i2 = Integer.MIN_VALUE;
                        }
                    } else if (this.f1269S0 != 1 && m1062k1()) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                } else if (this.f1269S0 != 1 && m1062k1()) {
                    i2 = 1;
                } else {
                    i2 = -1;
                }
                if (i2 != Integer.MIN_VALUE) {
                    rh41 rh41Var = (rh41) viewM990I.getLayoutParams();
                    rh41Var.getClass();
                    nr21 nr21Var = rh41Var.f199107e;
                    int iM1054e1 = i2 == 1 ? m1054e1() : m1052d1();
                    m1074w1(iM1054e1, zjv0Var);
                    m1072u1(i2);
                    wq70 wq70Var = this.f1271U0;
                    wq70Var.f253941c = wq70Var.f253942d + iM1054e1;
                    wq70Var.f253940b = (int) (this.f1267Q0.mo34605n() * 0.33333334f);
                    wq70Var.f253946h = true;
                    wq70Var.f253939a = false;
                    m1046X0(vjv0Var, wq70Var, zjv0Var);
                    this.f1279c1 = this.f1273W0;
                    View viewM65465h = nr21Var.m65465h(iM1054e1, i2);
                    if (viewM65465h != null && viewM65465h != viewM990I) {
                        return viewM65465h;
                    }
                    if (m1065n1(i2)) {
                        for (int i3 = this.f1265O0 - 1; i3 >= 0; i3--) {
                            View viewM65465h2 = this.f1266P0[i3].m65465h(iM1054e1, i2);
                            if (viewM65465h2 != null && viewM65465h2 != viewM990I) {
                                return viewM65465h2;
                            }
                        }
                    } else {
                        for (int i4 = 0; i4 < this.f1265O0; i4++) {
                            View viewM65465h3 = this.f1266P0[i4].m65465h(iM1054e1, i2);
                            if (viewM65465h3 != null && viewM65465h3 != viewM990I) {
                                return viewM65465h3;
                            }
                        }
                    }
                    boolean z = (this.f1272V0 ^ true) == (i2 == -1);
                    View viewMo923D = mo923D(z ? nr21Var.m65461d() : nr21Var.m65462e());
                    if (viewMo923D != null && viewMo923D != viewM990I) {
                        return viewMo923D;
                    }
                    if (m1065n1(i2)) {
                        for (int i5 = this.f1265O0 - 1; i5 >= 0; i5--) {
                            if (i5 != nr21Var.f157433e) {
                                View viewMo923D2 = mo923D(z ? this.f1266P0[i5].m65461d() : this.f1266P0[i5].m65462e());
                                if (viewMo923D2 != null && viewMo923D2 != viewM990I) {
                                    return viewMo923D2;
                                }
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < this.f1265O0; i6++) {
                            View viewMo923D3 = mo923D(z ? this.f1266P0[i6].m65461d() : this.f1266P0[i6].m65462e());
                            if (viewMo923D3 != null && viewMo923D3 != viewM990I) {
                                return viewMo923D3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    /* JADX INFO: renamed from: j1 */
    public final View m1061j1() {
        boolean z;
        boolean z2;
        int iM1097I = m1097I();
        int i = iM1097I - 1;
        BitSet bitSet = new BitSet(this.f1265O0);
        bitSet.set(0, this.f1265O0, true);
        byte b = (this.f1269S0 == 1 && m1062k1()) ? (byte) 1 : (byte) -1;
        if (this.f1273W0) {
            iM1097I = -1;
        } else {
            i = 0;
        }
        int i2 = i < iM1097I ? 1 : -1;
        while (i != iM1097I) {
            View viewM1096H = m1096H(i);
            rh41 rh41Var = (rh41) viewM1096H.getLayoutParams();
            if (bitSet.get(rh41Var.f199107e.f157433e)) {
                nr21 nr21Var = rh41Var.f199107e;
                if (this.f1273W0) {
                    int i3 = nr21Var.f157431c;
                    if (i3 == Integer.MIN_VALUE) {
                        nr21Var.m65459b();
                        i3 = nr21Var.f157431c;
                    }
                    if (i3 < this.f1267Q0.mo34600i()) {
                        ((rh41) ((View) edb.m38559h(1, nr21Var.f157429a)).getLayoutParams()).getClass();
                        return viewM1096H;
                    }
                } else {
                    int i4 = nr21Var.f157430b;
                    ArrayList arrayList = nr21Var.f157429a;
                    if (i4 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        rh41 rh41Var2 = (rh41) view.getLayoutParams();
                        nr21Var.f157430b = ((StaggeredGridLayoutManager) nr21Var.f157434f).f1267Q0.mo34598g(view);
                        rh41Var2.getClass();
                        i4 = nr21Var.f157430b;
                    }
                    if (i4 > this.f1267Q0.mo34604m()) {
                        ((rh41) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return viewM1096H;
                    }
                }
                bitSet.clear(rh41Var.f199107e.f157433e);
            }
            i += i2;
            if (i != iM1097I) {
                View viewM1096H2 = m1096H(i);
                if (this.f1273W0) {
                    int iMo34595d = this.f1267Q0.mo34595d(viewM1096H);
                    int iMo34595d2 = this.f1267Q0.mo34595d(viewM1096H2);
                    if (iMo34595d >= iMo34595d2) {
                        if (iMo34595d == iMo34595d2) {
                            if (rh41Var.f199107e.f157433e - ((rh41) viewM1096H2.getLayoutParams()).f199107e.f157433e < 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (b < 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z != z2) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewM1096H;
                }
                int iMo34598g = this.f1267Q0.mo34598g(viewM1096H);
                int iMo34598g2 = this.f1267Q0.mo34598g(viewM1096H2);
                if (iMo34598g <= iMo34598g2) {
                    if (iMo34598g == iMo34598g2) {
                        if (rh41Var.f199107e.f157433e - ((rh41) viewM1096H2.getLayoutParams()).f199107e.f157433e < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (b < 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z != z2) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewM1096H;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: k0 */
    public final void mo944k0(AccessibilityEvent accessibilityEvent) {
        super.mo944k0(accessibilityEvent);
        if (m1097I() > 0) {
            View viewM1048Z0 = m1048Z0(false);
            View viewM1047Y0 = m1047Y0(false);
            if (viewM1048Z0 == null || viewM1047Y0 == null) {
                return;
            }
            int iM1083V = AbstractC0110a.m1083V(viewM1048Z0);
            int iM1083V2 = AbstractC0110a.m1083V(viewM1047Y0);
            if (iM1083V < iM1083V2) {
                accessibilityEvent.setFromIndex(iM1083V);
                accessibilityEvent.setToIndex(iM1083V2);
            } else {
                accessibilityEvent.setFromIndex(iM1083V2);
                accessibilityEvent.setToIndex(iM1083V);
            }
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final boolean m1062k1() {
        return m1106S() == 1;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m1063l1(View view, int i, int i2) {
        Rect rect = this.f1282f1;
        m1118p(rect, view);
        rh41 rh41Var = (rh41) view.getLayoutParams();
        int iM1043y1 = m1043y1(i, ((ViewGroup.MarginLayoutParams) rh41Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) rh41Var).rightMargin + rect.right);
        int iM1043y2 = m1043y1(i2, ((ViewGroup.MarginLayoutParams) rh41Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) rh41Var).bottomMargin + rect.bottom);
        if (m1103P0(view, iM1043y1, iM1043y2, rh41Var)) {
            view.measure(iM1043y1, iM1043y2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0209  */
    /* JADX WARN: Code duplicated, block: B:254:0x0419  */
    /* JADX WARN: Code duplicated, block: B:265:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x01fc A[SYNTHETIC] */
    /* JADX INFO: renamed from: m1 */
    public final void m1064m1(vjv0 vjv0Var, zjv0 zjv0Var, boolean z) {
        boolean z2;
        th41 th41Var;
        int iM1097I;
        int i;
        int iM1083V;
        int iM1083V2;
        int iM1097I2;
        int i2;
        boolean z3;
        th41 th41Var2 = this.f1281e1;
        qh41 qh41Var = this.f1283g1;
        if (!(th41Var2 == null && this.f1275Y0 == -1) && zjv0Var.m96246b() == 0) {
            m1091C0(vjv0Var);
            qh41Var.m72785a();
            return;
        }
        boolean z4 = qh41Var.f188629e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = qh41Var.f188631g;
        boolean z5 = (z4 && this.f1275Y0 == -1 && this.f1281e1 == null) ? false : true;
        y3z0 y3z0Var = this.f1277a1;
        if (z5) {
            qh41Var.m72785a();
            th41 th41Var3 = this.f1281e1;
            if (th41Var3 != null) {
                int i3 = th41Var3.f220323c;
                if (i3 > 0) {
                    if (i3 == this.f1265O0) {
                        for (int i4 = 0; i4 < this.f1265O0; i4++) {
                            this.f1266P0[i4].m65460c();
                            th41 th41Var4 = this.f1281e1;
                            int iMo34600i = th41Var4.f220324d[i4];
                            if (iMo34600i != Integer.MIN_VALUE) {
                                iMo34600i += th41Var4.f220329i ? this.f1267Q0.mo34600i() : this.f1267Q0.mo34604m();
                            }
                            nr21 nr21Var = this.f1266P0[i4];
                            nr21Var.f157430b = iMo34600i;
                            nr21Var.f157431c = iMo34600i;
                        }
                    } else {
                        th41Var3.f220324d = null;
                        th41Var3.f220323c = 0;
                        th41Var3.f220325e = 0;
                        th41Var3.f220326f = null;
                        th41Var3.f220327g = null;
                        th41Var3.f220321a = th41Var3.f220322b;
                    }
                }
                th41 th41Var5 = this.f1281e1;
                this.f1280d1 = th41Var5.f220330t;
                boolean z6 = th41Var5.f220328h;
                mo947n(null);
                th41 th41Var6 = this.f1281e1;
                if (th41Var6 != null && th41Var6.f220328h != z6) {
                    th41Var6.f220328h = z6;
                }
                this.f1272V0 = z6;
                m1095G0();
                m1070s1();
                th41 th41Var7 = this.f1281e1;
                int i5 = th41Var7.f220321a;
                if (i5 != -1) {
                    this.f1275Y0 = i5;
                    qh41Var.f188627c = th41Var7.f220329i;
                } else {
                    qh41Var.f188627c = this.f1273W0;
                }
                if (th41Var7.f220325e > 1) {
                    y3z0Var.f269039b = th41Var7.f220326f;
                    y3z0Var.f269040c = th41Var7.f220327g;
                }
            } else {
                m1070s1();
                qh41Var.f188627c = this.f1273W0;
            }
            if (zjv0Var.f283550g || (i2 = this.f1275Y0) == -1) {
                if (this.f1279c1) {
                    int iM96246b = zjv0Var.m96246b();
                    iM1097I2 = m1097I() - 1;
                    while (true) {
                        if (iM1097I2 < 0) {
                            iM1083V2 = 0;
                            break;
                        }
                        iM1083V2 = AbstractC0110a.m1083V(m1096H(iM1097I2));
                        if (iM1083V2 < 0 && iM1083V2 < iM96246b) {
                            break;
                        } else {
                            iM1097I2--;
                        }
                    }
                } else {
                    int iM96246b2 = zjv0Var.m96246b();
                    iM1097I = m1097I();
                    i = 0;
                    while (true) {
                        if (i >= iM1097I) {
                            iM1083V2 = 0;
                            break;
                        }
                        iM1083V = AbstractC0110a.m1083V(m1096H(i));
                        if (iM1083V < 0 && iM1083V < iM96246b2) {
                            iM1083V2 = iM1083V;
                            break;
                        }
                        i++;
                    }
                }
                qh41Var.f188625a = iM1083V2;
                qh41Var.f188626b = Integer.MIN_VALUE;
            } else if (i2 < 0 || i2 >= zjv0Var.m96246b()) {
                this.f1275Y0 = -1;
                this.f1276Z0 = Integer.MIN_VALUE;
                if (this.f1279c1) {
                    int iM96246b3 = zjv0Var.m96246b();
                    iM1097I2 = m1097I() - 1;
                    while (true) {
                        if (iM1097I2 < 0) {
                            iM1083V2 = 0;
                            break;
                        } else {
                            iM1083V2 = AbstractC0110a.m1083V(m1096H(iM1097I2));
                            if (iM1083V2 < 0) {
                            }
                            iM1097I2--;
                        }
                    }
                } else {
                    int iM96246b4 = zjv0Var.m96246b();
                    iM1097I = m1097I();
                    i = 0;
                    while (true) {
                        if (i >= iM1097I) {
                            iM1083V2 = 0;
                            break;
                        } else {
                            iM1083V = AbstractC0110a.m1083V(m1096H(i));
                            if (iM1083V < 0) {
                            }
                            i++;
                        }
                    }
                }
                qh41Var.f188625a = iM1083V2;
                qh41Var.f188626b = Integer.MIN_VALUE;
            } else {
                th41 th41Var8 = this.f1281e1;
                if (th41Var8 == null || th41Var8.f220321a == -1 || th41Var8.f220323c < 1) {
                    View viewMo923D = mo923D(this.f1275Y0);
                    if (viewMo923D != null) {
                        qh41Var.f188625a = this.f1273W0 ? m1054e1() : m1052d1();
                        if (this.f1276Z0 != Integer.MIN_VALUE) {
                            if (qh41Var.f188627c) {
                                qh41Var.f188626b = (this.f1267Q0.mo34600i() - this.f1276Z0) - this.f1267Q0.mo34595d(viewMo923D);
                            } else {
                                qh41Var.f188626b = (this.f1267Q0.mo34604m() + this.f1276Z0) - this.f1267Q0.mo34598g(viewMo923D);
                            }
                        } else if (this.f1267Q0.mo34596e(viewMo923D) > this.f1267Q0.mo34605n()) {
                            qh41Var.f188626b = qh41Var.f188627c ? this.f1267Q0.mo34600i() : this.f1267Q0.mo34604m();
                        } else {
                            int iMo34598g = this.f1267Q0.mo34598g(viewMo923D) - this.f1267Q0.mo34604m();
                            if (iMo34598g < 0) {
                                qh41Var.f188626b = -iMo34598g;
                            } else {
                                int iMo34600i2 = this.f1267Q0.mo34600i() - this.f1267Q0.mo34595d(viewMo923D);
                                if (iMo34600i2 < 0) {
                                    qh41Var.f188626b = iMo34600i2;
                                } else {
                                    qh41Var.f188626b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i6 = this.f1275Y0;
                        qh41Var.f188625a = i6;
                        int i7 = this.f1276Z0;
                        if (i7 == Integer.MIN_VALUE) {
                            if (m1097I() != 0) {
                                if ((i6 < m1052d1()) != this.f1273W0) {
                                    z3 = false;
                                } else {
                                    z3 = true;
                                }
                            } else if (this.f1273W0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            qh41Var.f188627c = z3;
                            qh41Var.f188626b = z3 ? staggeredGridLayoutManager.f1267Q0.mo34600i() : staggeredGridLayoutManager.f1267Q0.mo34604m();
                        } else if (qh41Var.f188627c) {
                            qh41Var.f188626b = staggeredGridLayoutManager.f1267Q0.mo34600i() - i7;
                        } else {
                            qh41Var.f188626b = staggeredGridLayoutManager.f1267Q0.mo34604m() + i7;
                        }
                        qh41Var.f188628d = true;
                    }
                } else {
                    qh41Var.f188626b = Integer.MIN_VALUE;
                    qh41Var.f188625a = this.f1275Y0;
                }
            }
            qh41Var.f188629e = true;
        }
        if (this.f1281e1 == null && this.f1275Y0 == -1 && (qh41Var.f188627c != this.f1279c1 || m1062k1() != this.f1280d1)) {
            y3z0Var.m92775b();
            qh41Var.f188628d = true;
        }
        if (m1097I() > 0 && ((th41Var = this.f1281e1) == null || th41Var.f220323c < 1)) {
            if (qh41Var.f188628d) {
                for (int i8 = 0; i8 < this.f1265O0; i8++) {
                    this.f1266P0[i8].m65460c();
                    int i9 = qh41Var.f188626b;
                    if (i9 != Integer.MIN_VALUE) {
                        nr21 nr21Var2 = this.f1266P0[i8];
                        nr21Var2.f157430b = i9;
                        nr21Var2.f157431c = i9;
                    }
                }
            } else if (z5 || qh41Var.f188630f == null) {
                for (int i10 = 0; i10 < this.f1265O0; i10++) {
                    nr21 nr21Var3 = this.f1266P0[i10];
                    boolean z7 = this.f1273W0;
                    int i11 = qh41Var.f188626b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) nr21Var3.f157434f;
                    int iM65464g = z7 ? nr21Var3.m65464g(Integer.MIN_VALUE) : nr21Var3.m65467j(Integer.MIN_VALUE);
                    nr21Var3.m65460c();
                    if (iM65464g != Integer.MIN_VALUE && ((!z7 || iM65464g >= staggeredGridLayoutManager2.f1267Q0.mo34600i()) && (z7 || iM65464g <= staggeredGridLayoutManager2.f1267Q0.mo34604m()))) {
                        if (i11 != Integer.MIN_VALUE) {
                            iM65464g += i11;
                        }
                        nr21Var3.f157431c = iM65464g;
                        nr21Var3.f157430b = iM65464g;
                    }
                }
                nr21[] nr21VarArr = this.f1266P0;
                int length = nr21VarArr.length;
                int[] iArr = qh41Var.f188630f;
                if (iArr == null || iArr.length < length) {
                    qh41Var.f188630f = new int[staggeredGridLayoutManager.f1266P0.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    qh41Var.f188630f[i12] = nr21VarArr[i12].m65467j(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.f1265O0; i13++) {
                    nr21 nr21Var4 = this.f1266P0[i13];
                    nr21Var4.m65460c();
                    int i14 = qh41Var.f188630f[i13];
                    nr21Var4.f157430b = i14;
                    nr21Var4.f157431c = i14;
                }
            }
        }
        m1090C(vjv0Var);
        wq70 wq70Var = this.f1271U0;
        wq70Var.f253939a = false;
        int iMo34605n = this.f1268R0.mo34605n();
        this.f1270T0 = iMo34605n / this.f1265O0;
        View.MeasureSpec.makeMeasureSpec(iMo34605n, this.f1268R0.mo34602k());
        m1074w1(qh41Var.f188625a, zjv0Var);
        if (qh41Var.f188627c) {
            m1072u1(-1);
            m1046X0(vjv0Var, wq70Var, zjv0Var);
            m1072u1(1);
            wq70Var.f253941c = qh41Var.f188625a + wq70Var.f253942d;
            m1046X0(vjv0Var, wq70Var, zjv0Var);
        } else {
            m1072u1(1);
            m1046X0(vjv0Var, wq70Var, zjv0Var);
            m1072u1(-1);
            wq70Var.f253941c = qh41Var.f188625a + wq70Var.f253942d;
            m1046X0(vjv0Var, wq70Var, zjv0Var);
        }
        if (this.f1268R0.mo34602k() != 1073741824) {
            int iM1097I3 = m1097I();
            float fMax = 0.0f;
            for (int i15 = 0; i15 < iM1097I3; i15++) {
                View viewM1096H = m1096H(i15);
                float fMo34596e = this.f1268R0.mo34596e(viewM1096H);
                if (fMo34596e >= fMax) {
                    ((rh41) viewM1096H.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fMo34596e);
                }
            }
            int i16 = this.f1270T0;
            int iRound = Math.round(fMax * this.f1265O0);
            if (this.f1268R0.mo34602k() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f1268R0.mo34605n());
            }
            this.f1270T0 = iRound / this.f1265O0;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f1268R0.mo34602k());
            if (this.f1270T0 != i16) {
                for (int i17 = 0; i17 < iM1097I3; i17++) {
                    View viewM1096H2 = m1096H(i17);
                    rh41 rh41Var = (rh41) viewM1096H2.getLayoutParams();
                    rh41Var.getClass();
                    if (m1062k1() && this.f1269S0 == 1) {
                        int i18 = -((this.f1265O0 - 1) - rh41Var.f199107e.f157433e);
                        viewM1096H2.offsetLeftAndRight((this.f1270T0 * i18) - (i18 * i16));
                    } else {
                        int i19 = rh41Var.f199107e.f157433e;
                        int i20 = this.f1270T0 * i19;
                        int i21 = i19 * i16;
                        if (this.f1269S0 == 1) {
                            viewM1096H2.offsetLeftAndRight(i20 - i21);
                        } else {
                            viewM1096H2.offsetTopAndBottom(i20 - i21);
                        }
                    }
                }
            }
        }
        if (m1097I() > 0) {
            if (this.f1273W0) {
                m1050b1(vjv0Var, zjv0Var, true);
                m1051c1(vjv0Var, zjv0Var, false);
            } else {
                m1051c1(vjv0Var, zjv0Var, true);
                m1050b1(vjv0Var, zjv0Var, false);
            }
        }
        if (z && !zjv0Var.f283550g && this.f1278b1 != 0 && m1097I() > 0 && m1061j1() != null) {
            RecyclerView recyclerView = this.f1294b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.f1286j1);
            }
            z2 = m1044V0();
        }
        if (zjv0Var.f283550g) {
            qh41Var.m72785a();
        }
        this.f1279c1 = qh41Var.f188627c;
        this.f1280d1 = m1062k1();
        if (z2) {
            qh41Var.m72785a();
            m1064m1(vjv0Var, zjv0Var, false);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: n */
    public final void mo947n(String str) {
        if (this.f1281e1 == null) {
            super.mo947n(str);
        }
    }

    /* JADX INFO: renamed from: n1 */
    public final boolean m1065n1(int i) {
        if (this.f1269S0 == 0) {
            return (i == -1) != this.f1273W0;
        }
        return ((i == -1) == this.f1273W0) == m1062k1();
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: o0 */
    public void mo908o0(RecyclerView recyclerView, int i, int i2) {
        m1060i1(i, i2, 1);
    }

    /* JADX INFO: renamed from: o1 */
    public final void m1066o1(int i, zjv0 zjv0Var) {
        int iM1052d1;
        int i2;
        if (i > 0) {
            iM1052d1 = m1054e1();
            i2 = 1;
        } else {
            iM1052d1 = m1052d1();
            i2 = -1;
        }
        wq70 wq70Var = this.f1271U0;
        wq70Var.f253939a = true;
        m1074w1(iM1052d1, zjv0Var);
        m1072u1(i2);
        wq70Var.f253941c = iM1052d1 + wq70Var.f253942d;
        wq70Var.f253940b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: p0 */
    public void mo909p0(RecyclerView recyclerView) {
        this.f1277a1.m92775b();
        m1095G0();
    }

    /* JADX INFO: renamed from: p1 */
    public final void m1067p1(vjv0 vjv0Var, wq70 wq70Var) {
        int iMin;
        if (!wq70Var.f253939a || wq70Var.f253947i) {
            return;
        }
        if (wq70Var.f253940b == 0) {
            if (wq70Var.f253943e == -1) {
                m1068q1(vjv0Var, wq70Var.f253945g);
                return;
            } else {
                m1069r1(vjv0Var, wq70Var.f253944f);
                return;
            }
        }
        int i = 1;
        if (wq70Var.f253943e == -1) {
            int i2 = wq70Var.f253944f;
            int iM65467j = this.f1266P0[0].m65467j(i2);
            while (i < this.f1265O0) {
                int iM65467j2 = this.f1266P0[i].m65467j(i2);
                if (iM65467j2 > iM65467j) {
                    iM65467j = iM65467j2;
                }
                i++;
            }
            int i3 = i2 - iM65467j;
            m1068q1(vjv0Var, i3 < 0 ? wq70Var.f253945g : wq70Var.f253945g - Math.min(i3, wq70Var.f253940b));
            return;
        }
        int i4 = wq70Var.f253945g;
        int iM65464g = this.f1266P0[0].m65464g(i4);
        while (i < this.f1265O0) {
            int iM65464g2 = this.f1266P0[i].m65464g(i4);
            if (iM65464g2 < iM65464g) {
                iM65464g = iM65464g2;
            }
            i++;
        }
        int i5 = iM65464g - wq70Var.f253945g;
        if (i5 < 0) {
            iMin = wq70Var.f253944f;
        } else {
            iMin = Math.min(i5, wq70Var.f253940b) + wq70Var.f253944f;
        }
        m1069r1(vjv0Var, iMin);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: q */
    public final boolean mo951q() {
        return this.f1269S0 == 0;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: q0 */
    public void mo910q0(RecyclerView recyclerView, int i, int i2) {
        m1060i1(i, i2, 8);
    }

    /* JADX INFO: renamed from: q1 */
    public final void m1068q1(vjv0 vjv0Var, int i) {
        for (int iM1097I = m1097I() - 1; iM1097I >= 0; iM1097I--) {
            View viewM1096H = m1096H(iM1097I);
            if (this.f1267Q0.mo34598g(viewM1096H) < i || this.f1267Q0.mo34608q(viewM1096H) < i) {
                return;
            }
            rh41 rh41Var = (rh41) viewM1096H.getLayoutParams();
            rh41Var.getClass();
            if (rh41Var.f199107e.f157429a.size() == 1) {
                return;
            }
            nr21 nr21Var = rh41Var.f199107e;
            ArrayList arrayList = nr21Var.f157429a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            rh41 rh41Var2 = (rh41) view.getLayoutParams();
            rh41Var2.f199107e = null;
            if (rh41Var2.f166147a.m36330t() || rh41Var2.f166147a.m36333w()) {
                nr21Var.f157432d -= ((StaggeredGridLayoutManager) nr21Var.f157434f).f1267Q0.mo34596e(view);
            }
            if (size == 1) {
                nr21Var.f157430b = Integer.MIN_VALUE;
            }
            nr21Var.f157431c = Integer.MIN_VALUE;
            m1093E0(viewM1096H);
            vjv0Var.m85786i(viewM1096H);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: r */
    public final boolean mo953r() {
        return this.f1269S0 == 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: r0 */
    public void mo911r0(RecyclerView recyclerView, int i, int i2) {
        m1060i1(i, i2, 2);
    }

    /* JADX INFO: renamed from: r1 */
    public final void m1069r1(vjv0 vjv0Var, int i) {
        while (m1097I() > 0) {
            View viewM1096H = m1096H(0);
            if (this.f1267Q0.mo34595d(viewM1096H) > i || this.f1267Q0.mo34607p(viewM1096H) > i) {
                return;
            }
            rh41 rh41Var = (rh41) viewM1096H.getLayoutParams();
            rh41Var.getClass();
            if (rh41Var.f199107e.f157429a.size() == 1) {
                return;
            }
            nr21 nr21Var = rh41Var.f199107e;
            ArrayList arrayList = nr21Var.f157429a;
            View view = (View) arrayList.remove(0);
            rh41 rh41Var2 = (rh41) view.getLayoutParams();
            rh41Var2.f199107e = null;
            if (arrayList.size() == 0) {
                nr21Var.f157431c = Integer.MIN_VALUE;
            }
            if (rh41Var2.f166147a.m36330t() || rh41Var2.f166147a.m36333w()) {
                nr21Var.f157432d -= ((StaggeredGridLayoutManager) nr21Var.f157434f).f1267Q0.mo34596e(view);
            }
            nr21Var.f157430b = Integer.MIN_VALUE;
            m1093E0(viewM1096H);
            vjv0Var.m85786i(viewM1096H);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: s */
    public final boolean mo593s(ojv0 ojv0Var) {
        return ojv0Var instanceof rh41;
    }

    /* JADX INFO: renamed from: s1 */
    public final void m1070s1() {
        if (this.f1269S0 == 1 || !m1062k1()) {
            this.f1273W0 = this.f1272V0;
        } else {
            this.f1273W0 = !this.f1272V0;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: t0 */
    public void mo914t0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m1060i1(i, i2, 4);
    }

    /* JADX INFO: renamed from: t1 */
    public final int m1071t1(int i, vjv0 vjv0Var, zjv0 zjv0Var) {
        if (m1097I() == 0 || i == 0) {
            return 0;
        }
        m1066o1(i, zjv0Var);
        wq70 wq70Var = this.f1271U0;
        int iM1046X0 = m1046X0(vjv0Var, wq70Var, zjv0Var);
        if (wq70Var.f253940b >= iM1046X0) {
            i = i < 0 ? -iM1046X0 : iM1046X0;
        }
        this.f1267Q0.mo34609r(-i);
        this.f1279c1 = this.f1273W0;
        wq70Var.f253940b = 0;
        m1067p1(vjv0Var, wq70Var);
        return i;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: u */
    public final void mo955u(int i, int i2, zjv0 zjv0Var, gx8 gx8Var) {
        wq70 wq70Var;
        int iM65464g;
        int iM65467j;
        if (this.f1269S0 != 0) {
            i = i2;
        }
        if (m1097I() == 0 || i == 0) {
            return;
        }
        m1066o1(i, zjv0Var);
        int[] iArr = this.f1285i1;
        if (iArr == null || iArr.length < this.f1265O0) {
            this.f1285i1 = new int[this.f1265O0];
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = this.f1265O0;
            wq70Var = this.f1271U0;
            if (i3 >= i5) {
                break;
            }
            if (wq70Var.f253942d == -1) {
                iM65464g = wq70Var.f253944f;
                iM65467j = this.f1266P0[i3].m65467j(iM65464g);
            } else {
                iM65464g = this.f1266P0[i3].m65464g(wq70Var.f253945g);
                iM65467j = wq70Var.f253945g;
            }
            int i6 = iM65464g - iM65467j;
            if (i6 >= 0) {
                this.f1285i1[i4] = i6;
                i4++;
            }
            i3++;
        }
        Arrays.sort(this.f1285i1, 0, i4);
        for (int i7 = 0; i7 < i4; i7++) {
            int i8 = wq70Var.f253941c;
            if (i8 < 0 || i8 >= zjv0Var.m96246b()) {
                return;
            }
            gx8Var.m46027a(wq70Var.f253941c, this.f1285i1[i7]);
            wq70Var.f253941c += wq70Var.f253942d;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: u0 */
    public final void mo915u0(vjv0 vjv0Var, zjv0 zjv0Var) {
        m1064m1(vjv0Var, zjv0Var, true);
    }

    /* JADX INFO: renamed from: u1 */
    public final void m1072u1(int i) {
        wq70 wq70Var = this.f1271U0;
        wq70Var.f253943e = i;
        wq70Var.f253942d = this.f1273W0 != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: v0 */
    public final void mo916v0(zjv0 zjv0Var) {
        this.f1275Y0 = -1;
        this.f1276Z0 = Integer.MIN_VALUE;
        this.f1281e1 = null;
        this.f1283g1.m72785a();
    }

    /* JADX INFO: renamed from: v1 */
    public final void m1073v1(int i) {
        mo947n(null);
        if (i != this.f1265O0) {
            this.f1277a1.m92775b();
            m1095G0();
            this.f1265O0 = i;
            this.f1274X0 = new BitSet(this.f1265O0);
            this.f1266P0 = new nr21[this.f1265O0];
            for (int i2 = 0; i2 < this.f1265O0; i2++) {
                this.f1266P0[i2] = new nr21(this, i2);
            }
            m1095G0();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: w */
    public final int mo959w(zjv0 zjv0Var) {
        if (m1097I() == 0) {
            return 0;
        }
        boolean z = !this.f1284h1;
        return g9g1.m44030f(zjv0Var, this.f1267Q0, m1048Z0(z), m1047Y0(z), this, this.f1284h1);
    }

    /* JADX INFO: renamed from: w1 */
    public final void m1074w1(int i, zjv0 zjv0Var) {
        int iMo34605n;
        int iMo34605n2;
        int i2;
        wq70 wq70Var = this.f1271U0;
        boolean z = false;
        wq70Var.f253940b = 0;
        wq70Var.f253941c = i;
        il80 il80Var = this.f1297e;
        if (il80Var == null || !il80Var.m50993g() || (i2 = zjv0Var.f283544a) == -1) {
            iMo34605n = 0;
            iMo34605n2 = 0;
        } else {
            if (this.f1273W0 == (i2 < i)) {
                iMo34605n = this.f1267Q0.mo34605n();
                iMo34605n2 = 0;
            } else {
                iMo34605n2 = this.f1267Q0.mo34605n();
                iMo34605n = 0;
            }
        }
        RecyclerView recyclerView = this.f1294b;
        if (recyclerView == null || !recyclerView.f1243h) {
            wq70Var.f253945g = this.f1267Q0.mo34599h() + iMo34605n;
            wq70Var.f253944f = -iMo34605n2;
        } else {
            wq70Var.f253944f = this.f1267Q0.mo34604m() - iMo34605n2;
            wq70Var.f253945g = this.f1267Q0.mo34600i() + iMo34605n;
        }
        wq70Var.f253946h = false;
        wq70Var.f253939a = true;
        if (this.f1267Q0.mo34602k() == 0 && this.f1267Q0.mo34599h() == 0) {
            z = true;
        }
        wq70Var.f253947i = z;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: x */
    public final int mo917x(zjv0 zjv0Var) {
        return m1045W0(zjv0Var);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: x0 */
    public final void mo961x0(Parcelable parcelable) {
        if (parcelable instanceof th41) {
            th41 th41Var = (th41) parcelable;
            this.f1281e1 = th41Var;
            if (this.f1275Y0 != -1) {
                th41Var.f220321a = -1;
                th41Var.f220322b = -1;
                th41Var.f220324d = null;
                th41Var.f220323c = 0;
                th41Var.f220325e = 0;
                th41Var.f220326f = null;
                th41Var.f220327g = null;
            }
            m1095G0();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1075x1(nr21 nr21Var, int i, int i2) {
        int i3 = nr21Var.f157432d;
        int i4 = nr21Var.f157433e;
        if (i != -1) {
            int i5 = nr21Var.f157431c;
            if (i5 == Integer.MIN_VALUE) {
                nr21Var.m65459b();
                i5 = nr21Var.f157431c;
            }
            if (i5 - i3 >= i2) {
                this.f1274X0.set(i4, false);
                return;
            }
            return;
        }
        int i6 = nr21Var.f157430b;
        if (i6 == Integer.MIN_VALUE) {
            View view = (View) nr21Var.f157429a.get(0);
            rh41 rh41Var = (rh41) view.getLayoutParams();
            nr21Var.f157430b = ((StaggeredGridLayoutManager) nr21Var.f157434f).f1267Q0.mo34598g(view);
            rh41Var.getClass();
            i6 = nr21Var.f157430b;
        }
        if (i6 + i3 <= i2) {
            this.f1274X0.set(i4, false);
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: y */
    public final int mo918y(zjv0 zjv0Var) {
        if (m1097I() == 0) {
            return 0;
        }
        boolean z = !this.f1284h1;
        return g9g1.m44032h(zjv0Var, this.f1267Q0, m1048Z0(z), m1047Y0(z), this, this.f1284h1);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: y0 */
    public Parcelable mo963y0() {
        int iM65467j;
        int iMo34604m;
        int[] iArr;
        th41 th41Var = this.f1281e1;
        if (th41Var != null) {
            th41 th41Var2 = new th41();
            th41Var2.f220323c = th41Var.f220323c;
            th41Var2.f220321a = th41Var.f220321a;
            th41Var2.f220322b = th41Var.f220322b;
            th41Var2.f220324d = th41Var.f220324d;
            th41Var2.f220325e = th41Var.f220325e;
            th41Var2.f220326f = th41Var.f220326f;
            th41Var2.f220328h = th41Var.f220328h;
            th41Var2.f220329i = th41Var.f220329i;
            th41Var2.f220330t = th41Var.f220330t;
            th41Var2.f220327g = th41Var.f220327g;
            return th41Var2;
        }
        th41 th41Var3 = new th41();
        th41Var3.f220328h = this.f1272V0;
        th41Var3.f220329i = this.f1279c1;
        th41Var3.f220330t = this.f1280d1;
        y3z0 y3z0Var = this.f1277a1;
        if (y3z0Var == null || (iArr = (int[]) y3z0Var.f269039b) == null) {
            th41Var3.f220325e = 0;
        } else {
            th41Var3.f220326f = iArr;
            th41Var3.f220325e = iArr.length;
            th41Var3.f220327g = (ArrayList) y3z0Var.f269040c;
        }
        if (m1097I() <= 0) {
            th41Var3.f220321a = -1;
            th41Var3.f220322b = -1;
            th41Var3.f220323c = 0;
            return th41Var3;
        }
        th41Var3.f220321a = this.f1279c1 ? m1054e1() : m1052d1();
        View viewM1047Y0 = this.f1273W0 ? m1047Y0(true) : m1048Z0(true);
        th41Var3.f220322b = viewM1047Y0 != null ? AbstractC0110a.m1083V(viewM1047Y0) : -1;
        int i = this.f1265O0;
        th41Var3.f220323c = i;
        th41Var3.f220324d = new int[i];
        for (int i2 = 0; i2 < this.f1265O0; i2++) {
            if (this.f1279c1) {
                iM65467j = this.f1266P0[i2].m65464g(Integer.MIN_VALUE);
                if (iM65467j != Integer.MIN_VALUE) {
                    iMo34604m = this.f1267Q0.mo34600i();
                    iM65467j -= iMo34604m;
                }
            } else {
                iM65467j = this.f1266P0[i2].m65467j(Integer.MIN_VALUE);
                if (iM65467j != Integer.MIN_VALUE) {
                    iMo34604m = this.f1267Q0.mo34604m();
                    iM65467j -= iMo34604m;
                }
            }
            th41Var3.f220324d[i2] = iM65467j;
        }
        return th41Var3;
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: z */
    public final int mo965z(zjv0 zjv0Var) {
        if (m1097I() == 0) {
            return 0;
        }
        boolean z = !this.f1284h1;
        return g9g1.m44030f(zjv0Var, this.f1267Q0, m1048Z0(z), m1047Y0(z), this, this.f1284h1);
    }

    @Override // androidx.recyclerview.widget.AbstractC0110a
    /* JADX INFO: renamed from: z0 */
    public final void mo1076z0(int i) {
        if (i == 0) {
            m1044V0();
        }
    }

    public StaggeredGridLayoutManager() {
        this.f1265O0 = -1;
        this.f1272V0 = false;
        this.f1273W0 = false;
        this.f1275Y0 = -1;
        this.f1276Z0 = Integer.MIN_VALUE;
        this.f1277a1 = new y3z0(26);
        this.f1278b1 = 2;
        this.f1282f1 = new Rect();
        this.f1283g1 = new qh41(this);
        this.f1284h1 = true;
        this.f1286j1 = new cjs0(this, 24);
        this.f1269S0 = 1;
        m1073v1(2);
        this.f1271U0 = new wq70();
        this.f1267Q0 = d180.m34594b(this, this.f1269S0);
        this.f1268R0 = d180.m34594b(this, 1 - this.f1269S0);
    }
}
