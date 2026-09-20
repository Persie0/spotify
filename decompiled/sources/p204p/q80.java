package p204p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class q80 implements rdc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f186196a;

    /* JADX INFO: renamed from: b */
    public final ConstraintLayout f186197b;

    /* JADX INFO: renamed from: c */
    public final TextView f186198c;

    /* JADX INFO: renamed from: d */
    public final TextView f186199d;

    /* JADX INFO: renamed from: e */
    public final TextView f186200e;

    /* JADX INFO: renamed from: f */
    public final TextView f186201f;

    public /* synthetic */ q80(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, int i) {
        this.f186196a = i;
        this.f186197b = constraintLayout;
        this.f186198c = textView;
        this.f186199d = textView2;
        this.f186200e = textView3;
        this.f186201f = textView4;
    }

    /* JADX INFO: renamed from: a */
    public static q80 m72295a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.culturalmoments_actions_medium_card_text_container_playlist, (ViewGroup) null, false);
        int i = R.id.content_type;
        TextView textView = (TextView) vie1.m85629k(viewInflate, R.id.content_type);
        if (textView != null) {
            i = R.id.description;
            TextView textView2 = (TextView) vie1.m85629k(viewInflate, R.id.description);
            if (textView2 != null) {
                i = R.id.subtitle;
                TextView textView3 = (TextView) vie1.m85629k(viewInflate, R.id.subtitle);
                if (textView3 != null) {
                    i = R.id.title;
                    TextView textView4 = (TextView) vie1.m85629k(viewInflate, R.id.title);
                    if (textView4 != null) {
                        return new q80((ConstraintLayout) viewInflate, textView, textView2, textView3, textView4, 1);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // p204p.rdc1
    public final View getRoot() {
        switch (this.f186196a) {
            case 0:
                break;
        }
        return this.f186197b;
    }
}
