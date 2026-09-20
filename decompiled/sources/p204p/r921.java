package p204p;

import com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsRequest;
import com.spotify.p060dj.interactionmanager.p061v0.GenerateAndPlayRecsResponse;
import com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsRequest;
import com.spotify.p060dj.interactionmanager.p061v0.GetAckCommentaryAndPrepareRecsResponse;
import com.spotify.p060dj.interactionmanager.p061v0.GetSuggestedPromptsRequest;
import com.spotify.p060dj.interactionmanager.p061v0.GetSuggestedPromptsResponse;
import com.spotify.p060dj.interactionmanager.p061v0.Problem;
import com.spotify.p060dj.interactionmanager.p061v0.SubmitFeedbackRequest;
import com.spotify.p060dj.interactionmanager.p061v0.SubmitFeedbackResponse;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class r921 {

    /* JADX INFO: renamed from: a */
    public final i821 f196888a;

    public r921(i821 i821Var) {
        this.f196888a = i821Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m75006a(String str, String str2, String str3, String str4, String str5, String str6, ibk ibkVar) {
        n921 n921Var;
        if (ibkVar instanceof n921) {
            n921Var = (n921) ibkVar;
            int i = n921Var.f151688c;
            if ((i & Integer.MIN_VALUE) != 0) {
                n921Var.f151688c = i - Integer.MIN_VALUE;
            } else {
                n921Var = new n921(this, ibkVar);
            }
        } else {
            n921Var = new n921(this, ibkVar);
        }
        Object objM49935e = n921Var.f151686a;
        int i2 = n921Var.f151688c;
        if (i2 == 0) {
            bga.m29073P(objM49935e);
            GenerateAndPlayRecsRequest.Builder builderNewBuilder = GenerateAndPlayRecsRequest.newBuilder();
            builderNewBuilder.setPrompt(str);
            builderNewBuilder.setSessionId(str2);
            builderNewBuilder.setDeviceId(str3);
            if (str4 != null) {
                builderNewBuilder.setCurrentSegmentId(str4);
            }
            if (str5 != null) {
                builderNewBuilder.setCurrentTrackUri(str5);
            }
            builderNewBuilder.setAckCommentaryText(str6);
            GenerateAndPlayRecsRequest generateAndPlayRecsRequest = (GenerateAndPlayRecsRequest) builderNewBuilder.build();
            wj50.m88279p(generateAndPlayRecsRequest);
            n921Var.f151688c = 1;
            objM49935e = this.f196888a.m49935e(generateAndPlayRecsRequest, n921Var);
            yuk yukVar = yuk.f276404a;
            if (objM49935e == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM49935e);
        }
        GenerateAndPlayRecsResponse generateAndPlayRecsResponse = (GenerateAndPlayRecsResponse) objM49935e;
        System.out.println(generateAndPlayRecsResponse.getStatusCode());
        System.out.println((Object) generateAndPlayRecsResponse.getStatusMessage());
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m75007b(String str, String str2, String str3, String str4, ibk ibkVar) {
        o921 o921Var;
        if (ibkVar instanceof o921) {
            o921Var = (o921) ibkVar;
            int i = o921Var.f162921c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o921Var.f162921c = i - Integer.MIN_VALUE;
            } else {
                o921Var = new o921(this, ibkVar);
            }
        } else {
            o921Var = new o921(this, ibkVar);
        }
        Object objM49931a = o921Var.f162919a;
        int i2 = o921Var.f162921c;
        if (i2 == 0) {
            bga.m29073P(objM49931a);
            GetAckCommentaryAndPrepareRecsRequest.Builder builderNewBuilder = GetAckCommentaryAndPrepareRecsRequest.newBuilder();
            builderNewBuilder.setSessionId(str2);
            builderNewBuilder.setDeviceId(str3);
            builderNewBuilder.setCurrentSegmentId(str4);
            builderNewBuilder.setPrompt(str);
            GetAckCommentaryAndPrepareRecsRequest getAckCommentaryAndPrepareRecsRequest = (GetAckCommentaryAndPrepareRecsRequest) builderNewBuilder.build();
            wj50.m88279p(getAckCommentaryAndPrepareRecsRequest);
            o921Var.f162921c = 1;
            objM49931a = this.f196888a.m49931a(getAckCommentaryAndPrepareRecsRequest, o921Var);
            yuk yukVar = yuk.f276404a;
            if (objM49931a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM49931a);
        }
        GetAckCommentaryAndPrepareRecsResponse getAckCommentaryAndPrepareRecsResponse = (GetAckCommentaryAndPrepareRecsResponse) objM49931a;
        return new f921(getAckCommentaryAndPrepareRecsResponse.getAudioCdnUrl(), getAckCommentaryAndPrepareRecsResponse.getAckCommentaryText());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m75008c(String str, ibk ibkVar) {
        p921 p921Var;
        if (ibkVar instanceof p921) {
            p921Var = (p921) ibkVar;
            int i = p921Var.f175131c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p921Var.f175131c = i - Integer.MIN_VALUE;
            } else {
                p921Var = new p921(this, ibkVar);
            }
        } else {
            p921Var = new p921(this, ibkVar);
        }
        Object objM49933c = p921Var.f175129a;
        int i2 = p921Var.f175131c;
        if (i2 == 0) {
            bga.m29073P(objM49933c);
            GetSuggestedPromptsRequest.Builder builderNewBuilder = GetSuggestedPromptsRequest.newBuilder();
            builderNewBuilder.setUnused(true);
            if (str != null) {
                builderNewBuilder.setCurrentTrackUri(str);
            }
            GetSuggestedPromptsRequest getSuggestedPromptsRequest = (GetSuggestedPromptsRequest) builderNewBuilder.build();
            p921Var.f175131c = 1;
            objM49933c = this.f196888a.m49933c(getSuggestedPromptsRequest, p921Var);
            yuk yukVar = yuk.f276404a;
            if (objM49933c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM49933c);
        }
        return ((GetSuggestedPromptsResponse) objM49933c).getSuggestedPromptsList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m75009d(l921 l921Var, ibk ibkVar) {
        q921 q921Var;
        pqm0 pqm0VarM69840u;
        if (ibkVar instanceof q921) {
            q921Var = (q921) ibkVar;
            int i = q921Var.f186463c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q921Var.f186463c = i - Integer.MIN_VALUE;
            } else {
                q921Var = new q921(this, ibkVar);
            }
        } else {
            q921Var = new q921(this, ibkVar);
        }
        Object objM49932b = q921Var.f186461a;
        int i2 = q921Var.f186463c;
        if (i2 == 0) {
            bga.m29073P(objM49932b);
            if (wj50.m88271j(l921Var, k921.f120506a)) {
                pqm0VarM69840u = pft0.m69840u(Problem.PROBLEM_WRONG_MUSIC, null);
            } else if (wj50.m88271j(l921Var, i921.f99891a)) {
                pqm0VarM69840u = pft0.m69840u(Problem.PROBLEM_MISUNDERSTOOD_WORDS, null);
            } else if (wj50.m88271j(l921Var, g921.f77651a)) {
                pqm0VarM69840u = pft0.m69840u(Problem.PROBLEM_INACCURATE_STATEMENT, null);
            } else if (wj50.m88271j(l921Var, h921.f88862a)) {
                pqm0VarM69840u = pft0.m69840u(Problem.PROBLEM_MISPRONUNCIATION, null);
            } else {
                if (!(l921Var instanceof j921)) {
                    throw new NoWhenBranchMatchedException();
                }
                pqm0VarM69840u = pft0.m69840u(Problem.PROBLEM_OTHER_OR_GENERIC, ((j921) l921Var).m52723a());
            }
            Problem problem = (Problem) pqm0VarM69840u.f180350a;
            String str = (String) pqm0VarM69840u.f180351b;
            SubmitFeedbackRequest.Builder builderNewBuilder = SubmitFeedbackRequest.newBuilder();
            builderNewBuilder.setProblem(problem);
            if (str != null) {
                builderNewBuilder.setProblemDetail(str);
            }
            SubmitFeedbackRequest submitFeedbackRequest = (SubmitFeedbackRequest) builderNewBuilder.build();
            q921Var.f186463c = 1;
            objM49932b = this.f196888a.m49932b(submitFeedbackRequest, q921Var);
            yuk yukVar = yuk.f276404a;
            if (objM49932b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM49932b);
        }
        return ((SubmitFeedbackResponse) objM49932b).getMessageAcknowledgement();
    }
}
