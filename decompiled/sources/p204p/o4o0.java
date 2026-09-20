package p204p;

import com.spotify.watchfeedentrypoints.api.p188v1.GetPivotsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m24212d2 = {"Lp/o4o0;", "", "", "id", "categoryUri", "Lcom/spotify/watchfeedentrypoints/api/v1/GetPivotsResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_watchfeed_pivotspage-pivotspage"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface o4o0 {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Object m66249a(o4o0 o4o0Var, String str, String str2, fbk fbkVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContent");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return o4o0Var.m66250b(str, str2, fbkVar);
    }

    @zk00("watch-feed-entrypoints/v1/pivots/{id}")
    @rn20({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    /* JADX INFO: renamed from: b */
    Object m66250b(@ubn0("id") String str, @hit0("categoryUri") String str2, fbk<? super GetPivotsResponse> fbkVar);
}
