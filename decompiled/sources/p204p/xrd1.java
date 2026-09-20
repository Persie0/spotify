package p204p;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m24211d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m24212d2 = {"Lp/xrd1;", "", "Lp/nfr;", "body", "", "correlationId", "Lp/qfr;", "b", "(Lp/nfr;Ljava/lang/String;Lp/fbk;)Ljava/lang/Object;", "Lp/xpk0;", "Lp/w2a1;", "c", "(Lp/xpk0;Lp/fbk;)Ljava/lang/Object;", "src_main_java_com_spotify_devicepredictability_internal_devicesuggestionproviderimpl_sources_wheretoplay_impl-impl"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface xrd1 {
    /* JADX INFO: renamed from: a */
    static /* synthetic */ Object m91933a(xrd1 xrd1Var, nfr nfrVar, String str, fbk fbkVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recommend");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return xrd1Var.m91934b(nfrVar, str, fbkVar);
    }

    @j3m0("where-to-play/v2/recommend")
    @rn20({"Content-Type: application/json", "Content-Encoding: identity", "Accept: application/json"})
    /* JADX INFO: renamed from: b */
    Object m91934b(@h4a nfr nfrVar, @xe20("X-Correlation-Id") String str, fbk<? super qfr> fbkVar);

    @j3m0("where-to-play/v2/observe")
    @rn20({"Content-Type: application/json", "Content-Encoding: identity", "Accept: application/json"})
    /* JADX INFO: renamed from: c */
    Object m91935c(@h4a xpk0 xpk0Var, fbk<? super w2a1> fbkVar);
}
