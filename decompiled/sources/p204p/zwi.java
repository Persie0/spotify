package p204p;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.C0043a;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class zwi {

    /* JADX INFO: renamed from: a */
    public int f286987a;

    /* JADX INFO: renamed from: b */
    public int f286988b;

    /* JADX INFO: renamed from: c */
    public Object f286989c;

    /* JADX INFO: renamed from: d */
    public Object f286990d;

    /* JADX INFO: renamed from: e */
    public Object f286991e;

    /* JADX INFO: renamed from: f */
    public Object f286992f;

    /* JADX INFO: renamed from: g */
    public Object f286993g;

    public zwi(o7m o7mVar, int i, int i2, m500 m500Var, hc80 hc80Var, ica icaVar, l5j0 l5j0Var) {
        this.f286989c = o7mVar;
        this.f286987a = i;
        this.f286988b = i2;
        this.f286990d = m500Var;
        this.f286991e = hc80Var;
        this.f286992f = icaVar;
        this.f286993g = l5j0Var;
    }

    /* JADX INFO: renamed from: c */
    public static void m97117c(w7j w7jVar, w7j w7jVar2) {
        v7j jq20Var;
        ArrayList<v7j> arrayList = w7jVar.f248708u0;
        HashMap map = new HashMap();
        map.put(w7jVar, w7jVar2);
        w7jVar2.f248708u0.clear();
        w7jVar2.mo44861h(w7jVar, map);
        for (v7j v7jVar : arrayList) {
            if (v7jVar instanceof ix8) {
                jq20Var = new ix8();
            } else if (v7jVar instanceof ka20) {
                jq20Var = new ka20();
            } else if (v7jVar instanceof giz) {
                jq20Var = new giz();
            } else if (v7jVar instanceof d6o0) {
                jq20Var = new d6o0();
            } else {
                jq20Var = v7jVar instanceof jq20 ? new jq20() : new v7j();
            }
            w7jVar2.m87390W(jq20Var);
            map.put(v7jVar, jq20Var);
        }
        for (v7j v7jVar2 : arrayList) {
            ((v7j) map.get(v7jVar2)).mo44861h(v7jVar2, map);
        }
    }

    /* JADX INFO: renamed from: e */
    public static v7j m97118e(w7j w7jVar, View view) {
        if (w7jVar.f238241h0 == view) {
            return w7jVar;
        }
        ArrayList arrayList = w7jVar.f248708u0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v7j v7jVar = (v7j) arrayList.get(i);
            if (v7jVar.f238241h0 == view) {
                return v7jVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m97119a() {
        HashMap map;
        int[] iArr;
        Interpolator interpolatorLoadInterpolator;
        MotionLayout motionLayout = (MotionLayout) this.f286993g;
        int childCount = motionLayout.getChildCount();
        HashMap map2 = motionLayout.f665b1;
        map2.clear();
        SparseArray sparseArray = new SparseArray();
        int[] iArr2 = new int[childCount];
        for (int i = 0; i < childCount; i++) {
            View childAt = motionLayout.getChildAt(i);
            C0043a c0043a = new C0043a(childAt);
            int id = childAt.getId();
            iArr2[i] = id;
            sparseArray.put(id, c0043a);
            map2.put(childAt, c0043a);
        }
        int i2 = 0;
        while (i2 < childCount) {
            View childAt2 = motionLayout.getChildAt(i2);
            C0043a c0043a2 = (C0043a) map2.get(childAt2);
            if (c0043a2 == null) {
                map = map2;
                iArr = iArr2;
            } else {
                Rect rect = c0043a2.f698a;
                p1i0 p1i0Var = c0043a2.f703f;
                if (((c7j) this.f286991e) != null) {
                    v7j v7jVarM97118e = m97118e((w7j) this.f286989c, childAt2);
                    if (v7jVarM97118e != null) {
                        Rect rectM326x = MotionLayout.m326x(motionLayout, v7jVarM97118e);
                        c7j c7jVar = (c7j) this.f286991e;
                        int width = motionLayout.getWidth();
                        int height = motionLayout.getHeight();
                        int i3 = c7jVar.f34935d;
                        if (i3 != 0) {
                            C0043a.m346f(rectM326x, rect, i3, width, height);
                        }
                        p1i0Var.f173101c = 0.0f;
                        p1i0Var.f173102d = 0.0f;
                        c0043a2.m351e(p1i0Var);
                        map = map2;
                        iArr = iArr2;
                        p1i0Var.m68818d(rectM326x.left, rectM326x.top, rectM326x.width(), rectM326x.height());
                        x6j x6jVarM31740l = c7jVar.m31740l(c0043a2.f700c);
                        p1i0Var.m68816a(x6jVarM31740l);
                        z6j z6jVar = x6jVarM31740l.f258685d;
                        c0043a2.f709l = z6jVar.f279932g;
                        c0043a2.f705h.m31266c(rectM326x, c7jVar, i3, c0043a2.f700c);
                        c0043a2.f692C = x6jVarM31740l.f258687f.f24293i;
                        c0043a2.f694E = z6jVar.f279935j;
                        c0043a2.f695F = z6jVar.f279934i;
                        Context context = c0043a2.f699b.getContext();
                        int i4 = z6jVar.f279937l;
                        String str = z6jVar.f279936k;
                        int i5 = z6jVar.f279938m;
                        if (i4 == -2) {
                            interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, i5);
                        } else if (i4 == -1) {
                            interpolatorLoadInterpolator = new d1i0(aqs.m26892e(str), 0);
                        } else if (i4 == 0) {
                            interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
                        } else if (i4 == 1) {
                            interpolatorLoadInterpolator = new AccelerateInterpolator();
                        } else if (i4 == 2) {
                            interpolatorLoadInterpolator = new DecelerateInterpolator();
                        } else if (i4 != 4) {
                            interpolatorLoadInterpolator = i4 != 5 ? null : new OvershootInterpolator();
                        } else {
                            interpolatorLoadInterpolator = new BounceInterpolator();
                        }
                        c0043a2.f696G = interpolatorLoadInterpolator;
                    } else {
                        map = map2;
                        iArr = iArr2;
                        if (motionLayout.f674k1 != 0) {
                            mif1.m61889x();
                            mif1.m61891z(childAt2);
                            childAt2.getClass();
                        }
                    }
                } else {
                    map = map2;
                    iArr = iArr2;
                }
                if (((c7j) this.f286992f) != null) {
                    v7j v7jVarM97118e2 = m97118e((w7j) this.f286990d, childAt2);
                    if (v7jVarM97118e2 != null) {
                        Rect rectM326x2 = MotionLayout.m326x(motionLayout, v7jVarM97118e2);
                        c7j c7jVar2 = (c7j) this.f286992f;
                        int width2 = motionLayout.getWidth();
                        int height2 = motionLayout.getHeight();
                        p1i0 p1i0Var2 = c0043a2.f704g;
                        int i6 = c7jVar2.f34935d;
                        if (i6 != 0) {
                            C0043a.m346f(rectM326x2, rect, i6, width2, height2);
                        } else {
                            rect = rectM326x2;
                        }
                        p1i0Var2.f173101c = 1.0f;
                        p1i0Var2.f173102d = 1.0f;
                        c0043a2.m351e(p1i0Var2);
                        p1i0Var2.m68818d(rect.left, rect.top, rect.width(), rect.height());
                        p1i0Var2.m68816a(c7jVar2.m31740l(c0043a2.f700c));
                        c0043a2.f706i.m31266c(rect, c7jVar2, i6, c0043a2.f700c);
                    } else if (motionLayout.f674k1 != 0) {
                        mif1.m61889x();
                        mif1.m61891z(childAt2);
                        childAt2.getClass();
                    }
                }
            }
            i2++;
            map2 = map;
            iArr2 = iArr;
        }
        int[] iArr3 = iArr2;
        for (int i7 = 0; i7 < childCount; i7++) {
            C0043a c0043a3 = (C0043a) sparseArray.get(iArr3[i7]);
            int i8 = c0043a3.f703f.f173096X;
            if (i8 != -1) {
                C0043a c0043a4 = (C0043a) sparseArray.get(i8);
                c0043a3.f703f.m68819f(c0043a4, c0043a4.f703f);
                c0043a3.f704g.m68819f(c0043a4, c0043a4.f704g);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m97120b(int i, int i2) {
        MotionLayout motionLayout = (MotionLayout) this.f286993g;
        int optimizationLevel = motionLayout.getOptimizationLevel();
        if (motionLayout.f660W0 == motionLayout.getStartState()) {
            w7j w7jVar = (w7j) this.f286990d;
            c7j c7jVar = (c7j) this.f286992f;
            motionLayout.m361v(w7jVar, optimizationLevel, (c7jVar == null || c7jVar.f34935d == 0) ? i : i2, (c7jVar == null || c7jVar.f34935d == 0) ? i2 : i);
            c7j c7jVar2 = (c7j) this.f286991e;
            if (c7jVar2 != null) {
                w7j w7jVar2 = (w7j) this.f286989c;
                int i3 = c7jVar2.f34935d;
                int i4 = i3 == 0 ? i : i2;
                if (i3 == 0) {
                    i = i2;
                }
                motionLayout.m361v(w7jVar2, optimizationLevel, i4, i);
                return;
            }
            return;
        }
        c7j c7jVar3 = (c7j) this.f286991e;
        if (c7jVar3 != null) {
            w7j w7jVar3 = (w7j) this.f286989c;
            int i5 = c7jVar3.f34935d;
            motionLayout.m361v(w7jVar3, optimizationLevel, i5 == 0 ? i : i2, i5 == 0 ? i2 : i);
        }
        w7j w7jVar4 = (w7j) this.f286990d;
        c7j c7jVar4 = (c7j) this.f286992f;
        int i6 = (c7jVar4 == null || c7jVar4.f34935d == 0) ? i : i2;
        if (c7jVar4 == null || c7jVar4.f34935d == 0) {
            i = i2;
        }
        motionLayout.m361v(w7jVar4, optimizationLevel, i6, i);
    }

    /* JADX INFO: renamed from: d */
    public jyc1 m97121d() {
        return (jyc1) this.f286990d;
    }

    /* JADX INFO: renamed from: f */
    public void m97122f(c7j c7jVar, c7j c7jVar2) {
        this.f286991e = c7jVar;
        this.f286992f = c7jVar2;
        this.f286989c = new w7j();
        this.f286990d = new w7j();
        w7j w7jVar = (w7j) this.f286989c;
        MotionLayout motionLayout = (MotionLayout) this.f286993g;
        boolean z = MotionLayout.f633V1;
        w7j w7jVar2 = motionLayout.f735c;
        c29 c29Var = w7jVar2.f248712y0;
        w7jVar.f248712y0 = c29Var;
        w7jVar.f248710w0.m92359u(c29Var);
        w7j w7jVar3 = (w7j) this.f286990d;
        c29 c29Var2 = w7jVar2.f248712y0;
        w7jVar3.f248712y0 = c29Var2;
        w7jVar3.f248710w0.m92359u(c29Var2);
        ((w7j) this.f286989c).m87397e0();
        ((w7j) this.f286990d).m87397e0();
        m97117c(w7jVar2, (w7j) this.f286989c);
        m97117c(w7jVar2, (w7j) this.f286990d);
        if (motionLayout.f669f1 > 0.5d) {
            if (c7jVar != null) {
                m97129m((w7j) this.f286989c, c7jVar);
            }
            m97129m((w7j) this.f286990d, c7jVar2);
        } else {
            m97129m((w7j) this.f286990d, c7jVar2);
            if (c7jVar != null) {
                m97129m((w7j) this.f286989c, c7jVar);
            }
        }
        ((w7j) this.f286989c).f248713z0 = motionLayout.m359r();
        w7j w7jVar4 = (w7j) this.f286989c;
        w7jVar4.f248709v0.m49454C(w7jVar4);
        ((w7j) this.f286990d).f248713z0 = motionLayout.m359r();
        w7j w7jVar5 = (w7j) this.f286990d;
        w7jVar5.f248709v0.m49454C(w7jVar5);
        ViewGroup.LayoutParams layoutParams = motionLayout.getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.width;
            u7j u7jVar = u7j.f227711b;
            if (i == -2) {
                ((w7j) this.f286989c).m84868P(u7jVar);
                ((w7j) this.f286990d).m84868P(u7jVar);
            }
            if (layoutParams.height == -2) {
                ((w7j) this.f286989c).m84870R(u7jVar);
                ((w7j) this.f286990d).m84870R(u7jVar);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public void m97123g(int i) {
        String str = (String) this.f286993g;
        vaa1 vaa1Var = (vaa1) this.f286992f;
        vwi vwiVar = (vwi) this.f286991e;
        double dMo44585d = vwiVar.mo44585d();
        int i2 = this.f286987a;
        int iM72082M = q3d0.m72082M(dMo44585d * ((double) i2));
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            lwc1.m60115f(vwiVar, "volume_up_hardware_button", ((g2a1) vaa1Var.f239173b).m43382n(str, m97130n(iM72082M)), 4);
            int i3 = iM72082M + 1;
            if (i3 <= i2) {
                i2 = i3;
            }
            m97127k(i2);
            return;
        }
        if (iM38547C != 1) {
            if (iM38547C != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        lwc1.m60114b(vwiVar, "volume_down_hardware_button", ((g2a1) vaa1Var.f239173b).m43381m(str, m97130n(iM72082M)), 4);
        int i4 = iM72082M - 1;
        if (i4 < 0) {
            i4 = 0;
        }
        m97127k(i4);
    }

    /* JADX INFO: renamed from: h */
    public void m97124h(int i) {
        double dM97130n = m97130n(i);
        g2a1 g2a1Var = (g2a1) ((vaa1) this.f286992f).f239173b;
        zm8 zm8VarM25673o = ((ae41) g2a1Var.f75877c).m25673o((String) this.f286993g);
        String str = null;
        if (zm8VarM25673o != null) {
            yt91 yt91VarM96903c = zm8VarM25673o.f284180c.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("system_volume_slider", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
            int iM72082M = q3d0.m72082M(((double) 100) * dM97130n);
            dv91 dv91Var = new dv91("drag", 1);
            String strValueOf = String.valueOf(iM72082M);
            if (strValueOf == null) {
                strValueOf = "";
            }
            str = ((kv91) g2a1Var.f75876b).mo57453r(new av91("", "", dv91Var, new bv91("set_volume", 1, Collections.singletonMap("new_volume_percentage", strValueOf)), zt91VarM94607a, zm8VarM25673o.f284179b, System.currentTimeMillis()), null).f46380a.f279709a;
        }
        ((vwi) this.f286991e).f245502b.accept(new sxc1(new n601(dM97130n, "volume_system_slider", str, new l7i(new mx9(this, i, 1), 10))));
    }

    /* JADX INFO: renamed from: i */
    public void m97125i() {
        MotionLayout motionLayout = (MotionLayout) this.f286993g;
        int i = motionLayout.f662Y0;
        int i2 = motionLayout.f663Z0;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        motionLayout.f640G1 = mode;
        motionLayout.f641H1 = mode2;
        m97120b(i, i2);
        int i3 = 0;
        if (!(motionLayout.getParent() instanceof MotionLayout) || mode != 1073741824 || mode2 != 1073741824) {
            m97120b(i, i2);
            motionLayout.f636C1 = ((w7j) this.f286989c).m84886s();
            motionLayout.f637D1 = ((w7j) this.f286989c).m84882m();
            motionLayout.f638E1 = ((w7j) this.f286990d).m84886s();
            int iM84882m = ((w7j) this.f286990d).m84882m();
            motionLayout.f639F1 = iM84882m;
            motionLayout.f635B1 = (motionLayout.f636C1 == motionLayout.f638E1 && motionLayout.f637D1 == iM84882m) ? false : true;
        }
        int i4 = motionLayout.f636C1;
        int i5 = motionLayout.f637D1;
        int i6 = motionLayout.f640G1;
        if (i6 == Integer.MIN_VALUE || i6 == 0) {
            i4 = (int) ((motionLayout.f642I1 * (motionLayout.f638E1 - i4)) + i4);
        }
        int i7 = motionLayout.f641H1;
        if (i7 == Integer.MIN_VALUE || i7 == 0) {
            i5 = (int) ((motionLayout.f642I1 * (motionLayout.f639F1 - i5)) + i5);
        }
        int i8 = i5;
        w7j w7jVar = (w7j) this.f286989c;
        motionLayout.m360u(i, i2, i4, i8, w7jVar.f248700I0 || ((w7j) this.f286990d).f248700I0, w7jVar.f248701J0 || ((w7j) this.f286990d).f248701J0);
        HashMap map = motionLayout.f665b1;
        int childCount = motionLayout.getChildCount();
        motionLayout.f650Q1.m97119a();
        motionLayout.f673j1 = true;
        SparseArray sparseArray = new SparseArray();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = motionLayout.getChildAt(i9);
            sparseArray.put(childAt.getId(), (C0043a) map.get(childAt));
        }
        int width = motionLayout.getWidth();
        int height = motionLayout.getHeight();
        u1i0 u1i0Var = motionLayout.f651R0.f236371c;
        int i10 = u1i0Var != null ? u1i0Var.f225844p : -1;
        if (i10 != -1) {
            for (int i11 = 0; i11 < childCount; i11++) {
                C0043a c0043a = (C0043a) map.get(motionLayout.getChildAt(i11));
                if (c0043a != null) {
                    c0043a.f691B = i10;
                }
            }
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = new int[map.size()];
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            C0043a c0043a2 = (C0043a) map.get(motionLayout.getChildAt(i13));
            int i14 = c0043a2.f703f.f173096X;
            if (i14 != -1) {
                sparseBooleanArray.put(i14, true);
                iArr[i12] = c0043a2.f703f.f173096X;
                i12++;
            }
        }
        for (int i15 = 0; i15 < i12; i15++) {
            C0043a c0043a3 = (C0043a) map.get(motionLayout.findViewById(iArr[i15]));
            if (c0043a3 != null) {
                motionLayout.f651R0.m84469f(c0043a3);
                c0043a3.m352g(width, motionLayout.getNanoTime(), height);
            }
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = motionLayout.getChildAt(i16);
            C0043a c0043a4 = (C0043a) map.get(childAt2);
            if (!sparseBooleanArray.get(childAt2.getId()) && c0043a4 != null) {
                motionLayout.f651R0.m84469f(c0043a4);
                c0043a4.m352g(width, motionLayout.getNanoTime(), height);
            }
        }
        u1i0 u1i0Var2 = motionLayout.f651R0.f236371c;
        float f = u1i0Var2 != null ? u1i0Var2.f225837i : 0.0f;
        if (f != 0.0f) {
            boolean z = ((double) f) < 0.0d;
            float fAbs = Math.abs(f);
            float fMax = -3.4028235E38f;
            float fMin = Float.MAX_VALUE;
            float fMax2 = -3.4028235E38f;
            float fMin2 = Float.MAX_VALUE;
            for (int i17 = 0; i17 < childCount; i17++) {
                C0043a c0043a5 = (C0043a) map.get(motionLayout.getChildAt(i17));
                if (!Float.isNaN(c0043a5.f709l)) {
                    for (int i18 = 0; i18 < childCount; i18++) {
                        C0043a c0043a6 = (C0043a) map.get(motionLayout.getChildAt(i18));
                        if (!Float.isNaN(c0043a6.f709l)) {
                            fMin = Math.min(fMin, c0043a6.f709l);
                            fMax = Math.max(fMax, c0043a6.f709l);
                        }
                    }
                    while (i3 < childCount) {
                        C0043a c0043a7 = (C0043a) map.get(motionLayout.getChildAt(i3));
                        if (!Float.isNaN(c0043a7.f709l)) {
                            c0043a7.f711n = 1.0f / (1.0f - fAbs);
                            if (z) {
                                c0043a7.f710m = fAbs - (((fMax - c0043a7.f709l) / (fMax - fMin)) * fAbs);
                            } else {
                                c0043a7.f710m = fAbs - (((c0043a7.f709l - fMin) * fAbs) / (fMax - fMin));
                            }
                        }
                        i3++;
                    }
                    return;
                }
                p1i0 p1i0Var = c0043a5.f704g;
                float f2 = p1i0Var.f173103e;
                float f3 = p1i0Var.f173104f;
                float f4 = z ? f3 - f2 : f3 + f2;
                fMin2 = Math.min(fMin2, f4);
                fMax2 = Math.max(fMax2, f4);
            }
            while (i3 < childCount) {
                C0043a c0043a8 = (C0043a) map.get(motionLayout.getChildAt(i3));
                p1i0 p1i0Var2 = c0043a8.f704g;
                float f5 = p1i0Var2.f173103e;
                float f6 = p1i0Var2.f173104f;
                float f7 = z ? f6 - f5 : f6 + f5;
                c0043a8.f711n = 1.0f / (1.0f - fAbs);
                c0043a8.f710m = fAbs - (((f7 - fMin2) * fAbs) / (fMax2 - fMin2));
                i3++;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m97126j(s780 s780Var) {
        this.f286989c = s780Var;
    }

    /* JADX INFO: renamed from: k */
    public void m97127k(int i) {
        jyc1 jyc1Var = (jyc1) this.f286990d;
        this.f286990d = new jyc1(jyc1Var.f117376a, jyc1Var.f117377b, i, jyc1Var.f117378c);
        s780 s780Var = (s780) this.f286989c;
        if (s780Var != null) {
            ((wod0) s780Var.f206296b).m68417d(i);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m97128l(double d) {
        m97127k(q3d0.m72082M(((double) this.f286987a) * d));
    }

    /* JADX INFO: renamed from: m */
    public void m97129m(w7j w7jVar, c7j c7jVar) {
        x6j x6jVar;
        x6j x6jVar2;
        SparseArray sparseArray = new SparseArray();
        z7j z7jVar = new z7j(-2, -2);
        sparseArray.clear();
        sparseArray.put(0, w7jVar);
        MotionLayout motionLayout = (MotionLayout) this.f286993g;
        sparseArray.put(motionLayout.getId(), w7jVar);
        if (c7jVar != null && c7jVar.f34935d != 0) {
            w7j w7jVar2 = (w7j) this.f286990d;
            int optimizationLevel = motionLayout.getOptimizationLevel();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(motionLayout.getHeight(), 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(motionLayout.getWidth(), 1073741824);
            boolean z = MotionLayout.f633V1;
            motionLayout.m361v(w7jVar2, optimizationLevel, iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        for (v7j v7jVar : w7jVar.f248708u0) {
            v7jVar.f238245j0 = true;
            sparseArray.put(((View) v7jVar.f238241h0).getId(), v7jVar);
        }
        for (v7j v7jVar2 : w7jVar.f248708u0) {
            View view = (View) v7jVar2.f238241h0;
            int id = view.getId();
            HashMap map = c7jVar.f34938g;
            if (map.containsKey(Integer.valueOf(id)) && (x6jVar2 = (x6j) map.get(Integer.valueOf(id))) != null) {
                x6jVar2.m90092b(z7jVar);
            }
            v7jVar2.m84872T(c7jVar.m31740l(view.getId()).f258686e.f269825c);
            v7jVar2.m84867O(c7jVar.m31740l(view.getId()).f258686e.f269827d);
            if (view instanceof f6j) {
                f6j f6jVar = (f6j) view;
                int id2 = f6jVar.getId();
                HashMap map2 = c7jVar.f34938g;
                if (map2.containsKey(Integer.valueOf(id2)) && (x6jVar = (x6j) map2.get(Integer.valueOf(id2))) != null && (v7jVar2 instanceof jq20)) {
                    f6jVar.mo313j(x6jVar, (jq20) v7jVar2, z7jVar, sparseArray);
                }
                if (view instanceof Barrier) {
                    ((Barrier) view).m40868m();
                }
            }
            z7jVar.resolveLayoutDirection(motionLayout.getLayoutDirection());
            boolean z2 = MotionLayout.f633V1;
            motionLayout.m354b(false, view, v7jVar2, z7jVar, sparseArray);
            if (c7jVar.m31740l(view.getId()).f258684c.f13062c == 1) {
                v7jVar2.f238243i0 = view.getVisibility();
            } else {
                v7jVar2.f238243i0 = c7jVar.m31740l(view.getId()).f258684c.f13061b;
            }
        }
        for (v7j v7jVar3 : w7jVar.f248708u0) {
            if (v7jVar3 instanceof vpc1) {
                f6j f6jVar2 = (f6j) v7jVar3.f238241h0;
                jq20 jq20Var = (jq20) v7jVar3;
                f6jVar2.getClass();
                jq20Var.f114775v0 = 0;
                Arrays.fill(jq20Var.f114774u0, (Object) null);
                for (int i = 0; i < f6jVar2.f66419b; i++) {
                    jq20Var.m54027W((v7j) sparseArray.get(f6jVar2.f66418a[i]));
                }
                vpc1 vpc1Var = (vpc1) jq20Var;
                for (int i2 = 0; i2 < vpc1Var.f114775v0; i2++) {
                    v7j v7jVar4 = vpc1Var.f114774u0[i2];
                    if (v7jVar4 != null) {
                        v7jVar4.f238206G = true;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public double m97130n(int i) {
        String str;
        int i2 = this.f286987a;
        if (i2 != 0) {
            return ((double) i) / ((double) i2);
        }
        int i3 = this.f286988b;
        StringBuilder sb = new StringBuilder("ConnectVolumeProvider.transformVolume: maxVolume is 0 (controlType=");
        if (i3 == 1) {
            str = "FIXED";
        } else if (i3 != 2) {
            str = i3 != 3 ? "null" : "ABSOLUTE";
        } else {
            str = "RELATIVE";
        }
        sb.append(str);
        sb.append(")");
        na6.m63957e(sb.toString());
        return 0.0d;
    }

    public zwi(MotionLayout motionLayout) {
        this.f286993g = motionLayout;
        this.f286989c = new w7j();
        this.f286990d = new w7j();
        this.f286991e = null;
        this.f286992f = null;
    }
}
