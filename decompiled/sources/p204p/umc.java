package p204p;

import io.ably.lib.types.ErrorInfo;

/* JADX INFO: loaded from: classes16.dex */
public final class umc implements uuf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ bnc f231794a;

    public umc(bnc bncVar) {
        this.f231794a = bncVar;
    }

    @Override // p204p.uuf
    public final void onError(ErrorInfo errorInfo) {
        this.f231794a.f28802u = false;
    }

    @Override // p204p.uuf
    public final void onSuccess() {
        this.f231794a.f28802u = false;
    }
}
