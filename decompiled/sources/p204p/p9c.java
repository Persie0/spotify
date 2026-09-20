package p204p;

import com.spotify.casita.p040v1.resolved.ResolvedHome;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J¤\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00052\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, m24212d2 = {"Lp/p9c;", "", "", "cacheControlHeader", "encodedTargetDevice", "", "incrementalHomeEnabled", "refreshToken", "isTablet", "feedId", "eagerload", "timezone", "dsaModeEnabled", "locale", "pageToken", "slotBasedLoadingEnabled", "sessionId", "Lp/o2x0;", "Lcom/spotify/casita/v1/resolved/ResolvedHome;", "a", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface p9c {
    /* JADX INFO: renamed from: b */
    static Object m69369b(p9c p9cVar, String str, String str2, boolean z, String str3, Boolean bool, String str4, String str5, String str6, boolean z2, String str7, String str8, Boolean bool2, String str9, fbk fbkVar, int i, Object obj) {
        if (obj == null) {
            return p9cVar.m69370a(str, str2, z, (i & 8) != 0 ? null : str3, bool, (i & 32) != 0 ? "default" : str4, str5, str6, z2, str7, (i & 1024) != 0 ? null : str8, (i & 2048) != 0 ? null : bool2, (i & 4096) != 0 ? null : str9, fbkVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: home");
    }

    @zk00("casita/v1/home/{feedId}")
    @rn20({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Object m69370a(@xe20("Cache-Control") String str, @xe20("X-Target-Device") String str2, @xe20("X-Incremental-Home-Enabled") boolean z, @xe20("X-Refresh-Token") String str3, @xe20("X-Is-Tablet") Boolean bool, @ubn0("feedId") String str4, @hit0(encoded = true, value = "eagerload") String str5, @hit0("timezone") String str6, @hit0("mobile-only-dsa-enabled") boolean z2, @hit0("locale") String str7, @hit0("pagetoken") String str8, @hit0("slot-based-loading-enabled") Boolean bool2, @xe20("X-Session-Id") String str9, fbk<? super o2x0<ResolvedHome>> fbkVar);
}
