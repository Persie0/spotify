package p204p;

import com.spotify.familygatedcontent.p063v1.GetFeatureRequestDialogRequest;
import com.spotify.familygatedcontent.p063v1.GetFeatureRequestDialogResponse;
import com.spotify.familygatedcontent.p063v1.RequestFeatureRequest;
import com.spotify.familygatedcontent.p063v1.RequestFeatureResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lp/nby;", "", "Lcom/spotify/familygatedcontent/v1/GetFeatureRequestDialogRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/familygatedcontent/v1/GetFeatureRequestDialogResponse;", "b", "(Lcom/spotify/familygatedcontent/v1/GetFeatureRequestDialogRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/familygatedcontent/v1/RequestFeatureRequest;", "Lcom/spotify/familygatedcontent/v1/RequestFeatureResponse;", "a", "(Lcom/spotify/familygatedcontent/v1/RequestFeatureRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_premiumaccountmanagement_familygatedcontentimpl-familygatedcontentimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface nby {
    @j3m0("spotify.familygatedcontent.v1.FeatureRequestService/RequestFeature")
    @rn20({obr.f163698c, "Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Single<RequestFeatureResponse> m64102a(@h4a RequestFeatureRequest request);

    @j3m0("spotify.familygatedcontent.v1.FeatureRequestViewService/GetFeatureRequestDialog")
    @rn20({obr.f163698c, "Accept: application/protobuf"})
    /* JADX INFO: renamed from: b */
    Single<GetFeatureRequestDialogResponse> m64103b(@h4a GetFeatureRequestDialogRequest request);
}
