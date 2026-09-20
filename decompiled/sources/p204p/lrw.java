package p204p;

import com.spotify.player.esperanto.proto.EsGetErrorRequest$GetErrorRequest;
import com.spotify.player.esperanto.proto.EsGetStateRequest$GetStateRequest;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes2.dex */
public final class lrw implements jdp0 {

    /* JADX INFO: renamed from: a */
    public final r7k f136364a;

    public lrw(r7k r7kVar) {
        this.f136364a = r7kVar;
    }

    @Override // p204p.jdp0
    /* JADX INFO: renamed from: a */
    public final Observable mo53040a() {
        return this.f136364a.callStream("spotify.player.esperanto.proto.ContextPlayer", "GetError", EsGetErrorRequest$GetErrorRequest.m17757n()).map(new0.f153125R0).onErrorResumeNext(hcp0.f89861T0).map(g2h1.f75950Y0);
    }

    @Override // p204p.jdp0
    /* JADX INFO: renamed from: b */
    public final Flowable mo53041b() {
        return mo53042c(2, 2);
    }

    @Override // p204p.jdp0
    /* JADX INFO: renamed from: c */
    public final Flowable mo53042c(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Cap under zero");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Cap under zero");
        }
        ukw ukwVarM17762q = EsGetStateRequest$GetStateRequest.m17762q();
        umw umwVarM17777q = EsOptional$OptionalInt64.m17777q();
        umwVarM17777q.m83492m(i);
        ukwVarM17762q.m83348s(umwVarM17777q);
        umw umwVarM17777q2 = EsOptional$OptionalInt64.m17777q();
        umwVarM17777q2.m83492m(i2);
        ukwVarM17762q.m83346q(umwVarM17777q2);
        EsGetStateRequest$GetStateRequest esGetStateRequest$GetStateRequest = (EsGetStateRequest$GetStateRequest) ukwVarM17762q.build();
        wj50.m88279p(esGetStateRequest$GetStateRequest);
        return this.f136364a.callStream("spotify.player.esperanto.proto.ContextPlayer", "GetState", esGetStateRequest$GetStateRequest).map(msz0.f146886R0).onErrorResumeNext(h2h1.f86997Z0).map(p4h1.f173944b1).toFlowable(BackpressureStrategy.f7190d);
    }
}
