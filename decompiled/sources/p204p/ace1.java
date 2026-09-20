package p204p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m24211d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u0001H§@¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u0001H§@¢\u0006\u0004\b\u0004\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00012\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0001H§@¢\u0006\u0004\b\t\u0010\u0003J!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\f\u0010\rJM\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH'¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH'¢\u0006\u0004\b\u0017\u0010\u0016J\u001b\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u000bH'¢\u0006\u0004\b\u001a\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m24212d2 = {"Lp/ace1;", "", "d", "(Lp/fbk;)Ljava/lang/Object;", "b", "", "sampleId", "i", "(Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "h", "startingStoryId", "Lio/reactivex/rxjava3/core/Single;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "", "useLongText", "useFallbackImage", "locale", "username", "f", "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "e", "()Lio/reactivex/rxjava3/core/Single;", "g", "Lp/o2x0;", "Ljava/lang/Void;", "c", "src_main_java_com_spotify_campaigns_wrappedendpoint-wrappedendpoint"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface ace1 {
    @zk00("campaigns-service/v1/campaigns/wrapped/consumer")
    /* JADX INFO: renamed from: a */
    Single<Object> m25457a(@hit0("startingStoryId") String startingStoryId);

    @zk00("campaigns-service/v1/campaigns/wrapped/consumer/partial-list")
    /* JADX INFO: renamed from: b */
    Object m25458b(fbk<Object> fbkVar);

    @pem("campaigns-service/v1/campaigns/wrapped/consumer/archive/viewed")
    /* JADX INFO: renamed from: c */
    Single<o2x0<Void>> m25459c();

    @zk00("campaigns-service/v1/campaigns/wrapped/consumer/sample-list")
    /* JADX INFO: renamed from: d */
    Object m25460d(fbk<Object> fbkVar);

    @zk00("campaigns-service/v1/campaigns/wrapped/consumer/languages")
    /* JADX INFO: renamed from: e */
    Single<Object> m25461e();

    @zk00("campaigns-service/v1/campaigns/wrapped/consumer/debug")
    /* JADX INFO: renamed from: f */
    Single<Object> m25462f(@hit0("useLongText") boolean useLongText, @hit0("useFallbackImage") boolean useFallbackImage, @hit0("locale") String locale, @hit0("useUsername") String username, @hit0("startingStoryId") String startingStoryId);

    @pem("campaigns-service/v1/campaigns/wrapped/consumer/viewcount")
    /* JADX INFO: renamed from: g */
    Single<Object> m25463g();

    @zk00("campaigns-service/v1/campaigns/wrapped/consumer/sample")
    /* JADX INFO: renamed from: h */
    Object m25464h(fbk<Object> fbkVar);

    @zk00("campaigns-service/v1/campaigns/wrapped/consumer/sample/{sampleId}")
    /* JADX INFO: renamed from: i */
    Object m25465i(@ubn0("sampleId") String str, fbk<Object> fbkVar);
}
