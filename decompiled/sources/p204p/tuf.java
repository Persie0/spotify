package p204p;

import io.ably.lib.types.ErrorInfo;
import java.util.Iterator;

/* JADX INFO: loaded from: classes16.dex */
public final class tuf extends hc20 implements uuf {
    @Override // p204p.uuf
    public final void onError(ErrorInfo errorInfo) {
        Iterator it = m47092c().iterator();
        while (it.hasNext()) {
            try {
                ((uuf) it.next()).onError(errorInfo);
            } catch (Throwable unused) {
            }
        }
    }

    @Override // p204p.uuf
    public final void onSuccess() {
        Iterator it = m47092c().iterator();
        while (it.hasNext()) {
            try {
                ((uuf) it.next()).onSuccess();
            } catch (Throwable unused) {
            }
        }
    }
}
