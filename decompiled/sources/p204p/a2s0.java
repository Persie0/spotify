package p204p;

import com.spotify.profileprivacy.proto.p132v1.GetProfilePrivacyRequest;
import com.spotify.profileprivacy.proto.p132v1.GetProfilePrivacyResponse;
import com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyRequest;
import com.spotify.profileprivacy.proto.p132v1.SetProfilePrivacyResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lp/a2s0;", "", "Lcom/spotify/profileprivacy/proto/v1/GetProfilePrivacyRequest;", "body", "Lp/o2x0;", "Lcom/spotify/profileprivacy/proto/v1/GetProfilePrivacyResponse;", "b", "(Lcom/spotify/profileprivacy/proto/v1/GetProfilePrivacyRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/profileprivacy/proto/v1/SetProfilePrivacyRequest;", "Lcom/spotify/profileprivacy/proto/v1/SetProfilePrivacyResponse;", "a", "(Lcom/spotify/profileprivacy/proto/v1/SetProfilePrivacyRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_profile_privacy-privacy"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface a2s0 {
    @j3m0("/profile-privacy/v2/store-settings")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m24525a(@h4a SetProfilePrivacyRequest setProfilePrivacyRequest, fbk<? super o2x0<SetProfilePrivacyResponse>> fbkVar);

    @j3m0("/profile-privacy/v2/read-settings")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m24526b(@h4a GetProfilePrivacyRequest getProfilePrivacyRequest, fbk<? super o2x0<GetProfilePrivacyResponse>> fbkVar);
}
