package coil3.network;

import kotlin.Metadata;
import p204p.whj0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m24212d2 = {"Lcoil3/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "coil-network-core_release"}, m24213k = 1, m24214mv = {2, 2, 0}, m24216xi = 48)
public final class HttpException extends RuntimeException {
    public HttpException(whj0 whj0Var) {
        super("HTTP " + whj0Var.f251362a);
    }
}
