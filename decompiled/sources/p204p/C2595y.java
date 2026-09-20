package p204p;

import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;

/* JADX INFO: renamed from: p.y */
/* JADX INFO: loaded from: classes15.dex */
public final class C2595y implements xg30 {
    @Override // p204p.xg30
    public Object handleResponse(wg30 wg30Var, ErrorInfo errorInfo) throws AblyException {
        if (errorInfo == null) {
            return ((Long[]) qtz0.f192515b.fromJson(new String(wg30Var.f250963f), Long[].class))[0];
        }
        throw AblyException.fromErrorInfo(errorInfo);
    }
}
