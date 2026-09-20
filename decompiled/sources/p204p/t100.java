package p204p;

import android.widget.TextView;

/* JADX INFO: loaded from: classes7.dex */
public final class t100 extends dkv0 {

    /* JADX INFO: renamed from: S0 */
    public final yr50 f216047S0;

    /* JADX WARN: Illegal instructions before constructor call */
    public t100(u100 u100Var, yr50 yr50Var) {
        TextView textView = yr50Var.f275400b;
        super(textView);
        this.f216047S0 = yr50Var;
        textView.setOnClickListener(new ryp(u100Var, 12));
    }
}
