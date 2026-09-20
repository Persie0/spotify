package p204p;

import android.R;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public class wi20 implements vi20 {

    /* JADX INFO: renamed from: a */
    public final View f251488a;

    /* JADX INFO: renamed from: b */
    public final TextView f251489b;

    public wi20(View view) {
        this.f251488a = view;
        TextView textView = (TextView) view.findViewById(R.id.text1);
        this.f251489b = textView;
        TextView[] textViewArr = {textView};
        eng1.m39510t(textViewArr);
        eng1.m39509s(textViewArr);
        eng1.m39508r(view);
    }

    @Override // p204p.clc1
    public final View getView() {
        return this.f251488a;
    }

    @Override // p204p.vi20
    /* JADX INFO: renamed from: k */
    public int mo85578k() {
        return this.f251488a.getMeasuredWidth() / 2;
    }

    @Override // p204p.vi20
    /* JADX INFO: renamed from: o */
    public int mo85579o() {
        return this.f251488a.getHeight() / 2;
    }

    public final void setTitle(CharSequence charSequence) {
        this.f251489b.setText(charSequence);
    }

    @Override // p204p.vi20
    /* JADX INFO: renamed from: z */
    public boolean mo85580z() {
        return false;
    }
}
