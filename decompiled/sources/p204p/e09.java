package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Collections;

/* JADX INFO: loaded from: classes10.dex */
public final class e09 implements EventSource {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54902a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EventSource f54903b;

    public e09(EventSource eventSource) {
        this.f54902a = 7;
        this.f54903b = eventSource;
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        switch (this.f54902a) {
            case 0:
                return this.f54903b.mo15572a(consumer);
            case 1:
                return this.f54903b.mo15572a(consumer);
            case 2:
                return this.f54903b.mo15572a(consumer);
            case 3:
                return this.f54903b.mo15572a(consumer);
            case 4:
                return this.f54903b.mo15572a(consumer);
            case 5:
                return this.f54903b.mo15572a(consumer);
            case 6:
                return this.f54903b.mo15572a(consumer);
            case 7:
                return this.f54903b.mo15572a(new y7i(consumer, 1));
            case 8:
                return this.f54903b.mo15572a(consumer);
            case 9:
                return this.f54903b.mo15572a(consumer);
            case 10:
                return this.f54903b.mo15572a(consumer);
            case 11:
                return this.f54903b.mo15572a(consumer);
            case 12:
                return this.f54903b.mo15572a(consumer);
            case 13:
                return this.f54903b.mo15572a(consumer);
            case 14:
                return this.f54903b.mo15572a(consumer);
            case 15:
                return this.f54903b.mo15572a(consumer);
            default:
                return this.f54903b.mo15572a(consumer);
        }
    }

    public e09(String str, epx epxVar) {
        this.f54902a = 14;
        this.f54903b = RxEventSources.m15655a(((jpx) epxVar).m53978b(new C1668ai("SubscriberStateEventSource", false, (gh00) new e151(str, 4))).onErrorComplete().map(new q1h1(str, 12)));
    }

    public e09(t5q0 t5q0Var) {
        this.f54902a = 16;
        this.f54903b = RxEventSources.m15655a(((i7p0) t5q0Var).f99602c.distinctUntilChanged((BiPredicate) wby.f249892X0).doOnSubscribe(new s651(t5q0Var, 13)).doOnDispose(new y1s0(t5q0Var, 27)).map(mmq0.f145208U0));
    }

    public e09(Observable observable, int i) {
        this.f54902a = i;
        switch (i) {
            case 11:
                this.f54903b = RxEventSources.m15655a(observable.distinctUntilChanged().map(pmr0.f179225h));
                break;
            default:
                this.f54903b = RxEventSources.m15655a(observable.distinctUntilChanged().map(tnq0.f222044d));
                break;
        }
    }

    public e09(String str, z5f z5fVar) {
        this.f54902a = 5;
        this.f54903b = RxEventSources.m15655a(z5fVar.m95459c(str, Collections.singletonList(str), false).filter(q2z.f184750c).map(new it2(str, 3)).distinctUntilChanged().map(r2z.f195281c));
    }

    public e09(String str, b7m b7mVar) {
        this.f54902a = 2;
        this.f54903b = RxEventSources.m15655a(k0e1.m54988g(new g6a(new nzx0(new fol((Object) b7mVar, (Object) str, false, (fbk) null, 2)), 3), dau.f47107a));
    }

    public e09(String str, cr01 cr01Var) {
        this.f54902a = 13;
        this.f54903b = RxEventSources.m15655a(k0e1.m54988g(new g6a(new nzx0(new ld01(cr01Var, str, (fbk) null, 3)), 10), dau.f47107a));
    }

    public e09(String str, bgp bgpVar, Scheduler scheduler) {
        this.f54902a = 4;
        this.f54903b = RxEventSources.m15655a(Observable.defer(new frw(1, new lqk(bgpVar, str, scheduler, 29))).subscribeOn(Schedulers.f10370c));
    }

    public e09(awx0 awx0Var) {
        this.f54902a = 1;
        this.f54903b = RxEventSources.m15655a(awx0Var.f20724a.map(wow0.f253582Q0));
    }

    public e09(String str, wt80 wt80Var) {
        this.f54902a = 0;
        this.f54903b = RxEventSources.m15655a(k0e1.m54988g(new C2498vj(new pv4(((mu80) wt80Var).m62851p(new iz80(str)), 17), 14), dau.f47107a));
    }

    public e09(h3n h3nVar, so3 so3Var) {
        this.f54902a = 3;
        this.f54903b = RxEventSources.m15655a(Observable.defer(new frw(1, new ahr(26, h3nVar, so3Var))).subscribeOn(Schedulers.f10370c));
    }

    public e09(m600 m600Var, String str) {
        this.f54902a = 9;
        this.f54903b = RxEventSources.m15655a(m600Var.m60906G(new x12(str, m761.EPISODE_PAGE, 5)).map(gaz.f78145b1).onErrorReturn(haz.f89325Z0));
    }

    public e09(p7o p7oVar, String str) {
        this.f54902a = 6;
        this.f54903b = RxEventSources.m15655a(Observable.defer(new frw(1, new p200(10, p7oVar, str))).subscribeOn(Schedulers.f10370c));
    }

    public e09(String str, gkr0 gkr0Var, epx epxVar) {
        this.f54902a = 15;
        this.f54903b = RxEventSources.m15655a(Observable.combineLatest(gkr0Var.f80897a.distinctUntilChanged(), ((jpx) epxVar).m53978b(new C1668ai("CWPTrailerEventSource", false, (gh00) new mv81(str, 0))).filter(new C2617yl(str, 9)), pmr0.f179208T0).flatMap(new b141(17, str, epxVar)).map(ykq0.f273797U0).onErrorReturn(zkq0.f283813T0).distinctUntilChanged());
    }

    public e09(Flowable flowable, Flowable flowable2, zuv zuvVar, pgo pgoVar, kon konVar, luk lukVar, fj4 fj4Var, hv31 hv31Var) {
        this.f54902a = 12;
        boolean zM41791a = fj4Var.m41791a();
        tjo tjoVar = hiz0.f91914a;
        d3v d3vVar = d3v.f45021t;
        Flowable flowableM23320e = Flowable.m23320e(flowable.m23348j(d3vVar).m23331J(olr0.f166891X), flowable.m23348j(hdp0.f90173a).m23360y(pmr0.f179212X).m23331J(ykq0.f273802Y), flowable.m23348j(d3v.f45012Z), flowable.m23348j(d3v.f45007O0), new mwt0(zM41791a, 3));
        flowableM23320e.getClass();
        Function function = Functions.f7225a;
        ObservableFromPublisher observableFromPublisher = new ObservableFromPublisher(flowableM23320e.m23356t(function).m23331J(Functions.m23425b(zhz0.class)));
        Flowable flowableM23320e2 = Flowable.m23320e(flowable.m23348j(d3vVar).m23331J(onq0.f167329X), flowable2.m23331J(pnq0.f179496Y), flowable.m23348j(d3v.f45009Q0).m23356t(function), flowable.m23348j(d3v.f45008P0), new mwt0(fj4Var.m41791a(), 4));
        flowableM23320e2.getClass();
        ObservableFromPublisher observableFromPublisher2 = new ObservableFromPublisher(flowableM23320e2.m23331J(Functions.m23425b(zhz0.class)));
        Flowable flowableM23343X = flowable.m23348j(d3vVar).m23360y(zkq0.f283819Y).m23331J(alq0.f16931Y).m23355s(mmq0.f145213Y).m23343X(new bwt0(lukVar, zuvVar, pgoVar, konVar, 15));
        flowableM23343X.getClass();
        this.f54903b = RxEventSources.m15655a(observableFromPublisher, observableFromPublisher2, new ObservableFromPublisher(flowableM23343X.m23356t(function).m23331J(Functions.m23425b(zhz0.class))), new ObservableFromPublisher(k0e1.m54986e(gls.m45180a(hv31Var), lukVar).m23331J(nlr0.f155161t)));
    }

    public e09(String str, cvp cvpVar) {
        this.f54902a = 8;
        Observable observableM64579a = cvpVar.f42503a.m64579a(str);
        gh30 gh30Var = cvpVar.f42504b;
        String strConcat = "Notification state for ".concat(str);
        gh30Var.getClass();
        this.f54903b = RxEventSources.m15655a(observableM64579a.compose(new lsk(new zc30(new ej10(strConcat, 11), 2), new x10(19, fh30.f69554b))).flatMap(mzx.f148808P0));
    }
}
