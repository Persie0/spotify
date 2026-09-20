package p204p;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.usergeopoints.p176v1.UpdateLocationRequest;
import com.spotify.voiceassistants.playermodels.VoiceAssistantLoggingContext;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.completable.CompletableToSingle;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import retrofit2.HttpException;
import spotify.your_library.esperanto.proto.PinRequest;

/* JADX INFO: loaded from: classes5.dex */
public final class g2a1 implements kpb1, Function, t6l0, md9, cy51, k6f1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f75875a;

    /* JADX INFO: renamed from: b */
    public Object f75876b;

    /* JADX INFO: renamed from: c */
    public Object f75877c;

    public /* synthetic */ g2a1(int i, Object obj, Object obj2) {
        this.f75875a = i;
        this.f75876b = obj;
        this.f75877c = obj2;
    }

    @Override // p204p.kpb1
    /* JADX INFO: renamed from: a */
    public void mo28659a(String str) {
        ((gh00) this.f75877c).invoke(new i3c1(qob1.m73385b((qob1) this.f75876b, str), str));
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Completable completableM23303t;
        nrd1 nrd1Var;
        switch (this.f75875a) {
            case 6:
                Throwable th = (Throwable) obj;
                Logger.m3967c(th, "Couldn't create request for play", new Object[0]);
                ((ac6) ((eu6) this.f75876b).f62883h).m25441d(th, (VoiceAssistantLoggingContext) this.f75877c);
                return CompletableEmpty.f7437a;
            case 8:
                b4d1 b4d1Var = ((e5d1) this.f75876b).f56368i;
                Scheduler scheduler = (Scheduler) this.f75877c;
                if (b4d1Var.f23313c == null || b4d1Var.f23314d == null || b4d1Var.f23315e != null) {
                    completableM23303t = CompletableEmpty.f7437a;
                    wj50.m88279p(completableM23303t);
                } else {
                    b4d1Var.f23312b.add(new z3d1(b4d1Var));
                    completableM23303t = new CompletableFromAction(new a4d1(b4d1Var, 0)).m23303t(scheduler);
                }
                return new CompletableToSingle(completableM23303t, a140.f11325e, null).toObservable();
            case 9:
                String str = (String) obj;
                x4b x4bVar = (x4b) this.f75877c;
                f4d1 f4d1Var = (f4d1) this.f75876b;
                if (f4d1Var.f65762c.length() <= 0) {
                    return Single.just(str);
                }
                sdw0 sdw0Var = (sdw0) x4bVar.f258040e;
                Uri uri = Uri.parse(f4d1Var.f65762c);
                sdw0Var.getClass();
                return Single.fromCallable(new x31(20, uri, sdw0Var)).flatMap(new yya1(7, x4bVar, str));
            case 13:
                ysi ysiVar = (ysi) obj;
                pqm0 pqm0Var = (pqm0) this.f75876b;
                boolean z = ((Boolean) pqm0Var.f180350a).booleanValue() && !((Boolean) pqm0Var.f180351b).booleanValue();
                wg61 wg61Var = new wg61(new ixb1(ysiVar, 26));
                if (!z) {
                    nrd1Var = nrd1.APP_NOT_FOREGROUNDED;
                } else if (((Boolean) wg61Var.getValue()).booleanValue()) {
                    nrd1Var = ((prd1) this.f75877c).f180570i ? nrd1.ALREADY_SEEN_IN_SESSION : nrd1.ALL_CHECKS_CLEAR;
                } else {
                    nrd1Var = nrd1.NOT_WITHIN_TIMEFRAME;
                }
                return Single.just(nrd1Var);
            case 18:
                zpe1 zpe1Var = (zpe1) obj;
                if (!zpe1Var.equals(wpe1.f253755a)) {
                    return Single.just(zpe1Var);
                }
                tre1 tre1Var = ((yse1) this.f75876b).f275760a;
                d3o0 d3o0VarM98132o = PinRequest.m98132o();
                d3o0VarM98132o.m34887m((String) this.f75877c);
                return tre1Var.callSingle("spotify.your_library_esperanto.proto.YourLibraryService", "Pin", (PinRequest) d3o0VarM98132o.build()).map(hvi0.f95728Q0).map(wsq0.f254703Y0);
            default:
                pqm0 pqm0Var2 = new pqm0(Long.valueOf(gce.HOURS.f78575b.f50019a), TimeUnit.SECONDS);
                Observable observableJust = Observable.just(obj);
                fve1 fve1Var = (fve1) this.f75876b;
                Single singleDelay = ((Single) this.f75877c).delay(((Number) pqm0Var2.f180350a).longValue(), (TimeUnit) pqm0Var2.f180351b);
                fve1Var.getClass();
                return Observable.merge(observableJust, singleDelay.toObservable().concatMap(new g2a1(19, fve1Var, singleDelay)));
        }
    }

    @Override // p204p.k6f1
    /* JADX INFO: renamed from: b */
    public void mo30255b(Bitmap bitmap) {
        y3d1 y3d1Var = (y3d1) this.f75876b;
        y3d1Var.f268898c = bitmap;
        qng1 qng1Var = (qng1) this.f75877c;
        qng1Var.f190594l = y3d1Var;
        qng1Var.m73351a();
    }

    @Override // p204p.md9
    /* JADX INFO: renamed from: c */
    public void mo42509c() {
        mmf1.m62313g("BillingClient", "Reconnection attempt failed.");
        try {
            ((rtg1) this.f75876b).m76378a(esf1.f62364h);
        } catch (Throwable unused) {
            mmf1.m62315i("BillingClient");
        }
        xc9 xc9Var = (xc9) this.f75877c;
        if (xc9Var.f260137H != null) {
            n081 n081Var = new n081(this, 19);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n081Var.run();
            } else {
                xc9Var.f260145g.post(n081Var);
            }
        }
    }

    @Override // p204p.cy51
    /* JADX INFO: renamed from: d */
    public y7h1 mo27672d(Object obj) {
        fw40 fw40Var = (fw40) this.f75876b;
        f0m f0mVar = (f0m) this.f75877c;
        Bundle bundle = (Bundle) obj;
        xgf1 xgf1Var = (xgf1) fw40Var.f73935c;
        wsv0 wsv0Var = (wsv0) f0mVar.f64684b;
        if ((wsv0Var.isEmpty() || wsv0Var.contains(3)) && vgg1.m85459O(xgf1Var) && bundle.getBoolean("update_tv_provider", false)) {
            xgf1Var.getClass();
            try {
                xgf1Var.f261313a.delete(xgf1.f261311b, null, null);
            } catch (RuntimeException e) {
                xgf1.f261312c.m94134e("RuntimeException occurred", e);
            }
        }
        return bga.m29102x(null);
    }

    @Override // p204p.kpb1
    /* JADX INFO: renamed from: e */
    public void mo28662e(String str, String str2) {
        ((gh00) this.f75877c).invoke(new j3c1(qob1.m73385b((qob1) this.f75876b, str), str, str2));
    }

    @Override // p204p.md9
    /* JADX INFO: renamed from: f */
    public void mo42511f(ye9 ye9Var) {
        mmf1.m62313g("BillingClient", "Reconnection finished with result: " + ye9Var.f271939a);
        try {
            ((rtg1) this.f75876b).m76378a(ye9Var);
        } catch (Throwable unused) {
            mmf1.m62315i("BillingClient");
        }
        xc9 xc9Var = (xc9) this.f75877c;
        if (xc9Var.f260137H != null) {
            vpa1 vpa1Var = new vpa1(14, this, ye9Var);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                vpa1Var.run();
            } else {
                xc9Var.f260145g.post(vpa1Var);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public Observable m43376g(String str, roa roaVar) {
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(roaVar.f201199b);
        he41 he41Var = dd41VarM74726U.f47710d;
        return ((Observable) this.f75877c).map(new bl61(wj50.m88271j(he41Var != null ? he41Var.getType() : null, nvp0.f158938f), dd41VarM74726U, this, roaVar, str));
    }

    @Override // p204p.kpb1
    /* JADX INFO: renamed from: h */
    public void mo28664h(String str, String str2, psj psjVar) {
        ((gh00) this.f75877c).invoke(new g3c1(qob1.m73385b((qob1) this.f75876b, str), str, str2, psjVar));
    }

    /* JADX INFO: renamed from: i */
    public b141 m43377i(e1e e1eVar, r55 r55Var) {
        yb81 yb81Var = new yb81(this, r55Var, e1eVar, 14);
        return new b141(26, g1e.m43352c((g1e) this.f75876b, r55Var, new vbu0(r55Var, 5), r55Var, e1eVar, r55Var), yb81Var);
    }

    /* JADX INFO: renamed from: j */
    public Single m43378j() {
        hsb1 hsb1Var = (hsb1) this.f75876b;
        return Single.zip(Observable.combineLatest(((s5p) ((voi) hsb1Var.f94655c)).m77299i(), ((cdp) hsb1Var.f94656d).m32458d(), new und1(hsb1Var, 1)).firstOrError(), ((vsd1) ((usd1) hsb1Var.f94660h)).f244414a.map(f8r0.f67060Y0), oyq0.f171857Y0).flatMap(new vaa1(hsb1Var, 11)).map(new gc41(this, 27));
    }

    /* JADX INFO: renamed from: k */
    public d850 m43379k(int i) {
        String str;
        kv91 kv91Var = (kv91) this.f75876b;
        xug0 xug0Var = (xug0) this.f75877c;
        xug0Var.getClass();
        yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
        if (i == 1) {
            str = "daily";
        } else if (i == 2) {
            str = "never";
        } else {
            if (i != 3) {
                throw null;
            }
            str = "weekly";
        }
        yt91VarM96903c.f276055i.add(new bu91("cadence_row", str, null, null, null));
        yt91VarM96903c.f276056j = false;
        return kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: l */
    public void m43380l() {
        kv91 kv91Var = (kv91) this.f75876b;
        j8g0 j8g0Var = (j8g0) this.f75877c;
        j8g0Var.getClass();
        yt91 yt91VarM96903c = j8g0Var.f109936b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("save_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("submit", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: m */
    public String m43381m(String str, double d) {
        zm8 zm8VarM25673o = ((ae41) this.f75877c).m25673o(str);
        if (zm8VarM25673o == null) {
            return null;
        }
        yt91 yt91VarM96903c = zm8VarM25673o.f284180c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("system_volume_down", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        int iM72082M = q3d0.m72082M(d * ((double) 100));
        dv91 dv91Var = new dv91("hit", 1);
        String strValueOf = String.valueOf(iM72082M);
        if (strValueOf == null) {
            strValueOf = "";
        }
        return ((kv91) this.f75876b).mo57453r(new av91("", "", dv91Var, new bv91("set_volume", 1, Collections.singletonMap("new_volume_percentage", strValueOf)), zt91VarM94607a, zm8VarM25673o.f284179b, System.currentTimeMillis()), null).f46380a.f279709a;
    }

    /* JADX INFO: renamed from: n */
    public String m43382n(String str, double d) {
        zm8 zm8VarM25673o = ((ae41) this.f75877c).m25673o(str);
        if (zm8VarM25673o == null) {
            return null;
        }
        yt91 yt91VarM96903c = zm8VarM25673o.f284180c.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("system_volume_up", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        int iM72082M = q3d0.m72082M(d * ((double) 100));
        dv91 dv91Var = new dv91("hit", 1);
        String strValueOf = String.valueOf(iM72082M);
        if (strValueOf == null) {
            strValueOf = "";
        }
        return ((kv91) this.f75876b).mo57453r(new av91("", "", dv91Var, new bv91("set_volume", 1, Collections.singletonMap("new_volume_percentage", strValueOf)), zt91VarM94607a, zm8VarM25673o.f284179b, System.currentTimeMillis()), null).f46380a.f279709a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: o */
    public Enum m43383o(g7r g7rVar, String str, ibk ibkVar) {
        jqa1 jqa1Var;
        double d;
        String str2;
        String str3;
        String str4;
        double d2;
        String str5;
        String str6;
        String str7;
        if (ibkVar instanceof jqa1) {
            jqa1Var = (jqa1) ibkVar;
            int i = jqa1Var.f114867e;
            if ((i & Integer.MIN_VALUE) != 0) {
                jqa1Var.f114867e = i - Integer.MIN_VALUE;
            } else {
                jqa1Var = new jqa1(this, ibkVar);
            }
        } else {
            jqa1Var = new jqa1(this, ibkVar);
        }
        Object objM51353a = jqa1Var.f114865c;
        int i2 = jqa1Var.f114867e;
        ima0 ima0Var = ima0.f103654b;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                double d3 = jqa1Var.f114864b;
                str4 = jqa1Var.f114863a;
                try {
                    bga.m29073P(objM51353a);
                    d2 = d3;
                    try {
                        n7r n7rVar = (n7r) this.f75877c;
                        if (str4 == null) {
                            str7 = "unspecified";
                        } else {
                            str7 = str4;
                        }
                        ima0 ima0Var2 = ima0.f103653a;
                        n7rVar.m63810e(ima0Var2, 200, d2, str7);
                        return ima0Var2;
                    } catch (HttpException e) {
                        e = e;
                        str3 = str4;
                        d = d2;
                        n7r n7rVar2 = (n7r) this.f75877c;
                        if (str3 == null) {
                            str6 = "unspecified";
                        } else {
                            str6 = str3;
                        }
                        n7rVar2.m63810e(ima0Var, e.f288164a, d, str6);
                        return ima0Var;
                    } catch (Exception unused) {
                        str2 = str4;
                        d = d2;
                        n7r n7rVar3 = (n7r) this.f75877c;
                        if (str2 == null) {
                            str5 = "unspecified";
                        } else {
                            str5 = str2;
                        }
                        n7rVar3.m63810e(ima0Var, -1, d, str5);
                        return ima0Var;
                    }
                } catch (HttpException e2) {
                    e = e2;
                    str3 = str4;
                    d = d3;
                    n7r n7rVar4 = (n7r) this.f75877c;
                    if (str3 == null) {
                        str6 = "unspecified";
                    } else {
                        str6 = str3;
                    }
                    n7rVar4.m63810e(ima0Var, e.f288164a, d, str6);
                    return ima0Var;
                } catch (Exception unused2) {
                    str2 = str4;
                    d = d3;
                    n7r n7rVar5 = (n7r) this.f75877c;
                    if (str2 == null) {
                        str5 = "unspecified";
                    } else {
                        str5 = str2;
                    }
                    n7rVar5.m63810e(ima0Var, -1, d, str5);
                    return ima0Var;
                }
            }
            bga.m29073P(objM51353a);
            d = g7rVar.f77333c;
            uaa1 uaa1VarM22112s = UpdateLocationRequest.m22112s();
            uaa1VarM22112s.m82691q(g7rVar.f77331a);
            uaa1VarM22112s.m82693s(g7rVar.f77332b);
            uaa1VarM22112s.m82690m(d);
            if (str != null) {
                uaa1VarM22112s.m82692r(str);
            }
            UpdateLocationRequest updateLocationRequest = (UpdateLocationRequest) uaa1VarM22112s.build();
            try {
                try {
                    iqa1 iqa1Var = (iqa1) this.f75876b;
                    try {
                        wj50.m88279p(updateLocationRequest);
                        jqa1Var.f114863a = str;
                        jqa1Var.f114864b = d;
                        jqa1Var.f114867e = 1;
                        objM51353a = iqa1Var.m51353a(updateLocationRequest, jqa1Var);
                        yuk yukVar = yuk.f276404a;
                        if (objM51353a == yukVar) {
                            return yukVar;
                        }
                        str4 = str;
                        d2 = d;
                        n7r n7rVar6 = (n7r) this.f75877c;
                        if (str4 == null) {
                            str7 = "unspecified";
                        } else {
                            str7 = str4;
                        }
                        ima0 ima0Var3 = ima0.f103653a;
                        n7rVar6.m63810e(ima0Var3, 200, d2, str7);
                        return ima0Var3;
                    } catch (HttpException e3) {
                        e = e3;
                        str3 = str;
                        n7r n7rVar7 = (n7r) this.f75877c;
                        if (str3 == null) {
                            str6 = "unspecified";
                        } else {
                            str6 = str3;
                        }
                        n7rVar7.m63810e(ima0Var, e.f288164a, d, str6);
                        return ima0Var;
                    }
                } catch (HttpException e4) {
                    e = e4;
                }
            } catch (Exception unused3) {
                str2 = str;
                n7r n7rVar8 = (n7r) this.f75877c;
                if (str2 == null) {
                    str5 = "unspecified";
                } else {
                    str5 = str2;
                }
                n7rVar8.m63810e(ima0Var, -1, d, str5);
                return ima0Var;
            }
        } catch (CancellationException e5) {
            throw e5;
        }
    }

    /* JADX INFO: renamed from: p */
    public /* synthetic */ String[] m43384p() {
        return (String[]) this.f75876b;
    }

    /* JADX INFO: renamed from: q */
    public /* synthetic */ ArrayList m43385q() {
        return (ArrayList) this.f75877c;
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        return (swd1) ((vh00) this.f75876b).mo24510D0(view, swd1Var, (uq40) this.f75877c);
    }

    public g2a1(int i) {
        this.f75875a = i;
        switch (i) {
            case 25:
                g2a1 g2a1Var = x3h1.f257816b;
                this.f75876b = new y0i0((y0i0) g2a1Var.f75876b);
                this.f75877c = Arrays.copyOf((long[]) g2a1Var.f75877c, 10);
                break;
            default:
                this.f75877c = new bka1();
                break;
        }
    }

    public g2a1(xc9 xc9Var, rtg1 rtg1Var) {
        this.f75875a = 22;
        this.f75876b = rtg1Var;
        this.f75877c = xc9Var;
    }

    public g2a1(qng1 qng1Var, y3d1 y3d1Var) {
        this.f75875a = 24;
        this.f75876b = y3d1Var;
        Objects.requireNonNull(qng1Var);
        this.f75877c = qng1Var;
    }

    public g2a1(String[] strArr) {
        this.f75875a = 20;
        this.f75876b = strArr;
        this.f75877c = new ArrayList();
        new HashMap();
    }

    public g2a1(uf41 uf41Var) {
        this.f75875a = 12;
        this.f75876b = uf41Var;
    }

    public g2a1(kv91 kv91Var) {
        this.f75875a = 1;
        this.f75876b = kv91Var;
        this.f75877c = new xug0(25, (byte) 0);
    }

    public g2a1(dz31 dz31Var) {
        this.f75875a = 11;
        this.f75876b = dz31Var;
        this.f75877c = BehaviorSubject.m23795f();
    }
}
