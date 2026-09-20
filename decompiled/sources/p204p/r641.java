package p204p;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public final class r641 extends WebChromeClient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gh00 f196172a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f196173b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f196174c;

    public r641(gh00 gh00Var, gh00 gh00Var2, gh00 gh00Var3) {
        this.f196172a = gh00Var;
        this.f196173b = gh00Var2;
        this.f196174c = gh00Var3;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.f196173b.invoke(Integer.valueOf(i));
        this.f196174c.invoke(Boolean.valueOf(i < 100));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        if (str != null) {
            this.f196172a.invoke(str);
        }
    }
}
