package p204p;

import android.widget.TextView;

/* JADX INFO: loaded from: classes11.dex */
public final class dc71 extends dkv0 {

    /* JADX INFO: renamed from: S0 */
    public final yr50 f47447S0;

    /* JADX WARN: Illegal instructions before constructor call */
    public dc71(rls0 rls0Var, yr50 yr50Var) {
        TextView textView = yr50Var.f275400b;
        super(textView);
        this.f47447S0 = yr50Var;
        textView.setOnClickListener(new zg11(rls0Var, 7));
    }
}
