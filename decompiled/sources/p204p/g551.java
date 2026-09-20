package p204p;

import com.spotify.stickers.p160v1.GetManyStickersRequest;
import com.spotify.stickers.p160v1.GetStickerResponse;
import com.spotify.stickers.p160v1.GetSurfaceResponse;
import com.spotify.stickers.p160v1.SearchSurfaceStickersResponse;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u0007J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0007JN\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0003\u0010\u0013\u001a\u00020\u00122\b\b\u0003\u0010\u0014\u001a\u00020\u00022\u000e\b\u0003\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H§@¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m24212d2 = {"Lp/g551;", "", "", "surface", "Lp/o2x0;", "Lcom/spotify/stickers/v1/GetSurfaceResponse;", "b", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "stickerId", "Lcom/spotify/stickers/v1/GetStickerResponse;", "e", "Lcom/spotify/stickers/v1/GetManyStickersRequest;", "request", "a", "(Lcom/spotify/stickers/v1/GetManyStickersRequest;Lp/fbk;)Ljava/lang/Object;", "packId", "c", "query", "", "pageSize", "pageToken", "", "filterTagIds", "Lcom/spotify/stickers/v1/SearchSurfaceStickersResponse;", "f", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_stickers_datasourceimpl-datasourceimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface g551 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    static /* synthetic */ Object m43589d(g551 g551Var, String str, String str2, int i, String str3, List list, fbk fbkVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: searchSurfaceStickers");
        }
        if ((i2 & 4) != 0) {
            i = 20;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = "";
        }
        String str4 = str3;
        if ((i2 & 16) != 0) {
            list = lau.f131415a;
        }
        return g551Var.m43594f(str, str2, i3, str4, list, fbkVar);
    }

    @j3m0("stickers/v1/stickers:batchGet")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Object m43590a(@h4a GetManyStickersRequest getManyStickersRequest, fbk<? super o2x0<Object>> fbkVar);

    @zk00("stickers/v1/surfaces/{surface}")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: b */
    Object m43591b(@ubn0("surface") String str, fbk<? super o2x0<GetSurfaceResponse>> fbkVar);

    @zk00("stickers/v1/sticker-packs/{packId}")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: c */
    Object m43592c(@ubn0("packId") String str, fbk<? super o2x0<Object>> fbkVar);

    @zk00("stickers/v1/stickers/{stickerId}")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: e */
    Object m43593e(@ubn0("stickerId") String str, fbk<? super o2x0<GetStickerResponse>> fbkVar);

    @zk00("stickers/v1/surfaces/{surface}/stickers:search")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: f */
    Object m43594f(@ubn0("surface") String str, @hit0("query") String str2, @hit0("page_size") int i, @hit0("page_token") String str3, @hit0("filter_tag_ids") List<String> list, fbk<? super o2x0<SearchSurfaceStickersResponse>> fbkVar);
}
