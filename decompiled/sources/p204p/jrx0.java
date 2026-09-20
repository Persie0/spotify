package p204p;

import android.R;
import android.widget.TextView;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class jrx0 extends rpx0 implements trx0 {

    /* JADX INFO: renamed from: c */
    public final TextView f115335c;

    public jrx0(san0 san0Var) {
        super(san0Var);
        TextView textView = (TextView) san0Var.findViewById(R.id.text1);
        this.f115335c = textView;
        q3r0 q3r0VarM26334q = alf1.m26334q(san0Var.findViewById(com.spotify.music.R.id.row_view));
        Collections.addAll(q3r0VarM26334q.f184932c, textView);
        q3r0VarM26334q.m72126a();
    }

    /* JADX INFO: renamed from: b */
    public final void m54200b(int i) {
        TextView textView = this.f115335c;
        if (i != textView.getMaxLines()) {
            textView.setMaxLines(i);
        }
    }

    @Override // p204p.trx0
    /* JADX INFO: renamed from: h */
    public final TextView mo54201h() {
        return this.f115335c;
    }

    @Override // p204p.trx0
    /* JADX INFO: renamed from: l */
    public final void mo54202l(CharSequence charSequence) {
        this.f115335c.setText(charSequence);
    }
}
