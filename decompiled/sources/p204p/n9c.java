package p204p;

import com.spotify.home.funkispage.p077v1.proto.Feeds;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m24212d2 = {"Lp/n9c;", "", "", "cacheControl", "", "dsaModeEnabled", "locale", "Lcom/spotify/home/funkispage/v1/proto/Feeds;", "a", "(Ljava/lang/String;ZLjava/lang/String;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_accessibility_compose-compose"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface n9c {
    @zk00("casita/v1/feeds")
    @rn20({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    /* JADX INFO: renamed from: a */
    Object m63915a(@xe20("Cache-Control") String str, @hit0("mobile-only-dsa-enabled") boolean z, @hit0("locale") String str2, fbk<? super Feeds> fbkVar);
}
