package p204p;

import com.spotify.profileconfig.proto.p131v1.DismissProfileCompletionRequest;
import com.spotify.profileconfig.proto.p131v1.ProfileCompletionRequest;
import com.spotify.profileconfig.proto.p131v1.ProfileCompletionResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m24212d2 = {"Lp/sqr0;", "", "Lcom/spotify/profileconfig/proto/v1/ProfileCompletionRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lp/o2x0;", "Lcom/spotify/profileconfig/proto/v1/ProfileCompletionResponse;", "b", "(Lcom/spotify/profileconfig/proto/v1/ProfileCompletionRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/profileconfig/proto/v1/DismissProfileCompletionRequest;", "Ljava/lang/Void;", "a", "(Lcom/spotify/profileconfig/proto/v1/DismissProfileCompletionRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_profile_completionsheetimpl-completionsheetimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface sqr0 {
    @j3m0("profile-config/v1/dismiss-profile-completion")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Single<o2x0<Void>> m78959a(@h4a DismissProfileCompletionRequest request);

    @j3m0("profile-config/v1/show-profile-completion")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Single<o2x0<ProfileCompletionResponse>> m78960b(@h4a ProfileCompletionRequest request);
}
