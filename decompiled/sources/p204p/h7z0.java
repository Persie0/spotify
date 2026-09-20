package p204p;

import android.R;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public class h7z0 implements ji10 {

    /* JADX INFO: renamed from: a */
    public final View f88576a;

    /* JADX INFO: renamed from: b */
    public final TextView f88577b;

    /* JADX INFO: renamed from: c */
    public CharSequence f88578c;

    /* JADX INFO: renamed from: d */
    public final tc41 f88579d;

    /* JADX INFO: renamed from: e */
    public boolean f88580e;

    public h7z0(View view, boolean z) {
        this.f88576a = view;
        TextView textView = (TextView) view.findViewById(R.id.text1);
        this.f88577b = textView;
        if (z) {
            textView.setGravity(8388611);
        }
        tc41 tc41Var = new tc41(textView.getContext(), vc41.CHEVRON_RIGHT, textView.getTextSize() / 2.0f);
        this.f88579d = tc41Var;
        int iM88767v = wqg1.m88767v(6.0f, textView.getResources());
        p4l0 p4l0Var = tc41Var.f219020m;
        p4l0Var.m69148t(iM88767v, 0);
        tc41Var.f219021n = p4l0Var;
        tc41Var.invalidateSelf();
        tc41Var.setBounds(0, 0, tc41Var.f219021n.mo57072j(), tc41Var.f219021n.mo57071h());
        TextView[] textViewArr = {textView};
        eng1.m39510t(textViewArr);
        eng1.m39509s(textViewArr);
        eng1.m39508r(view);
        if (textView.isDuplicateParentStateEnabled()) {
            r35.m74605m(view);
        } else {
            r35.m74605m(textView);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m46807a() {
        SpannableString spannableString;
        CharSequence charSequence = this.f88578c;
        int i = charSequence != null ? 0 : 8;
        TextView textView = this.f88577b;
        textView.setVisibility(i);
        if (!this.f88580e || charSequence == null) {
            textView.setText(this.f88578c);
            return;
        }
        tc41 tc41Var = this.f88579d;
        String strM80416a = tc41Var.m80416a();
        p4l0 p4l0Var = tc41Var.f219020m;
        int iM88767v = wqg1.m88767v(6.0f, textView.getResources());
        if (uqg1.m83800x(this.f88576a.getContext())) {
            p4l0Var.m69148t(0, iM88767v);
            tc41Var.f219021n = p4l0Var;
            tc41Var.invalidateSelf();
            spannableString = new SpannableString(s571.m77250i(strM80416a, String.valueOf(charSequence)));
            spannableString.setSpan(new uc41(4, tc41Var, true), 0, 1, 18);
        } else {
            p4l0Var.m69148t(iM88767v, 0);
            tc41Var.f219021n = p4l0Var;
            tc41Var.invalidateSelf();
            spannableString = new SpannableString(s571.m77250i(String.valueOf(charSequence), strM80416a));
            spannableString.setSpan(new uc41(4, tc41Var, true), charSequence.length(), charSequence.length() + 1, 18);
        }
        textView.setText(spannableString);
    }

    @Override // p204p.clc1
    public final View getView() {
        return this.f88576a;
    }
}
