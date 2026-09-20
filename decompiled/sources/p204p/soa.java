package p204p;

import com.spotify.browsita.p033v1.resolved.ResolvedBrowse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JB\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lp/soa;", "", "", "cacheControl", "", "isTablet", "timezone", "notPersonalised", "Lp/o2x0;", "Lcom/spotify/browsita/v1/resolved/ResolvedBrowse;", "a", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_browse_clientnative-clientnative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface soa {
    /* JADX INFO: renamed from: b */
    static /* synthetic */ Object m78642b(soa soaVar, String str, Boolean bool, String str2, Boolean bool2, fbk fbkVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContent");
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        return soaVar.m78643a(str, bool, str2, bool2, fbkVar);
    }

    @zk00("browsita/v1/browse")
    @rn20({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Object m78643a(@xe20("Cache-Control") String str, @xe20("X-Is-Tablet") Boolean bool, @hit0("timezone") String str2, @hit0("not-personalised") Boolean bool2, fbk<? super o2x0<ResolvedBrowse>> fbkVar);
}
