package p204p;

import kotlin.Metadata;
import spotify.transcript_search.p213v1.SearchRequest;
import spotify.transcript_search.p213v1.SearchResponse;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m24212d2 = {"Lp/lld1;", "", "Lspotify/transcript_search/v1/SearchRequest;", "data", "Lp/o2x0;", "Lspotify/transcript_search/v1/SearchResponse;", "a", "(Lspotify/transcript_search/v1/SearchRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_pagematch_endpoint-endpoint"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface lld1 {
    @j3m0("transcript-search-api/v1/search")
    @rn20({obr.f163698c, "Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Object m59306a(@h4a SearchRequest searchRequest, fbk<? super o2x0<SearchResponse>> fbkVar);
}
