package p204p;

import com.spotify.corex.reading.proto.ReadSpan;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m24212d2 = {"Lp/bc7;", "", "", "audiobookId", "Lp/o2x0;", "Lp/w2a1;", "c", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "", "resumeAtMs", "Lcom/spotify/corex/reading/proto/ReadSpan;", "b", "(Ljava/lang/String;Ljava/lang/Long;Lp/fbk;)Ljava/lang/Object;", "chapterId", "a", "(Ljava/lang/String;Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_ereader_endpointimpl-endpointimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface bc7 {
    @zk00("transcript-read-along/read/{audiobookId}/{chapterId}")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Object m28686a(@ubn0("audiobookId") String str, @ubn0("chapterId") String str2, fbk<? super o2x0<ReadSpan>> fbkVar);

    @zk00("transcript-read-along/read/{audiobookId}/")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: b */
    Object m28687b(@ubn0("audiobookId") String str, @hit0("resumeAt") Long l, fbk<? super o2x0<ReadSpan>> fbkVar);

    @db20("transcript-read-along/read/{audiobookId}")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: c */
    Object m28688c(@ubn0("audiobookId") String str, fbk<? super o2x0<w2a1>> fbkVar);
}
