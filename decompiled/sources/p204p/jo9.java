package p204p;

import com.spotify.socialprompting.p151v1.GeneratePromptedPlaylistRequest;
import com.spotify.socialprompting.p151v1.GeneratePromptedPlaylistResponse;
import com.spotify.socialprompting.p151v1.GetFilterPillsRequest;
import com.spotify.socialprompting.p151v1.GetFilterPillsResponse;
import com.spotify.socialprompting.p151v1.GetSuggestedPromptsRequest;
import com.spotify.socialprompting.p151v1.GetSuggestedPromptsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m24212d2 = {"Lp/jo9;", "", "Lcom/spotify/socialprompting/v1/GeneratePromptedPlaylistRequest;", "request", "Lcom/spotify/socialprompting/v1/GeneratePromptedPlaylistResponse;", "b", "(Lcom/spotify/socialprompting/v1/GeneratePromptedPlaylistRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/socialprompting/v1/GetFilterPillsRequest;", "Lcom/spotify/socialprompting/v1/GetFilterPillsResponse;", "c", "(Lcom/spotify/socialprompting/v1/GetFilterPillsRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/socialprompting/v1/GetSuggestedPromptsRequest;", "Lcom/spotify/socialprompting/v1/GetSuggestedPromptsResponse;", "a", "(Lcom/spotify/socialprompting/v1/GetSuggestedPromptsRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_blend_socialprompting_network-network"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface jo9 {
    @j3m0("social-prompting/suggested-prompts")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m53867a(@h4a GetSuggestedPromptsRequest getSuggestedPromptsRequest, fbk<? super GetSuggestedPromptsResponse> fbkVar);

    @j3m0("social-prompting/generate")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m53868b(@h4a GeneratePromptedPlaylistRequest generatePromptedPlaylistRequest, fbk<? super GeneratePromptedPlaylistResponse> fbkVar);

    @j3m0("social-prompting/filter-pills")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m53869c(@h4a GetFilterPillsRequest getFilterPillsRequest, fbk<? super GetFilterPillsResponse> fbkVar);
}
