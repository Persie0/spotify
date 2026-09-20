package p204p;

import android.content.Context;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public final class af30 extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gd30 f15012a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f15013b;

    public af30(gd30 gd30Var, gh00 gh00Var) {
        this.f15012a = gd30Var;
        this.f15013b = gh00Var;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String strMessage;
        if (consoleMessage != null && (strMessage = consoleMessage.message()) != null && consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR && wl51.m88496t0(strMessage, "Content Security Policy", false)) {
            this.f15013b.invoke(new pe30(strMessage));
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        Context context;
        if (webView == null || (context = webView.getContext()) == null) {
            return false;
        }
        WebView webView2 = new WebView(context);
        webView2.setWebViewClient(new ze30(this.f15012a, z2));
        Object obj = message != null ? message.obj : null;
        WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
        if (webViewTransport != null) {
            webViewTransport.setWebView(webView2);
        }
        if (message == null) {
            return true;
        }
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (jsResult == null) {
            return true;
        }
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (jsResult == null) {
            return true;
        }
        jsResult.cancel();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (jsPromptResult == null) {
            return true;
        }
        jsPromptResult.cancel();
        return true;
    }
}
