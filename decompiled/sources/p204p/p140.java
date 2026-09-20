package p204p;

import com.spotify.identity.proto.p081v3.Identity$KidProfileUpdateRequest;
import com.spotify.identity.proto.p081v3.Identity$SocialHandleRequest;
import com.spotify.identity.proto.p081v3.Identity$SocialHandleResponse;
import com.spotify.identity.proto.p081v3.Identity$UserProfile;
import com.spotify.identity.proto.p081v3.Identity$UserProfileUpdateRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0018\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u001aH'¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u001aH'¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000bH'¢\u0006\u0004\b\u001f\u0010 ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, m24212d2 = {"Lp/p140;", "", "", "username", "Lio/reactivex/rxjava3/core/Single;", "Lp/o2x0;", "Lcom/spotify/identity/proto/v3/Identity$UserProfile;", "h", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/identity/proto/v3/Identity$UserProfileUpdateRequest;", "body", "Lio/reactivex/rxjava3/core/Completable;", "i", "(Ljava/lang/String;Lcom/spotify/identity/proto/v3/Identity$UserProfileUpdateRequest;)Lio/reactivex/rxjava3/core/Completable;", "uploadToken", "d", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "e", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "Lcom/spotify/identity/proto/v3/Identity$KidProfileUpdateRequest;", "c", "(Ljava/lang/String;Lcom/spotify/identity/proto/v3/Identity$KidProfileUpdateRequest;)Lio/reactivex/rxjava3/core/Completable;", "accountId", "socialHandle", "b", "(Ljava/lang/String;Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/identity/proto/v3/Identity$SocialHandleRequest;", "Lcom/spotify/identity/proto/v3/Identity$SocialHandleResponse;", "g", "(Ljava/lang/String;Lcom/spotify/identity/proto/v3/Identity$SocialHandleRequest;)Lio/reactivex/rxjava3/core/Single;", "a", "f", "()Lio/reactivex/rxjava3/core/Completable;", "src_main_java_com_spotify_profile_identity-identity"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface p140 {
    @j3m0("identity/v3/social-handle/{username}")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Single<o2x0<Identity$SocialHandleResponse>> mo68765a(@ubn0(encoded = true, value = "username") String username, @h4a Identity$SocialHandleRequest body);

    @zk00("identity/v3/user/accountid/{accountId}/username/{socialHandle}")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object mo68766b(@ubn0(encoded = true, value = "accountId") String str, @ubn0(encoded = true, value = "socialHandle") String str2, fbk<? super Identity$UserProfile> fbkVar);

    @j3m0("identity/v3/kid/username/{username}")
    /* JADX INFO: renamed from: c */
    Completable mo68767c(@ubn0(encoded = true, value = "username") String username, @h4a Identity$KidProfileUpdateRequest body);

    @j3m0("identity/v2/profile-image/{username}/{uploadToken}")
    /* JADX INFO: renamed from: d */
    Completable mo68768d(@ubn0(encoded = true, value = "username") String username, @ubn0("uploadToken") String uploadToken);

    @pem("identity/v2/profile-image/{username}")
    /* JADX INFO: renamed from: e */
    Completable mo68769e(@ubn0(encoded = true, value = "username") String username);

    @j3m0("identity/v3/social-handle/reset-rate-limit")
    /* JADX INFO: renamed from: f */
    Completable mo68770f();

    @j3m0("identity/v3/social-handle/validate/{username}")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: g */
    Single<o2x0<Identity$SocialHandleResponse>> mo68771g(@ubn0(encoded = true, value = "username") String username, @h4a Identity$SocialHandleRequest body);

    @zk00("identity/v3/user/username/{username}")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: h */
    Single<o2x0<Identity$UserProfile>> mo68772h(@ubn0(encoded = true, value = "username") String username);

    @j3m0("identity/v3/user/username/{username}")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: i */
    Completable mo68773i(@ubn0(encoded = true, value = "username") String username, @h4a Identity$UserProfileUpdateRequest body);
}
