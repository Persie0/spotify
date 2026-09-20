package p204p;

import com.spotify.addonconsideration.p011v1.GetAddonConsiderationRequest;
import com.spotify.addonconsideration.p011v1.GetAddonConsiderationResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m24212d2 = {"Lp/ov1;", "", "Lcom/spotify/addonconsideration/v1/GetAddonConsiderationRequest;", "body", "Lcom/spotify/addonconsideration/v1/GetAddonConsiderationResponse;", "a", "(Lcom/spotify/addonconsideration/v1/GetAddonConsiderationRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_premiumaccountmanagement_endpoints-endpoints"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface ov1 {
    @j3m0("addon-consideration/spotify.addonconsideration.v1.AddonConsiderationService/GetAddonConsideration")
    @rn20({obr.f163698c, "Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Object m68109a(@h4a GetAddonConsiderationRequest getAddonConsiderationRequest, fbk<? super GetAddonConsiderationResponse> fbkVar);
}
