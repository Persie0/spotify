package p204p;

import com.spotify.mostplayed.p112v1.Chart;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J3\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m24212d2 = {"Lp/z0i0;", "", "", "decoration", "exclusionRefs", "", "limit", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/mostplayed/v1/Chart;", "a", "(Ljava/lang/String;Ljava/lang/String;I)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_assistedcuration_content-content"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface z0i0 {
    @zk00("most-played/v1/chart")
    @rn20({"content-type: application/protobuf", "accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Single<Chart> m95063a(@hit0("decoration") String decoration, @hit0("exclusion-refs") String exclusionRefs, @hit0("limit") int limit);
}
