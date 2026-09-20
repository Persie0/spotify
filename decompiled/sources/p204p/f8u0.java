package p204p;

import com.spotify.ratingsandreviews.ratings.model.proto.RateRequest;
import io.reactivex.rxjava3.core.Completable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\nJ,\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, m24212d2 = {"Lp/f8u0;", "", "", "showUri", "Lcom/spotify/ratingsandreviews/ratings/model/proto/RateRequest;", "rateRequest", "Lio/reactivex/rxjava3/core/Completable;", "b", "(Ljava/lang/String;Lcom/spotify/ratingsandreviews/ratings/model/proto/RateRequest;)Lio/reactivex/rxjava3/core/Completable;", "a", "(Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "", "unreportedConsumptionMs", "Lp/o2x0;", "Ljava/lang/Void;", "c", "(Ljava/lang/String;Ljava/lang/Long;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_ratings_ratingsandreviews-ratingsandreviews"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface f8u0 {
    /* JADX INFO: renamed from: d */
    static /* synthetic */ Object m41044d(f8u0 f8u0Var, String str, Long l, fbk fbkVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getEligibility");
        }
        if ((i & 2) != 0) {
            l = null;
        }
        return f8u0Var.m41047c(str, l, fbkVar);
    }

    @pem("ratings/v1/rating/show/{showUri}")
    /* JADX INFO: renamed from: a */
    Completable m41045a(@ubn0("showUri") String showUri);

    @j3m0("ratings/v1/rating/show/{showUri}")
    /* JADX INFO: renamed from: b */
    Completable m41046b(@ubn0("showUri") String showUri, @h4a RateRequest rateRequest);

    @zk00("ratings/v2/rating/eligibility/show/{showUri}")
    /* JADX INFO: renamed from: c */
    Object m41047c(@ubn0("showUri") String str, @hit0("unreported_consumption_ms") Long l, fbk<? super o2x0<Void>> fbkVar);
}
