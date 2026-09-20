package p204p;

import com.spotify.personalizedepisodes.contentservice.p124v1.GetUserLocationResponse;
import com.spotify.personalizedepisodes.contentservice.p124v1.SuggestLocationsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m24212d2 = {"Lp/hma0;", "", "Lp/o2x0;", "Lcom/spotify/personalizedepisodes/contentservice/v1/GetUserLocationResponse;", "a", "(Lp/fbk;)Ljava/lang/Object;", "", "query", "Lcom/spotify/personalizedepisodes/contentservice/v1/SuggestLocationsResponse;", "b", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_bluejay_data_impl-location_data_module"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface hma0 {
    @zk00("personalized-episodes/v1/content/location")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m47938a(fbk<? super o2x0<GetUserLocationResponse>> fbkVar);

    @zk00("personalized-episodes/v1/content/location/suggest")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m47939b(@hit0("query") String str, fbk<? super o2x0<SuggestLocationsResponse>> fbkVar);
}
