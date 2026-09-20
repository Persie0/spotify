package p204p;

import com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequest;
import com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsResponse;
import com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsRequest;
import com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponse;
import com.spotify.p060dj.interactionmanager.p061v0.GetSuggestedPromptsRequest;
import com.spotify.p060dj.interactionmanager.p061v0.GetSuggestedPromptsResponse;
import com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextRequest;
import com.spotify.p060dj.interactionmanager.p061v0.ResolveInteractiveContextResponse;
import com.spotify.p060dj.interactionmanager.p061v0.SubmitFeedbackRequest;
import com.spotify.p060dj.interactionmanager.p061v0.SubmitFeedbackResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m24212d2 = {"Lp/i821;", "", "Lcom/spotify/dj/interactionmanager/v0/ResolveInteractiveContextRequest;", "request", "Lcom/spotify/dj/interactionmanager/v0/ResolveInteractiveContextResponse;", "d", "(Lcom/spotify/dj/interactionmanager/v0/ResolveInteractiveContextRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/dj/interactionmanager/v0/GetAckCommentaryAndPrepareRecsRequest;", "Lcom/spotify/dj/interactionmanager/v0/GetAckCommentaryAndPrepareRecsResponse;", "a", "(Lcom/spotify/dj/interactionmanager/v0/GetAckCommentaryAndPrepareRecsRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/dj/interactionmanager/v0/GenerateAndPlayRecsRequest;", "Lcom/spotify/dj/interactionmanager/v0/GenerateAndPlayRecsResponse;", "e", "(Lcom/spotify/dj/interactionmanager/v0/GenerateAndPlayRecsRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/dj/interactionmanager/v0/GetSuggestedPromptsRequest;", "Lcom/spotify/dj/interactionmanager/v0/GetSuggestedPromptsResponse;", "c", "(Lcom/spotify/dj/interactionmanager/v0/GetSuggestedPromptsRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/dj/interactionmanager/v0/SubmitFeedbackRequest;", "Lcom/spotify/dj/interactionmanager/v0/SubmitFeedbackResponse;", "b", "(Lcom/spotify/dj/interactionmanager/v0/SubmitFeedbackRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_endless_sillywalk_network-network"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface i821 {
    @j3m0("dj-interaction-manager/spotify.dj.interactionmanager.v0.DJInteractionManagerService/GetAckCommentaryAndPrepareRecs")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m49931a(@h4a GetAckCommentaryAndPrepareRecsRequest getAckCommentaryAndPrepareRecsRequest, fbk<? super GetAckCommentaryAndPrepareRecsResponse> fbkVar);

    @j3m0("dj-interaction-manager/spotify.dj.interactionmanager.v0.DJInteractionManagerService/SubmitFeedback")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m49932b(@h4a SubmitFeedbackRequest submitFeedbackRequest, fbk<? super SubmitFeedbackResponse> fbkVar);

    @j3m0("dj-interaction-manager/spotify.dj.interactionmanager.v0.DJInteractionManagerService/GetSuggestedPrompts")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m49933c(@h4a GetSuggestedPromptsRequest getSuggestedPromptsRequest, fbk<? super GetSuggestedPromptsResponse> fbkVar);

    @j3m0("dj-interaction-manager/spotify.dj.interactionmanager.v0.DJInteractionManagerService/ResolveInteractiveContext")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: d */
    Object m49934d(@h4a ResolveInteractiveContextRequest resolveInteractiveContextRequest, fbk<? super ResolveInteractiveContextResponse> fbkVar);

    @j3m0("dj-interaction-manager/spotify.dj.interactionmanager.v0.DJInteractionManagerService/GenerateAndPlayRecs")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: e */
    Object m49935e(@h4a GenerateAndPlayRecsRequest generateAndPlayRecsRequest, fbk<? super GenerateAndPlayRecsResponse> fbkVar);
}
