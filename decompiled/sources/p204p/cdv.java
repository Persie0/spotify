package p204p;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.jam.internal.socialconnect.models.HostApprovalResponseError;
import com.spotify.kidsentitybanning.banning.p086v1.UpdateBanStatusRequest;
import com.spotify.offline.offlineplugin_proto.EnumC1081g;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes10.dex */
public final class cdv implements Function, yh00, wc40, vd21, tw91, hab, ObservableOnSubscribe {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36951a;

    /* JADX INFO: renamed from: b */
    public Object f36952b;

    public /* synthetic */ cdv(Object obj, int i) {
        this.f36951a = i;
        this.f36952b = obj;
    }

    /* JADX INFO: renamed from: g */
    public static uv70 m32460g(cdv cdvVar, int i) {
        yw70 yw70Var = (yw70) cdvVar.f36952b;
        oa31 oa31VarM58610i = lb5.m58610i();
        gh00 gh00VarMo28816e = oa31VarM58610i != null ? oa31VarM58610i.mo28816e() : null;
        oa31 oa31VarM58611j = lb5.m58611j(oa31VarM58610i);
        try {
            sw70 sw70Var = (sw70) yw70Var.f276893f.getValue();
            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            vv70 vv70Var = yw70Var.f276904q;
            long j = sw70Var.f214604j;
            boolean z = yw70Var.f276891d;
            f150 f150Var = new f150(i, sw70Var);
            m12 m12Var = vv70Var.f245164c;
            return m12Var != null ? m12Var.m60506U(i, j, vv70Var.f245163b, z, f150Var) : qjs.f189299a;
        } catch (Throwable th) {
            lb5.m58615n(oa31VarM58610i, oa31VarM58611j, gh00VarMo28816e);
            throw th;
        }
    }

    @Override // p204p.vd21
    /* JADX INFO: renamed from: V */
    public void mo27465V() {
        ohz ohzVar = (ohz) this.f36952b;
        ConstraintLayout constraintLayout = ohzVar.f165570G;
        if (constraintLayout == null) {
            wj50.m88260d0("mediaContainer");
            throw null;
        }
        constraintLayout.setVisibility(0);
        ConstraintLayout constraintLayout2 = ohzVar.f165573J;
        if (constraintLayout2 == null) {
            wj50.m88260d0("achievementCardContainer");
            throw null;
        }
        constraintLayout2.setVisibility(4);
        ParagraphView paragraphView = ohzVar.f165574K;
        if (paragraphView == null) {
            wj50.m88260d0("achievementLabelView");
            throw null;
        }
        paragraphView.setVisibility(4);
        ConstraintLayout constraintLayout3 = ohzVar.f165569F;
        if (constraintLayout3 != null) {
            constraintLayout3.setAlpha(ohzVar.f165566C ? 0.0f : 1.0f);
        } else {
            wj50.m88260d0("mediaSceneContainer");
            throw null;
        }
    }

    @Override // p204p.tw91
    /* JADX INFO: renamed from: a */
    public pv91 mo32461a(yqx0 yqx0Var, int i, String str) {
        b660 b660Var = (b660) yqx0Var.f275324j;
        String str2 = b660Var.f23846b;
        String str3 = yqx0Var.f275315a;
        boolean z = b660Var.f23845a;
        String str4 = b660Var.f23847c;
        xfr xfrVar = b660Var.f23848d;
        xx61 xx61Var = b660Var.f23849e;
        return new qgg0(new pgg0(new s8g0(new tgg0()), Integer.valueOf(i), str, str3, 1), str2, klh.m56834f(oq40.m67589h(vyf1.m86719B(xfrVar)), ":", oq40.m67590i(xx61Var != null ? vyf1.m86720C(xx61Var, z, str4, xfrVar) : 6)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v22 */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) throws InterruptedException {
        rfz rfzVar;
        String str;
        Single singleFlatMap;
        Map<String, ?> all;
        int i = 2;
        boolean z = false;
        boolean z2 = false;
        ?? r4 = 0;
        Object next = null;
        u570Var = null;
        u570 u570Var = null;
        r4 = 0;
        switch (this.f36951a) {
            case 0:
                dmu dmuVar = (dmu) this.f36952b;
                ktx ktxVar = ((fqx) obj).f72301b;
                wj50.m88279p(ktxVar);
                dmuVar.getClass();
                z240 z240Var = (z240) g6f.m43745s0(((erc1) ktxVar).f62079a.f139524a);
                if (z240Var != null && (rfzVar = z240Var.f278475a) != null) {
                    str = rfzVar.f198763a;
                }
                if (r4 == 0) {
                    r4 = str;
                    return "";
                }
                r4 = str;
                return r4;
            case 1:
                y5f y5fVar = (y5f) ((Map) obj).get(((l1w) this.f36952b).f128810a);
                return Boolean.valueOf(y5fVar != null ? y5fVar.f269419c : false);
            case 2:
                ArrayList arrayListM68132b = ((ovh0) this.f36952b).m68132b();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListM68132b) {
                    if (obj2 instanceof l8j) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j6f.m52564V(((l8j) it.next()).mo47617b(), arrayList2);
                }
                return g6f.m43736n1(arrayList2);
            case 3:
                return azx.m27700a((azx) this.f36952b, (roa) obj);
            case 4:
            case 5:
            case 7:
            case 8:
            case 9:
            case 12:
            case 13:
            case 16:
            case 20:
            case 21:
            case 22:
            case 25:
            case 26:
            default:
                if (((String) obj).length() == 0) {
                    return C2244p5.f174033a;
                }
                ((mi80) ((mqr) this.f36952b).f146344c).getClass();
                return xul0.m92200a("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ");
            case 6:
                return h6f.m46715L((h7k0) obj, (h7k0) this.f36952b);
            case 10:
                qxr0 qxr0Var = (qxr0) obj;
                vxx vxxVar = (vxx) this.f36952b;
                if (!qxr0Var.f193735e || !((b2s0) vxxVar.f245852e).f22687a.m58288u()) {
                    return Observable.just(qxr0Var);
                }
                qxr0 qxr0VarM74146c = qxr0.m74146c(qxr0Var, 0, null, null, false, false, 0, 4, 47);
                return vjf1.m85770t((luk) vxxVar.f245855h, new joz(vxxVar, (fbk) r4, 9)).toObservable().map(new m600(i, qxr0VarM74146c, vxxVar)).onErrorResumeNext(new ae00((Object) qxr0VarM74146c, (int) (z ? 1 : 0)));
            case 11:
                return ((hx00) obj).m48962h((UpdateBanStatusRequest) ((l7a1) this.f36952b).build(), vnd1.f243077b);
            case 14:
                rk10 rk10Var = (rk10) obj;
                wir0 wir0Var = rk10Var.f199947a.f166208a;
                yk10 yk10Var = (yk10) this.f36952b;
                return ((rmh0) yk10Var.f273538b).f200553m.filter(new ae00(yk10Var, wir0Var)).take(1L).map(new u010(yk10Var, wir0Var, rk10Var, 4));
            case 15:
                z470 z470Var = (z470) ((g570) this.f36952b);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                rlv0 rlv0Var = new rlv0();
                z470Var.f279160m.execute(new bz1(rlv0Var, z470Var, countDownLatch, 17));
                countDownLatch.await(500L, TimeUnit.MILLISECONDS);
                SharedPreferences sharedPreferences = (SharedPreferences) rlv0Var.f200373a;
                if (sharedPreferences != null && (all = sharedPreferences.getAll()) != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry<String, ?> entry : all.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        u570 u570VarM95319c = z470Var.m95319c(key, value instanceof String ? (String) value : null);
                        if (u570VarM95319c != null) {
                            arrayList3.add(u570VarM95319c);
                        }
                    }
                    Iterator it2 = arrayList3.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            Long l = ((u570) next).f226932f;
                            long jLongValue = l != null ? l.longValue() : 0L;
                            do {
                                Object next2 = it2.next();
                                Long l2 = ((u570) next2).f226932f;
                                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                                if (jLongValue < jLongValue2) {
                                    next = next2;
                                    jLongValue = jLongValue2;
                                }
                            } while (it2.hasNext());
                        }
                    }
                    u570Var = (u570) next;
                }
                if (u570Var == null) {
                    singleFlatMap = Single.just(Boolean.FALSE);
                    wj50.m88279p(singleFlatMap);
                } else {
                    singleFlatMap = z470Var.f279154g.firstOrError().flatMap(new po10(19, u570Var, z470Var));
                    wj50.m88279p(singleFlatMap);
                }
                return singleFlatMap.toObservable().map(yby.f271309e).onErrorReturn(ddy.f47907e);
            case 17:
                o2x0 o2x0Var = (o2x0) obj;
                if (o2x0Var.f161171a.f149852O0) {
                    return new d930(null);
                }
                p3x0 p3x0Var = o2x0Var.f161173c;
                HostApprovalResponseError hostApprovalResponseErrorM74970a = p3x0Var != null ? r830.m74970a(p3x0Var, (p0i0) this.f36952b) : null;
                return new z830(hostApprovalResponseErrorM74970a != null ? new a830(wj50.m88271j(hostApprovalResponseErrorM74970a.message, "REQUEST_NOT_FOUND") ? 1 : 2) : new a830(2));
            case 18:
                ye81 ye81Var = (ye81) obj;
                cjb0 cjb0Var = (cjb0) this.f36952b;
                boolean z3 = ye81Var.f271938c;
                String str2 = ye81Var.f271936a;
                EnumC1081g enumC1081g = EnumC1081g.NOT_APPLICABLE;
                if (z3) {
                    Observable observable = q0f1.m71814A(cjb0Var.f38556a.f25822a, new zz70(ye81Var.f271937b, 15)).subscribeOn(cjb0Var.f38557b).map(w040.f246637a).map(new x040(ye81Var)).onErrorReturnItem(e140.m37518a(str2, enumC1081g)).toObservable();
                    wj50.m88279p(observable);
                    return observable;
                }
                Observable observableJust = Observable.just(e140.m37518a(str2, enumC1081g));
                wj50.m88279p(observableJust);
                return observableJust;
            case 19:
                C2263po c2263po = (C2263po) this.f36952b;
                if (((ris0) c2263po.f179550b).f199612a.mo48713h(ris0.f199610b, false) || ((kss0) c2263po.f179551c).m57254e()) {
                    Observable observableJust2 = Observable.just(fgs0.f69396a);
                    wj50.m88279p(observableJust2);
                    return observableJust2;
                }
                Observable observableJust3 = Observable.just(ngs0.f153790a);
                wj50.m88279p(observableJust3);
                return observableJust3;
            case 23:
                return Completable.m23291w(((dks) obj).m36317f(), TimeUnit.MILLISECONDS, (Scheduler) ((u010) this.f36952b).f225345b);
            case 24:
                z470 z470Var2 = (z470) this.f36952b;
                return z470Var2.f279154g.firstOrError().onErrorResumeNext(u470.f226617a).flatMap(new w470(z470Var2, (String) obj));
            case 27:
                n680 n680Var = (n680) this.f36952b;
                String strMo27974l = n680Var.f150742g.m49524v().mo27974l();
                n680Var.f150741f.getClass();
                Observable observable2 = ((String) i6v.f99336a.get(strMo27974l)) != null ? vjf1.m85770t(n680Var.f150748m, new j680(n680Var, r4, z2 ? 1 : 0)).toObservable() : Observable.just(Boolean.TRUE);
                wj50.m88279p(observable2);
                return Observable.combineLatest(((rwx0) n680Var.f150739d).f203428a.map(zzx.f288150i), observable2, new ae00(n680Var, 18));
        }
    }

    /* JADX INFO: renamed from: b */
    public fwz0 m32462b() {
        return (fwz0) ((v050) this.f36952b).f235922b.getValue();
    }

    @Override // p204p.hab
    /* JADX INFO: renamed from: c */
    public void mo25640c(x8b x8bVar, o2x0 o2x0Var) {
        hqb hqbVar = (hqb) this.f36952b;
        if (o2x0Var.f161171a.f149852O0) {
            hqbVar.resumeWith(o2x0Var.f161172b);
        } else {
            hqbVar.resumeWith(new c6x0(new HttpException(o2x0Var)));
        }
    }

    /* JADX INFO: renamed from: d */
    public mev m32463d(boolean z) {
        jv4 jv4Var = (jv4) this.f36952b;
        iv4 iv4Var = iv4.OPEN_ENTITY_PAGE_AND_START_PLAYBACK;
        return new mev(z || h6f.m46715L(iv4Var, iv4.START_PLAYBACK).contains(jv4Var.m54363c()), !z && h6f.m46715L(iv4Var, iv4.OPEN_ENTITY_PAGE).contains(jv4Var.m54363c()));
    }

    @Override // p204p.tw91
    /* JADX INFO: renamed from: e */
    public av91 mo32464e(yqx0 yqx0Var, int i, String str) {
        String str2 = ((b660) yqx0Var.f275324j).f23851g.f42911e.f266863a;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-connect-menu";
        yt91VarM50626j.f276052f = "6.5.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91 yt91VarM42473q = fr0.m42473q(yt91VarM50626j, "connect/devicepicker");
        yt91VarM42473q.f276055i.add(new bu91("device_list", null, null, null, null));
        yt91VarM42473q.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM42473q.m94607a();
        Integer numValueOf = Integer.valueOf(i);
        yt91 yt91VarM96903c = zt91VarM94607a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("connect_device", null, numValueOf, str2, str));
        yt91VarM96903c.f276056j = true;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("context_menu_button", null, null, null, null));
        yt91VarM96903c2.f276056j = true;
        return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
    }

    @Override // p204p.tw91
    /* JADX INFO: renamed from: f */
    public pv91 mo32465f(yqx0 yqx0Var, int i, String str) {
        return new qgg0(new pgg0(new s8g0(new tgg0()), Integer.valueOf(i), str, ((b660) yqx0Var.f275324j).f23851g.f42911e.f266863a, 1), 0);
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: h */
    public void mo26031h(int i, Bitmap bitmap) {
        ((SingleEmitter) this.f36952b).onSuccess(Integer.valueOf(bitmap.getPixel(0, 0)));
    }

    /* JADX INFO: renamed from: i */
    public void m32466i(v7z0 v7z0Var) {
        this.f36952b = v7z0Var;
    }

    @Override // p204p.hab
    /* JADX INFO: renamed from: l */
    public void mo25646l(x8b x8bVar, Throwable th) {
        ((hqb) this.f36952b).resumeWith(new c6x0(th));
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: o */
    public void mo26038o(Drawable drawable) {
        ((SingleEmitter) this.f36952b).onSuccess(-7829368);
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        gb80 gb80Var = (gb80) this.f36952b;
        ib80 ib80Var = new ib80(observableEmitter, gb80Var, 0);
        observableEmitter.onNext(gb80Var.mo31987b());
        gb80Var.mo31986a(ib80Var);
        observableEmitter.setCancellable(new gr5(8, gb80Var, ib80Var));
    }

    public cdv() {
        this.f36951a = 9;
    }

    public cdv(SingleEmitter singleEmitter, a5y a5yVar) {
        this.f36951a = 4;
        this.f36952b = singleEmitter;
    }

    @Override // p204p.wc40
    /* JADX INFO: renamed from: j */
    public void mo26033j(Drawable drawable) {
    }
}
