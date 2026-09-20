package p204p;

import com.spotify.gamesservice.musicguesser.p071v1.CompleteGameRequest;
import com.spotify.gamesservice.musicguesser.p071v1.GameResultsPage;
import com.spotify.gamesservice.musicguesser.p071v1.GetDailyIntroResponse;
import com.spotify.gamesservice.musicguesser.p071v1.GetGameResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m24211d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H§@¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000f\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m24212d2 = {"Lp/dhi0;", "Lp/o2x0;", "Lcom/spotify/gamesservice/musicguesser/v1/GetDailyIntroResponse;", "d", "(Lp/fbk;)Ljava/lang/Object;", "", "gameId", "Lcom/spotify/gamesservice/musicguesser/v1/GetGameResponse;", "a", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/gamesservice/musicguesser/v1/CompleteGameRequest;", "request", "Lcom/spotify/gamesservice/musicguesser/v1/GameResultsPage;", "c", "(Ljava/lang/String;Lcom/spotify/gamesservice/musicguesser/v1/CompleteGameRequest;Lp/fbk;)Ljava/lang/Object;", "b", "src_main_java_com_spotify_games_musicguesser_network_service-service"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface dhi0 {
    @zk00("games-service/music-guesser/v1/games/{game_id}")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Object m36043a(@ubn0("game_id") String str, fbk<? super o2x0<GetGameResponse>> fbkVar);

    @zk00("games-service/music-guesser/v1/games/{game_id}/results")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: b */
    Object m36044b(@ubn0("game_id") String str, fbk<? super o2x0<GameResultsPage>> fbkVar);

    @j3m0("games-service/music-guesser/v1/games/{game_id}/complete")
    @rn20({"Accept: application/protobuf", "Content-Type: application/protobuf"})
    /* JADX INFO: renamed from: c */
    Object m36045c(@ubn0("game_id") String str, @h4a CompleteGameRequest completeGameRequest, fbk<? super o2x0<GameResultsPage>> fbkVar);

    @zk00("games-service/music-guesser/v1/games/daily/intro")
    @rn20({"Accept: application/protobuf"})
    /* JADX INFO: renamed from: d */
    Object m36046d(fbk<? super o2x0<GetDailyIntroResponse>> fbkVar);
}
