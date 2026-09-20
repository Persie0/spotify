package p204p;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.legacyglue.icons.SpotifyIconView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class khp implements ovf {

    /* JADX INFO: renamed from: a */
    public final u6x f122703a;

    public khp(Context context) {
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.fall_back_plan_card, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        this.f122703a = new u6x((LinearLayout) viewInflate, 5);
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: c */
    public final void mo2821c(gh00 gh00Var) {
        u6x u6xVar = this.f122703a;
        ((LinearLayout) u6xVar.f227447b).setOnClickListener(new yep(17, gh00Var));
        ((Button) ((LinearLayout) u6xVar.f227447b).findViewById(R.id.primary_button)).setOnClickListener(new yep(18, gh00Var));
    }

    @Override // p204p.gr50
    /* JADX INFO: renamed from: d */
    public final void mo2820d(Object obj) {
        aby abyVar = (aby) obj;
        u6x u6xVar = this.f122703a;
        ((TextView) ((LinearLayout) u6xVar.f227447b).findViewById(R.id.title)).setText(abyVar.f14202a);
        LinearLayout linearLayout = (LinearLayout) u6xVar.f227447b;
        ((SpotifyIconView) linearLayout.findViewById(R.id.spotify_logo)).setColor(abyVar.f14203b);
        ((TextView) linearLayout.findViewById(R.id.description)).setText(abyVar.f14204c);
    }

    @Override // p204p.clc1
    public final View getView() {
        return (LinearLayout) this.f122703a.f227447b;
    }
}
