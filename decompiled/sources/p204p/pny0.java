package p204p;

import com.spotify.scrollsita.p146v1.NpvScrollResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001Jg\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m24212d2 = {"Lp/pny0;", "", "", "nowPlayingUri", "contextUri", "", "isEnhancedContext", "isPersonalisedContext", "isTablet", "isDJContext", "isVideoLayerActive", "timezone", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/scrollsita/v1/NpvScrollResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;ZZZZZLjava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_nowplaying_scrollsection_nova-nova"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface pny0 {
    @zk00("scrollsita/v1/scroll/{now_playing_uri}")
    @rn20({obr.f163698c, "Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Single<NpvScrollResponse> m70452a(@ubn0("now_playing_uri") String nowPlayingUri, @hit0("play_context_uri") String contextUri, @hit0("is_enhanced_context") boolean isEnhancedContext, @hit0("is_personalized_context") boolean isPersonalisedContext, @hit0("is_tablet") boolean isTablet, @hit0("is_ai_dj_context") boolean isDJContext, @hit0("is_video_layer_active") boolean isVideoLayerActive, @hit0("timezone") String timezone);
}
