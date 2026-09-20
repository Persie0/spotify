package p204p;

import com.spotify.venueview.p179v1.GetConcertsAtVenueNextPageRequest;
import com.spotify.venueview.p179v1.GetConcertsAtVenueNextPageResponse;
import com.spotify.venueview.p179v1.GetVenuePageRequest;
import com.spotify.venueview.p179v1.GetVenuePageResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m24212d2 = {"Lp/m9b1;", "", "Lcom/spotify/venueview/v1/GetVenuePageRequest;", "request", "Lcom/spotify/venueview/v1/GetVenuePageResponse;", "b", "(Lcom/spotify/venueview/v1/GetVenuePageRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/venueview/v1/GetConcertsAtVenueNextPageRequest;", "Lcom/spotify/venueview/v1/GetConcertsAtVenueNextPageResponse;", "a", "(Lcom/spotify/venueview/v1/GetConcertsAtVenueNextPageRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_liveevents_datasource-datasource"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface m9b1 {
    @j3m0("venue-view/spotify.concertview.venueview.v1.VenueViewService/GetConcertsAtVenueNextPage")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m61200a(@h4a GetConcertsAtVenueNextPageRequest getConcertsAtVenueNextPageRequest, fbk<? super GetConcertsAtVenueNextPageResponse> fbkVar);

    @j3m0("venue-view/spotify.concertview.venueview.v1.VenueViewService/GetVenuePage")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m61201b(@h4a GetVenuePageRequest getVenuePageRequest, fbk<? super GetVenuePageResponse> fbkVar);
}
