package p204p;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class dj20 extends by8 {

    /* JADX INFO: renamed from: c */
    public final Button f49533c;

    /* JADX INFO: renamed from: d */
    public final TextView f49534d;

    /* JADX INFO: renamed from: e */
    public final TextView f49535e;

    /* JADX INFO: renamed from: f */
    public final ViewGroup f49536f;

    /* JADX WARN: Illegal instructions before constructor call */
    public dj20(Activity activity, AppBarLayout appBarLayout) {
        View viewInflate = LayoutInflater.from(activity).inflate(R.layout.playlist_all_songs_header_content, (ViewGroup) appBarLayout, false);
        super(viewInflate);
        Button button = (Button) viewInflate.findViewById(R.id.button);
        button.setText(button.getContext().getString(R.string.playlist_all_songs_add_to_this_playlist_button));
        this.f49533c = button;
        this.f49534d = (TextView) viewInflate.findViewById(R.id.title);
        this.f49535e = (TextView) viewInflate.findViewById(R.id.subtitle);
        this.f49536f = (ViewGroup) viewInflate.findViewById(R.id.wrapper);
    }

    @Override // p204p.by8, p204p.em20
    /* JADX INFO: renamed from: a */
    public final void mo30875a(float f, int i) {
        this.f49536f.setTranslationY(-i);
    }
}
