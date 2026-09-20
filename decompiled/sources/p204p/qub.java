package p204p;

import com.spotify.reinventfree.cappingmetadataimpl.proto.Empty;
import com.spotify.reinventfree.cappingmetadataimpl.proto.GetHardCapEducationResponse;
import com.spotify.reinventfree.cappingmetadataimpl.proto.RecordHardCapImpressionRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0006H§@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m24212d2 = {"Lp/qub;", "", "Lcom/spotify/reinventfree/cappingmetadataimpl/proto/RecordHardCapImpressionRequest;", "request", "b", "(Lcom/spotify/reinventfree/cappingmetadataimpl/proto/RecordHardCapImpressionRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/reinventfree/cappingmetadataimpl/proto/Empty;", "Lcom/spotify/reinventfree/cappingmetadataimpl/proto/GetHardCapEducationResponse;", "a", "(Lcom/spotify/reinventfree/cappingmetadataimpl/proto/Empty;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_reinventfree_cappingmetadataimpl-cappingmetadataimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface qub {
    @j3m0("capping-api/spotify.cappingapi.v1.CappingMetadata/GetHardCapEducation")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m73889a(@h4a Empty empty, fbk<? super GetHardCapEducationResponse> fbkVar);

    @j3m0("capping-api/spotify.cappingapi.v1.CappingMetadata/RecordHardCapImpression")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m73890b(@h4a RecordHardCapImpressionRequest recordHardCapImpressionRequest, fbk<Object> fbkVar);
}
