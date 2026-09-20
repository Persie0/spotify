package p204p;

import com.spotify.concertview.concertfeedview.p050v1.GetConceptsRequest;
import com.spotify.concertview.concertfeedview.p050v1.GetConceptsResponse;
import com.spotify.concertview.concertfeedview.p050v1.GetFeedNextPageRequest;
import com.spotify.concertview.concertfeedview.p050v1.GetFeedNextPageResponse;
import com.spotify.concertview.concertfeedview.p050v1.GetFeedRequest;
import com.spotify.concertview.concertfeedview.p050v1.GetFeedResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m24212d2 = {"Lp/oai;", "", "Lcom/spotify/concertview/concertfeedview/v1/GetConceptsRequest;", "request", "Lcom/spotify/concertview/concertfeedview/v1/GetConceptsResponse;", "b", "(Lcom/spotify/concertview/concertfeedview/v1/GetConceptsRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/concertview/concertfeedview/v1/GetFeedRequest;", "Lcom/spotify/concertview/concertfeedview/v1/GetFeedResponse;", "a", "(Lcom/spotify/concertview/concertfeedview/v1/GetFeedRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/concertview/concertfeedview/v1/GetFeedNextPageRequest;", "Lcom/spotify/concertview/concertfeedview/v1/GetFeedNextPageResponse;", "c", "(Lcom/spotify/concertview/concertfeedview/v1/GetFeedNextPageRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_liveevents_datasource-datasource"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface oai {
    @j3m0("concert-feed-view/spotify.concertview.concertfeedview.v1.ConcertFeedViewService/GetFeed")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m66568a(@h4a GetFeedRequest getFeedRequest, fbk<? super GetFeedResponse> fbkVar);

    @j3m0("concert-feed-view/spotify.concertview.concertfeedview.v1.ConcertFeedViewService/GetConcepts")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m66569b(@h4a GetConceptsRequest getConceptsRequest, fbk<? super GetConceptsResponse> fbkVar);

    @j3m0("concert-feed-view/spotify.concertview.concertfeedview.v1.ConcertFeedViewService/GetFeedNextPage")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m66570c(@h4a GetFeedNextPageRequest getFeedNextPageRequest, fbk<? super GetFeedNextPageResponse> fbkVar);
}
