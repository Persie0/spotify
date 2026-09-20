package p204p;

import com.spotify.user_prompts.p174v1.CreatePromptRequest;
import com.spotify.user_prompts.p174v1.CreatePromptResponse;
import com.spotify.user_prompts.p174v1.GetStatusRequest;
import com.spotify.user_prompts.p174v1.GetStatusResponse;
import com.spotify.watchfeedentrypoints.api.p188v1.CreateSessionRequest;
import com.spotify.watchfeedentrypoints.api.p188v1.CreateSessionResponse;
import com.spotify.watchfeedentrypoints.api.p188v1.GetMessageRequest;
import com.spotify.watchfeedentrypoints.api.p188v1.GetMessageResponse;
import com.spotify.watchfeedentrypoints.api.p188v1.SubmitMessageRequest;
import com.spotify.watchfeedentrypoints.api.p188v1.SubmitMessageResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0012\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m24212d2 = {"Lp/xu2;", "", "Lcom/spotify/watchfeedentrypoints/api/v1/CreateSessionRequest;", "createSessionRequest", "Lcom/spotify/watchfeedentrypoints/api/v1/CreateSessionResponse;", "d", "(Lcom/spotify/watchfeedentrypoints/api/v1/CreateSessionRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/watchfeedentrypoints/api/v1/SubmitMessageRequest;", "submitMessageRequest", "Lcom/spotify/watchfeedentrypoints/api/v1/SubmitMessageResponse;", "c", "(Lcom/spotify/watchfeedentrypoints/api/v1/SubmitMessageRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/watchfeedentrypoints/api/v1/GetMessageRequest;", "getMessageRequest", "Lcom/spotify/watchfeedentrypoints/api/v1/GetMessageResponse;", "b", "(Lcom/spotify/watchfeedentrypoints/api/v1/GetMessageRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/user_prompts/v1/CreatePromptRequest;", "request", "Lcom/spotify/user_prompts/v1/CreatePromptResponse;", "a", "(Lcom/spotify/user_prompts/v1/CreatePromptRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/user_prompts/v1/GetStatusRequest;", "Lcom/spotify/user_prompts/v1/GetStatusResponse;", "e", "(Lcom/spotify/user_prompts/v1/GetStatusRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_watchfeed_pivotspage-pivotspage"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface xu2 {
    @j3m0("/user-prompts/spotify.user_prompts.v1.UserPromptsService/CreatePrompt")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: a */
    Object m92112a(@h4a CreatePromptRequest createPromptRequest, fbk<? super CreatePromptResponse> fbkVar);

    @j3m0("playlist-ai-creation/spotify.playlist.ai.creation.v2.PlaylistAiCreationServiceV2/GetMessage")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: b */
    Object m92113b(@h4a GetMessageRequest getMessageRequest, fbk<? super GetMessageResponse> fbkVar);

    @j3m0("playlist-ai-creation/spotify.playlist.ai.creation.v2.PlaylistAiCreationServiceV2/SubmitMessage")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: c */
    Object m92114c(@h4a SubmitMessageRequest submitMessageRequest, fbk<? super SubmitMessageResponse> fbkVar);

    @j3m0("playlist-ai-creation/spotify.playlist.ai.creation.v2.PlaylistAiCreationServiceV2/CreateSession")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: d */
    Object m92115d(@h4a CreateSessionRequest createSessionRequest, fbk<? super CreateSessionResponse> fbkVar);

    @j3m0("/user-prompts/spotify.user_prompts.v1.UserPromptsService/GetStatus")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: e */
    Object m92116e(@h4a GetStatusRequest getStatusRequest, fbk<? super GetStatusResponse> fbkVar);
}
