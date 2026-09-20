package p204p;

import com.spotify.lyrics.serviceretrofit.proto.p105v3.LyricsWrapperResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J=\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m24212d2 = {"Lp/mqb0;", "", "", "trackId", "", "vocalRemoval", "clientLanguage", "isPreview", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/lyrics/serviceretrofit/proto/v3/LyricsWrapperResponse;", "b", "(Ljava/lang/String;ZLjava/lang/String;Z)Lio/reactivex/rxjava3/core/Single;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_lyrics_serviceretrofit-serviceretrofit"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface mqb0 {
    @zk00("color-lyrics/v3/download/track/{trackId}")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Single<LyricsWrapperResponse> m62534a(@ubn0("trackId") String trackId, @hit0("clientLanguage") String clientLanguage);

    @zk00("color-lyrics/v3/track/{trackId}")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: b */
    Single<LyricsWrapperResponse> m62535b(@ubn0("trackId") String trackId, @hit0("vocalRemoval") boolean vocalRemoval, @hit0("clientLanguage") String clientLanguage, @hit0("preview") boolean isPreview);
}
