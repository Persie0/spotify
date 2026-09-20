package p204p;

import android.R;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public final class qh10 implements ph10 {

    /* JADX INFO: renamed from: a */
    public final View f188591a;

    /* JADX INFO: renamed from: b */
    public final TextView f188592b;

    /* JADX INFO: renamed from: c */
    public final TextView f188593c;

    /* JADX INFO: renamed from: d */
    public final Button f188594d;

    public qh10(View view) {
        this.f188591a = view;
        TextView textView = (TextView) view.findViewById(R.id.text1);
        this.f188592b = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.text2);
        this.f188593c = textView2;
        this.f188594d = (Button) view.findViewById(com.spotify.music.R.id.empty_view_button);
        TextView[] textViewArr = {textView};
        eng1.m39510t(textViewArr);
        eng1.m39509s(textViewArr);
        TextView[] textViewArr2 = {textView2};
        eng1.m39510t(textViewArr2);
        eng1.m39509s(textViewArr2);
        eng1.m39508r(view);
    }

    @Override // p204p.clc1
    public final View getView() {
        return this.f188591a;
    }

    @Override // p204p.oh10
    public final void setSubtitle(CharSequence charSequence) {
        this.f188593c.setText(charSequence);
    }

    @Override // p204p.oh10
    public final void setTitle(CharSequence charSequence) {
        this.f188592b.setText(charSequence);
    }
}
