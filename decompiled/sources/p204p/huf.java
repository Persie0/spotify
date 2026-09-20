package p204p;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: loaded from: classes11.dex */
public final class huf extends CompletableFuture {

    /* JADX INFO: renamed from: a */
    public final x4l0 f95397a;

    public huf(x4l0 x4l0Var) {
        this.f95397a = x4l0Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.f95397a.cancel();
        }
        return super.cancel(z);
    }
}
