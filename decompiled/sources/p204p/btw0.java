package p204p;

import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class btw0 extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final Object f30946a;

    /* JADX INFO: renamed from: b */
    public final y3o0 f30947b;

    public btw0(Map map, y3o0 y3o0Var) {
        this.f30946a = map;
        this.f30947b = y3o0Var;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.f30947b.invoke(Boolean.valueOf(webView.canGoBack()));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (msw0.m62781c(str)) {
            msw0.m62780b(webView, this.f30946a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (msw0.m62781c(str)) {
            msw0.m62780b(webView, this.f30946a);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return !msw0.m62781c(webResourceRequest.getUrl().toString());
    }
}
