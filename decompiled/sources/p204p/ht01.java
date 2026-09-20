package p204p;

import com.spotify.campfire.sharelist.impl.proto.ShareListRequest;
import com.spotify.campfire.sharelist.impl.proto.SharelistResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, m24212d2 = {"Lp/ht01;", "", "Lcom/spotify/campfire/sharelist/impl/proto/ShareListRequest;", "shareListRequest", "Lcom/spotify/campfire/sharelist/impl/proto/SharelistResponse;", "c", "(Lcom/spotify/campfire/sharelist/impl/proto/ShareListRequest;Lp/fbk;)Ljava/lang/Object;", "b", "a", "src_main_java_com_spotify_campfire_sharelist_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface ht01 {
    @j3m0("speechless/v1/retrieve/addToGroupSuggestions")
    /* JADX INFO: renamed from: a */
    Object m48567a(@h4a ShareListRequest shareListRequest, fbk<? super SharelistResponse> fbkVar);

    @j3m0("speechless/v1/retrieve/createGroupSuggestions")
    /* JADX INFO: renamed from: b */
    Object m48568b(@h4a ShareListRequest shareListRequest, fbk<? super SharelistResponse> fbkVar);

    @j3m0("speechless/v1/retrieve/sharelist")
    /* JADX INFO: renamed from: c */
    Object m48569c(@h4a ShareListRequest shareListRequest, fbk<? super SharelistResponse> fbkVar);
}
