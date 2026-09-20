package p204p;

import kotlin.Metadata;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$CreatePromptablePlaylistRequest;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$CreatePromptablePlaylistResponse;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$EditPromptablePlaylistRequest;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$EditPromptablePlaylistResponse;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$GetPromptHelperCarouselRequest;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$GetPromptablePlaylistRequest;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$RefreshPromptablePlaylistRequest;
import spotify.spotbot.p212v2.promptable_playlist.Promptableplaylist$SuggestionResponse;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m24212d2 = {"Lp/sws0;", "", "Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$CreatePromptablePlaylistRequest;", "body", "Lp/o2x0;", "Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$CreatePromptablePlaylistResponse;", "d", "(Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$CreatePromptablePlaylistRequest;Lp/fbk;)Ljava/lang/Object;", "Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$EditPromptablePlaylistRequest;", "Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$EditPromptablePlaylistResponse;", "c", "(Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$EditPromptablePlaylistRequest;Lp/fbk;)Ljava/lang/Object;", "Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$RefreshPromptablePlaylistRequest;", "Ljava/lang/Void;", "a", "(Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$RefreshPromptablePlaylistRequest;Lp/fbk;)Ljava/lang/Object;", "Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$GetPromptablePlaylistRequest;", "Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$SuggestionResponse;", "e", "(Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$GetPromptablePlaylistRequest;Lp/fbk;)Ljava/lang/Object;", "Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$GetPromptHelperCarouselRequest;", "b", "(Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$GetPromptHelperCarouselRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_promptedplaylists_dataimpl-dataimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface sws0 {
    @j3m0("spotbot-api2/spotify.spotbot.v2.promptable_playlist.PromptablePlaylistApi/RefreshPromptablePlaylist")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: a */
    Object m79558a(@h4a Promptableplaylist$RefreshPromptablePlaylistRequest promptableplaylist$RefreshPromptablePlaylistRequest, fbk<? super o2x0<Void>> fbkVar);

    @j3m0("spotbot-api2/spotify.spotbot.v2.promptable_playlist.PromptablePlaylistApi/GetPromptHelperCarousel")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: b */
    Object m79559b(@h4a Promptableplaylist$GetPromptHelperCarouselRequest promptableplaylist$GetPromptHelperCarouselRequest, fbk<? super o2x0<Object>> fbkVar);

    @j3m0("spotbot-api2/spotify.spotbot.v2.promptable_playlist.PromptablePlaylistApi/EditPromptablePlaylist")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: c */
    Object m79560c(@h4a Promptableplaylist$EditPromptablePlaylistRequest promptableplaylist$EditPromptablePlaylistRequest, fbk<? super o2x0<Promptableplaylist$EditPromptablePlaylistResponse>> fbkVar);

    @j3m0("spotbot-api2/spotify.spotbot.v2.promptable_playlist.PromptablePlaylistApi/CreatePromptablePlaylist")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: d */
    Object m79561d(@h4a Promptableplaylist$CreatePromptablePlaylistRequest promptableplaylist$CreatePromptablePlaylistRequest, fbk<? super o2x0<Promptableplaylist$CreatePromptablePlaylistResponse>> fbkVar);

    @j3m0("spotbot-api2/spotify.spotbot.v2.promptable_playlist.PromptablePlaylistApi/GetPromptablePlaylistSuggestions")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: e */
    Object m79562e(@h4a Promptableplaylist$GetPromptablePlaylistRequest promptableplaylist$GetPromptablePlaylistRequest, fbk<? super o2x0<Promptableplaylist$SuggestionResponse>> fbkVar);
}
