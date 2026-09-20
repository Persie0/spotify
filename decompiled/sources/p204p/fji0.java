package p204p;

import com.spotify.quizaccessservice.p138v1.CheckUserQuizStateRequest;
import com.spotify.quizaccessservice.p138v1.CheckUserQuizStateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m24212d2 = {"Lp/fji0;", "", "Lcom/spotify/quizaccessservice/v1/CheckUserQuizStateRequest;", "request", "Lp/o2x0;", "Lcom/spotify/quizaccessservice/v1/CheckUserQuizStateResponse;", "a", "(Lcom/spotify/quizaccessservice/v1/CheckUserQuizStateRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_musicquiz_network_access-access"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface fji0 {
    @j3m0("music-quiz-service/com.spotify.musicquizservice.v1.MusicQuizAccessService/CheckUserQuizState")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m41849a(@h4a CheckUserQuizStateRequest checkUserQuizStateRequest, fbk<? super o2x0<CheckUserQuizStateResponse>> fbkVar);
}
