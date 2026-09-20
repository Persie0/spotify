package p204p;

import com.spotify.profile.editprofile.proto.UserprofileviewV4$GetBioAudienceRequest;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$GetBioAudienceResponse;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$GetBioRequest;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$SetBioAudienceRequest;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$SetBioAudienceResponse;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$UpdateBioRequest;
import com.spotify.profile.editprofile.proto.UserprofileviewV4$UpdateBioResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m24212d2 = {"Lp/yf9;", "", "Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$GetBioRequest;", "request", "Lp/o2x0;", "a", "(Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$GetBioRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$GetBioAudienceRequest;", "Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$GetBioAudienceResponse;", "b", "(Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$GetBioAudienceRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$SetBioAudienceRequest;", "Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$SetBioAudienceResponse;", "c", "(Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$SetBioAudienceRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$UpdateBioRequest;", "Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$UpdateBioResponse;", "d", "(Lcom/spotify/profile/editprofile/proto/UserprofileviewV4$UpdateBioRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_profile_editprofile_editprofile_biodatasource-biodatasource"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface yf9 {
    @j3m0("user-profile-view/spotify.userprofileview.v4.UserProfileViewService/GetBio")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m93546a(@h4a UserprofileviewV4$GetBioRequest userprofileviewV4$GetBioRequest, fbk<? super o2x0<Object>> fbkVar);

    @j3m0("user-profile-view/spotify.userprofileview.v4.UserProfileViewService/GetBioAudience")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m93547b(@h4a UserprofileviewV4$GetBioAudienceRequest userprofileviewV4$GetBioAudienceRequest, fbk<? super o2x0<UserprofileviewV4$GetBioAudienceResponse>> fbkVar);

    @j3m0("user-profile-view/spotify.userprofileview.v4.UserProfileViewService/SetBioAudience")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m93548c(@h4a UserprofileviewV4$SetBioAudienceRequest userprofileviewV4$SetBioAudienceRequest, fbk<? super o2x0<UserprofileviewV4$SetBioAudienceResponse>> fbkVar);

    @j3m0("user-profile-view/spotify.userprofileview.v4.UserProfileViewService/UpdateBio")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: d */
    Object m93549d(@h4a UserprofileviewV4$UpdateBioRequest userprofileviewV4$UpdateBioRequest, fbk<? super o2x0<UserprofileviewV4$UpdateBioResponse>> fbkVar);
}
