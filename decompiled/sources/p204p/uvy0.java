package p204p;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes7.dex */
public final class uvy0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f234520a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f234521b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uvy0(kqi0 kqi0Var, int i) {
        super(0);
        this.f234520a = i;
        this.f234521b = kqi0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f234520a;
        w2a1 w2a1Var = w2a1.f247311a;
        kqi0 kqi0Var = this.f234521b;
        switch (i) {
            case 0:
                return (String) kqi0Var.getValue();
            case 1:
                float f = qmz0.f190439c;
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 2:
                float f2 = qmz0.f190439c;
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 3:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 4:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 5:
                kqi0Var.setValue(h8s0.f88784e);
                return w2a1Var;
            case 6:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 7:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 8:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 9:
                return (qf40) kqi0Var.getValue();
            case 10:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 11:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 12:
                return Integer.valueOf(((Number) kqi0Var.getValue()).intValue());
            case 13:
                return (siv0) kqi0Var.getValue();
            case 14:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 15:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 16:
                cjf1.m32972m(kqi0Var, false);
                return w2a1Var;
            case 17:
                WebView webView = (WebView) kqi0Var.getValue();
                if (webView != null) {
                    webView.goBack();
                }
                return w2a1Var;
            case 18:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 19:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 20:
                kqi0Var.setValue(xd61.m90409a((xd61) kqi0Var.getValue(), true, false, 55));
                return w2a1Var;
            case 21:
                return (siv0) kqi0Var.getValue();
            case 22:
                kqi0Var.setValue(Boolean.FALSE);
                return Boolean.TRUE;
            case 23:
                Boolean bool = Boolean.TRUE;
                kqi0Var.setValue(bool);
                return bool;
            case 24:
                ((eh00) kqi0Var.getValue()).invoke();
                return w2a1Var;
            case 25:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 26:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 27:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 28:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            default:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
        }
    }
}
