package p204p;

import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.local_files_esperanto.proto.EsLocalFiles$GetTracksRequest;
import com.spotify.local_files_esperanto.proto.EsLocalFiles$Query;
import com.spotify.offline_esperanto.proto.C1091c;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsProgressRequest;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsRequest;
import com.spotify.offline_esperanto.proto.EsOffline$GetItemsRequest;
import com.spotify.playlist.policy.proto.PlaylistTrackDecorationPolicy;
import io.reactivex.rxjava3.core.Observable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class hwk0 {

    /* JADX INFO: renamed from: a */
    public final fwk0 f95982a;

    /* JADX INFO: renamed from: b */
    public final aca0 f95983b;

    public hwk0(fwk0 fwk0Var, aca0 aca0Var) {
        this.f95982a = fwk0Var;
        this.f95983b = aca0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m48940a(Set set) {
        Observable observableJust;
        Observable observableJust2;
        Observable observableJust3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int iOrdinal = new gf41(str).f79270c.ordinal();
            if (iOrdinal != 6) {
                if (iOrdinal != 8) {
                    if (iOrdinal == 19) {
                        linkedHashSet3.add(str);
                    } else if (iOrdinal != 12 && iOrdinal != 13 && iOrdinal != 63) {
                        if (iOrdinal != 64) {
                        }
                    }
                }
                linkedHashSet2.add(str);
            }
            linkedHashSet.add(str);
        }
        boolean zIsEmpty = linkedHashSet2.isEmpty();
        fwk0 fwk0Var = this.f95982a;
        nau nauVar = nau.f152117a;
        if (zIsEmpty) {
            observableJust = Observable.just(nauVar);
            wj50.m88279p(observableJust);
        } else {
            dmw dmwVarM16151p = EsOffline$GetItemsRequest.m16151p();
            dmwVarM16151p.m36429m(linkedHashSet2);
            observableJust = fwk0Var.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeItems", (EsOffline$GetItemsRequest) dmwVarM16151p.build()).map(t2z.f216649S0).throttleLatest(250L, TimeUnit.MILLISECONDS).map(haz.f89313Q0);
        }
        if (linkedHashSet.isEmpty()) {
            observableJust2 = Observable.just(nauVar);
            wj50.m88279p(observableJust2);
        } else {
            C1091c c1091cM16137t = EsOffline$GetContextsRequest.m16137t();
            c1091cM16137t.m16213m(linkedHashSet);
            Observable map = fwk0Var.m42969c((EsOffline$GetContextsRequest) c1091cM16137t.build()).map(gaz.f78132S0);
            cmw cmwVarM16130o = EsOffline$GetContextsProgressRequest.m16130o();
            cmwVarM16130o.m33408m(linkedHashSet);
            observableJust2 = Observable.combineLatest(map, fwk0Var.callStream("spotify.offline_esperanto.proto.Offline", "SubscribeContextsProgress", (EsOffline$GetContextsProgressRequest) cmwVarM16130o.build()).map(q2z.f184736S0).map(y8z.f270425S0), j5z.f109146Q0);
        }
        if (linkedHashSet3.isEmpty()) {
            observableJust3 = Observable.just(nauVar);
            wj50.m88279p(observableJust3);
        } else {
            flw flwVarM13154p = EsLocalFiles$GetTracksRequest.m13154p();
            flwVarM13154p.m42016r((EsLocalFiles$Query) EsLocalFiles$Query.m13160o().build());
            ktp0 ktp0VarM18427E = PlaylistTrackDecorationPolicy.m18427E();
            ktp0VarM18427E.m57346D(TrackDecorationPolicy.newBuilder().setLink(true).setLocallyPlayable(true));
            flwVarM13154p.m42015q(ktp0VarM18427E);
            int i = 15;
            observableJust3 = k0e1.m54988g(new xif0(i, new mp80(((ica0) this.f95983b).callStream("spotify.local_files_esperanto.proto.LocalFiles", "SubscribeTracks", (EsLocalFiles$GetTracksRequest) flwVarM13154p.build()), 23), linkedHashSet3), dau.f47107a);
        }
        return Observable.combineLatest(observableJust, observableJust2, observableJust3, iaz.f100378R0);
    }
}
