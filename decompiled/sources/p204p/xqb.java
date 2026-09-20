package p204p;

import android.app.ForegroundServiceStartNotAllowedException;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableObserveOn;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;
import p000.C1398e;

/* JADX INFO: loaded from: classes9.dex */
public final class xqb implements Function, SingleOnSubscribe, t1k0 {

    /* JADX INFO: renamed from: d */
    public static final Object f264942d = new Object();

    /* JADX INFO: renamed from: e */
    public static ExecutorService f264943e;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f264944a;

    /* JADX INFO: renamed from: b */
    public Object f264945b;

    /* JADX INFO: renamed from: c */
    public Object f264946c;

    public /* synthetic */ xqb(int i, Object obj, Object obj2) {
        this.f264944a = i;
        this.f264945b = obj;
        this.f264946c = obj2;
    }

    /* JADX INFO: renamed from: a */
    public CompletableSubscribeOn m91823a(List list) {
        wz20 wz20Var;
        wz20 wz20Var2;
        Parcelable tz20Var;
        Parcelable lz20Var;
        vwy0 vwy0Var = (vwy0) this.f264946c;
        ArrayList<vz20> arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            br50 br50Var = (br50) it.next();
            Context context = (Context) this.f264945b;
            boolean z = br50Var instanceof cq50;
            lau lauVar = lau.f131415a;
            if (z) {
                cq50 cq50Var = (cq50) br50Var;
                tz20Var = new iz20(cq50Var.f40736a, cq50Var.f40737b, zfg1.m96022k(context, br50Var), cq50Var.f40738c, lauVar);
            } else if (br50Var instanceof dq50) {
                dq50 dq50Var = (dq50) br50Var;
                tz20Var = new jz20(dq50Var.f51821a, dq50Var.f51822b, zfg1.m96022k(context, br50Var), dq50Var.f51823c, false);
            } else {
                if (br50Var instanceof lq50) {
                    lq50 lq50Var = (lq50) br50Var;
                    lz20Var = new rz20(lq50Var.f135951a, lq50Var.f135952b, zfg1.m96022k(context, br50Var), lq50Var.f135953c);
                } else if (br50Var instanceof fq50) {
                    fq50 fq50Var = (fq50) br50Var;
                    tz20Var = new nz20(fq50Var.f72061a, fq50Var.f72062b, zfg1.m96022k(context, br50Var), fq50Var.f72063c, fq50Var.f72068h);
                } else if (br50Var instanceof jq50) {
                    jq50 jq50Var = (jq50) br50Var;
                    tz20Var = new kz20(jq50Var.f114791a, jq50Var.f114792b, zfg1.m96022k(context, br50Var), jq50Var.f114793c, null, jq50Var.f114797g, jq50Var.f114798h, false);
                } else if (br50Var instanceof qq50) {
                    qq50 qq50Var = (qq50) br50Var;
                    lz20Var = new lz20(qq50Var.f191491a, qq50Var.f191492b, zfg1.m96022k(context, br50Var), qq50Var.f191493c);
                } else {
                    if (!(br50Var instanceof tq50)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    tq50 tq50Var = (tq50) br50Var;
                    String str = tq50Var.f222713a;
                    String str2 = tq50Var.f222714b;
                    String str3 = tq50Var.f222715c;
                    boolean z2 = tq50Var.f222720h;
                    String str4 = tq50Var.f222718f;
                    if (!wl51.m88496t0(str4, "/", false)) {
                        str4 = null;
                    }
                    tz20Var = new tz20(str, str2, zfg1.m96022k(context, br50Var), str3, null, str4 != null ? (String) g6f.m43689C0(wl51.m88477a1(str4, new String[]{"/"}, 0, 6)) : null, lauVar, false, tq50Var.f222719g, z2, false);
                }
                tz20Var = lz20Var;
            }
            arrayList.add(tz20Var);
        }
        d5a0 d5a0Var = vwy0Var.f245575a;
        vx20 vx20Var = (vx20) d5a0Var.f45380b;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        for (vz20 vz20Var : arrayList) {
            xre xreVar = ((afr) d5a0Var.f45381c).f15201a;
            if (vz20Var instanceof iz20) {
                iz20 iz20Var = (iz20) vz20Var;
                String str5 = iz20Var.f107115a;
                String str6 = iz20Var.f107116b;
                String str7 = iz20Var.f107117c;
                String str8 = iz20Var.f107118d;
                ((wy3) xreVar).getClass();
                wz20Var = new wz20(str5, str6, str7, str8, null, 1, null, null, null, null, iz20Var.f107119e, System.currentTimeMillis(), null, null, 13264);
            } else {
                if (vz20Var instanceof jz20) {
                    jz20 jz20Var = (jz20) vz20Var;
                    String str9 = jz20Var.f117561a;
                    String str10 = jz20Var.f117562b;
                    String str11 = jz20Var.f117563c;
                    String str12 = jz20Var.f117564d;
                    ((wy3) xreVar).getClass();
                    wz20Var2 = new wz20(str9, str10, str11, str12, null, 2, null, null, null, null, null, System.currentTimeMillis(), null, Boolean.valueOf(jz20Var.f117565e), 6096);
                } else if (vz20Var instanceof kz20) {
                    kz20 kz20Var = (kz20) vz20Var;
                    String str13 = kz20Var.f127992a;
                    String str14 = kz20Var.f127993b;
                    String str15 = kz20Var.f127994c;
                    String str16 = kz20Var.f127995d;
                    String str17 = kz20Var.f127996e;
                    ((wy3) xreVar).getClass();
                    wz20Var = new wz20(str13, str14, str15, str16, str17, 4, Boolean.valueOf(kz20Var.f127997f), null, Boolean.valueOf(kz20Var.f127998g), null, null, System.currentTimeMillis(), Boolean.valueOf(kz20Var.f127999h), null, 9856);
                } else if (vz20Var instanceof lz20) {
                    lz20 lz20Var2 = (lz20) vz20Var;
                    String str18 = lz20Var2.f138241a;
                    String str19 = lz20Var2.f138242b;
                    String str20 = lz20Var2.f138243c;
                    String str21 = lz20Var2.f138244d;
                    ((wy3) xreVar).getClass();
                    wz20Var2 = new wz20(str18, str19, str20, str21, null, 5, null, null, null, null, null, System.currentTimeMillis(), null, null, 14288);
                } else if (vz20Var instanceof qz20) {
                    qz20 qz20Var = (qz20) vz20Var;
                    String str22 = qz20Var.f194093a;
                    String str23 = qz20Var.f194094b;
                    String str24 = qz20Var.f194095c;
                    String str25 = qz20Var.f194096d;
                    ((wy3) xreVar).getClass();
                    wz20Var2 = new wz20(str22, str23, str24, str25, null, 6, null, null, null, null, null, System.currentTimeMillis(), null, null, 14288);
                } else if (vz20Var instanceof rz20) {
                    rz20 rz20Var = (rz20) vz20Var;
                    String str26 = rz20Var.f204038a;
                    String str27 = rz20Var.f204039b;
                    String str28 = rz20Var.f204040c;
                    String str29 = rz20Var.f204041d;
                    ((wy3) xreVar).getClass();
                    wz20Var2 = new wz20(str26, str27, str28, str29, null, 7, null, null, null, null, null, System.currentTimeMillis(), null, null, 14288);
                } else if (vz20Var instanceof sz20) {
                    sz20 sz20Var = (sz20) vz20Var;
                    String str30 = sz20Var.f215370a;
                    String str31 = sz20Var.f215371b;
                    String str32 = sz20Var.f215372c;
                    String str33 = sz20Var.f215373d;
                    ((wy3) xreVar).getClass();
                    wz20Var2 = new wz20(str30, str31, str32, str33, null, 8, null, null, null, null, null, System.currentTimeMillis(), null, Boolean.valueOf(sz20Var.f215374e), 6096);
                } else if (vz20Var instanceof tz20) {
                    tz20 tz20Var2 = (tz20) vz20Var;
                    String str34 = tz20Var2.f225089a;
                    String str35 = tz20Var2.f225090b;
                    String str36 = tz20Var2.f225091c;
                    String str37 = tz20Var2.f225092d;
                    String str38 = tz20Var2.f225093e;
                    String str39 = tz20Var2.f225095g;
                    boolean z3 = tz20Var2.f225094f;
                    boolean z4 = tz20Var2.f225096h;
                    boolean z5 = tz20Var2.f225097i;
                    ((wy3) xreVar).getClass();
                    wz20Var = new wz20(str34, str35, str36, str37, str38, 9, Boolean.valueOf(z4), str39, Boolean.valueOf(z5), Boolean.valueOf(z3), tz20Var2.f225098t, System.currentTimeMillis(), Boolean.valueOf(tz20Var2.f225088X), null, 8192);
                } else if (vz20Var instanceof nz20) {
                    nz20 nz20Var = (nz20) vz20Var;
                    String str40 = nz20Var.f159977a;
                    String str41 = nz20Var.f159978b;
                    String str42 = nz20Var.f159979c;
                    String str43 = nz20Var.f159980d;
                    ((wy3) xreVar).getClass();
                    wz20Var = new wz20(str40, str41, str42, str43, null, 3, Boolean.valueOf(nz20Var.f159981e), null, null, null, null, System.currentTimeMillis(), null, null, 14224);
                } else if (vz20Var instanceof oz20) {
                    oz20 oz20Var = (oz20) vz20Var;
                    String str44 = oz20Var.f171963a;
                    String str45 = oz20Var.f171964b;
                    String str46 = oz20Var.f171965c;
                    String str47 = oz20Var.f171966d;
                    ((wy3) xreVar).getClass();
                    wz20Var = new wz20(str44, str45, str46, str47, null, 10, Boolean.FALSE, null, null, null, null, System.currentTimeMillis(), null, null, 14224);
                } else if (vz20Var instanceof pz20) {
                    pz20 pz20Var = (pz20) vz20Var;
                    String str48 = pz20Var.f183584a;
                    String str49 = pz20Var.f183585b;
                    String str50 = pz20Var.f183586c;
                    String str51 = pz20Var.f183587d;
                    ((wy3) xreVar).getClass();
                    wz20Var = new wz20(str48, str49, str50, str51, null, 11, Boolean.FALSE, null, null, null, null, System.currentTimeMillis(), null, null, 14224);
                } else {
                    if (!(vz20Var instanceof uz20)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uz20 uz20Var = (uz20) vz20Var;
                    String str52 = uz20Var.f235406a;
                    String str53 = uz20Var.f235407b;
                    String str54 = uz20Var.f235408c;
                    String str55 = uz20Var.f235409d;
                    ((wy3) xreVar).getClass();
                    wz20Var = new wz20(str52, str53, str54, str55, null, 12, Boolean.FALSE, null, null, null, null, System.currentTimeMillis(), null, null, 14224);
                }
                wz20Var = wz20Var2;
            }
            arrayList2.add(wz20Var);
        }
        return q0f1.m71844v(vx20Var.f245607a, new tsl(arrayList2.size(), 2)).m23292c(q0f1.m71844v(vx20Var.f245607a, new C1398e(12, vx20Var, arrayList2))).m23303t((Scheduler) d5a0Var.f45383e);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f264944a) {
            case 8:
                aet aetVar = (aet) this.f264945b;
                return (s2x) ((p2x0) obj).m68969b(new C1966i4(15, aetVar, (mc1) this.f264946c), new lc1(aetVar, 0));
            case 12:
                return ((gg2) this.f264945b).m44647a((String) this.f264946c, false).map(e8f.f57179e).onErrorReturn(ket.f121971f);
            case 24:
                lcf lcfVar = (lcf) obj;
                jr5 jr5Var = (jr5) this.f264945b;
                if (!(lcfVar instanceof icf)) {
                    return Single.just(lcfVar);
                }
                Flowable flowable = jr5Var.f115080d;
                return AbstractC0000a.m11j(flowable, flowable).filter(new q1h1(jr5Var.f115084h, 1)).firstOrError().flatMap(new r0e1(21, jr5Var, (w7p0) this.f264946c));
            default:
                bu5 bu5Var = (bu5) obj;
                etq etqVar = (etq) this.f264945b;
                String str = (String) this.f264946c;
                ArrayList arrayList = bu5Var.f31018b;
                Single singleJust = arrayList.isEmpty() ? Single.just(f06.f64554a) : ((t6f0) etqVar.f62756b).m80159a(arrayList).map(oet.f164555i).map((x74) etqVar.f62757c).map(b5v.f23732i).map(new r0e1(23, bu5Var, str));
                wj50.m88279p(singleJust);
                return singleJust;
        }
    }

    /* JADX INFO: renamed from: b */
    public pgq0 m91824b() {
        if (((Executor) this.f264945b) == null) {
            synchronized (f264942d) {
                try {
                    if (f264943e == null) {
                        f264943e = Executors.newFixedThreadPool(2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f264945b = f264943e;
        }
        return new pgq0(28, (Executor) this.f264945b, (pir) this.f264946c);
    }

    @Override // p204p.t1k0
    /* JADX INFO: renamed from: c */
    public void mo63773c(int i) {
        if (i == 3 || i == 2) {
            hqb hqbVar = (hqb) this.f264945b;
            xu5 xu5Var = (xu5) this.f264946c;
            hqbVar.m48229z(new jv5(xu5Var.f266004f, xu5Var.f266005g), e46.f56005b);
        }
    }

    /* JADX INFO: renamed from: d */
    public cw0 m91825d(mv0 mv0Var) {
        ghm ghmVar = (ghm) this.f264945b;
        fus0 fus0Var = (fus0) this.f264946c;
        jhm jhmVar = (jhm) ghmVar.f79948a.f102320c;
        return new cw0(mv0Var, fus0Var, jhmVar.m53428b(), new jiz((vmz) ((i4t0) jhmVar.f112506a.f206669o).get()), jhmVar.f112506a.m77516c());
    }

    @Override // p204p.t1k0
    /* JADX INFO: renamed from: e */
    public void mo63775e() {
        hqb hqbVar = (hqb) this.f264945b;
        xu5 xu5Var = (xu5) this.f264946c;
        hqbVar.m48229z(new jv5(xu5Var.f266004f, xu5Var.f266005g), z06.f277993c1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public Object m91826f(ibk ibkVar) {
        dfb1 dfb1Var;
        if (ibkVar instanceof dfb1) {
            dfb1Var = (dfb1) ibkVar;
            int i = dfb1Var.f48563c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dfb1Var.f48563c = i - Integer.MIN_VALUE;
            } else {
                dfb1Var = new dfb1(this, ibkVar);
            }
        } else {
            dfb1Var = new dfb1(this, ibkVar);
        }
        Object objM32628a = dfb1Var.f48561a;
        int i2 = dfb1Var.f48563c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM32628a);
                C2529wd c2529wd = new C2529wd();
                z4l0 z4l0Var = (z4l0) this.f264945b;
                Objects.requireNonNull(z4l0Var, "client == null");
                c2529wd.f250160a = z4l0Var;
                c2529wd.m87800r("https://app-version-sunsetting-cdn.spotifycdn.com/");
                c2529wd.m87798o((nd70) this.f264946c);
                cfb1 cfb1Var = (cfb1) c2529wd.m87802t().m32329b(cfb1.class);
                dfb1Var.f48563c = 1;
                objM32628a = cfb1Var.m32628a(dfb1Var);
                yuk yukVar = yuk.f276404a;
                if (objM32628a == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM32628a);
            }
            return (veb1) objM32628a;
        } catch (Exception e) {
            Logger.m3967c(e, "Failed to get sunset music app versions", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public Object m91827g(bet betVar, ibk ibkVar) {
        ju1 ju1Var;
        if (ibkVar instanceof ju1) {
            ju1Var = (ju1) ibkVar;
            int i = ju1Var.f116012c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ju1Var.f116012c = i - Integer.MIN_VALUE;
            } else {
                ju1Var = new ju1(this, ibkVar);
            }
        } else {
            ju1Var = new ju1(this, ibkVar);
        }
        Object obj = ju1Var.f116010a;
        int i2 = ju1Var.f116012c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                psp pspVar = (psp) this.f264945b;
                String str = betVar.f26423a;
                kbm0 kbm0Var = ((nbm0) this.f264946c).get();
                String str2 = kbm0Var != null ? kbm0Var.f121231a : null;
                if (str2 == null) {
                    str2 = "";
                }
                CompletableObserveOn completableObserveOnM70885b = pspVar.m70885b(str, str2, 2, betVar.f26424b);
                ju1Var.f116012c = 1;
                Object objM96565n = zn91.m96565n(completableObserveOnM70885b, ju1Var);
                yuk yukVar = yuk.f276404a;
                if (objM96565n == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return grx.f83844a;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "Failed to add to queue";
            }
            return new erx(message);
        }
    }

    /* JADX INFO: renamed from: h */
    public String m91828h(qag1 qag1Var) {
        av91 av91Var;
        j8g0 j8g0Var = (j8g0) this.f264946c;
        if (qag1Var instanceof w650) {
            j8g0Var.getClass();
            yt91 yt91VarM96903c = j8g0Var.f109936b.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("account_list", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
            Integer numValueOf = Integer.valueOf(((w650) qag1Var).f248260d);
            yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("user_item", null, numValueOf, null, null));
            yt91VarM96903c2.f276056j = true;
            av91Var = new av91("", "", new dv91("hit", 1), new bv91("login", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
        } else {
            if (!(qag1Var instanceof c650)) {
                throw new NoWhenBranchMatchedException();
            }
            j8g0Var.getClass();
            yt91 yt91VarM96903c3 = j8g0Var.f109936b.m96903c();
            yt91VarM96903c3.f276055i.add(new bu91("account_list", null, null, null, null));
            yt91VarM96903c3.f276056j = false;
            zt91 zt91VarM94607a2 = yt91VarM96903c3.m94607a();
            c650 c650Var = (c650) qag1Var;
            Integer numValueOf2 = Integer.valueOf(c650Var.f34391e);
            yt91 yt91VarM96903c4 = zt91VarM94607a2.m96903c();
            yt91VarM96903c4.f276055i.add(new bu91("add_user_item", null, numValueOf2, null, null));
            yt91VarM96903c4.f276056j = false;
            zt91 zt91VarM94607a3 = yt91VarM96903c4.m94607a();
            String str = c650Var.f34390d;
            dv91 dv91Var = new dv91("hit", 1);
            String string = str.toString();
            if (string == null) {
                string = "";
            }
            av91Var = new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a3, st91.f213865b, System.currentTimeMillis());
        }
        return ((kv91) this.f264945b).mo57453r(av91Var, null).f46380a.f279709a;
    }

    /* JADX INFO: renamed from: i */
    public void m91829i(phf1 phf1Var) {
        ou91 ou91VarMo24514e;
        j8g0 j8g0Var = (j8g0) this.f264946c;
        if (phf1Var instanceof ui40) {
            ou91VarMo24514e = j8g0Var.mo24514e();
        } else {
            if (!(phf1Var instanceof wi40)) {
                throw new NoWhenBranchMatchedException();
            }
            j8g0Var.getClass();
            yt91 yt91VarM96903c = j8g0Var.f109936b.m96903c();
            yt91VarM96903c.f276055i.add(new bu91("account_list", null, null, null, null));
            yt91VarM96903c.f276056j = false;
            zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
            Integer numValueOf = Integer.valueOf(((wi40) phf1Var).f251494b);
            yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("user_item", null, numValueOf, null, null));
            yt91VarM96903c2.f276056j = true;
            zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
            nu91 nu91Var = new nu91();
            nu91Var.f248107a = zt91VarM94607a2;
            nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
            nu91Var.f158542f = j8g0Var.f109937c;
            ou91VarMo24514e = (ou91) nu91Var.m87248a();
        }
        ((kv91) this.f264945b).mo57449i(ou91VarMo24514e, null);
    }

    /* JADX INFO: renamed from: j */
    public void m91830j() {
        kv91 kv91Var = (kv91) this.f264945b;
        gag0 gag0Var = (gag0) this.f264946c;
        gag0Var.getClass();
        yt91 yt91VarM96903c = gag0Var.f78050c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("later_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        String str = kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), gag0Var.f78049b, System.currentTimeMillis()), null).f46380a.f279709a;
    }

    /* JADX INFO: renamed from: k */
    public String m91831k() {
        kv91 kv91Var = (kv91) this.f264945b;
        gag0 gag0Var = (gag0) this.f264946c;
        gag0Var.getClass();
        yt91 yt91VarM96903c = gag0Var.f78050c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("link_account_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        return kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("navigate_to_external_uri", 1, Collections.singletonMap("destination", "https://alexa.amazon.com/spa/")), yt91VarM96903c.m94607a(), gag0Var.f78049b, System.currentTimeMillis()), null).f46380a.f279709a;
    }

    /* JADX INFO: renamed from: l */
    public void m91832l() {
        kv91 kv91Var = (kv91) this.f264945b;
        gag0 gag0Var = (gag0) this.f264946c;
        gag0Var.getClass();
        yt91 yt91VarM96903c = gag0Var.f78050c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("set_default_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        String str = kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("navigate_to_external_uri", 1, Collections.singletonMap("destination", "https://alexa.amazon.com/spa/index.html#settings/music-settings/service-preferences")), yt91VarM96903c.m94607a(), gag0Var.f78049b, System.currentTimeMillis()), null).f46380a.f279709a;
    }

    /* JADX INFO: renamed from: m */
    public av91 m91833m(String str) {
        zu91 zu91Var = new zu91();
        zu91Var.f248107a = (zt91) ((qgj0) this.f264946c).f188484b;
        zu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        ut91 ut91Var = ut91.f233854f;
        hr81 hr81VarM38946l = ehf1.m38946l();
        hr81VarM38946l.f94377d = (String) this.f264945b;
        hr81VarM38946l.f94376c = "navigate_to_external_uri";
        hr81VarM38946l.f94375b = 1;
        hr81.m48329q(hr81VarM38946l, "destination", str);
        zu91Var.f286396f = hr81VarM38946l.m48334j();
        return (av91) zu91Var.m87248a();
    }

    /* JADX INFO: renamed from: n */
    public void m91834n(AppBarLayout appBarLayout, View view, float f) {
        Rect rect = (Rect) this.f264946c;
        Rect rect2 = (Rect) this.f264945b;
        view.getDrawingRect(rect2);
        appBarLayout.offsetDescendantRectToMyCoords(view, rect2);
        rect2.offset(0, -appBarLayout.getTopInset());
        float fAbs = rect2.top - Math.abs(f);
        float f2 = 0.0f;
        if (fAbs > 0.0f) {
            WeakHashMap weakHashMap = mec1.f142677a;
            view.setClipBounds(null);
            view.setTranslationY(0.0f);
            return;
        }
        float fAbs2 = Math.abs(fAbs / rect2.height());
        if (fAbs2 >= 0.0f) {
            f2 = fAbs2 > 1.0f ? 1.0f : fAbs2;
        }
        float f3 = 1.0f - f2;
        float fHeight = (-fAbs) - ((rect2.height() * 0.3f) * (1.0f - (f3 * f3)));
        view.setTranslationY(fHeight);
        view.getDrawingRect(rect);
        rect.offset(0, (int) (-fHeight));
        WeakHashMap weakHashMap2 = mec1.f142677a;
        view.setClipBounds(rect);
    }

    /* JADX INFO: renamed from: o */
    public av91 m91835o(String str) {
        zu91 zu91Var = new zu91();
        zu91Var.f248107a = (zt91) ((qgj0) this.f264946c).f188484b;
        zu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        ut91 ut91Var = ut91.f233854f;
        hr81 hr81VarM38946l = ehf1.m38946l();
        hr81VarM38946l.f94377d = (String) this.f264945b;
        hr81VarM38946l.f94376c = "play";
        hr81VarM38946l.f94375b = 1;
        hr81.m48329q(hr81VarM38946l, "item_to_be_played", str);
        zu91Var.f286396f = hr81VarM38946l.m48334j();
        return (av91) zu91Var.m87248a();
    }

    /* JADX INFO: renamed from: p */
    public void m91836p(bn6 bn6Var) {
        this.f264945b = bn6Var;
    }

    /* JADX INFO: renamed from: q */
    public void m91837q(int i) {
        this.f264946c = new gag0(String.valueOf(i), 0);
    }

    /* JADX INFO: renamed from: r */
    public av91 m91838r(String str) {
        zu91 zu91Var = new zu91();
        zu91Var.f248107a = (zt91) ((qgj0) this.f264946c).f188484b;
        zu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        ut91 ut91Var = ut91.f233854f;
        hr81 hr81VarM38946l = ehf1.m38946l();
        hr81VarM38946l.f94377d = (String) this.f264945b;
        hr81VarM38946l.f94376c = "shuffle_play";
        hr81VarM38946l.f94375b = 1;
        hr81.m48329q(hr81VarM38946l, "context_to_be_played", str);
        zu91Var.f286396f = hr81VarM38946l.m48334j();
        return (av91) zu91Var.m87248a();
    }

    /* JADX INFO: renamed from: s */
    public void m91839s(Context context, String str, eh00 eh00Var) {
        ComponentName componentName;
        try {
            eh00Var.invoke();
            ((mwz0) this.f264946c).m63073a(1, str);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            Logger.m3965a("Trying to connect to MBS as a workaround", new Object[0]);
            C2255pg c2255pg = new C2255pg(this, eh00Var, str);
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent(MediaBrowserServiceCompat.SERVICE_INTERFACE);
            intent.setPackage(context.getPackageName());
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (listQueryIntentServices.size() == 1) {
                ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
            } else {
                if (!listQueryIntentServices.isEmpty()) {
                    throw new IllegalStateException(s571.m77246e(listQueryIntentServices.size(), "Expected 1 service that handles android.media.browse.MediaBrowserService, found "));
                }
                componentName = null;
            }
            if (componentName != null) {
                ((szb0) this.f264945b).m79731a(new C2255pg(this, componentName, context, c2255pg));
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.SingleOnSubscribe
    public void subscribe(SingleEmitter singleEmitter) {
        BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) this.f264945b;
        tx3 tx3Var = new tx3(singleEmitter, bluetoothAdapter);
        int profileConnectionState = bluetoothAdapter.getProfileConnectionState(2);
        if (profileConnectionState == 2 || profileConnectionState == 1) {
            bluetoothAdapter.getProfileProxy((Context) this.f264946c, tx3Var, 2);
        } else {
            singleEmitter.onSuccess(lau.f131415a);
        }
    }

    /* JADX INFO: renamed from: t */
    public ao6 m91840t() throws IOException {
        File file = (File) this.f264946c;
        File file2 = (File) this.f264945b;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                yif1.m93819w0("Couldn't rename file " + file2 + " to backup file " + file);
            }
        }
        try {
            return new ao6(file2);
        } catch (FileNotFoundException e) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + file2, e);
            }
            try {
                return new ao6(file2);
            } catch (FileNotFoundException e2) {
                throw new IOException("Couldn't create " + file2, e2);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public av91 m91841u(String str) {
        zu91 zu91Var = new zu91();
        zu91Var.f248107a = (zt91) ((qgj0) this.f264946c).f188484b;
        zu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        ut91 ut91Var = ut91.f233854f;
        hr81 hr81VarM38946l = ehf1.m38946l();
        hr81VarM38946l.f94377d = (String) this.f264945b;
        hr81VarM38946l.f94376c = "ui_navigate";
        hr81VarM38946l.f94375b = 1;
        hr81.m48329q(hr81VarM38946l, "destination", str);
        zu91Var.f286396f = hr81VarM38946l.m48334j();
        return (av91) zu91Var.m87248a();
    }

    /* JADX INFO: renamed from: v */
    public av91 m91842v() {
        zu91 zu91Var = new zu91();
        zu91Var.f248107a = (zt91) ((qgj0) this.f264946c).f188484b;
        zu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        ut91 ut91Var = ut91.f233854f;
        hr81 hr81VarM38946l = ehf1.m38946l();
        hr81VarM38946l.f94377d = (String) this.f264945b;
        hr81VarM38946l.f94376c = "ui_reveal";
        hr81VarM38946l.f94375b = 1;
        zu91Var.f286396f = hr81VarM38946l.m48334j();
        return (av91) zu91Var.m87248a();
    }

    public xqb(kv91 kv91Var, int i) {
        this.f264944a = i;
        switch (i) {
            case 16:
                this.f264945b = kv91Var;
                this.f264946c = new gag0("alexaAccountLinking", 0);
                break;
            default:
                this.f264945b = kv91Var;
                this.f264946c = new j8g0(0, (byte) 0);
                break;
        }
    }

    public xqb(mb80 mb80Var) {
        this.f264944a = 19;
        this.f264945b = mb80Var;
        this.f264946c = new mjc0(mb80Var.f141820e.mo61350a(), 0);
    }

    public xqb(C2098lp c2098lp, xre xreVar, y64 y64Var) {
        this.f264944a = 14;
        this.f264945b = c2098lp;
        this.f264946c = y64Var;
    }

    public xqb(igm igmVar) {
        this.f264944a = 25;
        this.f264945b = igmVar;
        this.f264946c = new bbg0(3);
    }

    public xqb(kv91 kv91Var, zr2 zr2Var, Map map) {
        this.f264944a = 13;
        this.f264945b = kv91Var;
        Object obj = (wr2) map.get(zr2Var.f285524a);
        this.f264946c = obj == null ? new xgp() : obj;
    }

    public xqb(File file) {
        this.f264944a = 29;
        this.f264945b = file;
        this.f264946c = new File(file.getPath() + ".bak");
    }

    public xqb(pir pirVar) {
        this.f264944a = 1;
        this.f264946c = pirVar;
    }

    public xqb(qgj0 qgj0Var, String str) {
        this.f264944a = 17;
        this.f264946c = qgj0Var;
        this.f264945b = str;
    }

    public xqb() {
        this.f264944a = 22;
        this.f264945b = new Rect();
        this.f264946c = new Rect();
    }
}
