package p204p;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes8.dex */
public final class srp extends WebView.VisualStateCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WebView f213367a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f213368b;

    public srp(WebView webView, gh00 gh00Var) {
        this.f213367a = webView;
        this.f213368b = gh00Var;
    }

    @Override // android.webkit.WebView.VisualStateCallback
    public final void onComplete(long j) {
        WebView webView = this.f213367a;
        boolean zIsAttachedToWindow = webView.isAttachedToWindow();
        gh00 gh00Var = this.f213368b;
        if (zIsAttachedToWindow) {
            gh00Var.invoke(n3f0.f150048a);
        } else {
            webView.addOnAttachStateChangeListener(new rrp(0, webView, gh00Var));
        }
    }
}
