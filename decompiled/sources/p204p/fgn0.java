package p204p;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes9.dex */
public final class fgn0 {

    /* JADX INFO: renamed from: a */
    public final vfn0 f69374a;

    /* JADX INFO: renamed from: b */
    public final Handler f69375b = new Handler(Looper.getMainLooper());

    public fgn0(vfn0 vfn0Var) {
        this.f69374a = vfn0Var;
    }

    @JavascriptInterface
    public final void onBridgeReady() {
        this.f69375b.post(new cgn0(this, 0));
    }

    @JavascriptInterface
    public final void onError() {
        this.f69375b.post(new cgn0(this, 1));
    }

    @JavascriptInterface
    public final void onFieldFocus(String str) {
        this.f69375b.post(new vod0(7, this, str));
    }

    @JavascriptInterface
    public final void onLoad(double d) {
        this.f69375b.post(new dgn0(this, d, 0));
    }

    @JavascriptInterface
    public final void onResize(double d) {
        this.f69375b.post(new dgn0(this, d, 1));
    }

    @JavascriptInterface
    public final void onSubmitRequested() {
        this.f69375b.post(new cgn0(this, 2));
    }

    @JavascriptInterface
    public final void onSuccess(String str, String str2) {
        this.f69375b.post(new egn0(this, str, str2, 0));
    }

    @JavascriptInterface
    public final void onValidationError(String str, String str2) {
        this.f69375b.post(new egn0(this, str, str2, 1));
    }
}
