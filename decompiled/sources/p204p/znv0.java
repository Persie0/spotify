package p204p;

import kotlin.Metadata;
import spotify.spotbot.p212v2.promptable_playlist.Refinement$AttachRefinementSessionRequest;
import spotify.spotbot.p212v2.promptable_playlist.Refinement$AttachRefinementSessionResponse;
import spotify.spotbot.p212v2.promptable_playlist.Refinement$DiscardRefinementSessionRequest;
import spotify.spotbot.p212v2.promptable_playlist.Refinement$SaveRefinementSessionRequest;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m24212d2 = {"Lp/znv0;", "", "Lspotify/spotbot/v2/promptable_playlist/Refinement$AttachRefinementSessionRequest;", "body", "Lp/o2x0;", "Lspotify/spotbot/v2/promptable_playlist/Refinement$AttachRefinementSessionResponse;", "b", "(Lspotify/spotbot/v2/promptable_playlist/Refinement$AttachRefinementSessionRequest;Lp/fbk;)Ljava/lang/Object;", "Lspotify/spotbot/v2/promptable_playlist/Refinement$DiscardRefinementSessionRequest;", "Ljava/lang/Void;", "c", "(Lspotify/spotbot/v2/promptable_playlist/Refinement$DiscardRefinementSessionRequest;Lp/fbk;)Ljava/lang/Object;", "Lspotify/spotbot/v2/promptable_playlist/Refinement$SaveRefinementSessionRequest;", "a", "(Lspotify/spotbot/v2/promptable_playlist/Refinement$SaveRefinementSessionRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_promptedplaylists_refinementimpl-refinementimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface znv0 {
    @j3m0("spotbot-api2/spotify.spotbot.v2.promptable_playlist.PromptablePlaylistApi/SaveRefinementSession")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: a */
    Object m96595a(@h4a Refinement$SaveRefinementSessionRequest refinement$SaveRefinementSessionRequest, fbk<? super o2x0<Void>> fbkVar);

    @j3m0("spotbot-api2/spotify.spotbot.v2.promptable_playlist.PromptablePlaylistApi/AttachRefinementSession")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: b */
    Object m96596b(@h4a Refinement$AttachRefinementSessionRequest refinement$AttachRefinementSessionRequest, fbk<? super o2x0<Refinement$AttachRefinementSessionResponse>> fbkVar);

    @j3m0("spotbot-api2/spotify.spotbot.v2.promptable_playlist.PromptablePlaylistApi/DiscardRefinementSession")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: c */
    Object m96597c(@h4a Refinement$DiscardRefinementSessionRequest refinement$DiscardRefinementSessionRequest, fbk<? super o2x0<Void>> fbkVar);
}
