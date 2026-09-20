package p204p;

import io.ably.lib.types.Callback;
import io.ably.lib.types.ErrorInfo;

/* JADX INFO: loaded from: classes15.dex */
public final class ymc implements Callback {

    /* JADX INFO: renamed from: a */
    public final Object f274218a;

    public /* synthetic */ ymc(Object obj) {
        this.f274218a = obj;
    }

    @Override // io.ably.lib.types.Callback
    public void onError(ErrorInfo errorInfo) {
        ((C1797e0) this.f274218a).f54818b = errorInfo;
    }

    @Override // io.ably.lib.types.Callback
    public void onSuccess(Object obj) {
        ((C1797e0) this.f274218a).f54817a = obj;
    }
}
