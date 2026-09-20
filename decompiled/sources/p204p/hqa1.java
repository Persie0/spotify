package p204p;

import com.spotify.usergeopoints.p176v1.ConsentWriteResponse;
import com.spotify.usergeopoints.p176v1.GetConsentResponse;
import com.spotify.usergeopoints.p176v1.GrantConsentRequest;
import com.spotify.usergeopoints.p176v1.RevokeConsentRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m24212d2 = {"Lp/hqa1;", "", "Lcom/spotify/usergeopoints/v1/GetConsentResponse;", "c", "(Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/usergeopoints/v1/GrantConsentRequest;", "request", "Lcom/spotify/usergeopoints/v1/ConsentWriteResponse;", "a", "(Lcom/spotify/usergeopoints/v1/GrantConsentRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/usergeopoints/v1/RevokeConsentRequest;", "b", "(Lcom/spotify/usergeopoints/v1/RevokeConsentRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_devicelocation_consent-consent"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface hqa1 {
    @j3m0("user-geo-points/v1/location/consent/grant")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m48202a(@h4a GrantConsentRequest grantConsentRequest, fbk<? super ConsentWriteResponse> fbkVar);

    @j3m0("user-geo-points/v1/location/consent/revoke")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m48203b(@h4a RevokeConsentRequest revokeConsentRequest, fbk<? super ConsentWriteResponse> fbkVar);

    @zk00("user-geo-points/v1/location/consent")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m48204c(fbk<? super GetConsentResponse> fbkVar);
}
