package p204p;

import android.webkit.ValueCallback;
import io.reactivex.rxjava3.core.CompletableEmitter;

/* JADX INFO: loaded from: classes.dex */
public final class bqk implements ValueCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CompletableEmitter f29843a;

    public bqk(CompletableEmitter completableEmitter) {
        this.f29843a = completableEmitter;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        this.f29843a.onComplete();
    }
}
