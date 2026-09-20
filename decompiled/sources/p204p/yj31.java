package p204p;

import com.spotify.socialrecs.p152v1.GetSessionRecsForUserRequest;
import com.spotify.socialrecs.p152v1.GetSessionRecsForUserResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m24212d2 = {"Lp/yj31;", "", "Lcom/spotify/socialrecs/v1/GetSessionRecsForUserRequest;", "getSessionRecsForUserRequest", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/socialrecs/v1/GetSessionRecsForUserResponse;", "a", "(Lcom/spotify/socialrecs/v1/GetSessionRecsForUserRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_socialrecommendation_endpoints-endpoints"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface yj31 {
    @j3m0("social-recs/spotify.socialrecs.v1.SocialRecsService/GetSessionRecsForUser")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Single<GetSessionRecsForUserResponse> m93842a(@h4a GetSessionRecsForUserRequest getSessionRecsForUserRequest);
}
