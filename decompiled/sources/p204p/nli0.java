package p204p;

import com.spotify.musicquizservice.p113v1.GetLocalizedStringsRequest;
import com.spotify.musicquizservice.p113v1.GetLocalizedStringsResponse;
import com.spotify.musicquizservice.p113v1.GetOnboardingCarouselRequest;
import com.spotify.musicquizservice.p113v1.GetOnboardingCarouselResponse;
import com.spotify.musicquizservice.p113v1.GetQuizColorsRequest;
import com.spotify.musicquizservice.p113v1.GetQuizColorsResponse;
import com.spotify.musicquizservice.p113v1.GetSoundEffectsRequest;
import com.spotify.musicquizservice.p113v1.GetSoundEffectsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m24211d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, m24212d2 = {"Lp/nli0;", "", "Lcom/spotify/musicquizservice/v1/GetSoundEffectsRequest;", "request", "Lp/o2x0;", "Lcom/spotify/musicquizservice/v1/GetSoundEffectsResponse;", "d", "(Lcom/spotify/musicquizservice/v1/GetSoundEffectsRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/GetQuizColorsRequest;", "Lcom/spotify/musicquizservice/v1/GetQuizColorsResponse;", "c", "(Lcom/spotify/musicquizservice/v1/GetQuizColorsRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/GetOnboardingCarouselRequest;", "Lcom/spotify/musicquizservice/v1/GetOnboardingCarouselResponse;", "a", "(Lcom/spotify/musicquizservice/v1/GetOnboardingCarouselRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/musicquizservice/v1/GetLocalizedStringsRequest;", "Lcom/spotify/musicquizservice/v1/GetLocalizedStringsResponse;", "b", "(Lcom/spotify/musicquizservice/v1/GetLocalizedStringsRequest;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_musicquiz_network_quizui-quizui"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface nli0 {
    @j3m0("music-quiz-service/com.spotify.musicquizservice.v1.QuizUiService/GetOnboardingCarousel")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: a */
    Object m64741a(@h4a GetOnboardingCarouselRequest getOnboardingCarouselRequest, fbk<? super o2x0<GetOnboardingCarouselResponse>> fbkVar);

    @j3m0("music-quiz-service/com.spotify.musicquizservice.v1.QuizUiService/GetLocalizedStrings")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: b */
    Object m64742b(@h4a GetLocalizedStringsRequest getLocalizedStringsRequest, fbk<? super o2x0<GetLocalizedStringsResponse>> fbkVar);

    @j3m0("music-quiz-service/com.spotify.musicquizservice.v1.QuizUiService/GetQuizColors")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: c */
    Object m64743c(@h4a GetQuizColorsRequest getQuizColorsRequest, fbk<? super o2x0<GetQuizColorsResponse>> fbkVar);

    @j3m0("music-quiz-service/com.spotify.musicquizservice.v1.QuizUiService/GetSoundEffects")
    @rn20({obr.f163698c, "Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: d */
    Object m64744d(@h4a GetSoundEffectsRequest getSoundEffectsRequest, fbk<? super o2x0<GetSoundEffectsResponse>> fbkVar);
}
