package p204p;

import com.spotify.lockstate.p104v1.proto.GetLockRequest;
import com.spotify.lockstate.p104v1.proto.GetLockResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lp/apa0;", "", "Lcom/spotify/lockstate/v1/proto/GetLockRequest;", "request", "Lcom/spotify/lockstate/v1/proto/GetLockResponse;", "a", "(Lcom/spotify/lockstate/v1/proto/GetLockRequest;Lp/fbk;)Ljava/lang/Object;", "", "path", "Lp/w2a1;", "b", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_lockstate_endpoints-endpoints"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface apa0 {
    @j3m0("/lock-state/get-locks")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m26670a(@h4a GetLockRequest getLockRequest, fbk<? super GetLockResponse> fbkVar);

    @j3m0("{path}")
    /* JADX INFO: renamed from: b */
    Object m26671b(@ubn0(encoded = true, value = "path") String str, fbk<? super w2a1> fbkVar);
}
