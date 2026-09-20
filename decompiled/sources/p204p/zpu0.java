package p204p;

import com.spotify.corex.readalongtranscript.proto.ReadAlongTranscript;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J9\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\u000bJ4\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H§@¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m24212d2 = {"Lp/zpu0;", "", "", "episodeId", "", "excludeCompanionContent", "excludeChapters", "Lio/reactivex/rxjava3/core/Single;", "Lp/o2x0;", "Lcom/spotify/corex/readalongtranscript/proto/ReadAlongTranscript;", "b", "(Ljava/lang/String;ZZ)Lio/reactivex/rxjava3/core/Single;", "a", "(Ljava/lang/String;ZZLp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_transcript_endpointsimpl-endpointsimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface zpu0 {
    @zk00("transcript-read-along/v2/episode/{episodeID}")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Object m96695a(@ubn0("episodeID") String str, @hit0("excludeCC") boolean z, @hit0("excludeChapters") boolean z2, fbk<? super o2x0<ReadAlongTranscript>> fbkVar);

    @zk00("transcript-read-along/v2/episode/{episodeID}")
    @gtq
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: b */
    Single<o2x0<ReadAlongTranscript>> m96696b(@ubn0("episodeID") String episodeId, @hit0("excludeCC") boolean excludeCompanionContent, @hit0("excludeChapters") boolean excludeChapters);
}
