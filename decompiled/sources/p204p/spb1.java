package p204p;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes11.dex */
public final class spb1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f212796a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f212797b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ spb1(kqi0 kqi0Var, int i) {
        super(0);
        this.f212796a = i;
        this.f212797b = kqi0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f212796a) {
            case 0:
                Boolean bool = (Boolean) this.f212797b.getValue();
                bool.booleanValue();
                return bool;
            case 1:
                this.f212797b.setValue(Boolean.TRUE);
                return w2a1.f247311a;
            case 2:
                this.f212797b.setValue(Boolean.TRUE);
                return w2a1.f247311a;
            case 3:
                this.f212797b.setValue(Boolean.TRUE);
                return w2a1.f247311a;
            case 4:
                this.f212797b.setValue(Boolean.FALSE);
                return w2a1.f247311a;
            case 5:
                this.f212797b.setValue(Boolean.FALSE);
                return w2a1.f247311a;
            case 6:
                this.f212797b.setValue(Boolean.TRUE);
                return w2a1.f247311a;
            case 7:
                this.f212797b.setValue(Boolean.FALSE);
                return w2a1.f247311a;
            case 8:
                ((eh00) this.f212797b.getValue()).invoke();
                return w2a1.f247311a;
            case 9:
                WebView webView = (WebView) this.f212797b.getValue();
                if (webView != null) {
                    webView.goBack();
                }
                return w2a1.f247311a;
            default:
                aq7.m26751i(this.f212797b, false);
                return w2a1.f247311a;
        }
    }
}
