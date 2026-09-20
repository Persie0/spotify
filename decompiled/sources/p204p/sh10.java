package p204p;

import android.R;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public final class sh10 implements rh10 {

    /* JADX INFO: renamed from: a */
    public final View f208976a;

    /* JADX INFO: renamed from: b */
    public final TextView f208977b;

    /* JADX INFO: renamed from: c */
    public final TextView f208978c;

    public sh10(View view) {
        this.f208976a = view;
        this.f208977b = (TextView) view.findViewById(R.id.text1);
        TextView textView = (TextView) view.findViewById(R.id.text2);
        this.f208978c = textView;
        eng1.m39510t(textView);
        eng1.m39508r(view);
    }

    @Override // p204p.clc1
    public final View getView() {
        return this.f208976a;
    }

    @Override // p204p.oh10
    public final void setSubtitle(CharSequence charSequence) {
        this.f208978c.setText(charSequence);
    }

    @Override // p204p.oh10
    public final void setTitle(CharSequence charSequence) {
        this.f208977b.setText(charSequence);
    }
}
