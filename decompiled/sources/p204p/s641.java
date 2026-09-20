package p204p;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public final class s641 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gh00 f205998a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f205999b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eh00 f206000c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh00 f206001d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ kqi0 f206002e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ kqi0 f206003f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ gh00 f206004g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ gh00 f206005h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ gh00 f206006i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s641(gh00 gh00Var, gh00 gh00Var2, eh00 eh00Var, gh00 gh00Var3, kqi0 kqi0Var, kqi0 kqi0Var2, gh00 gh00Var4, gh00 gh00Var5, gh00 gh00Var6) {
        super(1);
        this.f205998a = gh00Var;
        this.f205999b = gh00Var2;
        this.f206000c = eh00Var;
        this.f206001d = gh00Var3;
        this.f206002e = kqi0Var;
        this.f206003f = kqi0Var2;
        this.f206004g = gh00Var4;
        this.f206005h = gh00Var5;
        this.f206006i = gh00Var6;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        WebView webView = new WebView((Context) obj);
        this.f206002e.setValue(webView);
        this.f205998a.invoke(webView);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setGeolocationEnabled(false);
        if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(true);
        }
        webView.setWebViewClient(new w641(this.f205999b, this.f206000c, new p511(this.f206003f, 10), this.f206001d));
        webView.setWebChromeClient(new r641(this.f206004g, this.f206005h, this.f206006i));
        return webView;
    }
}
