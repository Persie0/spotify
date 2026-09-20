package p204p;

import com.spotify.upsells.p173v1.proto.BatchShouldUpsellRequest;
import com.spotify.upsells.p173v1.proto.BatchShouldUpsellResponse;
import com.spotify.upsells.p173v1.proto.GetUpsellRequest;
import com.spotify.upsells.p173v1.proto.GetUpsellResponse;
import com.spotify.upsells.p173v1.proto.ShouldUpsellRequest;
import com.spotify.upsells.p173v1.proto.ShouldUpsellResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m24212d2 = {"Lp/ebk;", "", "Lcom/spotify/upsells/v1/proto/ShouldUpsellRequest;", "request", "Lcom/spotify/upsells/v1/proto/ShouldUpsellResponse;", "b", "(Lcom/spotify/upsells/v1/proto/ShouldUpsellRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/upsells/v1/proto/BatchShouldUpsellRequest;", "Lcom/spotify/upsells/v1/proto/BatchShouldUpsellResponse;", "c", "(Lcom/spotify/upsells/v1/proto/BatchShouldUpsellRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/upsells/v1/proto/GetUpsellRequest;", "Lcom/spotify/upsells/v1/proto/GetUpsellResponse;", "a", "(Lcom/spotify/upsells/v1/proto/GetUpsellRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_upsells_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface ebk {
    @j3m0("upsell/v1/contextual-upsell")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: a */
    Object m38392a(@h4a GetUpsellRequest getUpsellRequest, fbk<? super GetUpsellResponse> fbkVar);

    @j3m0("upsell/v1/should-upsell")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: b */
    Object m38393b(@h4a ShouldUpsellRequest shouldUpsellRequest, fbk<? super ShouldUpsellResponse> fbkVar);

    @j3m0("upsell/v1/batch-should-upsell")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: c */
    Object m38394c(@h4a BatchShouldUpsellRequest batchShouldUpsellRequest, fbk<? super BatchShouldUpsellResponse> fbkVar);
}
