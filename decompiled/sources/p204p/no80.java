package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.encoremobile.component.textview.EncoreTextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes5.dex */
public final class no80 implements noc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f156626a;

    public /* synthetic */ no80(int i) {
        this.f156626a = i;
    }

    @Override // p204p.noc1
    /* JADX INFO: renamed from: a */
    public final dkv0 mo25390a(ViewGroup viewGroup) {
        switch (this.f156626a) {
            case 0:
                View viewM25591c = adn.m25591c(viewGroup, R.layout.bottom_list_view, viewGroup, false);
                if (viewM25591c != null) {
                    return new a8u((LinearLayout) viewM25591c);
                }
                throw new NullPointerException("rootView");
            case 1:
                View viewM25591c2 = adn.m25591c(viewGroup, R.layout.top_list_view, viewGroup, false);
                if (viewM25591c2 != null) {
                    return new a8u((LinearLayout) viewM25591c2);
                }
                throw new NullPointerException("rootView");
            default:
                View viewM25591c3 = adn.m25591c(viewGroup, R.layout.listening_hours_title, viewGroup, false);
                EncoreTextView encoreTextView = (EncoreTextView) vie1.m85629k(viewM25591c3, R.id.text_view_title);
                if (encoreTextView == null) {
                    throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c3.getResources().getResourceName(R.id.text_view_title)));
                }
                return new qg90(new i780(4, (LinearLayout) viewM25591c3, encoreTextView));
        }
    }

    @Override // p204p.noc1
    /* JADX INFO: renamed from: b */
    public final void mo25391b(dkv0 dkv0Var, moc1 moc1Var) {
        switch (this.f156626a) {
            case 0:
            case 1:
                break;
            default:
                ((EncoreTextView) ((qg90) dkv0Var).f188409S0.f99466c).setText(((rg90) moc1Var).f198894a);
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    private final void m65231c(dkv0 dkv0Var, moc1 moc1Var) {
    }

    /* JADX INFO: renamed from: d */
    private final void m65232d(dkv0 dkv0Var, moc1 moc1Var) {
    }
}
