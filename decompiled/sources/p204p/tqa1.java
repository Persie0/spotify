package p204p;

import com.spotify.userhighlight.p177v1.CreateUserHighlightRequest;
import com.spotify.userhighlight.p177v1.CreateUserHighlightResponse;
import com.spotify.userhighlight.p177v1.UpdateUserHighlightRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\u00012\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m24212d2 = {"Lp/tqa1;", "", "Lcom/spotify/userhighlight/v1/CreateUserHighlightRequest;", "request", "Lcom/spotify/userhighlight/v1/CreateUserHighlightResponse;", "a", "(Lcom/spotify/userhighlight/v1/CreateUserHighlightRequest;Lp/fbk;)Ljava/lang/Object;", "", "uri", "c", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/userhighlight/v1/UpdateUserHighlightRequest;", "Lp/w2a1;", "b", "(Ljava/lang/String;Lcom/spotify/userhighlight/v1/UpdateUserHighlightRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_entitysegments_userhighlightdataimpl-userhighlightdataimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface tqa1 {
    @j3m0("user-highlight/v1/user-highlights")
    @rn20({"content-type: application/x-protobuf", "accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m81310a(@h4a CreateUserHighlightRequest createUserHighlightRequest, fbk<? super CreateUserHighlightResponse> fbkVar);

    @n2m0("user-highlight/v1/user-highlights/{uri}")
    @rn20({"content-type: application/x-protobuf", "accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m81311b(@ubn0(encoded = true, value = "uri") String str, @h4a UpdateUserHighlightRequest updateUserHighlightRequest, fbk<? super w2a1> fbkVar);

    @zk00("user-highlight/v1/user-highlights/{uri}")
    @rn20({"content-type: application/x-protobuf", "accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m81312c(@ubn0(encoded = true, value = "uri") String str, fbk<Object> fbkVar);
}
