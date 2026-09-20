package p204p;

import com.spotify.externalintegration.http.UnauthenticatedExperiencesResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m24212d2 = {"Lp/jr2;", "", "", "clientContext", "externalAccessoryDescription", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/externalintegration/http/UnauthenticatedExperiencesResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "query", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_externalintegration_http-http"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface jr2 {
    /* JADX INFO: renamed from: b */
    static /* synthetic */ Single m54129b(jr2 jr2Var, String str, String str2, String str3, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUnauthenticatedSearch");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return jr2Var.m54132d(str, str2, str3);
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ Single m54130c(jr2 jr2Var, String str, String str2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUnauthenticatedExperiences");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return jr2Var.m54131a(str, str2);
    }

    @zk00("{clientContext}/v1/unauthenticated-experiences/")
    /* JADX INFO: renamed from: a */
    Single<UnauthenticatedExperiencesResponse> m54131a(@ubn0(encoded = true, value = "clientContext") String clientContext, @xe20("x-external-accessory-description") String externalAccessoryDescription);

    @zk00("{clientContext}/v1/unauthenticated-search/")
    /* JADX INFO: renamed from: d */
    Single<UnauthenticatedExperiencesResponse> m54132d(@ubn0(encoded = true, value = "clientContext") String clientContext, @xe20("x-external-accessory-description") String externalAccessoryDescription, @hit0("query") String query);
}
