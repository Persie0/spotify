package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class fe70 implements txf {
    @Override // p204p.txf
    /* JADX INFO: renamed from: a */
    public final sxf mo41411a(ViewGroup viewGroup) {
        View viewM25591c = adn.m25591c(viewGroup, R.layout.label_component, viewGroup, false);
        if (viewM25591c == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) viewM25591c;
        return new ge70(new xr50(textView, textView, 1));
    }

    @Override // p204p.txf
    /* JADX INFO: renamed from: b */
    public final void mo41412b(Object obj, sxf sxfVar) {
        be70 be70Var = (be70) obj;
        ge70 ge70Var = (ge70) sxfVar;
        xr50 xr50Var = ge70Var.f79041a;
        TextView textView = xr50Var.f265269c;
        textView.setText(be70Var.f26296a);
        textView.setMaxLines(ge70Var.f79043c);
        textView.setTextAlignment(wj50.m88271j(be70Var.f26297b, Boolean.TRUE) ? 4 : ge70Var.f79044d);
        xr50Var.f265268b.setPaddingRelative(ge70Var.f79045e, ge70Var.f79047g, ge70Var.f79046f, ge70Var.f79048h);
    }
}
