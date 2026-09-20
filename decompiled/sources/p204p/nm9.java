package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m24212d2 = {"Lp/nm9;", "", "Lp/qm9;", "blendMutateTrackListRequest", "Lio/reactivex/rxjava3/core/Single;", "Lp/o2x0;", "", "a", "(Lp/qm9;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_blend_endpoints-endpoints"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface nm9 {
    @j3m0("blend-writer/v1/mutate-track-list")
    @rn20({"Accept: application/json", "Content-Type: application/json"})
    /* JADX INFO: renamed from: a */
    Single<o2x0<Boolean>> m64809a(@h4a qm9 blendMutateTrackListRequest);
}
