package p204p;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encore.image.EncoreImageView;
import com.spotify.encoreconsumermobile.elements.badge.viral.ViralBadgeView;
import com.spotify.music.R;
import java.util.Collections;

/* JADX INFO: loaded from: classes9.dex */
public final class fgp extends ConstraintLayout implements h8w {

    /* JADX INFO: renamed from: R0 */
    public final yho f69378R0;

    public fgp(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.default_episode_row_header, this);
        int i = R.id.artwork;
        EncoreImageView encoreImageView = (EncoreImageView) vie1.m85629k(this, R.id.artwork);
        if (encoreImageView != null) {
            i = R.id.premium_label;
            TextView textView = (TextView) vie1.m85629k(this, R.id.premium_label);
            if (textView != null) {
                i = R.id.subtitle;
                TextView textView2 = (TextView) vie1.m85629k(this, R.id.subtitle);
                if (textView2 != null) {
                    i = R.id.title;
                    TextView textView3 = (TextView) vie1.m85629k(this, R.id.title);
                    if (textView3 != null) {
                        i = R.id.virality_badge;
                        ViralBadgeView viralBadgeView = (ViralBadgeView) vie1.m85629k(this, R.id.virality_badge);
                        if (viralBadgeView != null) {
                            yho yhoVar = new yho(this, encoreImageView, textView, textView2, textView3, viralBadgeView, 3);
                            setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                            q3r0 q3r0VarM26334q = alf1.m26334q(textView3);
                            Collections.addAll(q3r0VarM26334q.f184932c, textView2);
                            Collections.addAll(q3r0VarM26334q.f184933d, encoreImageView);
                            q3r0VarM26334q.m72126a();
                            this.f69378R0 = yhoVar;
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    private final void setUpWithSubtitle(String str) {
        yho yhoVar = this.f69378R0;
        ((TextView) yhoVar.f272930e).setText(wl51.m88491o1(str).toString());
        ((TextView) yhoVar.f272930e).setVisibility(0);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        g8w g8wVar = (g8w) obj;
        String str = g8wVar.f77610b;
        yho yhoVar = this.f69378R0;
        TextView textView = (TextView) yhoVar.f272931f;
        EncoreImageView encoreImageView = (EncoreImageView) yhoVar.f272928c;
        textView.setText(wl51.m88491o1(g8wVar.f77609a).toString());
        String str2 = g8wVar.f77611c;
        if (str2 != null) {
            encoreImageView.setSource(new fxu(Uri.parse(str2)));
        }
        encoreImageView.setModifierFactory(new e9l(g8wVar, 21));
        c7j c7jVar = new c7j();
        c7jVar.m31736f(this);
        if (g8wVar.f77614f == 1) {
            c7jVar.m31739i(R.id.artwork, (int) getContext().getResources().getDimension(R.dimen.track_row_cover_art_size));
        } else {
            c7jVar.m31739i(R.id.artwork, (int) getContext().getResources().getDimension(R.dimen.track_row_cover_art_sixteen_by_nine));
        }
        c7jVar.m31733b(this);
        encoreImageView.setPlaceholderFactory(q6p.f185894e);
        ((TextView) yhoVar.f272929d).setVisibility(g8wVar.f77613e ? 0 : 8);
        if (str == null || wl51.m88460J0(str)) {
            c7j c7jVar2 = new c7j();
            c7jVar2.m31736f(this);
            c7jVar2.m31737g(R.id.title, 4, R.id.subtitle, 3);
            c7jVar2.m31733b(this);
            ((TextView) yhoVar.f272930e).setVisibility(8);
        } else {
            c7j c7jVar3 = new c7j();
            c7jVar3.m31736f(this);
            c7jVar3.m31737g(R.id.title, 4, R.id.subtitle, 3);
            c7jVar3.m31733b(this);
            setUpWithSubtitle(str);
        }
        ((ViralBadgeView) yhoVar.f272932g).setVisibility(8);
    }

    public final void setViewContext(egp egpVar) {
        ((EncoreImageView) this.f69378R0.f272928c).setImageLoader(egpVar.f59370a);
    }
}
