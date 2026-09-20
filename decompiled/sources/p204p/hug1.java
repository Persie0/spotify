package p204p;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import com.spotify.music.R;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class hug1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f95407a;

    /* JADX INFO: renamed from: a */
    public static final void m48656a(gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(513966434);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(gh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            String strM54977L = k0e1.m54977L(R.string.max_children_reached_title, xq00Var);
            String strM54977L2 = k0e1.m54977L(R.string.denial_error_close_button, xq00Var);
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new t0c0(17, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            glg1.m45152c(strM54977L, strM54977L2, null, true, (eh00) objM91750T, xq00Var, 3072, 4);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new z3d0(gh00Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final c9k m48657b() {
        return kk40.m56661c(opo.m67570t(njg1.m64613f(), new ivu0(efy.f59152X0)));
    }

    /* JADX INFO: renamed from: c */
    public static final ArrayList m48658c(ArrayList arrayList) {
        gmi gmiVar;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            lo11 lo11Var = (lo11) it.next();
            if (lo11Var instanceof ko11) {
                gmiVar = new gmi(new imi(((ko11) lo11Var).f124500a));
            } else {
                if (!(lo11Var instanceof jo11)) {
                    throw new NoWhenBranchMatchedException();
                }
                jo11 jo11Var = (jo11) lo11Var;
                gmiVar = new gmi(new hmi(jo11Var.f114269a, jo11Var.f114272d, jo11Var.f114270b, jo11Var.f114271c));
            }
            arrayList2.add(gmiVar);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: d */
    public static final cbm0 m48659d(int i) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
            return xgg1.m90662N1("AGE_SIGNAL_SIGNUP_CONFIRM_AGE", "age-signal/signup/confirm-age", 134, "age-signal");
        }
        if (iM38547C == 1) {
            AtomicReferenceArray atomicReferenceArray2 = cbm0.f36163e;
            return xgg1.m90662N1("AGE_SIGNAL_SIGNUP_ASK_PARENT", "age-signal/signup/ask-parent", 133, "age-signal");
        }
        if (iM38547C != 2) {
            throw new NoWhenBranchMatchedException();
        }
        AtomicReferenceArray atomicReferenceArray3 = cbm0.f36163e;
        return xgg1.m90662N1("AGE_SIGNAL_SIGNUP_MANAGED_ACCOUNT", "age-signal/signup/managed-account", 135, "age-signal");
    }

    /* JADX INFO: renamed from: e */
    public static final void m48660e(azp0 azp0Var) {
        it4 it4Var = new it4(3);
        jqv0 jqv0Var = qpv0.f191387a;
        azp0Var.m27657p(it4Var, jqv0Var.mo54112b(String.class));
        azp0Var.m27657p(new it4(1), jqv0Var.mo54112b(tbn0.class));
        lo4 lo4Var = new lo4(3);
        up60 up60VarMo54112b = jqv0Var.mo54112b(mja1.class);
        ArrayList arrayList = (ArrayList) azp0Var.f21666d;
        arrayList.add(new pqm0(lo4Var, up60VarMo54112b));
        arrayList.add(new pqm0(new uja1(), jqv0Var.mo54112b(mja1.class)));
        azp0Var.m27655n(new hb6(6), jqv0Var.mo54112b(mja1.class));
        azp0Var.m27655n(new hb6(1), jqv0Var.mo54112b(byte[].class));
        azp0Var.m27655n(new hb6(4), jqv0Var.mo54112b(mja1.class));
    }

    /* JADX INFO: renamed from: f */
    public static final void m48661f(azp0 azp0Var, fvu0 fvu0Var) {
        if (((Boolean) zuj0.m97056s(fvu0Var.f73868b.f207348n, tw41.f224311a)).booleanValue()) {
            ((ArrayList) azp0Var.f21667e).add(new saa0(9));
            ((ArrayList) azp0Var.f21668f).add(new saa0(10));
        }
    }

    /* JADX INFO: renamed from: g */
    public static final Object m48662g(x8b x8bVar, fbk fbkVar) {
        hqb hqbVar = new hqb(1, seg1.m77914f(fbkVar));
        hqbVar.m48222q();
        hqbVar.mo42415l(new b8i(x8bVar, 2));
        x8bVar.mo52182p(new ae00(hqbVar, 16));
        return hqbVar.m48221p();
    }

    /* JADX INFO: renamed from: h */
    public static final Object m48663h(x8b x8bVar, fbk fbkVar) {
        hqb hqbVar = new hqb(1, seg1.m77914f(fbkVar));
        hqbVar.m48222q();
        hqbVar.mo42415l(new pb70(x8bVar, 1));
        x8bVar.mo52182p(new qb70(hqbVar));
        return hqbVar.m48221p();
    }

    /* JADX INFO: renamed from: i */
    public static final Object m48664i(x8b x8bVar, fbk fbkVar) {
        hqb hqbVar = new hqb(1, seg1.m77914f(fbkVar));
        hqbVar.m48222q();
        hqbVar.mo42415l(new pb70(x8bVar, 0));
        x8bVar.mo52182p(new cdv(hqbVar, 25));
        return hqbVar.m48221p();
    }

    /* JADX INFO: renamed from: j */
    public static final String m48665j(Context context, u2s u2sVar) {
        String str = u2sVar.f226159d;
        String str2 = u2sVar.f226158c;
        if (str2 == null || str == null) {
            return str != null ? m48668m(context, u2sVar.f226156a, R.string.download_button_downloadable_content_description_with_entity, R.string.download_button_pending_content_description_with_entity, R.string.download_button_downloading_content_description_with_entity, R.string.download_button_downloaded_content_description_with_entity, R.string.download_button_error_content_description_with_entity, R.string.download_button_disabled_content_description_with_entity, new String[]{str}) : m48668m(context, u2sVar.f226156a, R.string.download_button_downloadable_content_description, R.string.download_button_pending_content_description, R.string.download_button_downloading_content_description, R.string.download_button_downloaded_content_description, R.string.download_button_error_content_description, R.string.download_button_disabled_content_description, new String[0]);
        }
        return m48668m(context, u2sVar.f226156a, R.string.download_button_downloadable_content_description_with_context, R.string.download_button_pending_content_description_with_context, R.string.download_button_downloading_content_description_with_context, R.string.download_button_downloaded_content_description_with_context, R.string.download_button_error_content_description_with_context, R.string.download_button_disabled_content_description_with_context, new String[]{str2, str});
    }

    /* JADX INFO: renamed from: k */
    public static final float m48666k(int i, int i2, float[] fArr) {
        return fArr[((i - i2) * 2) + 1];
    }

    /* JADX INFO: renamed from: l */
    public static final s3j m48667l(bmi bmiVar) {
        qf40 qf40Var = bmiVar.f28559v;
        ArrayList arrayList = new ArrayList(i6f.m49804T(qf40Var, 10));
        Iterator<E> it = qf40Var.iterator();
        while (it.hasNext()) {
            arrayList.add(((emi) it.next()).f60920a);
        }
        return new s3j(new v3j(arrayList, g6f.m43728j1(bmiVar.f28560w)), bmiVar.f28563z, bmiVar.f28560w, bmiVar.f28561x, 16);
    }

    /* JADX INFO: renamed from: m */
    public static final String m48668m(Context context, x9s x9sVar, int i, int i2, int i3, int i4, int i5, int i6, String[] strArr) {
        if (!(x9sVar instanceof p9s)) {
            if (x9sVar instanceof v9s) {
                i = i2;
            } else if (x9sVar instanceof s9s) {
                i = i3;
            } else if (x9sVar instanceof q9s) {
                i = i4;
            } else if (x9sVar instanceof t9s) {
                i = i5;
            } else {
                if (!wj50.m88271j(x9sVar, n9s.f151855a)) {
                    if (wj50.m88271j(x9sVar, u9s.f228263a)) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                i = i6;
            }
        }
        return context.getString(i, Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static ofm0 m48669n(View view) {
        ofm0 ofm0VarM48670o = m48670o(view);
        if (ofm0VarM48670o != null) {
            return ofm0VarM48670o;
        }
        ofm0 ofm0Var = null;
        try {
            i500 i500VarM31593H = c700.m31593H(view);
            if (i500VarM31593H == 0) {
                throw new IllegalStateException("View " + view + " does not have a Fragment set");
            }
            ofm0 ofm0Var2 = i500VarM31593H instanceof ofm0 ? (ofm0) i500VarM31593H : null;
            if (ofm0Var2 == null) {
                LayoutInflater.Factory factoryM49715n0 = i500VarM31593H.m49715n0();
                ofm0Var2 = factoryM49715n0 instanceof ofm0 ? (ofm0) factoryM49715n0 : null;
            }
            if (ofm0Var2 != null) {
                return ofm0Var2;
            }
            for (Object obj : btz0.m30487K(view.getContext(), hhc1.f91356i)) {
                ofm0 ofm0Var3 = obj instanceof ofm0 ? (ofm0) obj : null;
                if (ofm0Var3 != null) {
                    ofm0Var = ofm0Var3;
                    break;
                }
            }
            if (ofm0Var != null) {
                return ofm0Var;
            }
            throw new IllegalStateException("No page properties in view hierarchy");
        } catch (IllegalStateException unused) {
        }
    }

    /* JADX INFO: renamed from: o */
    public static ofm0 m48670o(View view) {
        Object tag = view.getTag(R.id.view_tree_page_properties);
        ofm0 ofm0Var = tag instanceof ofm0 ? (ofm0) tag : null;
        if (ofm0Var != null) {
            return ofm0Var;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            return m48670o(view2);
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static final int[] m48671p(bb71 bb71Var, Layout layout, bmx bmxVar, RectF rectF, int i, nk4 nk4Var) {
        egz0 hx10Var;
        int i2;
        if (i == 1) {
            hx10Var = new uj81(27, bb71Var.f25459f.getText(), bb71Var.m28625j());
        } else {
            CharSequence text = bb71Var.f25459f.getText();
            hx10Var = Build.VERSION.SDK_INT >= 29 ? new hx10(text, bb71Var.f25454a) : new ix10(text);
        }
        egz0 egz0Var = hx10Var;
        int lineForVertical = layout.getLineForVertical((int) rectF.top);
        if (rectF.top > bb71Var.m28620e(lineForVertical) && (lineForVertical = lineForVertical + 1) >= bb71Var.f25460g) {
            return null;
        }
        int i3 = lineForVertical;
        int lineForVertical2 = layout.getLineForVertical((int) rectF.bottom);
        if (lineForVertical2 == 0 && rectF.bottom < bb71Var.m28622g(0)) {
            return null;
        }
        int iM48672q = m48672q(bb71Var, layout, bmxVar, i3, rectF, egz0Var, nk4Var, true);
        while (true) {
            i2 = i3;
            if (iM48672q != -1 || i2 >= lineForVertical2) {
                break;
            }
            i3 = i2 + 1;
            iM48672q = m48672q(bb71Var, layout, bmxVar, i3, rectF, egz0Var, nk4Var, true);
        }
        if (iM48672q == -1) {
            return null;
        }
        int iM48672q2 = m48672q(bb71Var, layout, bmxVar, lineForVertical2, rectF, egz0Var, nk4Var, false);
        while (iM48672q2 == -1 && i2 < lineForVertical2) {
            int i4 = lineForVertical2 - 1;
            iM48672q2 = m48672q(bb71Var, layout, bmxVar, i4, rectF, egz0Var, nk4Var, false);
            lineForVertical2 = i4;
        }
        if (iM48672q2 == -1) {
            return null;
        }
        return new int[]{egz0Var.mo30541d(iM48672q + 1), egz0Var.mo30542e(iM48672q2 - 1)};
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0263 A[EDGE_INSN: B:144:0x0263->B:171:0x02bf BREAK  A[LOOP:5: B:154:0x027f->B:206:0x027f]] */
    /* JADX INFO: renamed from: q */
    public static final int m48672q(bb71 bb71Var, Layout layout, bmx bmxVar, int i, RectF rectF, egz0 egz0Var, nk4 nk4Var, boolean z) {
        no70[] no70VarArr;
        int i2;
        no70[] no70VarArr2;
        int i3;
        int iMo30542e;
        int i4;
        int i5;
        int iMo30541d;
        Bidi bidiCreateLineBidi;
        float fM89175b;
        float fM89175b2;
        float fM89175b3;
        int lineTop = layout.getLineTop(i);
        int lineBottom = layout.getLineBottom(i);
        int lineStart = layout.getLineStart(i);
        int lineEnd = layout.getLineEnd(i);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i6 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i6];
        Layout layout2 = bb71Var.f25459f;
        int lineStart2 = layout2.getLineStart(i);
        int iM28621f = bb71Var.m28621f(i);
        if (i6 < (iM28621f - lineStart2) * 2) {
            nt40.m65597a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        ww8 ww8Var = new ww8(bb71Var);
        boolean z2 = false;
        boolean z3 = layout2.getParagraphDirection(i) == 1;
        int i7 = 0;
        while (lineStart2 < iM28621f) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z3 && !zIsRtlCharAt) {
                fM89175b = ww8Var.m89175b(lineStart2, z2, z2, true);
                fM89175b3 = ww8Var.m89175b(lineStart2 + 1, true, true, true);
            } else if (z3 && zIsRtlCharAt) {
                fM89175b3 = ww8Var.m89175b(lineStart2, false, false, false);
                fM89175b = ww8Var.m89175b(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fM89175b2 = ww8Var.m89175b(lineStart2, false, false, true);
                    fM89175b = ww8Var.m89175b(lineStart2 + 1, true, true, true);
                } else {
                    fM89175b = ww8Var.m89175b(lineStart2, false, false, false);
                    fM89175b2 = ww8Var.m89175b(lineStart2 + 1, true, true, false);
                }
                fM89175b3 = fM89175b2;
            }
            fArr[i7] = fM89175b;
            fArr[i7 + 1] = fM89175b3;
            i7 += 2;
            lineStart2++;
            z3 = z3;
            z2 = false;
        }
        Layout layout3 = (Layout) bmxVar.f28644b;
        int lineStart3 = layout3.getLineStart(i);
        int lineEnd2 = layout3.getLineEnd(i);
        int iM29915r = bmxVar.m29915r(lineStart3, false);
        int iM29916s = bmxVar.m29916s(iM29915r);
        int i8 = lineStart3 - iM29916s;
        int i9 = lineEnd2 - iM29916s;
        Bidi bidiM29906i = bmxVar.m29906i(iM29915r);
        if (bidiM29906i == null || (bidiCreateLineBidi = bidiM29906i.createLineBidi(i8, i9)) == null) {
            no70VarArr = new no70[]{new no70(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            no70VarArr = new no70[runCount];
            int i10 = 0;
            while (i10 < runCount) {
                int i11 = runCount;
                no70VarArr[i10] = new no70(bidiCreateLineBidi.getRunStart(i10) + lineStart3, bidiCreateLineBidi.getRunLimit(i10) + lineStart3, bidiCreateLineBidi.getRunLevel(i10) % 2 == 1);
                i10++;
                runCount = i11;
            }
        }
        z350 b450Var = z ? new b450(0, no70VarArr.length - 1, 1) : g0g1.m43304i(no70VarArr.length - 1, 0, -1);
        int i12 = b450Var.f278778a;
        int i13 = b450Var.f278779b;
        int i14 = b450Var.f278780c;
        if ((i14 <= 0 || i12 > i13) && (i14 >= 0 || i13 > i12)) {
            return -1;
        }
        while (true) {
            no70 no70Var = no70VarArr[i12];
            boolean z4 = no70Var.f156614c;
            int iMo30540b = no70Var.f156612a;
            int iMo30543h = no70Var.f156613b;
            float f = z4 ? fArr[((iMo30543h - 1) - lineStart) * 2] : fArr[(iMo30540b - lineStart) * 2];
            float fM48666k = z4 ? m48666k(iMo30540b, lineStart, fArr) : m48666k(iMo30543h - 1, lineStart, fArr);
            if (z) {
                float f2 = rectF.left;
                if (fM48666k >= f2) {
                    i2 = i14;
                    float f3 = rectF.right;
                    if (f <= f3) {
                        if ((z4 || f2 > f) && (!z4 || f3 < fM48666k)) {
                            int i15 = iMo30543h;
                            int i16 = iMo30540b;
                            while (true) {
                                i4 = i15;
                                if (i15 - i16 <= 1) {
                                    break;
                                }
                                int i17 = (i4 + i16) / 2;
                                float f4 = fArr[(i17 - lineStart) * 2];
                                if ((z4 || f4 <= rectF.left) && (!z4 || f4 >= rectF.right)) {
                                    i15 = i4;
                                    i16 = i17;
                                } else {
                                    i15 = i17;
                                }
                            }
                            i5 = z4 ? i4 : i16;
                        } else {
                            i5 = iMo30540b;
                        }
                        int iMo30542e2 = egz0Var.mo30542e(i5);
                        if (iMo30542e2 != -1 && (iMo30541d = egz0Var.mo30541d(iMo30542e2)) < iMo30543h) {
                            if (iMo30541d >= iMo30540b) {
                                iMo30540b = iMo30541d;
                            }
                            if (iMo30542e2 > iMo30543h) {
                                iMo30542e2 = iMo30543h;
                            }
                            no70VarArr2 = no70VarArr;
                            RectF rectF2 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                            int iMo30542e3 = iMo30542e2;
                            while (true) {
                                rectF2.left = z4 ? fArr[((iMo30542e3 - 1) - lineStart) * 2] : fArr[(iMo30540b - lineStart) * 2];
                                rectF2.right = z4 ? m48666k(iMo30540b, lineStart, fArr) : m48666k(iMo30542e3 - 1, lineStart, fArr);
                                if (((Boolean) nk4Var.invoke(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                iMo30540b = egz0Var.mo30540b(iMo30540b);
                                if (iMo30540b != -1 && iMo30540b < iMo30543h) {
                                    iMo30542e3 = egz0Var.mo30542e(iMo30540b);
                                    if (iMo30542e3 > iMo30543h) {
                                        iMo30542e3 = iMo30543h;
                                    }
                                }
                            }
                        }
                        iMo30540b = -1;
                        break;
                    }
                } else {
                    i2 = i14;
                }
                no70VarArr2 = no70VarArr;
                iMo30540b = -1;
                break;
            } else {
                i2 = i14;
                no70VarArr2 = no70VarArr;
                float f5 = rectF.left;
                if (fM48666k < f5) {
                    iMo30543h = -1;
                    break;
                }
                float f6 = rectF.right;
                if (f <= f6) {
                    if ((z4 || f6 < fM48666k) && (!z4 || f5 > f)) {
                        int i18 = iMo30543h;
                        int i19 = iMo30540b;
                        while (i18 - i19 > 1) {
                            int i20 = (i18 + i19) / 2;
                            float f7 = fArr[(i20 - lineStart) * 2];
                            int i21 = i18;
                            if ((z4 || f7 <= rectF.right) && (!z4 || f7 >= rectF.left)) {
                                i18 = i21;
                                i19 = i20;
                            } else {
                                i18 = i20;
                            }
                        }
                        i3 = z4 ? i18 : i19;
                    } else {
                        i3 = iMo30543h - 1;
                    }
                    int iMo30541d2 = egz0Var.mo30541d(i3 + 1);
                    if (iMo30541d2 == -1 || (iMo30542e = egz0Var.mo30542e(iMo30541d2)) <= iMo30540b) {
                        iMo30543h = -1;
                        break;
                    }
                    if (iMo30541d2 < iMo30540b) {
                        iMo30541d2 = iMo30540b;
                    }
                    if (iMo30542e <= iMo30543h) {
                        iMo30543h = iMo30542e;
                    }
                    RectF rectF3 = new RectF(0.0f, lineTop, 0.0f, lineBottom);
                    int iMo30541d3 = iMo30541d2;
                    while (true) {
                        rectF3.left = z4 ? fArr[((iMo30543h - 1) - lineStart) * 2] : fArr[(iMo30541d3 - lineStart) * 2];
                        rectF3.right = z4 ? m48666k(iMo30541d3, lineStart, fArr) : m48666k(iMo30543h - 1, lineStart, fArr);
                        if (((Boolean) nk4Var.invoke(rectF3, rectF)).booleanValue()) {
                            break;
                        }
                        iMo30543h = egz0Var.mo30543h(iMo30543h);
                        if (iMo30543h == -1 || iMo30543h <= iMo30540b) {
                            iMo30543h = -1;
                            break;
                        }
                        iMo30541d3 = egz0Var.mo30541d(iMo30543h);
                        if (iMo30541d3 < iMo30540b) {
                            iMo30541d3 = iMo30540b;
                        }
                    }
                } else {
                    iMo30543h = -1;
                    break;
                }
                iMo30540b = iMo30543h;
            }
            if (iMo30540b >= 0) {
                return iMo30540b;
            }
            if (i12 == i13) {
                return -1;
            }
            i12 += i2;
            i14 = i2;
            no70VarArr = no70VarArr2;
        }
    }

    /* JADX INFO: renamed from: r */
    public static final t050 m48673r(z8k z8kVar, fjk0 fjk0Var, fjk0 fjk0Var2, fjk0 fjk0Var3, fjk0 fjk0Var4, fjk0 fjk0Var5, fjk0 fjk0Var6) {
        return ((b9k) z8kVar).m28489g("AgeAssuranceVideoBlockerDaemon", new jq9(fjk0Var, fjk0Var2, fjk0Var3, fjk0Var4, fjk0Var5, fjk0Var6, 10));
    }

    /* JADX INFO: renamed from: s */
    public static zbn0 m48674s(jm60 jm60Var, u8b0 u8b0Var) {
        return new zbn0(u8b0Var, yz60.m94964b(jm60Var, u8b0Var, x0b1.m89551c(), wej0.f250565f, jm60Var.mo53768p() == 3, false));
    }

    /* JADX INFO: renamed from: t */
    public static boolean m48675t(hb4 hb4Var) {
        return hb4Var.m46986d();
    }

    /* JADX INFO: renamed from: u */
    public static void m48676u(View view, dcm0 dcm0Var) {
        view.setTag(R.id.view_tree_page_properties, dcm0Var.f47583d.m41329b().mo24326a());
    }

    /* JADX INFO: renamed from: v */
    public static final ju01 m48677v(Bundle bundle) {
        Object objM96523K = zn91.m96523K(bundle, "share.args", ju01.class);
        if (objM96523K != null) {
            return (ju01) objM96523K;
        }
        throw new IllegalArgumentException("No share arguments in bundle.");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    public static final void m48678w(Throwable th, fbk fbkVar) {
        rb70 rb70Var;
        if (fbkVar instanceof rb70) {
            rb70Var = (rb70) fbkVar;
            int i = rb70Var.f197519b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rb70Var.f197519b = i - Integer.MIN_VALUE;
            } else {
                rb70Var = new rb70(fbkVar);
            }
        } else {
            rb70Var = new rb70(fbkVar);
        }
        Object obj = rb70Var.f197518a;
        int i2 = rb70Var.f197519b;
        if (i2 != 0) {
            if (i2 == 1) {
                throw edb.m38575x(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(obj);
        rb70Var.f197519b = 1;
        xsr.f265651a.mo30646r(rb70Var.getContext(), new lk00(25, rb70Var, th));
    }
}
