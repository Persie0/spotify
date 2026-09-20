package p204p;

import android.view.View;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes10.dex */
public final class wmh0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xmh0 f252897a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f252898b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ WebView f252899c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wmh0(xmh0 xmh0Var, View view, WebView webView) {
        super(0);
        this.f252897a = xmh0Var;
        this.f252898b = view;
        this.f252899c = webView;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        this.f252897a.getClass();
        this.f252898b.setVisibility(8);
        this.f252899c.setVisibility(0);
        return w2a1.f247311a;
    }
}
