package p204p;

import com.spotify.wrapped.p194v1.proto.ReportGenerationRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m24212d2 = {"Lp/li5;", "", "Lcom/spotify/wrapped/v1/proto/ReportGenerationRequest;", "body", "a", "(Lcom/spotify/wrapped/v1/proto/ReportGenerationRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_campaigns_wrapped_endpoint-endpoint"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface li5 {
    @j3m0("campaigns-service/v1/campaigns/wrapped/consumer/archive/report")
    @rn20({"Accept: application/protobuf", "Content-Type: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Object m59026a(@h4a ReportGenerationRequest reportGenerationRequest, fbk<Object> fbkVar);
}
