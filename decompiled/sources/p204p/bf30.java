package p204p;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes4.dex */
public final class bf30 extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gd30 f26533a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ye30 f26534b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f26535c;

    public bf30(gd30 gd30Var, ye30 ye30Var, gh00 gh00Var) {
        this.f26533a = gd30Var;
        this.f26534b = ye30Var;
        this.f26535c = gh00Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        ye30 ye30Var = this.f26534b;
        sr4 sr4Var = ye30Var.f271912a;
        if (sr4Var != null) {
            sr4Var.m79016f(f710.m40937e(2));
        }
        sr4 sr4Var2 = ye30Var.f271912a;
        if (sr4Var2 != null) {
            ((rr4) ye30Var.f271913b).m76276b(sr4Var2.m79015d());
        }
        ye30Var.f271912a = null;
        this.f26535c.invoke(se30.f208182a);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        sr4 sr4Var = this.f26534b.f271912a;
        if (sr4Var != null) {
            sr4Var.m79019k(f710.m40937e(2), null, (4 & 4) != 0);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        String string;
        Uri url;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
            string = "unknown";
        }
        ye30 ye30Var = this.f26534b;
        sr4 sr4Var = ye30Var.f271912a;
        if (sr4Var != null) {
            ((rr4) ye30Var.f271913b).m76276b(sr4Var.m79015d());
        }
        ye30Var.f271912a = null;
        this.f26535c.invoke(new ve30(string, i));
        if (Build.VERSION.SDK_INT < 27 || safeBrowsingResponse == null) {
            return;
        }
        safeBrowsingResponse.backToSafety(true);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String string;
        if (webResourceRequest != null && (url = webResourceRequest.getUrl()) != null && (string = url.toString()) != null) {
            this.f26533a.m44332b(string, 1, webResourceRequest.hasGesture(), webResourceRequest.isRedirect());
        }
        return true;
    }
}
