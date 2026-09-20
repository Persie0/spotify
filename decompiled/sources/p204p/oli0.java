package p204p;

import com.spotify.musicquizservice.p113v1.CompleteQuizRequest;
import com.spotify.musicquizservice.p113v1.CompleteQuizResponse;
import com.spotify.musicquizservice.p113v1.GetQuizMetadataRequest;
import com.spotify.musicquizservice.p113v1.GetQuizMetadataResponse;
import com.spotify.musicquizservice.p113v1.GetRoundRequest;
import com.spotify.musicquizservice.p113v1.GetRoundResponse;
import com.spotify.musicquizservice.p113v1.RateQuestionRequest;
import com.spotify.musicquizservice.p113v1.RateQuestionResponse;
import com.spotify.musicquizservice.p113v1.ReportAnswersRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m24212d2 = {"Lp/oli0;", "", "Lcom/spotify/musicquizservice/v1/ReportAnswersRequest;", "request", "Lp/o2x0;", "b", "(Lcom/spotify/musicquizservice/v1/ReportAnswersRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/GetQuizMetadataRequest;", "Lcom/spotify/musicquizservice/v1/GetQuizMetadataResponse;", "a", "(Lcom/spotify/musicquizservice/v1/GetQuizMetadataRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/GetRoundRequest;", "Lcom/spotify/musicquizservice/v1/GetRoundResponse;", "d", "(Lcom/spotify/musicquizservice/v1/GetRoundRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/RateQuestionRequest;", "Lcom/spotify/musicquizservice/v1/RateQuestionResponse;", "e", "(Lcom/spotify/musicquizservice/v1/RateQuestionRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/CompleteQuizRequest;", "Lcom/spotify/musicquizservice/v1/CompleteQuizResponse;", "c", "(Lcom/spotify/musicquizservice/v1/CompleteQuizRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_musicquiz_network_quiz-quiz"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface oli0 {
    @j3m0("music-quiz-service/com.spotify.musicquizservice.v1.MusicQuizService/GetQuizMetadata")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m67293a(@h4a GetQuizMetadataRequest getQuizMetadataRequest, fbk<? super o2x0<GetQuizMetadataResponse>> fbkVar);

    @j3m0("music-quiz-service/com.spotify.musicquizservice.v1.MusicQuizService/ReportAnswers")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m67294b(@h4a ReportAnswersRequest reportAnswersRequest, fbk<? super o2x0<Object>> fbkVar);

    @j3m0("music-quiz-service/com.spotify.musicquizservice.v1.MusicQuizService/CompleteQuiz")
    @rn20({obr.f163698c, "Accept: application/x-protobuf", "Content-Encoding: identity"})
    /* JADX INFO: renamed from: c */
    Object m67295c(@h4a CompleteQuizRequest completeQuizRequest, fbk<? super o2x0<CompleteQuizResponse>> fbkVar);

    @j3m0("music-quiz-service/com.spotify.musicquizservice.v1.MusicQuizService/GetRound")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: d */
    Object m67296d(@h4a GetRoundRequest getRoundRequest, fbk<? super o2x0<GetRoundResponse>> fbkVar);

    @j3m0("music-quiz-service/com.spotify.musicquizservice.v1.MusicQuizService/RateQuestion")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: e */
    Object m67297e(@h4a RateQuestionRequest rateQuestionRequest, fbk<? super o2x0<RateQuestionResponse>> fbkVar);
}
