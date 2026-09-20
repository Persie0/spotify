package p204p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.compose.p002ui.geometry.Offset;
import androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver;
import com.comscore.streaming.ContentType;
import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.mobius.Next;
import com.spotify.playbacknative.AudioDriver;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class sjf1 {

    /* JADX INFO: renamed from: b */
    public static final Object f209841b = new Object();

    /* JADX INFO: renamed from: c */
    public static sd40 f209842c;

    /* JADX INFO: renamed from: d */
    public static sd40 f209843d;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f209844a;

    public /* synthetic */ sjf1(int i) {
        this.f209844a = i;
    }

    /* JADX INFO: renamed from: c */
    public static final void m78318c(int i, String str, String str2, String str3, gh00 gh00Var, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        fyf fyfVarM75772x;
        xq00Var.m91775k0(-2077753747);
        int i2 = i | (xq00Var.m91768h(z) ? 4 : 2) | (xq00Var.m91766g(str) ? 32 : 16) | (xq00Var.m91766g(str2) ? 256 : 128) | (xq00Var.m91766g(str3) ? 2048 : 1024) | (xq00Var.m91770i(fxh0Var) ? 16384 : 8192) | (xq00Var.m91770i(gh00Var) ? 131072 : 65536);
        if (xq00Var.m91752Y(i2 & 1, (74899 & i2) != 74898)) {
            yhu yhuVar = new yhu(4);
            float f = leu.m58816b(xq00Var).f117230b.f224759b;
            float f2 = leu.m58816b(xq00Var).f117230b.f224759b;
            xhu xhuVar = new xhu(new j4m0(f, f2, f, f2), leu.m58816b(xq00Var).f117232d.f137886b, leu.m58816b(xq00Var).f117235g.f159604b, leu.m58816b(xq00Var).f117230b.f224760c, leu.m58818d(xq00Var).f64974j);
            if (str3 == null) {
                xq00Var.m91771i0(707182312);
                xq00Var.m91788r(false);
                fyfVarM75772x = null;
            } else {
                xq00Var.m91771i0(707182313);
                fyfVarM75772x = rkk.m75772x(-1430363892, new jhw(str3, 9, (char) 0), xq00Var);
                xq00Var.m91788r(false);
            }
            fyf fyfVar = fyfVarM75772x;
            boolean z2 = ((458752 & i2) == 131072) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
            Object objM91750T = xq00Var.m91750T();
            if (z2 || objM91750T == t6x0.f217647t) {
                objM91750T = new pg3(gh00Var, str, 3);
                xq00Var.m91793t0(objM91750T);
            }
            z520.m95428h(z, (gh00) objM91750T, yhuVar, xhuVar, fxh0Var, 0, null, null, null, fyfVar, null, null, null, false, null, rkk.m75772x(-555291024, new jhw(str2, 10, (char) 0), xq00Var), xq00Var, i2 & 57358, 196608, 32224);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new y0z(z, str, str2, str3, fxh0Var, gh00Var, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m78319d(w0z w0zVar, fxh0 fxh0Var, gh00 gh00Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(520240237);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(w0zVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            yw70 yw70VarM30763a = bx70.m30763a(0, 3, xq00Var);
            fxh0 fxh0VarM39673I = epv0.m39673I("filter-chips-row", fxh0Var);
            zi5 zi5Var = bj5.f27610a;
            xi5 xi5VarM29370g = bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224761d);
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new wkx(13, w0zVar, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            fyg1.m43086j(fxh0VarM39673I, yw70VarM30763a, null, xi5VarM29370g, null, null, false, null, (gh00) objM91750T, xq00Var, 0, 492);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new evs(w0zVar, fxh0Var, gh00Var, false, i, 25);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m78320e(ih41 ih41Var, fxh0 fxh0Var, fyf fyfVar, xq00 xq00Var, int i, int i2) {
        int i3;
        fxh0 fxh0Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-1936890734);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91766g(ih41Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= xq00Var.m91766g(fxh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= xq00Var.m91770i(fyfVar) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            fxh0 fxh0Var3 = i4 != 0 ? cxh0.f43038a : fxh0Var;
            c8y0 c8y0VarM59893o = ltf1.m59893o(xq00Var);
            int i5 = i3 & 14;
            boolean z = i5 == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == ia7Var) {
                objM91750T = sam.m77674m(new dh41(ih41Var, 0));
                xq00Var.m91793t0(objM91750T);
            }
            fh41 fh41Var = (fh41) ((rv41) objM91750T).getValue();
            boolean z2 = i5 == 4;
            Object objM91750T2 = xq00Var.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                objM91750T2 = new vd41(ih41Var, 2);
                xq00Var.m91793t0(objM91750T2);
            }
            gh00 gh00Var = (gh00) objM91750T2;
            Object objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == ia7Var) {
                objM91750T3 = m541.f140114Z0;
                xq00Var.m91793t0(objM91750T3);
            }
            bx4.m30752a(fh41Var, fxh0Var3, gh00Var, null, "StackNode", (gh00) objM91750T3, rkk.m75772x(922902415, new cj0(c8y0VarM59893o, ih41Var, fyfVar, 20), xq00Var), xq00Var, (i3 & ContentType.LONG_FORM_ON_DEMAND) | 1794048, 8);
            fxh0Var2 = fxh0Var3;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new a4j0(ih41Var, fxh0Var2, fyfVar, i, i2, 12);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m78321f(bc21 bc21Var, po40 po40Var, vvl0 vvl0Var, oo40 oo40Var, cl8 cl8Var, long j) {
        float fIntBitsToFloat;
        jpi0 jpi0Var = (jpi0) cl8Var.f39207c;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (po40Var.f179590c >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (po40Var.f179590c & 4294967295L));
        if (m78327l(po40Var)) {
            cl8Var.f39206b = 0;
            jpi0Var.m53957d();
        }
        if (!m78322g(po40Var) && !m78327l(po40Var)) {
            if (jpi0Var.f114676b == 3) {
                int i = cl8Var.f39206b;
                cl8Var.f39206b = i + 1;
                jpi0Var.m53967n(i, po40Var);
            } else {
                jpi0Var.m53954a(po40Var);
            }
            if (cl8Var.f39206b == 3) {
                cl8Var.f39206b = 0;
            }
            Object[] objArr = jpi0Var.f114675a;
            int i2 = jpi0Var.f114676b;
            float fIntBitsToFloat4 = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((po40) objArr[i3]).f179590c >> 32));
            }
            int i4 = jpi0Var.f114676b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = jpi0Var.f114675a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((po40) objArr2[i5]).f179590c & 4294967295L));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / jpi0Var.f114676b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L);
        if (vvl0Var != null) {
            int i6 = oo40Var.f167459a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
            }
            jFloatToRawIntBits = vvl0Var == vvl0.f245249b ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) : (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        bc21Var.m28661d(po40Var.f179589b, Offset.m257g(jFloatToRawIntBits, j));
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m78322g(po40 po40Var) {
        return po40Var.f179595h && !po40Var.f179591d;
    }

    /* JADX INFO: renamed from: h */
    public static final x6x0 m78323h(x6x0 x6x0Var, gh00 gh00Var) {
        if (x6x0Var instanceof k6x0) {
            return (x6x0) gh00Var.invoke(x6x0Var);
        }
        if ((x6x0Var instanceof r6x0) || (x6x0Var instanceof y5x0)) {
            return x6x0Var;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: i */
    public static final if71 m78324i(if71 if71Var, boolean z, xq00 xq00Var) {
        if (!z) {
            xq00Var.m91771i0(-901304405);
            xq00Var.m91788r(false);
            return if71Var;
        }
        xq00Var.m91771i0(-901820400);
        if (if71Var.equals(leu.m58818d(xq00Var).f64967c)) {
            xq00Var.m91771i0(-1414562414);
            if71Var = leu.m58818d(xq00Var).f64966b;
            xq00Var.m91788r(false);
        } else if (if71Var.equals(leu.m58818d(xq00Var).f64968d)) {
            xq00Var.m91771i0(-1414560114);
            if71Var = leu.m58818d(xq00Var).f64967c;
            xq00Var.m91788r(false);
        } else if (if71Var.equals(leu.m58818d(xq00Var).f64969e)) {
            xq00Var.m91771i0(-1414557969);
            if71Var = leu.m58818d(xq00Var).f64968d;
            xq00Var.m91788r(false);
        } else if (if71Var.equals(leu.m58818d(xq00Var).f64971g)) {
            xq00Var.m91771i0(-1414555794);
            if71Var = leu.m58818d(xq00Var).f64969e;
            xq00Var.m91788r(false);
        } else if (if71Var.equals(leu.m58818d(xq00Var).f64974j)) {
            xq00Var.m91771i0(-1414553682);
            if71Var = leu.m58818d(xq00Var).f64971g;
            xq00Var.m91788r(false);
        } else if (if71Var.equals(leu.m58818d(xq00Var).f64975k)) {
            xq00Var.m91771i0(-1414551438);
            if71Var = leu.m58818d(xq00Var).f64972h;
            xq00Var.m91788r(false);
        } else if (if71Var.equals(leu.m58818d(xq00Var).f64977m)) {
            xq00Var.m91771i0(-1414549235);
            if71Var = leu.m58818d(xq00Var).f64974j;
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(-1414548467);
            xq00Var.m91788r(false);
        }
        xq00Var.m91788r(false);
        return if71Var;
    }

    /* JADX INFO: renamed from: j */
    public static final tzq0 m78325j(xzq0 xzq0Var) {
        return new tzq0(xzq0Var);
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m78326k(String str, up60 up60Var) {
        if (m78332q(str) == null) {
            return false;
        }
        jqv0 jqv0Var = qpv0.f191387a;
        return up60Var.equals(jqv0Var.mo54112b(v140.class)) || up60Var.equals(jqv0Var.mo54112b(daj.class)) || up60Var.equals(jqv0Var.mo54112b(erc1.class));
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m78327l(po40 po40Var) {
        return !po40Var.f179595h && po40Var.f179591d;
    }

    /* JADX INFO: renamed from: m */
    public static final sd40 m78328m() {
        sd40 sd40Var = f209843d;
        if (sd40Var != null) {
            return sd40Var;
        }
        float f = 24;
        rd40 rd40Var = new rd40("Encore.Vector.Plus24", f, f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = c5b1.f34134a;
        pk31 pk31Var = new pk31(n6f.f150862b);
        sep sepVarM62656j = mrx0.m62656j(12.0f, 1.0f);
        sepVarM62656j.m77933g(1.0f, 1.0f, false, true, 1.0f, 1.0f);
        sepVarM62656j.m77927D(9.0f);
        sepVarM62656j.m77942p(9.0f);
        sepVarM62656j.m77933g(1.0f, 1.0f, true, true, 0.0f, 2.0f);
        sepVarM62656j.m77942p(-9.0f);
        sepVarM62656j.m77927D(9.0f);
        sepVarM62656j.m77933g(1.0f, 1.0f, true, true, -2.0f, 0.0f);
        sepVarM62656j.m77927D(-9.0f);
        sepVarM62656j.m77941o(2.0f);
        sepVarM62656j.m77933g(1.0f, 1.0f, true, true, 0.0f, -2.0f);
        sepVarM62656j.m77942p(9.0f);
        sepVarM62656j.m77926C(2.0f);
        sepVarM62656j.m77933g(1.0f, 1.0f, false, true, 1.0f, -1.0f);
        rd40.m75320a(rd40Var, sepVarM62656j.f208338a, pk31Var, 1.0f, 2, 1.0f);
        sd40 sd40VarM75321b = rd40Var.m75321b();
        f209843d = sd40VarM75321b;
        return sd40VarM75321b;
    }

    /* JADX INFO: renamed from: n */
    public static final Intent m78329n(m10 m10Var, dc91 dc91Var, int i, gh00 gh00Var) {
        int i2 = dc91Var.f47465b;
        if (m10Var instanceof ap41) {
            ap41 ap41Var = (ap41) m10Var;
            Intent intentM78331p = m78331p(ap41Var, (eoi0) gh00Var.invoke(ap41Var.f17827b));
            if (intentM78331p.getData() == null) {
                intentM78331p.setData(wqg1.m88765q(dc91Var, i, 5, ""));
            }
            return intentM78331p;
        }
        if (m10Var instanceof gux0) {
            int i3 = ActionCallbackBroadcastReceiver.f892a;
            return wqg1.m88762k(spg1.m78914x(dc91Var.f47464a, i2, (eoi0) gh00Var.invoke(((gux0) m10Var).f84570a)), dc91Var, i);
        }
        if (!(m10Var instanceof re70)) {
            throw new IllegalStateException(("Cannot create fill-in Intent for action type: " + m10Var).toString());
        }
        ComponentName componentName = dc91Var.f47477n;
        if (componentName != null) {
            return wqg1.m88762k(new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i2), dc91Var, i);
        }
        throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
    }

    /* JADX INFO: renamed from: o */
    public static final PendingIntent m78330o(m10 m10Var, dc91 dc91Var, int i, gh00 gh00Var) {
        int i2 = dc91Var.f47465b;
        Context context = dc91Var.f47464a;
        if (m10Var instanceof ap41) {
            ap41 ap41Var = (ap41) m10Var;
            Intent intentM78331p = m78331p(ap41Var, (eoi0) gh00Var.invoke(ap41Var.f17827b));
            if (intentM78331p.getData() == null) {
                intentM78331p.setData(wqg1.m88765q(dc91Var, i, 5, ""));
            }
            return PendingIntent.getActivity(context, 0, intentM78331p, 201326592, ap41Var.f17828c);
        }
        if (m10Var instanceof gux0) {
            int i3 = ActionCallbackBroadcastReceiver.f892a;
            Intent intentM78914x = spg1.m78914x(context, i2, (eoi0) gh00Var.invoke(((gux0) m10Var).f84570a));
            intentM78914x.setData(wqg1.m88765q(dc91Var, i, 5, ""));
            return PendingIntent.getBroadcast(context, 0, intentM78914x, 201326592);
        }
        if (!(m10Var instanceof re70)) {
            throw new IllegalStateException(("Cannot create PendingIntent for action type: " + m10Var).toString());
        }
        ComponentName componentName = dc91Var.f47477n;
        if (componentName == null) {
            throw new IllegalArgumentException("In order to use LambdaAction, actionBroadcastReceiver must be provided");
        }
        Intent intentPutExtra = new Intent().setComponent(componentName).setAction("ACTION_TRIGGER_LAMBDA").putExtra("EXTRA_ACTION_KEY", (String) null).putExtra("EXTRA_APPWIDGET_ID", i2);
        intentPutExtra.setData(wqg1.m88765q(dc91Var, i, 5, null));
        return PendingIntent.getBroadcast(context, 0, intentPutExtra, 201326592);
    }

    /* JADX INFO: renamed from: p */
    public static final Intent m78331p(ap41 ap41Var, eoi0 eoi0Var) {
        if (!(ap41Var instanceof ap41)) {
            throw new IllegalStateException(("Action type not defined in app widget package: " + ap41Var).toString());
        }
        Intent intent = ap41Var.f17826a;
        Map mapUnmodifiableMap = Collections.unmodifiableMap(eoi0Var.f61430a);
        ArrayList arrayList = new ArrayList(mapUnmodifiableMap.size());
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            arrayList.add(new pqm0(((o50) entry.getKey()).f161808a, entry.getValue()));
        }
        pqm0[] pqm0VarArr = (pqm0[]) arrayList.toArray(new pqm0[0]);
        intent.putExtras(pp91.m70529j((pqm0[]) Arrays.copyOf(pqm0VarArr, pqm0VarArr.length)));
        return intent;
    }

    /* JADX INFO: renamed from: q */
    public static final gf41 m78332q(String str) {
        try {
            gf41 gf41Var = new gf41(str);
            if (gf41Var.f79270c == df41.LOCAL_TRACK) {
                return gf41Var;
            }
            return null;
        } catch (SpotifyUriParserException unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    public static final daj m78333r(gf41 gf41Var) {
        hvi0 hvi0Var = cks.f39079b;
        long j = gf41Var.f79276i;
        if (j < 0) {
            j = 0;
        }
        return new daj(14, jwg1.m54450E(j, ils.SECONDS));
    }

    /* JADX INFO: renamed from: s */
    public static final v140 m78334s(gf41 gf41Var) {
        String str = gf41Var.f79272e;
        String str2 = str == null ? "" : str;
        String str3 = gf41Var.f79273f;
        List listSingletonList = (str3 == null || str3.length() == 0) ? lau.f131415a : Collections.singletonList(new t140(str3, ""));
        String str4 = gf41Var.f79274g;
        return new v140(str2, "Track", null, listSingletonList, (str4 == null || str4.length() == 0) ? null : new u140(str4, ""), 4);
    }

    /* JADX INFO: renamed from: t */
    public static final erc1 m78335t(String str) {
        return fjf1.m41834x(str);
    }

    /* JADX INFO: renamed from: u */
    public static cbh0 m78336u() {
        st91 st91Var = st91.f213865b;
        return new cbh0(16, (byte) 0);
    }

    /* JADX INFO: renamed from: v */
    public static final Single m78337v(Single single, int i) {
        return single.onErrorReturn(new zz11(i, 29));
    }

    /* JADX INFO: renamed from: w */
    public static final long m78338w(po40 po40Var, vvl0 vvl0Var, oo40 oo40Var, boolean z) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        long j2 = po40Var.f179594g;
        if (vvl0Var != null) {
            int i = oo40Var.f167459a;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (vvl0Var == vvl0.f245249b) {
                long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
                jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = jFloatToRawIntBits2 << 32;
            } else {
                long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                j = jFloatToRawIntBits3 << 32;
            }
            j2 = j | (jFloatToRawIntBits & 4294967295L);
        }
        long jM256f = Offset.m256f(m78339x(po40Var, vvl0Var, oo40Var), j2);
        if (z || !po40Var.f179596i) {
            return jM256f;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: x */
    public static final long m78339x(po40 po40Var, vvl0 vvl0Var, oo40 oo40Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (vvl0Var == null) {
            return po40Var.f179590c;
        }
        int i = oo40Var.f167459a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (po40Var.f179590c >> 32));
        } else {
            if (i != 2) {
                return po40Var.f179590c;
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (po40Var.f179590c & 4294967295L));
        }
        if (vvl0Var == vvl0.f245249b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    /* JADX INFO: renamed from: y */
    public static Next m78340y(yuf0 yuf0Var, cnf0 cnf0Var) {
        b791 b791Var = yuf0Var.f276343P0;
        return l6l.m58366o(l6l.m58375x(l6l.m58371t(Next.m15606h(yuf0.m94655c(yuf0Var, null, null, null, null, null, null, null, null, null, null, b791.m28366c(b791Var, i0r0.m49376c(b791Var.f24195a, null, null, null, null, null, null, cnf0Var.f40009a, cnf0Var.f40010b, null, null, null, null, null, null, 32381), null, false, false, 14), null, null, null, null, false, 0, null, null, 0, 0, null, null, null, null, null, null, false, null, null, null, null, null, -131073, AudioDriver.SPOTIFY_MAX_VOLUME)))), 3);
    }

    public String toString() {
        switch (this.f209844a) {
            case 16:
                return ((f9h1) this).f67272e.toString();
            default:
                return super.toString();
        }
    }
}
