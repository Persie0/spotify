package p204p;

import android.util.LruCache;
import com.spotify.liveroom.listeningparty.proto.ObservePartyRequest;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes2.dex */
public final class jpk0 {

    /* JADX INFO: renamed from: a */
    public final th90 f114686a;

    /* JADX INFO: renamed from: b */
    public final LruCache f114687b = new LruCache(10);

    public jpk0(th90 th90Var) {
        this.f114686a = th90Var;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m53969a(gf41 gf41Var) {
        ObservePartyRequest observePartyRequest;
        String string = gf41Var.toString();
        mpk0 mpk0VarM13080q = ObservePartyRequest.m13080q();
        mpk0VarM13080q.m62496q(string);
        String str = (String) this.f114687b.get(string);
        if (str == null) {
            observePartyRequest = (ObservePartyRequest) mpk0VarM13080q.build();
        } else {
            mpk0VarM13080q.m62495m(str);
            observePartyRequest = (ObservePartyRequest) mpk0VarM13080q.build();
        }
        wj50.m88279p(observePartyRequest);
        return this.f114686a.m80831a(observePartyRequest).toObservable().flatMap(new d2j0(7, this, gf41Var));
    }
}
