package p204p;

import android.os.Build;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
public final class ex3 implements w58 {

    /* JADX INFO: renamed from: a */
    public final Object f63658a;

    /* JADX INFO: renamed from: b */
    public final Object f63659b;

    /* JADX INFO: renamed from: c */
    public final Object f63660c;

    /* JADX INFO: renamed from: d */
    public final Object f63661d;

    public ex3(fke fkeVar, ue7 ue7Var) {
        this.f63658a = fkeVar;
        this.f63659b = ue7Var;
        int i = 0;
        this.f63660c = new k97(this, i);
        this.f63661d = new j97(this, i);
    }

    /* JADX INFO: renamed from: a */
    public AutofillManager m40158a() {
        return (AutofillManager) this.f63660c;
    }

    /* JADX INFO: renamed from: b */
    public void m40159b(WebView webView) {
        webView.setWebViewClient((k97) this.f63660c);
        webView.setWebChromeClient((j97) this.f63661d);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowContentAccess(false);
        settings.setUserAgentString("Spotify-Android-Checkout/" + ((edi0) ((fke) this.f63658a)).m38599e() + "/" + tli0.f221480b);
        settings.setAllowFileAccess(false);
        settings.setDomStorageEnabled(true);
        settings.setGeolocationEnabled(false);
        if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(true);
        }
    }

    public ex3(oz3 oz3Var, h68 h68Var) {
        this.f63658a = oz3Var;
        this.f63659b = h68Var;
        AutofillManager autofillManager = (AutofillManager) oz3Var.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f63660c = autofillManager;
            oz3Var.setImportantForAutofill(1);
            d68 d68VarM48394i = hrg1.m48394i(oz3Var);
            AutofillId autofillId = d68VarM48394i != null ? (AutofillId) d68VarM48394i.f45621a : null;
            if (autofillId != null) {
                this.f63661d = autofillId;
                return;
            }
            throw edb.m38576y("Required value was null.");
        }
        throw new IllegalStateException("Autofill service could not be located.");
    }
}
