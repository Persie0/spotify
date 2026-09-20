package p204p;

import com.spotify.savetospotify.p145v1.HttpCreateEpisodeRequest;
import com.spotify.savetospotify.p145v1.HttpCreateEpisodeResponse;
import com.spotify.savetospotify.p145v1.HttpCreateLocalFilesShowRequest;
import com.spotify.savetospotify.p145v1.HttpCreateShowRequest;
import com.spotify.savetospotify.p145v1.HttpEpisodeReadinessResponse;
import com.spotify.savetospotify.p145v1.HttpGetShowResponse;
import com.spotify.savetospotify.p145v1.HttpListShowsResponse;
import com.spotify.savetospotify.p145v1.HttpUpdateEpisodeRequest;
import com.spotify.savetospotify.p145v1.HttpUpdateShowPlaybackControlRequest;
import com.spotify.savetospotify.p145v1.HttpUpdateShowRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00012\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\u00020\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u001b\u001a\u00020\u001a2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001f\u001a\u00020\u00012\b\b\u0001\u0010\u001d\u001a\u00020\r2\b\b\u0001\u0010\n\u001a\u00020\u001eH§@¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020!2\b\b\u0001\u0010\u001d\u001a\u00020\rH§@¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010#\u001a\u00020\u001a2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b#\u0010\u0015J\u001a\u0010$\u001a\u00020\u001a2\b\b\u0001\u0010\u001d\u001a\u00020\rH§@¢\u0006\u0004\b$\u0010\u0015J\u0010\u0010%\u001a\u00020\u0006H§@¢\u0006\u0004\b%\u0010\bJ\u001a\u0010'\u001a\u00020\u00012\b\b\u0001\u0010\n\u001a\u00020&H§@¢\u0006\u0004\b'\u0010(ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006)À\u0006\u0001"}, m24212d2 = {"Lp/un51;", "", "Lp/euw0;", "body", "m", "(Lp/euw0;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/savetospotify/v1/HttpListShowsResponse;", "a", "(Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/savetospotify/v1/HttpCreateShowRequest;", "request", "i", "(Lcom/spotify/savetospotify/v1/HttpCreateShowRequest;Lp/fbk;)Ljava/lang/Object;", "", "showId", "Lcom/spotify/savetospotify/v1/HttpCreateEpisodeRequest;", "Lcom/spotify/savetospotify/v1/HttpCreateEpisodeResponse;", "f", "(Ljava/lang/String;Lcom/spotify/savetospotify/v1/HttpCreateEpisodeRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/savetospotify/v1/HttpGetShowResponse;", "g", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/savetospotify/v1/HttpUpdateShowRequest;", "b", "(Ljava/lang/String;Lcom/spotify/savetospotify/v1/HttpUpdateShowRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/savetospotify/v1/HttpUpdateShowPlaybackControlRequest;", "Lp/w2a1;", "e", "(Ljava/lang/String;Lcom/spotify/savetospotify/v1/HttpUpdateShowPlaybackControlRequest;Lp/fbk;)Ljava/lang/Object;", "episodeId", "Lcom/spotify/savetospotify/v1/HttpUpdateEpisodeRequest;", "c", "(Ljava/lang/String;Lcom/spotify/savetospotify/v1/HttpUpdateEpisodeRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/savetospotify/v1/HttpEpisodeReadinessResponse;", "h", "k", "l", "j", "Lcom/spotify/savetospotify/v1/HttpCreateLocalFilesShowRequest;", "d", "(Lcom/spotify/savetospotify/v1/HttpCreateLocalFilesShowRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_sts_mascotimpl-mascotimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface un51 {
    @zk00("/save-to-spotify/api/v1/shows")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m83513a(fbk<? super HttpListShowsResponse> fbkVar);

    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @l3m0("/save-to-spotify/api/v1/shows/{show_id}")
    /* JADX INFO: renamed from: b */
    Object m83514b(@ubn0("show_id") String str, @h4a HttpUpdateShowRequest httpUpdateShowRequest, fbk<Object> fbkVar);

    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @l3m0("/save-to-spotify/api/v1/episodes/{episode_id}")
    /* JADX INFO: renamed from: c */
    Object m83515c(@ubn0("episode_id") String str, @h4a HttpUpdateEpisodeRequest httpUpdateEpisodeRequest, fbk<Object> fbkVar);

    @j3m0("/save-to-spotify/api/v1/local-files/shows")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: d */
    Object m83516d(@h4a HttpCreateLocalFilesShowRequest httpCreateLocalFilesShowRequest, fbk<Object> fbkVar);

    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @l3m0("/save-to-spotify/api/v1/shows/{show_id}/playback-control")
    /* JADX INFO: renamed from: e */
    Object m83517e(@ubn0("show_id") String str, @h4a HttpUpdateShowPlaybackControlRequest httpUpdateShowPlaybackControlRequest, fbk<? super w2a1> fbkVar);

    @j3m0("/save-to-spotify/api/v1/shows/{show_id}/episodes")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: f */
    Object m83518f(@ubn0("show_id") String str, @h4a HttpCreateEpisodeRequest httpCreateEpisodeRequest, fbk<? super HttpCreateEpisodeResponse> fbkVar);

    @zk00("/save-to-spotify/api/v1/shows/{show_id}")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: g */
    Object m83519g(@ubn0("show_id") String str, fbk<? super HttpGetShowResponse> fbkVar);

    @zk00("/save-to-spotify/api/v1/episodes/{episode_id}/readiness")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: h */
    Object m83520h(@ubn0("episode_id") String str, fbk<? super HttpEpisodeReadinessResponse> fbkVar);

    @j3m0("/save-to-spotify/api/v1/shows")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: i */
    Object m83521i(@h4a HttpCreateShowRequest httpCreateShowRequest, fbk<Object> fbkVar);

    @zk00("/save-to-spotify/api/v1/local-files/shows")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: j */
    Object m83522j(fbk<? super HttpListShowsResponse> fbkVar);

    @pem("/save-to-spotify/api/v1/shows/{show_id}")
    /* JADX INFO: renamed from: k */
    Object m83523k(@ubn0("show_id") String str, fbk<? super w2a1> fbkVar);

    @pem("/save-to-spotify/api/v1/episodes/{episode_id}")
    /* JADX INFO: renamed from: l */
    Object m83524l(@ubn0("episode_id") String str, fbk<? super w2a1> fbkVar);

    @j3m0("/save-to-spotify/api/v1/images")
    @rn20({"Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: m */
    Object m83525m(@h4a euw0 euw0Var, fbk<Object> fbkVar);
}
