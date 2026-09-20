package p204p;

import android.content.ContentResolver;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.esperanto.esperantoimpl.SchedulingTransport;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class izg1 {

    /* JADX INFO: renamed from: a */
    public static sd40 f107219a;

    /* JADX INFO: renamed from: a */
    public static final void m52000a(fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00 xq00Var2;
        xq00Var.m91775k0(-1663634930);
        int i2 = i | 6;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 3) != 2)) {
            fxh0Var = cxh0.f43038a;
            xq00Var2 = xq00Var;
            p271.m68899b(mi21.m61814B(fxh0Var, null, 3), 6, 0L, 0L, xq00Var2, 48, 12);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1885g5(fxh0Var, i, 15);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m52001b(iv70 iv70Var, Object obj, int i, Object obj2, xq00 xq00Var, int i2) {
        xq00Var.m91775k0(1439843069);
        int i3 = (xq00Var.m91766g(iv70Var) ? 4 : 2) | i2 | (xq00Var.m91766g(obj) ? 32 : 16) | (xq00Var.m91762e(i) ? 256 : 128) | (xq00Var.m91766g(obj2) ? 2048 : 1024);
        if (xq00Var.m91752Y(i3 & 1, (i3 & 1171) != 1170)) {
            ((b8y0) obj).mo28441e(obj2, rkk.m75772x(980966366, new l15(i, obj2, iv70Var), xq00Var), xq00Var, 48);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new oo4(iv70Var, obj, i, obj2, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m52002c(kl71 kl71Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(1634687309);
        int i2 = (xq00Var.m91766g(kl71Var) ? 4 : 2) | i | 48;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((Configuration) xq00Var.m91774k(AndroidCompositionLocals_androidKt.f501a)).orientation == 2;
            String strM54977L = k0e1.m54977L(R.string.time_cap_pivot_upsell_accessibility_label, xq00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM55316t = k3u0.m55316t(cxh0Var, null, 3);
            boolean zM91766g = xq00Var.m91766g(strM54977L);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == t6x0.f217647t) {
                objM91750T = new e151(strM54977L, 19);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(fxh0VarM55316t, false, (gh00) objM91750T);
            if (z) {
                xq00Var.m91771i0(-1664053868);
                dzg1.m37456j(kl71Var, fxh0VarM96644b, xq00Var, i2 & 14);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1663951723);
                fzg1.m43199b(kl71Var, fxh0VarM96644b, xq00Var, i2 & 14);
                xq00Var.m91788r(false);
            }
            fxh0Var = cxh0Var;
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new d361(kl71Var, fxh0Var, i, 15);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m52004e(View view, s4r0 s4r0Var, s4r0 s4r0Var2) {
        okv0 okv0Var = new okv0(new nlv0(), s4r0Var, new Handler(Looper.getMainLooper()), s4r0Var2, view);
        if (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnDrawListener(okv0Var);
        } else {
            view.addOnAttachStateChangeListener(new rrp(8, view, okv0Var));
        }
    }

    /* JADX INFO: renamed from: f */
    public static final t12 m52005f(u12 u12Var) {
        v12 v12Var = (v12) u12Var.f225650d;
        jg31.m53271i(v12Var);
        ContentResolver contentResolver = (ContentResolver) u12Var.f225651e;
        jg31.m53271i(contentResolver);
        Flowable flowable = (Flowable) u12Var.f225648b;
        jg31.m53271i(flowable);
        Scheduler scheduler = (Scheduler) u12Var.f225652f;
        jg31.m53271i(scheduler);
        luk lukVar = (luk) u12Var.f225649c;
        jg31.m53271i(lukVar);
        Handler handler = new Handler(Looper.getMainLooper());
        hz6 hz6Var = (hz6) u12Var.f225656t;
        jg31.m53271i(hz6Var);
        om0 om0Var = (om0) u12Var.f225645X;
        jg31.m53271i(om0Var);
        b22 b22Var = new b22(handler, hz6Var, om0Var);
        lwc1 lwc1Var = (lwc1) u12Var.f225653g;
        jg31.m53271i(lwc1Var);
        xu61 xu61Var = (xu61) u12Var.f225646Y;
        jg31.m53271i(xu61Var);
        s1e1 s1e1Var = new s1e1(v12Var, om0Var, new lh51(xu61Var, lukVar), 14);
        ecr ecrVar = (ecr) u12Var.f225654h;
        jg31.m53271i(ecrVar);
        gb80 gb80Var = (gb80) u12Var.f225655i;
        jg31.m53271i(gb80Var);
        return new t12(v12Var, contentResolver, flowable, scheduler, lukVar, b22Var, lwc1Var, s1e1Var, ecrVar, gb80Var);
    }

    /* JADX INFO: renamed from: g */
    public static final C2048kd m52006g(SchedulingTransport schedulingTransport) {
        return new C2048kd(schedulingTransport);
    }

    /* JADX INFO: renamed from: h */
    public static final RecyclerView m52007h(View view) {
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        C2042k7 c2042k7 = new C2042k7((ViewGroup) view, 8);
        while (c2042k7.hasNext()) {
            RecyclerView recyclerViewM52007h = m52007h((View) c2042k7.next());
            if (recyclerViewM52007h != null) {
                return recyclerViewM52007h;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static j4m0 m52008i(xq00 xq00Var) {
        return new j4m0(leu.m58816b(xq00Var).f117230b.f224759b, leu.m58816b(xq00Var).f117230b.f224759b, 14 + 56, 0);
    }

    /* JADX INFO: renamed from: j */
    public static final String m52009j(int i, Resources resources) {
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            return resources.getString(R.string.follow_button_active_content_description);
        }
        if (iM38547C == 1) {
            return resources.getString(R.string.follow_button_content_description);
        }
        if (iM38547C == 2) {
            return resources.getString(R.string.follow_back_button_unselected_state_text);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: k */
    public static j4m0 m52010k(xq00 xq00Var) {
        return zsf1.m96850j(leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, leu.m58816b(xq00Var).f117230b.f224763f, 0.0f, 10);
    }

    /* JADX INFO: renamed from: l */
    public static final int m52011l(zq50 zq50Var) {
        if (zq50Var instanceof iw2) {
            return 3;
        }
        if (zq50Var instanceof aq5) {
            return 1;
        }
        if (zq50Var instanceof dep0) {
            return 2;
        }
        if ((zq50Var instanceof mb81) || (zq50Var instanceof rw6) || (zq50Var instanceof b67) || (zq50Var instanceof n87) || (zq50Var instanceof g410) || (zq50Var instanceof hmr0) || (zq50Var instanceof jn7) || (zq50Var instanceof kuh) || (zq50Var instanceof s5b1) || (zq50Var instanceof bs60) || (zq50Var instanceof k38) || (zq50Var instanceof h6z0) || (zq50Var instanceof pzp0)) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: m */
    public static final LinkedHashMap m52012m(vl11 vl11Var) {
        ArrayList arrayList = new ArrayList();
        qkf1.m73094o("eq", arrayList, "available", vl11Var.f242348c);
        qkf1.m73094o("eq", arrayList, "hasTimeLeft", vl11Var.f242354i);
        qkf1.m73094o("lt", arrayList, "daysLastPlayed", vl11Var.f242356k);
        qkf1.m73094o("gt", arrayList, "timePlayed", vl11Var.f242355j);
        qkf1.m73094o("eq", arrayList, "availableOffline", vl11Var.f242349d);
        qkf1.m73094o("eq", arrayList, "inCollection", vl11Var.f242351f);
        Boolean bool = vl11Var.f242350e;
        if (wj50.m88271j(bool, Boolean.TRUE)) {
            qkf1.m73094o("gt", arrayList, "timeLeft", 0);
        }
        qkf1.m73094o("ne", arrayList, "isPlayed", bool);
        qkf1.m73094o("eq", arrayList, "videoEpisode", vl11Var.f242352g);
        qkf1.m73094o("contains", arrayList, "text", vl11Var.f242361p);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("updateThrottling", String.valueOf(vl11Var.f242346a));
        linkedHashMap.put("responseFormat", "protobuf");
        gs31 gs31Var = vl11Var.f242353h;
        if (gs31Var != null) {
            linkedHashMap.put("sort", ms31.m62699b(gs31Var));
        }
        if (!arrayList.isEmpty()) {
            linkedHashMap.put("filter", g6f.m43753y0(arrayList, ",", null, null, null, 62));
        }
        Double d = vl11Var.f242357l;
        if (d != null) {
            linkedHashMap.put("relTimeLeftTolerance", String.valueOf(d.doubleValue()));
        }
        Integer num = vl11Var.f242358m;
        if (num != null) {
            linkedHashMap.put("absTimeLeftTolerance", String.valueOf(num.intValue()));
        }
        g5u0 g5u0Var = vl11Var.f242362q;
        if (g5u0Var != null) {
            int i = g5u0Var.f76771a;
            linkedHashMap.put("start", String.valueOf(0));
            linkedHashMap.put("length", String.valueOf(i));
        }
        String str = vl11Var.f242359n;
        if (str != null) {
            linkedHashMap.put("includeInRange", str);
        }
        Integer num2 = vl11Var.f242360o;
        if (num2 != null) {
            linkedHashMap.put("includeInRangeContext", String.valueOf(num2.intValue()));
        }
        Boolean bool2 = vl11Var.f242363r;
        if (bool2 != null && bool2.booleanValue()) {
            linkedHashMap.put("preferCache", String.valueOf(bool2.booleanValue()));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: n */
    public static final t050 m52013n(z8k z8kVar, gjk0 gjk0Var, hkk0 hkk0Var, hkk0 hkk0Var2) {
        return ((b9k) z8kVar).m28489g("DuckingAudioManagerDaemon", new qik0(gjk0Var, hkk0Var, hkk0Var2, 6));
    }

    /* JADX INFO: renamed from: o */
    public static final i5x m52014o(dut dutVar) {
        return mhf1.m61771p(dutVar).m94133b(x30.f257617U0, cvd0.f42370X);
    }

    /* JADX INFO: renamed from: p */
    public static final void m52015p(RecyclerView recyclerView, eh00 eh00Var, eh00 eh00Var2) {
        recyclerView.m1013j(new nkv0(recyclerView, eh00Var, eh00Var2));
    }
}
