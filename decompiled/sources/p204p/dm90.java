package p204p;

import com.spotify.liveeventslocation.p099v1.locationsuggest.LocationSuggestRequest;
import com.spotify.liveeventslocation.p099v1.locationsuggest.LocationSuggestResponse;
import com.spotify.liveeventslocation.p099v1.userlocation.DeleteUserLocationRequest;
import com.spotify.liveeventslocation.p099v1.userlocation.GetUserLocationRequest;
import com.spotify.liveeventslocation.p099v1.userlocation.GetUserLocationResponse;
import com.spotify.liveeventslocation.p099v1.userlocation.StoreUserLocationRequest;
import com.spotify.liveeventslocation.p099v1.userlocation.StoreUserLocationResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m24212d2 = {"Lp/dm90;", "", "Lcom/spotify/liveeventslocation/v1/locationsuggest/LocationSuggestRequest;", "request", "Lcom/spotify/liveeventslocation/v1/locationsuggest/LocationSuggestResponse;", "d", "(Lcom/spotify/liveeventslocation/v1/locationsuggest/LocationSuggestRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/liveeventslocation/v1/userlocation/GetUserLocationRequest;", "Lcom/spotify/liveeventslocation/v1/userlocation/GetUserLocationResponse;", "a", "(Lcom/spotify/liveeventslocation/v1/userlocation/GetUserLocationRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/liveeventslocation/v1/userlocation/StoreUserLocationRequest;", "Lcom/spotify/liveeventslocation/v1/userlocation/StoreUserLocationResponse;", "b", "(Lcom/spotify/liveeventslocation/v1/userlocation/StoreUserLocationRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/liveeventslocation/v1/userlocation/DeleteUserLocationRequest;", "Lp/o2x0;", "Ljava/lang/Void;", "c", "(Lcom/spotify/liveeventslocation/v1/userlocation/DeleteUserLocationRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_liveevents_datasource-datasource"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface dm90 {
    @j3m0("live-events-location/spotify.liveeventslocation.v1.UserLocationService/GetUserLocation")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m36398a(@h4a GetUserLocationRequest getUserLocationRequest, fbk<? super GetUserLocationResponse> fbkVar);

    @j3m0("live-events-location/spotify.liveeventslocation.v1.UserLocationService/StoreUserLocation")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m36399b(@h4a StoreUserLocationRequest storeUserLocationRequest, fbk<? super StoreUserLocationResponse> fbkVar);

    @j3m0("live-events-location/spotify.liveeventslocation.v1.UserLocationService/DeleteUserLocation")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m36400c(@h4a DeleteUserLocationRequest deleteUserLocationRequest, fbk<? super o2x0<Void>> fbkVar);

    @j3m0("live-events-location/spotify.liveeventslocation.v1.LocationSuggestService/Suggest")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: d */
    Object m36401d(@h4a LocationSuggestRequest locationSuggestRequest, fbk<? super LocationSuggestResponse> fbkVar);
}
