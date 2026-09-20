package p204p;

import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m24212d2 = {"Lp/bkp0;", "", "", "playlistId", "", "maxGenres", "maxArtists", "maxTracks", ContextTrack.Metadata.KEY_TITLE, "Lio/reactivex/rxjava3/core/Single;", "Lp/w410;", "a", "(Ljava/lang/String;IIILjava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_assistedcuration_content-content"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface bkp0 {
    @zk00("playlistextender/v2/top-genre-tracks")
    /* JADX INFO: renamed from: a */
    Single<w410> m29719a(@hit0("playlist_id") String playlistId, @hit0("max_genres") int maxGenres, @hit0("max_artists") int maxArtists, @hit0("max_tracks") int maxTracks, @hit0(ContextTrack.Metadata.KEY_TITLE) String title);
}
