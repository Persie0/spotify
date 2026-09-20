package p204p;

import com.spotify.musicquizservice.p113v1.GetOrCreateChallengeRequest;
import com.spotify.musicquizservice.p113v1.GetOrCreateChallengeResponse;
import com.spotify.musicquizservice.p113v1.GetShareCardForQuizRequest;
import com.spotify.musicquizservice.p113v1.GetShareCardForQuizResponse;
import com.spotify.musicquizservice.p113v1.ListChallengeTargetsRequest;
import com.spotify.musicquizservice.p113v1.ListChallengeTargetsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m24212d2 = {"Lp/rjc;", "", "Lcom/spotify/musicquizservice/v1/GetOrCreateChallengeRequest;", "request", "Lp/o2x0;", "Lcom/spotify/musicquizservice/v1/GetOrCreateChallengeResponse;", "b", "(Lcom/spotify/musicquizservice/v1/GetOrCreateChallengeRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/ListChallengeTargetsRequest;", "Lcom/spotify/musicquizservice/v1/ListChallengeTargetsResponse;", "c", "(Lcom/spotify/musicquizservice/v1/ListChallengeTargetsRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/GetShareCardForQuizRequest;", "Lcom/spotify/musicquizservice/v1/GetShareCardForQuizResponse;", "a", "(Lcom/spotify/musicquizservice/v1/GetShareCardForQuizRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_musicquiz_network_challenge-challenge"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface rjc {
    @j3m0("music-quiz-service/com.spotify.musicquizservice.v1.ChallengeService/GetShareCardForQuiz")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m75637a(@h4a GetShareCardForQuizRequest getShareCardForQuizRequest, fbk<? super o2x0<GetShareCardForQuizResponse>> fbkVar);

    @j3m0("music-quiz-service/com.spotify.musicquizservice.v1.ChallengeService/GetOrCreateChallenge")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m75638b(@h4a GetOrCreateChallengeRequest getOrCreateChallengeRequest, fbk<? super o2x0<GetOrCreateChallengeResponse>> fbkVar);

    @j3m0("music-quiz-service/com.spotify.musicquizservice.v1.ChallengeService/ListChallengeTargets")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m75639c(@h4a ListChallengeTargetsRequest listChallengeTargetsRequest, fbk<? super o2x0<ListChallengeTargetsResponse>> fbkVar);
}
