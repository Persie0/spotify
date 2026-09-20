package p204p;

import com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistSyncDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionArtistDecorationPolicy;

/* JADX INFO: loaded from: classes4.dex */
public final class o06 {

    /* JADX INFO: renamed from: a */
    public final n5f f160239a;

    /* JADX INFO: renamed from: b */
    public final CollectionArtistDecorationPolicy f160240b;

    public o06(n5f n5fVar) {
        this.f160239a = n5fVar;
        ArtistDecorationPolicy artistDecorationPolicy = (ArtistDecorationPolicy) ArtistDecorationPolicy.newBuilder().setName(true).setLink(true).setPortraits(true).build();
        ArtistCollectionDecorationPolicy artistCollectionDecorationPolicy = (ArtistCollectionDecorationPolicy) ArtistCollectionDecorationPolicy.newBuilder().setCollectionLink(true).setIsBanned(true).setIsFollowed(true).setNumTracksInCollection(true).build();
        ArtistSyncDecorationPolicy artistSyncDecorationPolicy = (ArtistSyncDecorationPolicy) ArtistSyncDecorationPolicy.newBuilder().setOfflineState(true).build();
        n0f n0fVarM97459r = CollectionArtistDecorationPolicy.m97459r();
        n0fVarM97459r.m63450m(artistDecorationPolicy);
        n0fVarM97459r.m63452r(artistSyncDecorationPolicy);
        n0fVarM97459r.m63451q(artistCollectionDecorationPolicy);
        this.f160240b = (CollectionArtistDecorationPolicy) n0fVarM97459r.build();
    }
}
