package p204p;

import com.spotify.recommendedsearches.p142v1.RecommendedSearches;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m24212d2 = {"Lp/igv0;", "", "", "", "params", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/recommendedsearches/v1/RecommendedSearches;", "a", "(Ljava/util/Map;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_search_recommendedsearches_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface igv0 {
    @zk00("recommended-searches/v1/recommendations")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Single<RecommendedSearches> m50568a(@pit0 Map<String, String> params);
}
