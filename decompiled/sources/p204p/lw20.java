package p204p;

import com.spotify.highlightsstats.data.proto.p076v2.HighlightsListRequest;
import com.spotify.highlightsstats.data.proto.p076v2.HighlightsListResponse;
import com.spotify.highlightsstats.data.proto.p076v2.SummaryRequest;
import com.spotify.highlightsstats.data.proto.p076v2.SummaryResponse;
import com.spotify.highlightsstats.data.proto.sharing.p074v1.ShareHighlightRequest;
import com.spotify.highlightsstats.data.proto.sharing.p074v1.ShareResponse;
import com.spotify.highlightsstats.data.proto.sharing.p074v1.ShareStatsRequest;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.StatsDetailsRequest;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.StatsDetailsResponse;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.UserTimelineRequest;
import com.spotify.highlightsstats.data.proto.timeline.view.p075v1.UserTimelineResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H'¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH'¢\u0006\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, m24212d2 = {"Lp/lw20;", "", "Lcom/spotify/highlightsstats/data/proto/timeline/view/v1/UserTimelineRequest;", "request", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/highlightsstats/data/proto/timeline/view/v1/UserTimelineResponse;", "a", "(Lcom/spotify/highlightsstats/data/proto/timeline/view/v1/UserTimelineRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/highlightsstats/data/proto/v2/SummaryRequest;", "Lcom/spotify/highlightsstats/data/proto/v2/SummaryResponse;", "e", "(Lcom/spotify/highlightsstats/data/proto/v2/SummaryRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/highlightsstats/data/proto/timeline/view/v1/StatsDetailsRequest;", "Lcom/spotify/highlightsstats/data/proto/timeline/view/v1/StatsDetailsResponse;", "c", "(Lcom/spotify/highlightsstats/data/proto/timeline/view/v1/StatsDetailsRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/highlightsstats/data/proto/v2/HighlightsListRequest;", "Lcom/spotify/highlightsstats/data/proto/v2/HighlightsListResponse;", "g", "(Lcom/spotify/highlightsstats/data/proto/v2/HighlightsListRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/highlightsstats/data/proto/v2/StatsDetailsRequest;", "Lcom/spotify/highlightsstats/data/proto/v2/StatsDetailsResponse;", "f", "(Lcom/spotify/highlightsstats/data/proto/v2/StatsDetailsRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/highlightsstats/data/proto/sharing/v1/ShareHighlightRequest;", "Lcom/spotify/highlightsstats/data/proto/sharing/v1/ShareResponse;", "b", "(Lcom/spotify/highlightsstats/data/proto/sharing/v1/ShareHighlightRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/highlightsstats/data/proto/sharing/v1/ShareStatsRequest;", "d", "(Lcom/spotify/highlightsstats/data/proto/sharing/v1/ShareStatsRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_highlightsstats_data-data"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface lw20 {
    @j3m0("/spotify.highlightsandstatsview.v1.HighlightsAndStatsViewService/UserTimeline")
    @rn20({"content-type: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Single<UserTimelineResponse> m60091a(@h4a UserTimelineRequest request);

    @j3m0("/highlights-and-stats-sharing/v2/share_highlight")
    @rn20({"content-type: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Single<ShareResponse> m60092b(@h4a ShareHighlightRequest request);

    @j3m0("/spotify.highlightsandstatsview.v1.HighlightsAndStatsViewService/StatsDetails")
    @rn20({"content-type: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Single<StatsDetailsResponse> m60093c(@h4a StatsDetailsRequest request);

    @j3m0("/highlights-and-stats-sharing/v2/share_stats")
    @rn20({"content-type: application/x-protobuf"})
    /* JADX INFO: renamed from: d */
    Single<ShareResponse> m60094d(@h4a ShareStatsRequest request);

    @j3m0("/spotify.highlightsandstatsview.v2.HighlightsAndStatsViewService/Summary")
    @rn20({"content-type: application/x-protobuf"})
    /* JADX INFO: renamed from: e */
    Object m60095e(@h4a SummaryRequest summaryRequest, fbk<? super SummaryResponse> fbkVar);

    @j3m0("/spotify.highlightsandstatsview.v2.HighlightsAndStatsViewService/StatsDetails")
    @rn20({"content-type: application/x-protobuf"})
    /* JADX INFO: renamed from: f */
    Single<com.spotify.highlightsstats.data.proto.p076v2.StatsDetailsResponse> m60096f(@h4a com.spotify.highlightsstats.data.proto.p076v2.StatsDetailsRequest request);

    @j3m0("/spotify.highlightsandstatsview.v2.HighlightsAndStatsViewService/HighlightsList")
    @rn20({"content-type: application/x-protobuf"})
    /* JADX INFO: renamed from: g */
    Object m60097g(@h4a HighlightsListRequest highlightsListRequest, fbk<? super HighlightsListResponse> fbkVar);
}
