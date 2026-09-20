package p204p;

import com.spotify.episode.episodeassociationsimpl.proto.EpisodeassociationsResponse$GetComponentsResponse;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J5\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m24212d2 = {"Lp/r0w;", "", "", "entityUri", "", "componentTypes", "Lio/reactivex/rxjava3/core/Single;", "Lp/o2x0;", "Lcom/spotify/episode/episodeassociationsimpl/proto/EpisodeassociationsResponse$GetComponentsResponse;", "a", "(Ljava/lang/String;Ljava/util/List;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_episode_episodeassociationsimpl-episodeassociationsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface r0w {
    @zk00("entity-associations-view/v1/components/{entity_uri}")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Single<o2x0<EpisodeassociationsResponse$GetComponentsResponse>> m74424a(@ubn0(ContextTrack.Metadata.KEY_ENTITY_URI) String entityUri, @hit0("component_type") List<String> componentTypes);
}
