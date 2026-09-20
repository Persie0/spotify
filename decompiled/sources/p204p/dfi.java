package p204p;

import com.spotify.concertpageview.p048v1.GetConcertPageRequest;
import com.spotify.concertpageview.p048v1.GetConcertPageResponse;
import com.spotify.concertpageview.p048v1.GetTicketingTimelineRequest;
import com.spotify.concertpageview.p048v1.GetTicketingTimelineResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lp/dfi;", "", "Lcom/spotify/concertpageview/v1/GetConcertPageRequest;", "request", "Lp/o2x0;", "Lcom/spotify/concertpageview/v1/GetConcertPageResponse;", "b", "(Lcom/spotify/concertpageview/v1/GetConcertPageRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/concertpageview/v1/GetTicketingTimelineRequest;", "Lcom/spotify/concertpageview/v1/GetTicketingTimelineResponse;", "a", "(Lcom/spotify/concertpageview/v1/GetTicketingTimelineRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_liveevents_datasource-datasource"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface dfi {
    @j3m0("concert-page-view/spotify.concertview.concertpageview.v1.ConcertPageViewService/GetTicketingTimeline")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m35895a(@h4a GetTicketingTimelineRequest getTicketingTimelineRequest, fbk<? super o2x0<GetTicketingTimelineResponse>> fbkVar);

    @j3m0("concert-page-view/spotify.concertview.concertpageview.v1.ConcertPageViewService/GetConcertPage")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m35896b(@h4a GetConcertPageRequest getConcertPageRequest, fbk<? super o2x0<GetConcertPageResponse>> fbkVar);
}
