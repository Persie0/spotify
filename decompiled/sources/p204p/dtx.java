package p204p;

import com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionTrackDecorationPolicy;

/* JADX INFO: loaded from: classes7.dex */
public final class dtx extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public static final dtx f52916a = new dtx(0);

    @Override // p204p.eh00
    public final Object invoke() {
        c6f c6fVarM97545u = CollectionTrackDecorationPolicy.m97545u();
        c6fVarM97545u.m31562x(TrackDecorationPolicy.newBuilder().setIs19PlusOnly(true).setIsExplicit(true).setPlayable(true));
        c6fVarM97545u.m31557s(TrackCollectionDecorationPolicy.newBuilder().setIsBanned(true));
        c6fVarM97545u.m31555q(ArtistCollectionDecorationPolicy.newBuilder().setIsBanned(true));
        return (CollectionTrackDecorationPolicy) c6fVarM97545u.build();
    }
}
