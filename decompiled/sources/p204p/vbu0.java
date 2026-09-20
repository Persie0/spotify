package p204p;

import android.database.Cursor;
import android.net.Uri;
import android.util.Base64;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.work.impl.WorkDatabase_Impl;
import com.spotify.base.java.logging.Logger;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class vbu0 implements Function, ant, k1e, InterfaceC1810ed, BiFunction, SingleOnSubscribe, xhj {

    /* JADX INFO: renamed from: c */
    public static final vbu0 f239582c = new vbu0();

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f239583a;

    /* JADX INFO: renamed from: b */
    public Object f239584b;

    public /* synthetic */ vbu0() {
        this.f239583a = 1;
    }

    /* JADX INFO: renamed from: e */
    public static void m85171e() {
        List list = Collections.EMPTY_LIST;
    }

    @Override // p204p.k1e
    /* JADX INFO: renamed from: a */
    public void mo31129a() {
        m500 m500Var = (m500) this.f239584b;
        Logger.m3969e(edb.m38564m("Finishing ", m500Var.getLocalClassName()), new Object[0]);
        m500Var.finish();
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new fxx(Collections.singletonList(gao.m44175b(((ww3) this.f239584b).f255683b, (Map) obj, ((fxx) obj2).f74479a, false, 28)), null, null, null);
    }

    @Override // p204p.InterfaceC1810ed
    /* JADX INFO: renamed from: b */
    public boolean mo38504b(nbb nbbVar) {
        String strEncodeToString;
        Object obj = ((Map) ((nn3) this.f239584b).f156319b.getValue()).get(nbbVar.f152236b);
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(nbbVar.f152235a.getBytes(StandardCharsets.UTF_8)), 2);
            wj50.m88279p(strEncodeToString);
        } catch (Exception e) {
            m6b.m60995j("Failed to hash client ID: ", e.getMessage());
            strEncodeToString = "";
        }
        return wj50.m88271j(obj, strEncodeToString);
    }

    /* JADX INFO: renamed from: c */
    public void m85172c(HashMap map) {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            x2h1.m89737A(map, new ubu0(this, 1));
            return;
        }
        StringBuilder sbM36620t = dq60.m36620t("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        n0e1.m63421b(size, sbM36620t);
        sbM36620t.append(")");
        String string = sbM36620t.toString();
        TreeMap treeMap = ojx0.f166164i;
        ojx0 ojx0VarM50495m = ig31.m50495m(size, string);
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            ojx0VarM50495m.mo38269L0(i, (String) it.next());
            i++;
        }
        Cursor cursorM65531q = nsf1.m65531q((WorkDatabase_Impl) this.f239584b, ojx0VarM50495m, false);
        try {
            int iM43274p = g0b1.m43274p(cursorM65531q, "work_spec_id");
            if (iM43274p == -1) {
                cursorM65531q.close();
                return;
            }
            while (cursorM65531q.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorM65531q.getString(iM43274p));
                if (arrayList != null) {
                    arrayList.add(sco.m77812a(cursorM65531q.getBlob(0)));
                }
            }
            cursorM65531q.close();
        } catch (Throwable th) {
            cursorM65531q.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m85173d(HashMap map) {
        Set setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            x2h1.m89737A(map, new ubu0(this, 0));
            return;
        }
        StringBuilder sbM36620t = dq60.m36620t("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        n0e1.m63421b(size, sbM36620t);
        sbM36620t.append(")");
        String string = sbM36620t.toString();
        TreeMap treeMap = ojx0.f166164i;
        ojx0 ojx0VarM50495m = ig31.m50495m(size, string);
        Iterator it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            ojx0VarM50495m.mo38269L0(i, (String) it.next());
            i++;
        }
        Cursor cursorM65531q = nsf1.m65531q((WorkDatabase_Impl) this.f239584b, ojx0VarM50495m, false);
        try {
            int iM43274p = g0b1.m43274p(cursorM65531q, "work_spec_id");
            if (iM43274p == -1) {
                cursorM65531q.close();
                return;
            }
            while (cursorM65531q.moveToNext()) {
                ArrayList arrayList = (ArrayList) map.get(cursorM65531q.getString(iM43274p));
                if (arrayList != null) {
                    arrayList.add(cursorM65531q.getString(0));
                }
            }
            cursorM65531q.close();
        } catch (Throwable th) {
            cursorM65531q.close();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public Object m85174f(z0r z0rVar, Uri uri, lu01 lu01Var, int i, ru71 ru71Var, ibk ibkVar) {
        iv6 iv6Var;
        if (ibkVar instanceof iv6) {
            iv6Var = (iv6) ibkVar;
            int i2 = iv6Var.f106150f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iv6Var.f106150f = i2 - Integer.MIN_VALUE;
            } else {
                iv6Var = new iv6(this, ibkVar);
            }
        } else {
            iv6Var = new iv6(this, ibkVar);
        }
        iv6 iv6Var2 = iv6Var;
        Object objMo34036b = iv6Var2.f106148d;
        int i3 = iv6Var2.f106150f;
        int i4 = 1;
        fbk fbkVar = null;
        yuk yukVar = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(objMo34036b);
            d3r d3rVar = uri != null ? new d3r(uri) : null;
            c3r c3rVar = new c3r(i, i);
            x2r x2rVarM31048c = ((bzo) this.f239584b).m31048c(z0rVar.mo89604c(), z0rVar.mo89606h(), new f2r(3));
            iv6Var2.f106145a = z0rVar;
            iv6Var2.f106146b = ru71Var;
            iv6Var2.f106147c = i;
            iv6Var2.f106150f = 1;
            objMo34036b = x2rVarM31048c.mo34036b(lu01Var, c3rVar, d3rVar, null);
            if (objMo34036b != yukVar) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo34036b);
            return objMo34036b;
        }
        i = iv6Var2.f106147c;
        ru71Var = iv6Var2.f106146b;
        z0rVar = iv6Var2.f106145a;
        bga.m29073P(objMo34036b);
        ho01 ho01Var = (ho01) objMo34036b;
        C1673an c1673an = new C1673an(i4, 3, fbkVar);
        C1673an c1673an2 = new C1673an(i4, 4, fbkVar);
        l7l s0cVar = ru71Var != null ? new s0c(ru71Var) : t0c.f215839e;
        iv6Var2.f106145a = null;
        iv6Var2.f106146b = null;
        iv6Var2.f106147c = i;
        iv6Var2.f106150f = 2;
        Object objM26512u = ang1.m26512u(z0rVar, ho01Var, c1673an, c1673an2, s0cVar, iv6Var2, 24);
        return objM26512u == yukVar ? yukVar : objM26512u;
    }

    /* JADX INFO: renamed from: g */
    public void m85175g() {
        l65 l65Var = (l65) this.f239584b;
        lro lroVar = l65Var.f130192P0;
        if (lroVar != null) {
            ((ActionBarOverlayLayout) lroVar).m86c();
        }
        if (l65Var.f130197U0 != null) {
            l65Var.f130202Y.getDecorView().removeCallbacks(l65Var.f130198V0);
            if (l65Var.f130197U0.isShowing()) {
                try {
                    l65Var.f130197U0.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            l65Var.f130197U0 = null;
        }
        zkc1 zkc1Var = l65Var.f130199W0;
        if (zkc1Var != null) {
            zkc1Var.m96314c();
        }
        zge0 zge0Var = l65Var.m58307x(0).f119669h;
        if (zge0Var != null) {
            zge0Var.m96064d(true);
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        bji bjiVar;
        switch (this.f239583a) {
            case 17:
                singleEmitter.onSuccess(new a54(((Boolean) Single.create(new brl0((c54) this.f239584b, 16)).blockingGet()).booleanValue()));
                break;
            case 18:
                singleEmitter.onSuccess(new a94(((Boolean) Single.create(new brl0((b94) this.f239584b, 17)).blockingGet()).booleanValue()));
                break;
            case 19:
            default:
                gi5 gi5Var = (gi5) this.f239584b;
                fnk0 fnk0Var = gi5Var.f80068r;
                if (fnk0Var == null || !fnk0Var.m42228h("apps-music-libs-eventsender.rate_limiting_rule_2_time_unit_seconds")) {
                    bjiVar = fnk0Var;
                    bjiVar = gi5Var.f80069s;
                }
                if (bjiVar != null) {
                }
                break;
            case 20:
                singleEmitter.onSuccess(new ml4(((Boolean) Single.create(new brl0((ol4) this.f239584b, 19)).blockingGet()).booleanValue()));
                break;
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        ((EncoreTextView) ((hol0) ((C2223op) this.f239584b).f167721b).f93564d).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
    }

    public /* synthetic */ vbu0(Object obj, int i) {
        this.f239583a = i;
        this.f239584b = obj;
    }

    public vbu0(hv31 hv31Var) {
        this.f239583a = 22;
        this.f239584b = bzf1.m31021m(jag1.m52819d(Boolean.valueOf(hv31Var.mo48713h(fv31.f73628b.m78181M("debug_test_apple_tv_enabled"), false))));
    }

    public vbu0(kc3 kc3Var, ek3 ek3Var) {
        this.f239583a = 14;
        this.f239584b = kc3Var;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0139  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Single singleJust;
        f0m0 f0m0Var;
        boolean z = true;
        boolean z2 = false;
        switch (this.f239583a) {
            case 2:
                gqx gqxVar = (gqx) obj;
                String str = ((C2323r2) this.f239584b).f194988g;
                v140 v140Var = (v140) gqxVar.mo45449a(v140.class, str).f72301b;
                String str2 = v140Var != null ? v140Var.f236243a : null;
                if (str2 == null) {
                    str2 = "";
                }
                p3r p3rVar = (p3r) gqxVar.mo45449a(p3r.class, str).f72301b;
                String str3 = p3rVar != null ? p3rVar.f173690a : null;
                return new C2437u2(str2, str3 != null ? str3 : "");
            case 4:
                f5k0 f5k0Var = (f5k0) obj;
                if (f5k0Var instanceof d5k0) {
                    return Single.never();
                }
                if (f5k0Var instanceof e5k0) {
                    String str4 = ((e5k0) f5k0Var).f56424a;
                    if (str4 != null && (singleJust = Single.just(str4)) != null) {
                        return singleJust;
                    }
                    C2471uu c2471uu = (C2471uu) this.f239584b;
                    return c2471uu.f234046e.m23360y(uwk.f234683b).m23327A().flatMap(new qgj0(c2471uu, 3));
                }
                throw new NoWhenBranchMatchedException();
            case 7:
                ihj0 ihj0Var = new ihj0((qlv0) this.f239584b, 4);
                int i = Flowable.f7192a;
                return ((Flowable) obj).m23328B(ihj0Var, i, i);
            case 8:
                dz0 dz0Var = (dz0) this.f239584b;
                return new CompletableFromAction(new ok0(6, dz0Var, (gj7) obj)).m23293d(dz0Var.f54475i.f230608c.map(njy0.f154696c)).onErrorReturn(kqd1.f125284c);
            case 9:
                dqy0 dqy0Var = (dqy0) obj;
                return ((n93) ((bi1) this.f239584b).f27309b).m63880c(dqy0Var.f52115d, dqy0Var.f52116e, "", dqy0Var.f52117f, new f93(31, null)).ignoreElement();
            case 10:
                x02 x02Var = (x02) obj;
                boolean zM85155a = ((vbj) this.f239584b).m85155a();
                AbstractC1861fi abstractC1861fi = x02Var.f256763Z;
                boolean z3 = abstractC1861fi instanceof hdl;
                g0m0 g0m0Var = g0m0.f75396b;
                if ((z3 || (abstractC1861fi instanceof idl)) && !zM85155a) {
                    f0m0Var = new f0m0(g0m0Var, false);
                } else {
                    lr20 lr20Var = x02Var.f256754N0;
                    boolean z4 = lr20Var instanceof jr20;
                    g0m0 g0m0Var2 = g0m0.f75397c;
                    if (z4) {
                        f0m0Var = new f0m0(g0m0Var2, ((jr20) lr20Var).f115057a);
                    } else if (lr20Var instanceof kr20) {
                        f0m0Var = new f0m0(g0m0Var2, true);
                    } else {
                        if (!(lr20Var instanceof ir20)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        f0m0Var = new f0m0(g0m0Var, false);
                    }
                }
                return Flowable.m23313I(f0m0Var);
            case 11:
                sb2 sb2Var = (sb2) obj;
                xb2 xb2Var = (xb2) this.f239584b;
                xjr0 xjr0Var = xb2Var.f259819d;
                int i2 = sb2Var.f207319a;
                int i3 = sb2Var.f207320b;
                int i4 = sb2Var.f207321c;
                xjr0Var.getClass();
                int i5 = Calendar.getInstance().get(1);
                if (1900 > i4 || i4 > i5) {
                    z = false;
                } else {
                    try {
                        Calendar calendar = Calendar.getInstance();
                        calendar.setLenient(false);
                        calendar.set(i4, i3, i2);
                        calendar.getTime();
                        jba0 jba0VarM52883w6 = jba0.m52883w6();
                        jba0 jba0VarM52886z6 = jba0.m52886z6(i4, i3 + 1, i2);
                        if ((jba0VarM52886z6.m52896m6(jba0VarM52883w6) < 0) == false && jba0VarM52886z6.m52896m6(jba0VarM52883w6) != 0) {
                            z = false;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                }
                if (z) {
                    xb2Var.f259816a.mo24510D0(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
                }
                return new xa2(z);
            case 13:
                xf40 xf40Var = (xf40) obj;
                ((ik40) this.f239584b).getClass();
                xf40 xf40Var2 = xf40Var.isEmpty() ? null : xf40Var;
                if (xf40Var2 != null) {
                    for (Map.Entry entry : xf40Var2.entrySet()) {
                        if (entry.getKey() == j6n0.f109363g) {
                            z2 = !((g18) entry.getValue()).f75540a;
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 19:
                return (PlayerState) this.f239584b;
            case 25:
                return ((c0y) ((cc6) this.f239584b).f83503b.f235651a.f246568h).m31198g(xul0.m92201d((LoggingParams) obj), false);
            case 28:
                hv31 hv31Var = (hv31) obj;
                tf7 tf7Var = (tf7) this.f239584b;
                ihj0 ihj0Var2 = tf7Var.f219872b;
                if (((mv3) ihj0Var2.f102306b).m62892d()) {
                    fv31 fv31Var = tf7.f219867d;
                    mv3 mv3Var = (mv3) ihj0Var2.f102306b;
                    if (!hv31Var.mo48713h(on3.m67386e(mv3Var.m62891c()), false) && hv31Var.mo48717l(on3.m67387f(ihj0Var2.m50645d()), 0) < mv3Var.m62890b() && ((int) ((System.currentTimeMillis() - hv31Var.mo48712g(on3.m67388h(mv3Var.m62891c()), 0L)) / 3600000)) >= mv3Var.m62889a()) {
                        return ((rwx0) tf7Var.f219871a).m76591b("audiobook-onboarding-completed").firstOrError().map(gk40.f80723f);
                    }
                }
                Single singleJust2 = Single.just(Boolean.FALSE);
                wj50.m88279p(singleJust2);
                return singleJust2;
            default:
                Throwable th = (Throwable) obj;
                try {
                    ((hua0) this.f239584b).f95357b.f91056n.invoke();
                    break;
                } catch (Throwable unused2) {
                }
                return new zua0(wze1.m89423D(th));
        }
    }
}
