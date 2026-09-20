package p204p;

import com.spotify.sharecard.config.impl.proto.SetCardConfigRequest;
import com.spotify.sharecard.config.impl.proto.SetCardConfigResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m24212d2 = {"Lp/qk01;", "", "Lcom/spotify/sharecard/config/impl/proto/SetCardConfigRequest;", "request", "Lcom/spotify/sharecard/config/impl/proto/SetCardConfigResponse;", "a", "(Lcom/spotify/sharecard/config/impl/proto/SetCardConfigRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_sharecard_config_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface qk01 {
    @j3m0("/share-preview-service/cardconfig/v1")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: a */
    Object m73040a(@h4a SetCardConfigRequest setCardConfigRequest, fbk<? super SetCardConfigResponse> fbkVar);
}
