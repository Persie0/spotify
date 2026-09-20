package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m24212d2 = {"Lp/p42;", "", "", "uri", "Lio/reactivex/rxjava3/core/Single;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_affinity_endpointimpl-endpointimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface p42 {
    @zk00("npv-scroll-order/v1/affinity/{uri}")
    @rn20({obr.f163698c, "Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Single<Object> m69096a(@ubn0("uri") String uri);
}
