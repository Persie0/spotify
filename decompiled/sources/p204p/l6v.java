package p204p;

import com.spotify.corex.readalong.p053v1.proto.TranscriptExcerpt;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001JC\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H'¢\u0006\u0004\b\f\u0010\rJ9\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m24212d2 = {"Lp/l6v;", "", "", "episodeId", "", "startMs", "", "min", "max", "Lio/reactivex/rxjava3/core/Single;", "Lp/o2x0;", "Lcom/spotify/corex/readalong/v1/proto/TranscriptExcerpt;", "a", "(Ljava/lang/String;JII)Lio/reactivex/rxjava3/core/Single;", "endMs", "b", "(Ljava/lang/String;JJ)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_transcript_excerptsimpl-excerptsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface l6v {
    @zk00("transcript-read-along/excerpt/v2/episode/{episodeID}")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Single<o2x0<TranscriptExcerpt>> m58386a(@ubn0("episodeID") String episodeId, @hit0("startMs") long startMs, @hit0("minimumCharacters") int min, @hit0("maximumCharacters") int max);

    @zk00("transcript-read-along/excerpt/v2/episode/{episodeID}")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: b */
    Single<o2x0<TranscriptExcerpt>> m58387b(@ubn0("episodeID") String episodeId, @hit0("startMs") long startMs, @hit0("endMs") long endMs);
}
