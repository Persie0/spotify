package p204p;

import android.app.NotificationManager;
import android.content.Intent;
import android.net.Uri;
import android.service.notification.StatusBarNotification;
import com.spotify.authentication.tokenexchangeapi.TokenExchangeException;
import com.spotify.offline_esperanto.proto.EsOffline$DownloadRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SkipToPrevTrackCommand;
import com.spotify.player.model.command.options.SkipToPrevTrackOptions;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableSubscribeOn;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableConcatWithSingle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import spotify.your_library.esperanto.proto.YourLibraryResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class hvj0 implements Function, BiPredicate, InterfaceC2207oa, Predicate, BiFunction, w1j0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f95742a;

    /* JADX INFO: renamed from: b */
    public final Object f95743b;

    public /* synthetic */ hvj0(Object obj, int i) {
        this.f95742a = i;
        this.f95743b = obj;
    }

    /* JADX INFO: renamed from: a */
    public boolean m48893a() {
        int mode = ((pz6) ((hz6) this.f95743b)).f183611a.getMode();
        return mode == 2 || mode == 1;
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        return ((ge4) this.f95743b).m44449a() && wj50.m88271j(((ihi) obj).f102294a, "spotify:list:offline-playable:all");
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        boolean z;
        switch (this.f95742a) {
            case 14:
                Map map = (Map) obj;
                if (((uvf0) obj2).m84055a()) {
                    ((wrf0) ((a3k) this.f95743b).f11976f).getClass();
                    if (wrf0.m88857a(map)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(((Boolean) obj).booleanValue() && ((Boolean) obj2).booleanValue() && ((my3) ((izb) ((r3n0) this.f95743b).f195526c).f107186a.get()).m63153a());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m48894b(String str) {
        NotificationManager notificationManager = (NotificationManager) this.f95743b;
        for (StatusBarNotification statusBarNotification : notificationManager.getActiveNotifications()) {
            String string = statusBarNotification.getNotification().extras.getString("uri");
            Set set = dd41.f47702f;
            if (wj50.m88271j(mjd.m61966b(r46.m74726U(string)), str)) {
                notificationManager.cancel(statusBarNotification.getId());
            }
        }
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(intent.getDataString());
        e1q0 e1q0Var = (e1q0) this.f95743b;
        Map map = (Map) x0h1.m89581x(dau.f47107a, new onm0(e1q0Var, (fbk) null, 21));
        if (!dxf1.m37244s("has-podcasts-available", map) && !dxf1.m37246v(map)) {
            return e1q0.m37566f();
        }
        if (!dd41VarM74726U.m35722t()) {
            return e1q0.m37563c(e1q0Var, e1q0.m37565e(dd41VarM74726U), intent, e301Var, dd41VarM74726U);
        }
        dd41 dd41VarM35709g = dd41VarM74726U.m35709g();
        return dd41VarM35709g == null ? new r1j0(dd41VarM74726U) : new r1j0(dd41VarM35709g);
    }

    @Override // io.reactivex.rxjava3.functions.BiPredicate
    public boolean test(Object obj, Object obj2) {
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        ((dii0) this.f95743b).getClass();
        return dxf1.m37222K(map) == dxf1.m37222K(map2) && wj50.m88271j(map.get("pick-and-shuffle"), map2.get("pick-and-shuffle"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hvj0(gh00 gh00Var) {
        this.f95742a = 11;
        this.f95743b = (qe70) gh00Var;
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        boolean z;
        switch (this.f95742a) {
            case 9:
                qam0 qam0Var = (qam0) obj;
                wmm0 wmm0Var = (wmm0) this.f95743b;
                if (wmm0Var.f252933d) {
                    if (!qam0Var.equals(wmm0Var.f252934e)) {
                        if (qam0Var instanceof gnm0) {
                            gnm0 gnm0Var = (gnm0) qam0Var;
                            qam0 qam0Var2 = wmm0Var.f252934e;
                            if (qam0Var2 != null && (qam0Var2 instanceof gnm0)) {
                                gnm0 gnm0Var2 = (gnm0) qam0Var2;
                                if (!wj50.m88271j(gnm0Var.f82737a, gnm0Var2.f82737a) || gnm0Var.f82745i != gnm0Var2.f82745i) {
                                }
                            }
                        }
                        z = false;
                    }
                    z = true;
                } else {
                    z = false;
                }
                wmm0Var.f252933d = false;
                return z;
            default:
                PlayerState playerState = (PlayerState) obj;
                if (!((eap0) this.f95743b).f57709c.m70127h(playerState)) {
                    String str = (String) playerState.contextMetadata().get(ContextTrack.Metadata.KEY_LOADING_STATUS);
                    if (str == null) {
                        str = "";
                    }
                    if (str.length() <= 0 || str.equals("loading")) {
                        return false;
                    }
                }
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r12v44, types: [java.lang.Object, p.yaw0] */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) throws Throwable {
        int i = this.f95742a;
        Object obj2 = this.f95743b;
        switch (i) {
            case 1:
                Single singleCast = Single.just((ke20) obj).map(y8z.f270423Q0).cast(ne20.class);
                le20 le20Var = le20.f132436a;
                Single singleJust = Single.just(le20Var);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                Scheduler scheduler = (Scheduler) ((kz5) obj2).f128015e;
                Flowable flowableConcatWith = singleCast.concatWith(singleJust.delay(5000L, timeUnit, scheduler));
                Single singleDelay = Single.just(le20Var).delay(2000L, timeUnit, scheduler);
                flowableConcatWith.getClass();
                Objects.requireNonNull(singleDelay, "other is null");
                return new FlowableConcatWithSingle(flowableConcatWith, singleDelay);
            case 5:
                return ynd1.m94245b(((qzk0) obj2).f194219b, (YourLibraryResponse) obj, true, false, false, false, 160);
            case 6:
                Map map = (Map) obj;
                d3l0 d3l0Var = (d3l0) obj2;
                a7n a7nVar = d3l0Var.f44936c;
                if (!gwg1.m45947s((String) map.get("employee"))) {
                    return Observable.empty();
                }
                if (d3l0.m34863a(map) && ((hv31) a7nVar.get()).mo48713h(d3l0.f44932f, false)) {
                    Set setMo48706a = ((hv31) a7nVar.get()).mo48706a(d3l0.f44933g);
                    if (setMo48706a.isEmpty()) {
                        d3l0Var.m34865c(false);
                        return d3l0Var.m34864b();
                    }
                    Set<String> set = setMo48706a;
                    int i2 = 10;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(set, 10));
                    for (String str : set) {
                        fwk0 fwk0Var = ((y3l0) d3l0Var.f44935b.get()).f268961a;
                        amw amwVarM16125q = EsOffline$DownloadRequest.m16125q();
                        amwVarM16125q.m26450r(str);
                        arrayList.add(fwk0Var.m42967a((EsOffline$DownloadRequest) amwVarM16125q.build()).flatMapCompletable(jsy.f115608T0));
                    }
                    CompletableSubscribeOn completableSubscribeOnM23303t = Completable.m23289m(arrayList).m23303t((Scheduler) d3l0Var.f44937d.get());
                    qbj0 qbj0Var = new qbj0(setMo48706a, 18);
                    Consumer consumer = Functions.f7228d;
                    Action action = Functions.f7227c;
                    return completableSubscribeOnM23303t.m23297i(qbj0Var, consumer, action, action, action, action).m23295g(new jn10(i2, d3l0Var, setMo48706a)).m23293d(d3l0Var.m34864b());
                }
                if (d3l0.m34863a(map)) {
                    return d3l0Var.m34864b();
                }
                if (gwg1.m45947s((String) map.get("employee")) && !wj50.m88271j(map.get("employee-free-opt-in"), "0")) {
                    return Observable.fromCallable(new ic9(d3l0Var, 11));
                }
                return Observable.empty();
            case 8:
                z2m0 z2m0Var = ((g3m0) obj2).f76240d;
                List list = ((fxx) obj).f74479a;
                z2m0Var.f278615a = list;
                return list;
            case 10:
                Throwable th = (Throwable) obj;
                if (!(th instanceof TokenExchangeException) && !(th instanceof TimeoutException)) {
                    throw th;
                }
                return (Uri) obj2;
            case 13:
                return ((yse1) obj2).m94464c(((be3) obj).f26266j).ignoreElement();
            case 16:
                p8p0 p8p0Var = ((q0p0) obj2).f184055t;
                wj50.m88279p(p8p0Var);
                return p8p0Var.mo48412a(new f8p0(SkipToPrevTrackCommand.builder().options(SkipToPrevTrackOptions.builder().allowSeeking(Boolean.TRUE).build()).build()));
            case 18:
                String str2 = (String) obj;
                int length = str2.length();
                rhj rhjVar = rhj.f199233a;
                if (length > 0) {
                    return ((jpx) ((epx) ((e6a0) obj2).f56601e)).m53978b(new C1668ai("queue", false, (gh00) new k5n0(str2, 17))).takeUntil(laz.f131457X0).filter(maz.f141732W0).map(new l06(str2, 8)).toFlowable(BackpressureStrategy.f7190d).m23334N(rhjVar);
                }
                return Flowable.m23313I(rhjVar);
            case 22:
                ieb0 ieb0Var = (ieb0) obj;
                vhq0 vhq0Var = (vhq0) obj2;
                tm31 tm31Var = vhq0Var.f241550b;
                pgo pgoVar = vhq0Var.f241549a;
                if (tm31Var != null && pgoVar != null) {
                    return vie1.m85642x(xsr.f265652b, new yyj0((Object) pgoVar, (Object) tm31Var, (Object) ieb0Var, false, (fbk) null, 22));
                }
                Observable observableEmpty = Observable.empty();
                wj50.m88279p(observableEmpty);
                return observableEmpty;
            case 26:
                return ((v9w0) ((elr0) obj2).f60745b.get()).f239057c.mo28488d();
            case 27:
                mrr0 mrr0Var = (mrr0) obj;
                Set set2 = dd41.f47702f;
                String strM35694A = r46.m74732a0(mrr0Var.f146594f, null).m35694A();
                wj50.m88279p(strM35694A);
                xxz xxzVar = mrr0Var.f146595g;
                return ((x4b) obj2).m89855E(Collections.singletonMap(strM35694A, xxzVar), Collections.singleton(strM35694A)).map(new b1h1(strM35694A, 9)).map(new xuk0(mrr0Var, 21)).map(loq0.f135524c);
            case 28:
                return new gzr0(((uxr0) obj2).f235032f);
            default:
                qxr0 qxr0Var = (qxr0) obj;
                e6a0 e6a0Var = (e6a0) obj2;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                List list2 = qxr0Var.f193732b;
                ArrayList<p0s0> arrayList2 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof p0s0) {
                        arrayList2.add(obj3);
                    }
                }
                for (p0s0 p0s0Var : arrayList2) {
                    o0s0 o0s0Var = p0s0Var.f172732a;
                    String str3 = p0s0Var.f172733b;
                    xxz xxzVar2 = p0s0Var.f172737f;
                    if (o0s0Var == k0s0.f118140a || o0s0Var == e0s0.f55029a || o0s0Var == m0s0.f138731a || o0s0Var == f0s0.f64712a) {
                        linkedHashSet.add(str3);
                        linkedHashMap.put(str3, xxzVar2);
                    }
                }
                return ((x4b) e6a0Var.f56599c).m89855E(kkc0.m56706s0(linkedHashMap), g6f.m43736n1(linkedHashSet)).map(new cxq0(6, e6a0Var, qxr0Var));
        }
    }
}
