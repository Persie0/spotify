package p204p;

import android.view.View;
import android.widget.TextView;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes7.dex */
public final class cj20 extends bj20 {

    /* JADX INFO: renamed from: d */
    public final TextView f38483d;

    public cj20(View view) {
        super(view, 1);
        TextView textView = (TextView) view.findViewById(R.id.metadata);
        this.f38483d = textView;
        TextView[] textViewArr = {textView};
        eng1.m39510t(textViewArr);
        eng1.m39509s(textViewArr);
        eng1.m39508r(view);
    }
}
