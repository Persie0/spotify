package p204p;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class j5x extends WebViewClient {

    /* JADX INFO: renamed from: a */
    public final Handler f109134a;

    /* JADX INFO: renamed from: b */
    public final gh00 f109135b;

    /* JADX INFO: renamed from: c */
    public final b4d1 f109136c;

    /* JADX INFO: renamed from: d */
    public final HashMap f109137d = new HashMap();

    public j5x(Handler handler, gh00 gh00Var, b4d1 b4d1Var) {
        this.f109134a = handler;
        this.f109135b = gh00Var;
        this.f109136c = b4d1Var;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        HashMap map = this.f109137d;
        Runnable runnable = (Runnable) map.remove(str);
        if (runnable != null) {
            this.f109134a.removeCallbacks(runnable);
        }
        map.put(str, new uqf1(20, str, this));
        this.f109135b.invoke(new c6d1(str));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        webView.getProgress();
        if (webView.getProgress() == 100) {
            HashMap map = this.f109137d;
            if (map.containsKey(str)) {
                this.f109135b.invoke(new u5d1(str));
                Runnable runnable = (Runnable) map.remove(str);
                if (runnable != null) {
                    this.f109134a.removeCallbacks(runnable);
                }
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        HashMap map = this.f109137d;
        if (map.containsKey(str)) {
            return;
        }
        this.f109135b.invoke(new t5d1(str));
        uqf1 uqf1Var = new uqf1(20, str, this);
        map.put(str, uqf1Var);
        this.f109134a.postDelayed(uqf1Var, 10000L);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            String string = webResourceRequest.getUrl().toString();
            this.f109135b.invoke(new s5d1(string));
            Runnable runnable = (Runnable) this.f109137d.remove(string);
            if (runnable != null) {
                this.f109134a.removeCallbacks(runnable);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.isForMainFrame()) {
            String string = webResourceRequest.getUrl().toString();
            this.f109135b.invoke(new s5d1(Integer.valueOf(webResourceResponse.getStatusCode()), string, "http"));
            Runnable runnable = (Runnable) this.f109137d.remove(string);
            if (runnable != null) {
                this.f109134a.removeCallbacks(runnable);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String string = webResourceRequest.getUrl().toString();
        f1e f1eVarM28086a = this.f109136c.m28086a();
        boolean z = false;
        if (f1eVarM28086a != null && f1eVarM28086a.mo40533a(webResourceRequest.getUrl())) {
            z = true;
        }
        this.f109135b.invoke(new m5d1(string, z));
        return true;
    }
}
