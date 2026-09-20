package p204p;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public final class iyc extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f106933a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f106934b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f106935c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ kqi0 f106936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iyc(eh00 eh00Var, kqi0 kqi0Var, kqi0 kqi0Var2, int i) {
        super(0);
        this.f106933a = i;
        this.f106934b = eh00Var;
        this.f106935c = kqi0Var;
        this.f106936d = kqi0Var2;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f106933a;
        w2a1 w2a1Var = w2a1.f247311a;
        eh00 eh00Var = this.f106934b;
        kqi0 kqi0Var = this.f106936d;
        kqi0 kqi0Var2 = this.f106935c;
        switch (i) {
            case 0:
                float f = pyc.f183385a;
                kqi0Var2.setValue(Boolean.TRUE);
                ((gh00) kqi0Var.getValue()).invoke(xwc.f266632a);
                eh00Var.invoke();
                break;
            default:
                WebView webView = (WebView) kqi0Var2.getValue();
                if (webView != null && ((Boolean) kqi0Var.getValue()).booleanValue()) {
                    webView.goBack();
                } else {
                    eh00Var.invoke();
                }
                break;
        }
        return w2a1Var;
    }
}
