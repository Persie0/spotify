package p204p;

import com.spotify.kidssessions.p090v1.GetAutoLoginTokenRequest;
import com.spotify.kidssessions.p090v1.GetAutoLoginTokenResponse;
import com.spotify.kidssessions.p090v1.GetSessionResponse;
import com.spotify.kidssessions.p090v1.GetTransitioningProfileResponse;
import com.spotify.kidssessions.p090v1.StartSessionRequest;
import com.spotify.kidssessions.p090v1.StartSessionResponse;
import com.spotify.kidssessions.p090v1.TerminateSessionRequest;
import com.spotify.kidssessions.p090v1.TerminateSessionResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0016\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, m24212d2 = {"Lp/a770;", "", "Lcom/spotify/kidssessions/v1/StartSessionRequest;", "request", "Lcom/spotify/kidssessions/v1/StartSessionResponse;", "a", "(Lcom/spotify/kidssessions/v1/StartSessionRequest;Lp/fbk;)Ljava/lang/Object;", "", "sessionId", "Lcom/spotify/kidssessions/v1/GetSessionResponse;", "b", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/kidssessions/v1/TerminateSessionRequest;", "Lcom/spotify/kidssessions/v1/TerminateSessionResponse;", "c", "(Ljava/lang/String;Lcom/spotify/kidssessions/v1/TerminateSessionRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/kidssessions/v1/GetAutoLoginTokenRequest;", "Lcom/spotify/kidssessions/v1/GetAutoLoginTokenResponse;", "e", "(Ljava/lang/String;Lcom/spotify/kidssessions/v1/GetAutoLoginTokenRequest;Lp/fbk;)Ljava/lang/Object;", "Lcom/spotify/kidssessions/v1/GetTransitioningProfileResponse;", "f", "d", "src_main_java_com_spotify_genalphaauthentication_datasourceimpl-datasourceimpl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface a770 {
    @j3m0("kids-sessions/v1/parental-consent-sessions")
    @rn20({"Accept: application/x-protobuf", "No-Webgate-Authentication: true"})
    /* JADX INFO: renamed from: a */
    Object m24917a(@h4a StartSessionRequest startSessionRequest, fbk<? super StartSessionResponse> fbkVar);

    @zk00("kids-sessions/v1/parental-consent-sessions/{session_id}")
    @rn20({"Accept: application/x-protobuf", "No-Webgate-Authentication: true"})
    /* JADX INFO: renamed from: b */
    Object m24918b(@ubn0("session_id") String str, fbk<? super GetSessionResponse> fbkVar);

    @j3m0("kids-sessions/v1/parental-consent-sessions/{session_id}/terminate")
    @rn20({"Accept: application/x-protobuf", "No-Webgate-Authentication: true"})
    /* JADX INFO: renamed from: c */
    Object m24919c(@ubn0("session_id") String str, @h4a TerminateSessionRequest terminateSessionRequest, fbk<? super TerminateSessionResponse> fbkVar);

    @j3m0("kids-sessions/me/v1/parental-consent-sessions")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: d */
    Object m24920d(@h4a StartSessionRequest startSessionRequest, fbk<? super StartSessionResponse> fbkVar);

    @j3m0("kids-sessions/v1/parental-consent-sessions/{session_id}/token")
    @rn20({"Accept: application/x-protobuf", "No-Webgate-Authentication: true"})
    /* JADX INFO: renamed from: e */
    Object m24921e(@ubn0("session_id") String str, @h4a GetAutoLoginTokenRequest getAutoLoginTokenRequest, fbk<? super GetAutoLoginTokenResponse> fbkVar);

    @zk00("kids-sessions/me/v1/parental-consent-sessions/{session_id}/transitioning-profile")
    @rn20({"Accept: application/x-protobuf"})
    /* JADX INFO: renamed from: f */
    Object m24922f(@ubn0("session_id") String str, fbk<? super GetTransitioningProfileResponse> fbkVar);
}
