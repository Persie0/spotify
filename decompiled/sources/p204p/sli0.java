package p204p;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p002ui.platform.ComposeView;
import com.google.android.meet.addons.AddonException;
import com.spotify.music.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import kotlin.NoWhenBranchMatchedException;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$ItemMarkResult;
import spotify.resumption_progress_esperanto.proto.ResumptionProgressEsperanto$MarkAsFinishedResponse;

/* JADX INFO: loaded from: classes7.dex */
public abstract class sli0 {

    /* JADX INFO: renamed from: a */
    public static final ady f210421a = new ady("", 1, 0, 0, "");

    /* JADX INFO: renamed from: b */
    public static sd40 f210422b;

    /* JADX INFO: renamed from: a */
    public static final void m78474a(rvh0 rvh0Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-2122584767);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(rvh0Var) : xq00Var.m91770i(rvh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            d861.m35255a(null, null, 0L, 0L, 0.0f, 0.0f, null, rkk.m75772x(-1704561914, new sf91(4, rvh0Var, gh00Var), xq00Var), xq00Var, 12582912, 127);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yz11(rvh0Var, gh00Var, i, 21);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m78475b(int i, fyf fyfVar, xq00 xq00Var, fxh0 fxh0Var) {
        int i2;
        xq00Var.m91775k0(2064964257);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(fxh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fyfVar) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            m78476c(((i2 << 3) & 896) | (i2 & 14) | 48, fyfVar, xq00Var, fxh0Var);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new br4(fxh0Var, fyfVar, i, 1);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m78476c(int i, fyf fyfVar, xq00 xq00Var, fxh0 fxh0Var) {
        int i2;
        xq00Var.m91775k0(771959668);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(fxh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(fyfVar) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            Object objM91750T = xq00Var.m91750T();
            ia7 ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                yum0 yum0Var = new yum0(null, zhi0.f282936c);
                xq00Var.m91793t0(yum0Var);
                objM91750T = yum0Var;
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            Object objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = new dr4(kqi0Var, 0);
                xq00Var.m91793t0(objM91750T2);
            }
            qqg1.m73532b(a571.f12456b.mo30068a(m78487n((eh00) objM91750T2, xq00Var, 0)), rkk.m75772x(-291176396, new C2493vf(fxh0Var, kqi0Var, fyfVar, 1), xq00Var), xq00Var, 56);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new br4(fxh0Var, fyfVar, i, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m78477d(hku hkuVar, lku lkuVar, xq00 xq00Var, int i) {
        int i2;
        fyf fyfVarM75772x;
        fyf fyfVarM75772x2;
        xq00Var.m91775k0(-1812461956);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91770i(hkuVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(lkuVar) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zM91770i = xq00Var.m91770i(hkuVar);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                hgl hglVar = new hgl(0, hkuVar, hku.class, "cancel", "cancel()V", 0, 0, 18);
                xq00Var.m91793t0(hglVar);
                objM91750T = hglVar;
            }
            eh00 eh00Var = (eh00) objM91750T;
            boolean z = lkuVar.f134451e;
            lhr lhrVar = new lhr(4, z, z, false);
            String str = lkuVar.f134447a;
            if (str == null) {
                xq00Var.m91771i0(1275027775);
                xq00Var.m91788r(false);
                fyfVarM75772x = null;
            } else {
                xq00Var.m91771i0(1275027776);
                fyfVarM75772x = rkk.m75772x(-593076879, new wuh(str, 16, (byte) 0), xq00Var);
                xq00Var.m91788r(false);
            }
            gh00 gh00Var = lkuVar.f134453g;
            if (gh00Var == null) {
                xq00Var.m91771i0(1275115102);
                xq00Var.m91788r(false);
                fyfVarM75772x2 = null;
            } else {
                xq00Var.m91771i0(1275115103);
                fyfVarM75772x2 = rkk.m75772x(1236415492, new aog(27, gh00Var), xq00Var);
                xq00Var.m91788r(false);
            }
            if (fyfVarM75772x2 == null) {
                xq00Var.m91771i0(1275234236);
                String str2 = lkuVar.f134448b;
                if (str2 == null) {
                    xq00Var.m91771i0(1275234235);
                    xq00Var.m91788r(false);
                    fyfVarM75772x2 = null;
                } else {
                    xq00Var.m91771i0(1275234236);
                    fyfVarM75772x2 = rkk.m75772x(-55900630, new wuh(str2, 17, (byte) 0), xq00Var);
                    xq00Var.m91788r(false);
                }
            } else {
                xq00Var.m91771i0(1980794650);
            }
            xq00Var.m91788r(false);
            fyf fyfVar = fyfVarM75772x2;
            fyf fyfVar2 = new fyf(new frp(hkuVar, lkuVar.f134449c, new tgu(4), 25), true, -2000270740);
            fku fkuVar = lkuVar.f134450d;
            kku.m56742b(eh00Var, lhrVar, null, fyfVarM75772x, fyfVar, fyfVar2, fkuVar != null ? new fyf(new frp(hkuVar, fkuVar, wgu.f251150c, 25), true, -2000270740) : null, xq00Var, 0, 4);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new sbu(hkuVar, lkuVar, i, 3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final ur31 m78478e(wr31 wr31Var) {
        switch (wr31Var) {
            case RECENTLY_UPDATED:
                return ur31.f233215i;
            case RECENTLY_ADDED:
                return ur31.f233213g;
            case ALPHABETICAL:
                return ur31.f233207a;
            case CREATOR:
                return ur31.f233209c;
            case CUSTOM:
                return ur31.f233210d;
            case RECENTLY_PLAYED_OR_ADDED:
                return ur31.f233214h;
            case AUTHOR:
                return ur31.f233208b;
            case RELEVANCE:
                return ur31.f233216t;
            case DATE:
                return ur31.f233211e;
            case RELEASE_DATE:
                return ur31.f233212f;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m78479f() {
        if (!wj50.m88271j(Looper.myLooper(), Looper.getMainLooper())) {
            throw new IllegalStateException("EncoreDialogPresenter must be called on the main thread");
        }
    }

    /* JADX INFO: renamed from: g */
    public static b3j0 m78480g(Parcel parcel) {
        if (parcel.readInt() != 0) {
            return igg1.m50537p(parcel);
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static m7t0 m78481h(gh00 gh00Var, gh00 gh00Var2, th00 th00Var, gh00 gh00Var3, int i) {
        j1a1 j1a1Var = xsr.f265652b;
        if ((i & 16) != 0) {
            gh00Var3 = oa50.f163223X;
        }
        icp icpVar = new icp();
        gh00Var3.invoke(icpVar);
        return new m7t0(new ax4(gh00Var, 2), gh00Var2, th00Var, icpVar, true, j1a1Var);
    }

    /* JADX INFO: renamed from: i */
    public static m7t0 m78482i(gh00 gh00Var, th00 th00Var, gh00 gh00Var2, int i) {
        j1a1 j1a1Var = xsr.f265652b;
        if ((i & 8) != 0) {
            gh00Var2 = te90.f219615X;
        }
        icp icpVar = new icp();
        gh00Var2.invoke(icpVar);
        return new m7t0(new x10(14, gh00Var), new ri80(gh00Var, th00Var), th00Var, icpVar, true, j1a1Var);
    }

    /* JADX INFO: renamed from: j */
    public static m7t0 m78483j(ck90 ck90Var, th00 th00Var, jrs0 jrs0Var, int i) {
        j1a1 j1a1Var = xsr.f265652b;
        gh00 gh00Var = jrs0Var;
        if ((i & 8) != 0) {
            gh00Var = te90.f219619Z;
        }
        icp icpVar = new icp();
        gh00Var.invoke(icpVar);
        return new m7t0(new nuv(ck90Var, 5), new ri80(th00Var, ck90Var), th00Var, icpVar, false, j1a1Var);
    }

    /* JADX INFO: renamed from: k */
    public static final String m78484k(ResumptionProgressEsperanto$MarkAsFinishedResponse resumptionProgressEsperanto$MarkAsFinishedResponse) {
        ae50 ae50VarM97902n = resumptionProgressEsperanto$MarkAsFinishedResponse.m97902n();
        ArrayList<ResumptionProgressEsperanto$ItemMarkResult> arrayList = new ArrayList();
        for (Object obj : ae50VarM97902n) {
            if (((ResumptionProgressEsperanto$ItemMarkResult) obj).m97888o() != iax0.ITEM_RESULT_SUCCESS) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (ResumptionProgressEsperanto$ItemMarkResult resumptionProgressEsperanto$ItemMarkResult : arrayList) {
            arrayList2.add(resumptionProgressEsperanto$ItemMarkResult.m97887n() + "=" + resumptionProgressEsperanto$ItemMarkResult.m97888o());
        }
        return "result=" + resumptionProgressEsperanto$MarkAsFinishedResponse.m97903o() + ", failedItems=" + arrayList2;
    }

    /* JADX INFO: renamed from: l */
    public static yzk m78485l() {
        Collection collectionM43714b1;
        try {
            String strM71564X = pxy.m71564X((File) yzk.f277837d.getValue());
            int length = strM71564X.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = wj50.m88282u(strM71564X.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            List listM83876h = yzk.f277836c.m83876h(strM71564X.subSequence(i, length + 1).toString());
            if (listM83876h.isEmpty()) {
                collectionM43714b1 = lau.f131415a;
            } else {
                ListIterator listIterator = listM83876h.listIterator(listM83876h.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionM43714b1 = g6f.m43714b1(listM83876h, listIterator.nextIndex() + 1);
                    }
                }
                collectionM43714b1 = lau.f131415a;
            }
            String[] strArr = (String[]) collectionM43714b1.toArray(new String[0]);
            long j = Long.parseLong(strArr[13]);
            long j2 = Long.parseLong(strArr[14]);
            long j3 = Long.parseLong(strArr[15]);
            long j4 = Long.parseLong(strArr[16]);
            long j5 = Long.parseLong(strArr[21]);
            double dElapsedRealtime = SystemClock.elapsedRealtime() / 1000.0d;
            wg61 wg61Var = yzk.f277838e;
            return new yzk((((j + j2) + j3) + j4) / ((Number) wg61Var.getValue()).doubleValue(), dElapsedRealtime - (j5 / ((Number) wg61Var.getValue()).doubleValue()));
        } catch (IOException | NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static bbg0 m78486m(String str) {
        st91 st91Var = st91.f213865b;
        return new bbg0(str, 0);
    }

    /* JADX INFO: renamed from: n */
    public static final ar4 m78487n(eh00 eh00Var, xq00 xq00Var, int i) {
        Object obj = t6x0.f217647t;
        View view = (View) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f506f);
        boolean zM91766g = xq00Var.m91766g(view);
        Object objM91750T = xq00Var.m91750T();
        if (zM91766g || objM91750T == obj) {
            objM91750T = new ar4(view, null, eh00Var);
            xq00Var.m91793t0(objM91750T);
        }
        ar4 ar4Var = (ar4) objM91750T;
        boolean zM91770i = xq00Var.m91770i(ar4Var);
        Object objM91750T2 = xq00Var.m91750T();
        if (zM91770i || objM91750T2 == obj) {
            objM91750T2 = new uq4(ar4Var, 3);
            xq00Var.m91793t0(objM91750T2);
        }
        hz40.m49233e(ar4Var, (gh00) objM91750T2, xq00Var);
        return ar4Var;
    }

    /* JADX INFO: renamed from: o */
    public static final void m78488o(TextView textView) {
        vc41 vc41Var = vc41.CHEVRON_RIGHT;
        Context context = textView.getContext();
        tc41 tc41Var = new tc41(context, vc41Var, context.getResources().getDimension(R.dimen.text_view_icon_size));
        tc41Var.m80417b(context.getColor(R.color.white));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, tc41Var, (Drawable) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2, types: [p.hc80] */
    /* JADX WARN: Type inference failed for: r3v3, types: [p.hc80] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [p.ijc1] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.app.Activity, android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v1, types: [p.dir] */
    /* JADX WARN: Type inference failed for: r7v2, types: [p.h9y0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX INFO: renamed from: p */
    public static final hku m78489p(Activity activity, lku lkuVar) {
        ?? r6;
        ijc1 ijc1Var;
        hc80 hc80Var;
        m78479f();
        ?? r0 = (ViewGroup) activity.getWindow().getDecorView();
        ComposeView composeView = new ComposeView(activity, null, 0, 6, null);
        ?? dirVar = new dir(0);
        ?? M40067h = eug1.m40067h(r0);
        if (M40067h == 0) {
            if (activity instanceof hc80) {
                hc80Var = (hc80) activity;
            } else {
                M40067h = 0;
            }
            if (M40067h == 0) {
                M40067h = hc80Var;
                M40067h = dirVar;
            }
        }
        M40067h = hc80Var;
        hku hkuVar = new hku(composeView, dirVar, lkuVar);
        composeView.setViewCompositionStrategy(fkr0.f70595U0);
        eug1.m40073o(composeView, M40067h);
        if (activity instanceof ijc1) {
            ijc1Var = (ijc1) activity;
        } else {
            r6 = 0;
        }
        if (r6 == 0) {
            r6 = ijc1Var;
            r6 = dirVar;
        }
        r6 = ijc1Var;
        lug1.m59989F(composeView, r6);
        h9y0 h9y0Var = activity instanceof h9y0 ? (h9y0) activity : null;
        if (h9y0Var != null) {
            dirVar = h9y0Var;
        }
        y85.m93047D(composeView, dirVar);
        gb80 lifecycle = M40067h.getLifecycle();
        hkuVar.f92526d = lifecycle;
        lifecycle.mo31986a(hkuVar);
        composeView.addOnAttachStateChangeListener(hkuVar);
        if (lifecycle.mo31987b() == fb80.f67750a) {
            hkuVar.m47854b();
        }
        if (!hkuVar.f92527e) {
            return hkuVar;
        }
        composeView.setTag(hkuVar);
        composeView.setContent(new fyf(new mku(hkuVar, lkuVar, 1), true, -179874898));
        r0.addView(composeView, new FrameLayout.LayoutParams(0, 0));
        return hkuVar;
    }

    /* JADX INFO: renamed from: q */
    public static final boolean m78490q(max0 max0Var, ae50 ae50Var) {
        if (max0Var != max0.RESPONSE_RESULT_SUCCESS) {
            return false;
        }
        if (ae50Var != null && ae50Var.isEmpty()) {
            return true;
        }
        Iterator<E> it = ae50Var.iterator();
        while (it.hasNext()) {
            if (((ResumptionProgressEsperanto$ItemMarkResult) it.next()).m97888o() != iax0.ITEM_RESULT_SUCCESS) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static void m78491r(b3j0 b3j0Var, Parcel parcel) {
        if (b3j0Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            igg1.m50521A(b3j0Var, parcel);
        }
    }

    /* JADX INFO: renamed from: s */
    public static AddonException m78492s(pv1 pv1Var) {
        Optional.empty();
        return new AddonException(null, pv1Var);
    }

    /* JADX INFO: renamed from: t */
    public static AddonException m78493t(String str, String str2) {
        Optional.of(new kwf1(str2));
        return new AddonException(str, pv1.f181560b);
    }
}
