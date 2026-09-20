package p204p;

import com.spotify.kidsrequest.p089v1.CreateRequestRequest;
import com.spotify.kidsrequest.p089v1.GetPendingRequestsResponse;
import com.spotify.kidsrequest.p089v1.GetRequestStatusRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u0006H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m24212d2 = {"Lp/z670;", "", "Lcom/spotify/kidsrequest/v1/CreateRequestRequest;", "request", "a", "(Lcom/spotify/kidsrequest/v1/CreateRequestRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/kidsrequest/v1/GetRequestStatusRequest;", "b", "(Lcom/spotify/kidsrequest/v1/GetRequestStatusRequest;Lp/fbk;)Ljava/lang/Object;", "", "childId", "Lcom/spotify/kidsrequest/v1/GetPendingRequestsResponse;", "c", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_genalphablocking_datasourceimpl-datasourceimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface z670 {
    @j3m0("kids-request/v1/request")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m95471a(@h4a CreateRequestRequest createRequestRequest, fbk<Object> fbkVar);

    @j3m0("kids-request/v1/request-status")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m95472b(@h4a GetRequestStatusRequest getRequestStatusRequest, fbk<Object> fbkVar);

    @zk00("kids-request/v1/children/{child_id}/pending-requests")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m95473c(@ubn0("child_id") String str, fbk<? super GetPendingRequestsResponse> fbkVar);
}
