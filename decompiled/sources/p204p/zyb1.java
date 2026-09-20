package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes9.dex */
public final class zyb1 extends ConstraintLayout implements h8w {

    /* JADX INFO: renamed from: R0 */
    public final sef0 f287548R0;

    public zyb1(Context context) {
        super(context, null, 0);
        LayoutInflater.from(context).inflate(R.layout.video_label_episode_row_header, this);
        int i = R.id.artwork;
        ArtworkView artworkView = (ArtworkView) vie1.m85629k(this, R.id.artwork);
        if (artworkView != null) {
            i = R.id.subtitle;
            TextView textView = (TextView) vie1.m85629k(this, R.id.subtitle);
            if (textView != null) {
                i = R.id.subtitles_container;
                if (((LinearLayout) vie1.m85629k(this, R.id.subtitles_container)) != null) {
                    i = R.id.title;
                    TextView textView2 = (TextView) vie1.m85629k(this, R.id.title);
                    if (textView2 != null) {
                        i = R.id.video_label_container;
                        FrameLayout frameLayout = (FrameLayout) vie1.m85629k(this, R.id.video_label_container);
                        if (frameLayout != null) {
                            i = R.id.virality_label;
                            TextView textView3 = (TextView) vie1.m85629k(this, R.id.virality_label);
                            if (textView3 != null) {
                                sef0 sef0Var = new sef0(this, artworkView, textView, textView2, frameLayout, textView3);
                                setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                                q3r0 q3r0VarM26334q = alf1.m26334q(this);
                                View[] viewArr = {textView3};
                                ArrayList arrayList = q3r0VarM26334q.f184932c;
                                Collections.addAll(arrayList, viewArr);
                                Collections.addAll(arrayList, textView);
                                Collections.addAll(arrayList, textView2);
                                Collections.addAll(q3r0VarM26334q.f184933d, artworkView);
                                q3r0VarM26334q.m72126a();
                                this.f287548R0 = sef0Var;
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i)));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        g8w g8wVar = (g8w) obj;
        String str = g8wVar.f77610b;
        boolean z = g8wVar.f77612d;
        sef0 sef0Var = this.f287548R0;
        TextView textView = (TextView) sef0Var.f208287d;
        TextView textView2 = (TextView) sef0Var.f208286c;
        textView.setText(wl51.m88491o1(g8wVar.f77609a).toString());
        ((ArtworkView) sef0Var.f208285b).mo2820d(new u66(new h66(g8wVar.f77611c), false));
        ((TextView) sef0Var.f208289f).setVisibility(8);
        textView2.setText(g6f.m43753y0(bk5.m29582E0(new String[]{z ? getContext().getString(R.string.video_episode_label) : null, str != null ? wl51.m88491o1(str).toString() : null}), " • ", null, null, null, 62));
        textView2.setVisibility(wl51.m88460J0(textView2.getText()) ? 8 : 0);
        ((FrameLayout) sef0Var.f208288e).setVisibility(8);
    }

    public final void setViewContext(yyb1 yyb1Var) {
        ((ArtworkView) this.f287548R0.f208285b).setViewContext(new r96(yyb1Var.f277463a));
    }
}
