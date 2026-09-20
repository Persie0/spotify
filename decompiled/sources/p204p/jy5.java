package p204p;

import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionArtistDecorationPolicy;

/* JADX INFO: loaded from: classes9.dex */
public final class jy5 {

    /* JADX INFO: renamed from: b */
    public static final CollectionArtistDecorationPolicy f117296b;

    /* JADX INFO: renamed from: a */
    public final n5f f117297a;

    static {
        n0f n0fVarM97459r = CollectionArtistDecorationPolicy.m97459r();
        n0fVarM97459r.m63450m((ArtistDecorationPolicy) ArtistDecorationPolicy.newBuilder().setName(true).setLink(true).setPortraits(true).build());
        f117296b = (CollectionArtistDecorationPolicy) n0fVarM97459r.build();
    }

    public jy5(n5f n5fVar) {
        this.f117297a = n5fVar;
    }
}
