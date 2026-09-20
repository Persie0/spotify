package p204p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateRequest;
import com.spotify.connectivity.esperanto.proto.SubStateRequest;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: classes.dex */
public final class rxp implements ssi {

    /* JADX INFO: renamed from: a */
    public final Flowable f203652a;

    /* JADX INFO: renamed from: b */
    public final pri f203653b;

    /* JADX INFO: renamed from: c */
    public final c1j f203654c;

    /* JADX INFO: renamed from: d */
    public final luk f203655d;

    static {
        new uc5(8);
    }

    public rxp(Flowable flowable, pri priVar, c1j c1jVar, luk lukVar) {
        this.f203652a = flowable;
        this.f203653b = priVar;
        this.f203654c = c1jVar;
        this.f203655d = lukVar;
    }

    /* JADX INFO: renamed from: c */
    public final Observable m76661c() {
        ObservableFromPublisher observableFromPublisher = new ObservableFromPublisher(this.f203652a.m23348j(d3v.f45011Y));
        c1j c1jVar = this.f203654c;
        c1jVar.getClass();
        SubStateRequest subStateRequest = (SubStateRequest) SubStateRequest.m7511n().build();
        C2048kd c2048kd = c1jVar.f33144a;
        wj50.m88279p(subStateRequest);
        return Observable.combineLatest(observableFromPublisher, k0e1.m54988g(new yqi(k0e1.m54985d(c2048kd.m56123O(subStateRequest)), 7), dau.f47107a).map(njy0.f154684U0), m76662d(), nwh0.f159166U0).skipWhile(y5i0.f269452T0).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: d */
    public final Observable m76662d() {
        tri triVar = (tri) this.f203653b;
        triVar.getClass();
        nti ntiVarM7377s = ConnectMessages$StateRequest.m7377s();
        ntiVarM7377s.m65626q();
        ntiVarM7377s.m65625m(false);
        ntiVarM7377s.m65628s(true);
        ntiVarM7377s.m65629t(true);
        ntiVarM7377s.m65627r(false);
        ConnectMessages$StateRequest connectMessages$StateRequest = (ConnectMessages$StateRequest) ntiVarM7377s.build();
        wj50.m88279p(connectMessages$StateRequest);
        return k0e1.m54988g(triVar.m81353d(connectMessages$StateRequest), this.f203655d).map(new gg5(8));
    }
}
