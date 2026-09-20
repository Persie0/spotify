package p204p;

import android.content.Context;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ShowDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionEpisodeDecorationPolicy;
import spotify.collection.esperanto.proto.CollectionShowDecorationPolicy;

/* JADX INFO: loaded from: classes9.dex */
public final class u7f0 {

    /* JADX INFO: renamed from: d */
    public static final CollectionEpisodeDecorationPolicy f227595d;

    /* JADX INFO: renamed from: a */
    public final Context f227596a;

    /* JADX INFO: renamed from: b */
    public final n5f f227597b;

    /* JADX INFO: renamed from: c */
    public final h5w f227598c;

    static {
        i3f i3fVarM97499u = CollectionEpisodeDecorationPolicy.m97499u();
        i3fVarM97499u.m49615r((EpisodeDecorationPolicy) EpisodeDecorationPolicy.newBuilder().setName(true).setLength(true).build());
        u5f u5fVarM97529r = CollectionShowDecorationPolicy.m97529r();
        u5fVarM97529r.m82404s((ShowDecorationPolicy) ShowDecorationPolicy.newBuilder().setName(true).build());
        i3fVarM97499u.m49618u((CollectionShowDecorationPolicy) u5fVarM97529r.build());
        f227595d = (CollectionEpisodeDecorationPolicy) i3fVarM97499u.build();
    }

    public u7f0(Context context, n5f n5fVar, h5w h5wVar) {
        this.f227596a = context;
        this.f227597b = n5fVar;
        this.f227598c = h5wVar;
    }
}
