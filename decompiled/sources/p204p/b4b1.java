package p204p;

import android.R;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes8.dex */
public final class b4b1 implements ji10 {

    /* JADX INFO: renamed from: a */
    public final View f23296a;

    /* JADX INFO: renamed from: b */
    public final TextView f23297b;

    /* JADX INFO: renamed from: c */
    public final TextView f23298c;

    public b4b1(View view) {
        this.f23296a = view;
        this.f23297b = (TextView) view.findViewById(R.id.text1);
        this.f23298c = (TextView) view.findViewById(com.spotify.music.R.id.value_row_value);
    }

    @Override // p204p.clc1
    public final View getView() {
        return this.f23296a;
    }
}
