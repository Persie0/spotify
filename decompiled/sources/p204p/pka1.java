package p204p;

import com.spotify.share.linkgeneration.api.proto.GenerateUrlRequest;
import com.spotify.share.linkgeneration.api.proto.GenerateUrlResponse;
import com.spotify.share.linkgeneration.api.proto.UnshortenUrlRequest;
import com.spotify.share.linkgeneration.api.proto.UnshortenUrlResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00052\u00020\u0001:\u0001\u000bJ\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lp/pka1;", "", "Lcom/spotify/share/linkgeneration/api/proto/GenerateUrlRequest;", "requestBody", "Lcom/spotify/share/linkgeneration/api/proto/GenerateUrlResponse;", "a", "(Lcom/spotify/share/linkgeneration/api/proto/GenerateUrlRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/share/linkgeneration/api/proto/UnshortenUrlRequest;", "Lcom/spotify/share/linkgeneration/api/proto/UnshortenUrlResponse;", "b", "(Lcom/spotify/share/linkgeneration/api/proto/UnshortenUrlRequest;Lp/fbk;)Ljava/lang/Object;", "p/oka1", "src_main_java_com_spotify_share_linkgeneration_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface pka1 {

    /* JADX INFO: renamed from: a */
    public static final oka1 f178420a = oka1.f166313a;

    /* JADX INFO: renamed from: b */
    public static final String f178421b = "https";

    @j3m0("url-dispenser/v1/generate-url")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Object m70183a(@h4a GenerateUrlRequest generateUrlRequest, fbk<? super GenerateUrlResponse> fbkVar);

    @j3m0("url-dispenser/v1/unshorten-url")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: b */
    Object m70184b(@h4a UnshortenUrlRequest unshortenUrlRequest, fbk<? super UnshortenUrlResponse> fbkVar);
}
