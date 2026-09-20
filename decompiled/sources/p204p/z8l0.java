package p204p;

import io.reactivex.rxjava3.core.Completable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m24211d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J-\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m24212d2 = {"Lp/z8l0;", "", "", "trackUri", "shareId", "linkSource", "Lio/reactivex/rxjava3/core/Completable;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Completable;", "Lp/x8b;", "Ljava/lang/Void;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lp/x8b;", "src_main_java_com_spotify_ondemandsharing_endpointretrofit-endpointretrofit"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public interface z8l0 {
    @zk00("on-demand-sharing/v1/verify/uri/{uri}/share-id/{shareId}")
    /* JADX INFO: renamed from: a */
    Completable m95607a(@ubn0("uri") String trackUri, @ubn0("shareId") String shareId, @hit0("linkSource") String linkSource);

    @j3m0("on-demand-sharing/v1/register/uri/{uri}/share-id/{shareId}")
    /* JADX INFO: renamed from: b */
    x8b<Void> m95608b(@ubn0("uri") String trackUri, @ubn0("shareId") String shareId);
}
