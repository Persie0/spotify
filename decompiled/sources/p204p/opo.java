package p204p;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.ContentProvider;
import android.content.Context;
import android.view.ViewGroup;
import com.comscore.streaming.ContentType;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.music.R;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public abstract class opo {

    /* JADX INFO: renamed from: a */
    public static final ode f167972a = new ode(3);

    /* JADX INFO: renamed from: b */
    public static sd40 f167973b;

    /* JADX INFO: renamed from: A */
    public static final y790 m67544A(Single single) {
        y790 y790Var = new y790();
        single.subscribe(y790Var.f269996e);
        return y790Var;
    }

    /* JADX INFO: renamed from: B */
    public static final String m67545B(String str) {
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(str);
        he41 he41Var = dd41VarM74726U.f47710d;
        if (!wj50.m88271j(he41Var != null ? he41Var.getType() : null, avp0.f20242e)) {
            if (!wj50.m88271j(he41Var != null ? he41Var.getType() : null, ivp0.f106258f)) {
                throw new IllegalArgumentException((dd41VarM74726U + " URI is not supported, only Playlist URIs are supported.").toString());
            }
        }
        return "spotify:internal:playlist-overlap-sheet:".concat(dd41VarM74726U.m35710h());
    }

    /* JADX INFO: renamed from: C */
    public static final AbstractC2524w8 m67546C(Iterable iterable) {
        AbstractC2524w8 abstractC2524w8 = iterable instanceof AbstractC2524w8 ? (AbstractC2524w8) iterable : null;
        if (abstractC2524w8 != null) {
            return abstractC2524w8;
        }
        zqn0 zqn0Var = iterable instanceof zqn0 ? (zqn0) iterable : null;
        AbstractC2524w8 abstractC2524w8M48544d = zqn0Var != null ? ((hsn0) zqn0Var).m48544d() : null;
        if (abstractC2524w8M48544d != null) {
            return abstractC2524w8M48544d;
        }
        boolean z = iterable instanceof Collection;
        lv21 lv21Var = lv21.f137205b;
        if (z) {
            return lv21Var.m60045b((Collection) iterable);
        }
        hsn0 hsn0VarM60046d = lv21Var.m60046d();
        j6f.m52564V(iterable, hsn0VarM60046d);
        return hsn0VarM60046d.m48544d();
    }

    /* JADX INFO: renamed from: D */
    public static final ern0 m67547D(Map map) {
        grn0 grn0Var = map instanceof grn0 ? (grn0) map : null;
        if (grn0Var != null) {
            return grn0Var;
        }
        hrn0 hrn0Var = map instanceof hrn0 ? (hrn0) map : null;
        ern0 ern0VarBuild = hrn0Var != null ? hrn0Var.build() : null;
        if (ern0VarBuild != null) {
            return ern0VarBuild;
        }
        grn0 grn0Var2 = grn0.f83797d;
        grn0Var2.getClass();
        hrn0 hrn0Var2 = new hrn0(grn0Var2);
        hrn0Var2.putAll(map);
        return hrn0Var2.build();
    }

    /* JADX INFO: renamed from: E */
    public static final orn0 m67548E(Iterable iterable) {
        orn0 orn0Var = iterable instanceof orn0 ? (orn0) iterable : null;
        if (orn0Var != null) {
            return orn0Var;
        }
        qrn0 qrn0Var = iterable instanceof qrn0 ? (qrn0) iterable : null;
        orn0 orn0VarM73654b = qrn0Var != null ? qrn0Var.m73654b() : null;
        return orn0VarM73654b == null ? m67571u(orn0.f168627d, iterable) : orn0VarM73654b;
    }

    /* JADX INFO: renamed from: F */
    public static final String m67549F(ktz0 ktz0Var) {
        return g6f.m43753y0(n0e1.m63417Y(0, ktz0Var.mo33222e()), ", ", ktz0Var.mo33226i() + '(', ")", new lw70(ktz0Var, 1), 24);
    }

    /* JADX INFO: renamed from: G */
    public static kks m67550G(dfo dfoVar, ViewGroup.LayoutParams layoutParams, ScrollCardType scrollCardType, int i) {
        if ((i & 1) != 0) {
            layoutParams = null;
        }
        if ((i & 2) != 0) {
            scrollCardType = null;
        }
        return new kks(dfoVar, layoutParams, scrollCardType);
    }

    /* JADX INFO: renamed from: a */
    public static final void m67551a(z4o0 z4o0Var, int i, fxh0 fxh0Var, xq00 xq00Var, int i2) throws Throwable {
        fxh0 fxh0Var2;
        xv41 xv41Var;
        Throwable th;
        xq00 xq00Var2;
        cxh0 cxh0Var;
        hc80 hc80Var;
        boolean z;
        v290 v290Var;
        xq00 xq00Var3 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var3.m91775k0(-365464019);
        int i3 = (i2 & 6) == 0 ? i2 | ((i2 & 8) == 0 ? xq00Var3.m91766g(z4o0Var) : xq00Var3.m91770i(z4o0Var) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i3 |= xq00Var3.m91762e(i) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (xq00Var3.m91752Y(i4 & 1, (i4 & 147) != 146)) {
            hc80 hc80Var2 = (hc80) xq00Var3.m91774k(sda0.f207965a);
            dq6 dq6Var = (dq6) xq00Var3.m91774k(eq6.f61794a);
            he90 he90Var = z4o0Var.f279316i;
            kqi0 kqi0VarM77671j = sam.m77671j((zv41) he90Var.f90385i, xq00Var3, 0);
            kqi0 kqi0VarM77671j2 = sam.m77671j(z4o0Var.f279308X, xq00Var3, 0);
            boolean zM91766g = xq00Var3.m91766g((t4o0) kqi0VarM77671j.getValue());
            Object objM91750T = xq00Var3.m91750T();
            gau gauVar = gau.f78095a;
            if (zM91766g || objM91750T == ia7Var) {
                t4o0 t4o0Var = (t4o0) kqi0VarM77671j.getValue();
                objM91750T = (t4o0Var == null || (xv41Var = t4o0Var.f217053b) == null) ? gauVar : xv41Var;
                xq00Var3.m91793t0(objM91750T);
            }
            kqi0 kqi0VarM77670i = sam.m77670i((fiz) objM91750T, new sp80(), null, xq00Var3, 0, 2);
            boolean zM91766g2 = xq00Var3.m91766g((t4o0) kqi0VarM77671j.getValue());
            Object objM91750T2 = xq00Var3.m91750T();
            if (zM91766g2 || objM91750T2 == ia7Var) {
                t4o0 t4o0Var2 = (t4o0) kqi0VarM77671j.getValue();
                Object obj = t4o0Var2 != null ? t4o0Var2.f217052a : gauVar;
                xq00Var3.m91793t0(obj);
                objM91750T2 = obj;
            }
            kqi0 kqi0VarM77670i2 = sam.m77670i((fiz) objM91750T2, new td70(0, 0, 0), null, xq00Var3, 0, 2);
            Object objM91750T3 = xq00Var3.m91750T();
            if (objM91750T3 == ia7Var) {
                objM91750T3 = sam.m77674m(new z9b(kqi0VarM77670i2, kqi0VarM77670i, kqi0VarM77671j2, 2));
                xq00Var3.m91793t0(objM91750T3);
            }
            rv41 rv41Var = (rv41) objM91750T3;
            Object objM91750T4 = xq00Var3.m91750T();
            if (objM91750T4 == ia7Var) {
                m680 m680Var = (m680) he90Var.f90381e;
                LinkedHashMap linkedHashMap = (LinkedHashMap) he90Var.f90383g;
                if (linkedHashMap == null) {
                    wj50.m88260d0("elementFactories");
                    throw null;
                }
                th = null;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    th00 th00Var = (th00) entry.getValue();
                    tp80 tp80Var = (tp80) he90Var.f90382f;
                    if (tp80Var == null) {
                        wj50.m88260d0("listContentRuntime");
                        throw null;
                    }
                    linkedHashMap2.put(key, (qy8) th00Var.invoke(((xp80) tp80Var).f264539l, (hc80) he90Var.f90379c));
                }
                Map map = (Map) he90Var.f90384h;
                if (map == null) {
                    wj50.m88260d0("instrumentationEnvironments");
                    throw null;
                }
                tp80 tp80Var2 = (tp80) he90Var.f90382f;
                if (tp80Var2 == null) {
                    wj50.m88260d0("listContentRuntime");
                    throw null;
                }
                objM91750T4 = m680.m60952b(m680Var, linkedHashMap2, map, new hmm0(1, tp80Var2, tp80.class, "onVisibleScrollRangeChanged", "onVisibleScrollRangeChanged(Lcom/spotify/listcontentruntime/configdsl/ListContentRuntime$ScrollRange;)V", 0, 0, 5), 12);
                xq00Var3.m91793t0(objM91750T4);
            } else {
                th = null;
            }
            v290 v290Var2 = (v290) objM91750T4;
            int iMo35989Z0 = (int) ((yqq) xq00Var3.m91774k(wsh.f254617h)).mo35989Z0(12);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var3.f264809T);
            wpn0 wpn0VarM91778m = xq00Var3.m91778m();
            cxh0 cxh0Var2 = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var3, cxh0Var2);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var3.f264811a == null) {
                pmg1.m70360s();
                throw th;
            }
            xq00Var3.m91779m0();
            if (xq00Var3.f264808S) {
                xq00Var3.m91776l(c2087le);
            } else {
                xq00Var3.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var3);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var3);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var3);
            zsf1.m96833D(roh.f201266k, xq00Var3);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var3);
            if (((Boolean) rv41Var.getValue()).booleanValue()) {
                xq00Var2 = xq00Var3;
                cxh0Var = cxh0Var2;
                hc80Var = hc80Var2;
                z = false;
                xq00Var2.m91771i0(811303035);
                xq00Var2.m91788r(false);
            } else {
                xq00Var3.m91771i0(811237687);
                hc80Var = hc80Var2;
                cxh0Var = cxh0Var2;
                p271.m68899b(pha.f177517a.mo66945a(cxh0Var2, d7f0.f46174i), 0, 0L, 0L, xq00Var, 0, 14);
                xq00Var2 = xq00Var;
                z = false;
                xq00Var2.m91788r(false);
            }
            boolean zM91762e = xq00Var2.m91762e(iMo35989Z0);
            int i5 = i4 & ContentType.LONG_FORM_ON_DEMAND;
            boolean zM91770i = zM91762e | (i5 == 32 ? true : z) | xq00Var2.m91770i(dq6Var) | xq00Var2.m91770i(v290Var2) | xq00Var2.m91770i(hc80Var);
            Object objM91750T5 = xq00Var2.m91750T();
            if (zM91770i || objM91750T5 == ia7Var) {
                n3c n3cVar = new n3c(iMo35989Z0, i, dq6Var, v290Var2, hc80Var);
                v290Var = v290Var2;
                xq00Var2.m91793t0(n3cVar);
                objM91750T5 = n3cVar;
            } else {
                v290Var = v290Var2;
            }
            gh00 gh00Var = (gh00) objM91750T5;
            boolean zM91770i2 = xq00Var2.m91770i(kqi0VarM77670i) | (i5 == 32 ? true : z) | xq00Var2.m91770i(v290Var) | xq00Var2.m91770i(hc80Var) | xq00Var2.m91770i(rv41Var);
            Object objM91750T6 = xq00Var2.m91750T();
            if (zM91770i2 || objM91750T6 == ia7Var) {
                objM91750T6 = new gg7(i, v290Var, hc80Var, kqi0VarM77670i, rv41Var, 1);
                xq00Var2.m91793t0(objM91750T6);
            }
            xq00Var3 = xq00Var2;
            g0b1.m43261b(gh00Var, null, (gh00) objM91750T6, xq00Var3, 0, 2);
            xq00Var3.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var3.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var3.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new a80(z4o0Var, i, fxh0Var2, i2, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m67552b(eh00 eh00Var, eh00 eh00Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(974581685);
        int i2 = i | (xq00Var.m91770i(eh00Var) ? 4 : 2) | (xq00Var.m91770i(eh00Var2) ? 32 : 16) | 384;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            String strM54977L = k0e1.m54977L(R.string.your_updates_empty_state_footnote, xq00Var);
            String strM54977L2 = k0e1.m54977L(R.string.your_updates_empty_state_footnote_music_link, xq00Var);
            String strM54977L3 = k0e1.m54977L(R.string.your_updates_empty_state_footnote_podcasts_link, xq00Var);
            g15 g15VarM42471o = fr0.m42471o(270142733, xq00Var);
            String str = String.format(strM54977L, Arrays.copyOf(new Object[]{strM54977L2, strM54977L3}, 2));
            int iM88458H0 = wl51.m88458H0(str, strM54977L2, 0, false, 6);
            int length = strM54977L2.length() + iM88458H0;
            int iM88458H1 = wl51.m88458H0(str, strM54977L3, 0, false, 6);
            int length2 = strM54977L3.length() + iM88458H1;
            g15VarM42471o.m43331g(str.substring(0, iM88458H0));
            boolean z = (i2 & 14) == 4;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == ia7Var) {
                objM91750T = new vm01(21, eh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            vie.m85608a(g15VarM42471o, strM54977L2, "your_updates_empty_state_music_link", vie.f241686a, (gh00) objM91750T);
            g15VarM42471o.m43331g(str.substring(length, iM88458H1));
            boolean z2 = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T2 = xq00Var.m91750T();
            if (z2 || objM91750T2 == ia7Var) {
                objM91750T2 = new vm01(22, eh00Var2);
                xq00Var.m91793t0(objM91750T2);
            }
            vie.m85608a(g15VarM42471o, strM54977L3, "your_updates_empty_state_podcasts_link", vie.f241686a, (gh00) objM91750T2);
            g15VarM42471o.m43331g(str.substring(length2));
            j15 j15VarM43339o = g15VarM42471o.m43339o();
            xq00Var.m91788r(false);
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            cxh0 cxh0Var = cxh0.f43038a;
            ahf1.m25933e(j15VarM43339o, zsf1.m96832C(cxh0Var, 0.0f, f, 0.0f, 0.0f, 13), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, null, xq00Var, 0, 0, 4064);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new pa30(eh00Var, eh00Var2, fxh0Var2, i, 3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final ho40 m67553c(ch01 ch01Var, xq00 xq00Var, int i) {
        zoz zozVar = (zoz) xq00Var.m91774k(apz.f18035a);
        float f = leu.m58816b(xq00Var).f117231c.f127596e;
        boolean zM91760d = ((((i & 14) ^ 6) > 4 && xq00Var.m91766g(ch01Var)) || (i & 6) == 4) | xq00Var.m91760d(f) | xq00Var.m91766g(zozVar);
        Object objM91750T = xq00Var.m91750T();
        if (zM91760d || objM91750T == t6x0.f217647t) {
            zozVar.getClass();
            objM91750T = new yoz(tcz.f219180Y0, ch01Var, f, null);
            xq00Var.m91793t0(objM91750T);
        }
        return (ho40) objM91750T;
    }

    /* JADX INFO: renamed from: d */
    public static String m67554d(String... strArr) {
        String str;
        String string;
        int length = strArr.length;
        int i = 0;
        while (true) {
            str = null;
            if (i < length) {
                String str2 = strArr[i];
                if (str2 != null && (string = wl51.m88491o1(str2).toString()) != null && string.length() > 0) {
                    str = string;
                }
                if (str != null) {
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: e */
    public static final String m67555e(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: f */
    public static final String m67556f(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m67557g(fk30 fk30Var) {
        return (fk30Var.images().main() == null && fk30Var.images().icon() == null && fk30Var.custom().bundle("calendar") == null) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public static final int m67558h(ktz0 ktz0Var, ktz0[] ktz0VarArr) {
        int iHashCode = (ktz0Var.mo33226i().hashCode() * 31) + Arrays.hashCode(ktz0VarArr);
        int iMo33222e = ktz0Var.mo33222e();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iMo33222e > 0)) {
                break;
            }
            int i2 = iMo33222e - 1;
            int i3 = i * 31;
            String strMo33226i = ktz0Var.mo33225h(ktz0Var.mo33222e() - iMo33222e).mo33226i();
            if (strMo33226i != null) {
                iHashCode2 = strMo33226i.hashCode();
            }
            i = i3 + iHashCode2;
            iMo33222e = i2;
        }
        int iMo33222e2 = ktz0Var.mo33222e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iMo33222e2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iMo33222e2 - 1;
            int i5 = iHashCode3 * 31;
            k0e1 kind = ktz0Var.mo33225h(ktz0Var.mo33222e() - iMo33222e2).getKind();
            iHashCode3 = i5 + (kind != null ? kind.hashCode() : 0);
            iMo33222e2 = i4;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m67559i(Activity activity) {
        jg31.m53269g(activity, "activity");
        ComponentCallbacks2 application = activity.getApplication();
        if (!(application instanceof dd20)) {
            throw new RuntimeException(klh.m56834f(application.getClass().getCanonicalName(), " does not implement ", dd20.class.getCanonicalName()));
        }
        m67563m(activity, (dd20) application);
    }

    /* JADX INFO: renamed from: j */
    public static void m67560j(Service service) {
        ComponentCallbacks2 application = service.getApplication();
        if (!(application instanceof dd20)) {
            throw new RuntimeException(klh.m56834f(application.getClass().getCanonicalName(), " does not implement ", dd20.class.getCanonicalName()));
        }
        m67563m(service, (dd20) application);
    }

    /* JADX INFO: renamed from: k */
    public static void m67561k(BroadcastReceiver broadcastReceiver, Context context) {
        jg31.m53269g(broadcastReceiver, "broadcastReceiver");
        jg31.m53269g(context, "context");
        ComponentCallbacks2 componentCallbacks2 = (Application) context.getApplicationContext();
        if (!(componentCallbacks2 instanceof dd20)) {
            throw new RuntimeException(klh.m56834f(componentCallbacks2.getClass().getCanonicalName(), " does not implement ", dd20.class.getCanonicalName()));
        }
        m67563m(broadcastReceiver, (dd20) componentCallbacks2);
    }

    /* JADX INFO: renamed from: l */
    public static void m67562l(ContentProvider contentProvider) {
        ComponentCallbacks2 componentCallbacks2 = (Application) contentProvider.getContext().getApplicationContext();
        if (!(componentCallbacks2 instanceof dd20)) {
            throw new RuntimeException(klh.m56834f(componentCallbacks2.getClass().getCanonicalName(), " does not implement ", dd20.class.getCanonicalName()));
        }
        m67563m(contentProvider, (dd20) componentCallbacks2);
    }

    /* JADX INFO: renamed from: m */
    public static void m67563m(Object obj, dd20 dd20Var) {
        zsr zsrVarMo3091i = dd20Var.mo3091i();
        jg31.m53270h(zsrVarMo3091i, "%s.androidInjector() returned null", dd20Var.getClass());
        zsrVarMo3091i.mo24956K0(obj);
    }

    /* JADX INFO: renamed from: n */
    public static boolean m67564n(String str) {
        Object c6x0Var;
        try {
            Set set = dd41.f47702f;
            c6x0Var = Boolean.valueOf(r46.m74726U(str).f47709c == gn80.CONCERT_CAMPAIGN);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Object obj = Boolean.FALSE;
        if (c6x0Var instanceof c6x0) {
            c6x0Var = obj;
        }
        return ((Boolean) c6x0Var).booleanValue();
    }

    /* JADX INFO: renamed from: o */
    public static String m67565o(m340 m340Var) {
        String str;
        z240 z240VarM60640a = m340Var.m60640a(a340.f11863d);
        if (z240VarM60640a == null && (z240VarM60640a = m340Var.m60640a(a340.f11861b)) == null) {
            z240VarM60640a = (z240) g6f.m43745s0(m340Var.f139524a);
        }
        if (z240VarM60640a == null || (str = z240VarM60640a.f278475a.f198763a) == null || wl51.m88460J0(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: p */
    public static final AbstractC2524w8 m67566p(Object... objArr) {
        return lv21.f137205b.m60045b(Arrays.asList(objArr));
    }

    /* JADX INFO: renamed from: q */
    public static final ern0 m67567q(pqm0... pqm0VarArr) {
        grn0 grn0Var = grn0.f83797d;
        grn0Var.getClass();
        hrn0 hrn0Var = new hrn0(grn0Var);
        kkc0.m56703p0(hrn0Var, pqm0VarArr);
        return hrn0Var.build();
    }

    /* JADX INFO: renamed from: r */
    public static final grn0 m67568r() {
        return grn0.f83797d;
    }

    /* JADX INFO: renamed from: s */
    public static final orn0 m67569s() {
        return orn0.f168627d;
    }

    /* JADX INFO: renamed from: t */
    public static juk m67570t(juk jukVar, juk jukVar2) {
        return jukVar2 == dau.f47107a ? jukVar : (juk) jukVar2.mo26605o(jukVar, new xaf(7));
    }

    /* JADX INFO: renamed from: u */
    public static final orn0 m67571u(xrn0 xrn0Var, Iterable iterable) {
        if (iterable instanceof Collection) {
            qrn0 qrn0Var = new qrn0((orn0) xrn0Var);
            qrn0Var.addAll((Collection) iterable);
            return qrn0Var.m73654b();
        }
        qrn0 qrn0Var2 = new qrn0((orn0) xrn0Var);
        j6f.m52564V(iterable, qrn0Var2);
        return qrn0Var2.m73654b();
    }

    /* JADX INFO: renamed from: v */
    public static EventSource m67572v(Observable observable, v301 v301Var, Flowable flowable, mcu0 mcu0Var, lla llaVar, Observable observable2) {
        return RxEventSources.m15655a(observable, v301Var.f236746a.m43619b("social-connect/v2/session_update", new ptw0(1, v301Var, v301.class, "convert", "convert(Lcom/spotify/connectivity/pubsub/DealerMessage$PushedMessage;)Lcom/spotify/jam/internal/socialconnect/models/SessionUpdate;", 0, 0, 8)).map(xjr0.f262195O0).doOnError(hyx0.f96725c1).onErrorComplete(), new ObservableFromPublisher(flowable.m23331J(zhi0.f282927O0).m23356t(Functions.f7225a).m23331J(qgr0.f188526O0)).doOnError(u9w0.f228300g).onErrorComplete(), mcu0Var.m61496c().skip(1L).distinctUntilChanged().map(ujr0.f231086P0), llaVar.f134593a.m43619b("social-connect/v2/broadcast_status_update", new e2a(llaVar)).map(wjr0.f252012O0).doOnError(hyx0.f96723b1).onErrorComplete(), observable2.distinctUntilChanged().map(tjr0.f220987O0));
    }

    /* JADX INFO: renamed from: w */
    public static final String m67573w(fbk fbkVar) {
        Object c6x0Var;
        if (fbkVar instanceof lsr) {
            return ((lsr) fbkVar).toString();
        }
        try {
            c6x0Var = fbkVar + '@' + m67556f(fbkVar);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        if (s6x0.m77348a(c6x0Var) != null) {
            c6x0Var = fbkVar.getClass().getName() + '@' + m67556f(fbkVar);
        }
        return (String) c6x0Var;
    }

    /* JADX INFO: renamed from: x */
    public static final qf40 m67574x(Iterable iterable) {
        qf40 qf40Var = iterable instanceof qf40 ? (qf40) iterable : null;
        return qf40Var == null ? m67546C(iterable) : qf40Var;
    }

    /* JADX INFO: renamed from: y */
    public static final ern0 m67575y(Map map) {
        ern0 ern0Var = map instanceof ern0 ? (ern0) map : null;
        if (ern0Var != null) {
            return ern0Var;
        }
        crn0 crn0Var = map instanceof crn0 ? (crn0) map : null;
        ern0 ern0VarBuild = crn0Var != null ? crn0Var.build() : null;
        if (ern0VarBuild != null) {
            return ern0VarBuild;
        }
        grn0 grn0Var = grn0.f83797d;
        grn0Var.getClass();
        hrn0 hrn0Var = new hrn0(grn0Var);
        hrn0Var.putAll(map);
        return hrn0Var.build();
    }

    /* JADX INFO: renamed from: z */
    public static final ig40 m67576z(Iterable iterable) {
        ig40 ig40Var = iterable instanceof ig40 ? (ig40) iterable : null;
        if (ig40Var != null) {
            return ig40Var;
        }
        wrn0 wrn0Var = iterable instanceof wrn0 ? (wrn0) iterable : null;
        orn0 orn0VarM73654b = wrn0Var != null ? ((qrn0) wrn0Var).m73654b() : null;
        return orn0VarM73654b == null ? m67571u(orn0.f168627d, iterable) : orn0VarM73654b;
    }
}
