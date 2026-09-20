package p204p;

import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import java.net.InetAddress;
import java.net.URI;

/* JADX INFO: renamed from: p.d0 */
/* JADX INFO: loaded from: classes16.dex */
public final class C1761d0 implements xg30, lpa0 {
    /* JADX INFO: renamed from: a */
    public static InetAddress m34486a(URI uri) {
        return InetAddress.getByName(uri.getHost());
    }

    @Override // p204p.xg30
    public Object handleResponse(wg30 wg30Var, ErrorInfo errorInfo) throws AblyException {
        if (errorInfo == null) {
            return wg30Var.f250963f;
        }
        throw AblyException.fromErrorInfo(errorInfo);
    }
}
