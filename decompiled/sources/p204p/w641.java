package p204p;

import android.net.Uri;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes4.dex */
public final class w641 extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final gh00 f248253a;

    /* JADX INFO: renamed from: b */
    public final eh00 f248254b;

    /* JADX INFO: renamed from: c */
    public final p511 f248255c;

    /* JADX INFO: renamed from: d */
    public final gh00 f248256d;

    public w641(gh00 gh00Var, eh00 eh00Var, p511 p511Var, gh00 gh00Var2) {
        this.f248253a = gh00Var;
        this.f248254b = eh00Var;
        this.f248255c = p511Var;
        this.f248256d = gh00Var2;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        if (str != null) {
            this.f248253a.invoke(str);
        }
        boolean z2 = false;
        if (webView != null && webView.canGoBack()) {
            z2 = true;
        }
        this.f248255c.invoke(Boolean.valueOf(z2));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (str != null) {
            this.f248253a.invoke(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame()) {
            return;
        }
        this.f248254b.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int statusCode;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest == null || !webResourceRequest.isForMainFrame() || webResourceResponse == null || 400 > (statusCode = webResourceResponse.getStatusCode()) || statusCode >= 600) {
            return;
        }
        this.f248254b.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        this.f248254b.invoke();
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String string;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
            return false;
        }
        if (((Boolean) this.f248256d.invoke(string)).booleanValue()) {
            return true;
        }
        return !URLUtil.isNetworkUrl(string);
    }
}
