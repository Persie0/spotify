package p204p;

import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes8.dex */
public interface vwa {
    @JavascriptInterface
    void call(String str);

    @JavascriptInterface
    void callV2(String str, String str2, boolean z);

    @JavascriptInterface
    void documentReady();

    @JavascriptInterface
    void documentReady(String str);
}
