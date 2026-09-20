package p204p;

import com.spotify.playlistmixing.proto.HarmonizeRequestBody;
import com.spotify.playlistmixing.proto.HarmonizeResponseBody;
import com.spotify.playlistmixing.proto.HarmonizeSaveRequestBody;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m24212d2 = {"Lp/j2g0;", "", "Lcom/spotify/playlistmixing/proto/HarmonizeRequestBody;", "request", "Lp/o2x0;", "Lcom/spotify/playlistmixing/proto/HarmonizeResponseBody;", "a", "(Lcom/spotify/playlistmixing/proto/HarmonizeRequestBody;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/playlistmixing/proto/HarmonizeSaveRequestBody;", "b", "(Lcom/spotify/playlistmixing/proto/HarmonizeSaveRequestBody;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_playlistmixing_endpoints-endpoints"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface j2g0 {
    @j3m0("list-harmonizer/v1/harmonize")
    @rn20({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Object m52218a(@h4a HarmonizeRequestBody harmonizeRequestBody, fbk<? super o2x0<HarmonizeResponseBody>> fbkVar);

    @j3m0("list-harmonizer/v1/harmonize/save")
    @rn20({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    /* JADX INFO: renamed from: b */
    Object m52219b(@h4a HarmonizeSaveRequestBody harmonizeSaveRequestBody, fbk<? super o2x0<HarmonizeResponseBody>> fbkVar);
}
