package p204p;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class n7z0 extends h7z0 {

    /* JADX INFO: renamed from: f */
    public final TextView f151277f;

    public n7z0(View view) {
        super(view, false);
        TextView textView = (TextView) view.findViewById(R.id.metadata);
        this.f151277f = textView;
        TextView[] textViewArr = {textView};
        eng1.m39510t(textViewArr);
        eng1.m39509s(textViewArr);
        eng1.m39508r(view);
    }
}
