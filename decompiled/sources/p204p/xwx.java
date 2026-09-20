package p204p;

import com.spotify.externalintegration.http.ExternalIntegrationBackendResponseModel;
import io.reactivex.rxjava3.core.Single;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001JE\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0003H'¢\u0006\u0004\b\n\u0010\u000bJO\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0003H'¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m24212d2 = {"Lp/xwx;", "", "", "", "cacheHeaders", "iso8601ClientDateTime", "externalIntegrationRequestModelJson", "Lio/reactivex/rxjava3/core/Single;", "Lp/o2x0;", "Lcom/spotify/externalintegration/http/ExternalIntegrationBackendResponseModel;", "a", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "genreUri", "b", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface xwx {
    @zk00("external-integration-browse/v1/get-browse-root")
    /* JADX INFO: renamed from: a */
    Single<o2x0<ExternalIntegrationBackendResponseModel>> m92306a(@il20 Map<String, String> cacheHeaders, @xe20("x-timestamp") String iso8601ClientDateTime, @hit0("request_json") String externalIntegrationRequestModelJson);

    @zk00("external-integration-browse/v1/get-browse-content")
    /* JADX INFO: renamed from: b */
    Single<o2x0<ExternalIntegrationBackendResponseModel>> m92307b(@il20 Map<String, String> cacheHeaders, @xe20("x-timestamp") String iso8601ClientDateTime, @hit0("genre_uri") String genreUri, @hit0("request_json") String externalIntegrationRequestModelJson);
}
