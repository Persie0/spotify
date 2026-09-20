package p204p;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes4.dex */
public final class ze30 extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gd30 f281870a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f281871b;

    public ze30(gd30 gd30Var, boolean z) {
        this.f281870a = gd30Var;
        this.f281871b = z;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String string;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (string = url.toString()) != null) {
            this.f281870a.m44332b(string, 2, this.f281871b, webResourceRequest.isRedirect());
            if (webView != null) {
                webView.destroy();
            }
        }
        return true;
    }
}
