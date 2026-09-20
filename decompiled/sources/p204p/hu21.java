package p204p;

import com.spotify.home.slotloading.proto.GetMainHomeLayoutResponse;
import com.spotify.home.slotloading.proto.GetSlotContentResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J6\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJ`\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, m24212d2 = {"Lp/hu21;", "", "", "cacheControlHeader", "feed", "sessionId", "Lp/o2x0;", "Lcom/spotify/home/slotloading/proto/GetMainHomeLayoutResponse;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "", "slotType", "timezone", "eagerload", "", "dsaModeEnabled", "Lcom/spotify/home/slotloading/proto/GetSlotContentResponse;", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_home_slotloading-slotloading"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface hu21 {
    /* JADX INFO: renamed from: c */
    static /* synthetic */ Object m48591c(hu21 hu21Var, String str, String str2, String str3, fbk fbkVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pageLayout");
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return hu21Var.m48594b(str, str2, str3, fbkVar);
    }

    /* JADX INFO: renamed from: d */
    static /* synthetic */ Object m48592d(hu21 hu21Var, String str, int i, String str2, String str3, String str4, boolean z, String str5, fbk fbkVar, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slotContent");
        }
        if ((i2 & 16) != 0) {
            str4 = null;
        }
        if ((i2 & 32) != 0) {
            z = false;
        }
        if ((i2 & 64) != 0) {
            str5 = null;
        }
        return hu21Var.m48593a(str, i, str2, str3, str4, z, str5, fbkVar);
    }

    @zk00("casita/v1-beta/slot-content")
    @rn20({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Object m48593a(@xe20("Cache-Control") String str, @hit0("slotType") int i, @hit0("feed") String str2, @hit0("timezone") String str3, @hit0(encoded = true, value = "eagerload") String str4, @hit0("mobile-only-dsa-enabled") boolean z, @xe20("X-Session-Id") String str5, fbk<? super o2x0<GetSlotContentResponse>> fbkVar);

    @zk00("casita/v1-beta/page-layout")
    @rn20({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    /* JADX INFO: renamed from: b */
    Object m48594b(@xe20("Cache-Control") String str, @hit0("feed") String str2, @xe20("X-Session-Id") String str3, fbk<? super o2x0<GetMainHomeLayoutResponse>> fbkVar);
}
