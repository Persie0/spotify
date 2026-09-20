package p204p;

import com.spotify.libraryimportservice.tmm.GetTransferResultsBannerResponse;
import com.spotify.libraryimportservice.tmm.StoreTransferResultsEngagementRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lp/q980;", "", "Lcom/spotify/libraryimportservice/tmm/GetTransferResultsBannerResponse;", "a", "(Lp/fbk;)Ljava/lang/Object;", "", "transferId", "Lcom/spotify/libraryimportservice/tmm/StoreTransferResultsEngagementRequest;", "request", "Lp/w2a1;", "b", "(Ljava/lang/String;Lcom/spotify/libraryimportservice/tmm/StoreTransferResultsEngagementRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_libraryimport_matchresult_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface q980 {
    @zk00("library-import/v1/transfer-results-banner")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m72356a(fbk<? super GetTransferResultsBannerResponse> fbkVar);

    @j3m0("library-import/v1/transfer-results-engagement/{transferId}")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m72357b(@ubn0("transferId") String str, @h4a StoreTransferResultsEngagementRequest storeTransferResultsEngagementRequest, fbk<? super w2a1> fbkVar);
}
