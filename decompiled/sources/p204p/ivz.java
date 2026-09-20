package p204p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import spotify.socialgraph.esperanto.proto.FollowRequestV4;
import spotify.socialgraph.esperanto.proto.FollowedUsersRequest;

/* JADX INFO: loaded from: classes6.dex */
public final class ivz {

    /* JADX INFO: renamed from: a */
    public final C2048kd f106302a;

    public ivz(C2048kd c2048kd) {
        this.f106302a = c2048kd;
    }

    /* JADX INFO: renamed from: a */
    public final Completable m51769a(String str, boolean z) {
        exz exzVarM97969p = FollowRequestV4.m97969p();
        exzVarM97969p.m40268q(str);
        exzVarM97969p.m40267m(z);
        FollowRequestV4 followRequestV4 = (FollowRequestV4) exzVarM97969p.build();
        wj50.m88279p(followRequestV4);
        return this.f106302a.callSingle("spotify.socialgraph_esperanto.proto.SocialGraphService", "FollowUser", followRequestV4).map(snq0.f210992P0).map(jsy.f115621c).flatMapCompletable(new gt2(str, 5));
    }

    /* JADX INFO: renamed from: b */
    public final Observable m51770b() {
        dyz dyzVarM97973o = FollowedUsersRequest.m97973o();
        dyzVarM97973o.m37396m();
        FollowedUsersRequest followedUsersRequest = (FollowedUsersRequest) dyzVarM97973o.build();
        wj50.m88279p(followedUsersRequest);
        return this.f106302a.callStream("spotify.socialgraph_esperanto.proto.SocialGraphService", "SubscribeToFollowedUsers", followedUsersRequest).map(tnq0.f222026P0).switchMap(uty.f234025b);
    }
}
