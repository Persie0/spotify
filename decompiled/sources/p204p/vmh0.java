package p204p;

import android.view.View;
import android.webkit.WebView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class vmh0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xmh0 f242824a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f242825b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ WebView f242826c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmh0(xmh0 xmh0Var, View view, WebView webView) {
        super(0);
        this.f242824a = xmh0Var;
        this.f242825b = view;
        this.f242826c = webView;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        xmh0 xmh0Var = this.f242824a;
        xmh0Var.getClass();
        View view = this.f242825b;
        view.setVisibility(0);
        boolean zMo76359a = xmh0Var.f263377i.mo76359a(3);
        view.findViewById(R.id.vtec_progress_normal).setVisibility(zMo76359a ? 0 : 8);
        view.findViewById(R.id.vtec_progress_static).setVisibility(zMo76359a ? 8 : 0);
        this.f242826c.setVisibility(4);
        return w2a1.f247311a;
    }
}
