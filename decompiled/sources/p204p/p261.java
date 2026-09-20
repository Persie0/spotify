package p204p;

import android.R;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class p261 {

    /* JADX INFO: renamed from: a */
    public final TextView f173258a;

    /* JADX INFO: renamed from: b */
    public final TextView f173259b;

    /* JADX INFO: renamed from: c */
    public final ImageView f173260c;

    /* JADX INFO: renamed from: d */
    public final ImageView f173261d;

    /* JADX INFO: renamed from: e */
    public final ImageView f173262e;

    public p261(View view) {
        this.f173258a = (TextView) view.findViewById(R.id.text1);
        this.f173259b = (TextView) view.findViewById(R.id.text2);
        this.f173260c = (ImageView) view.findViewById(R.id.icon1);
        this.f173261d = (ImageView) view.findViewById(R.id.icon2);
        this.f173262e = (ImageView) view.findViewById(com.spotify.music.R.id.edit_query);
    }
}
