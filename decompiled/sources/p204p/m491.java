package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class m491 implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f139877a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n491 f139878b;

    public /* synthetic */ m491(n491 n491Var, int i) {
        this.f139877a = i;
        this.f139878b = n491Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f139877a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                n491 n491Var = this.f139878b;
                n491.m63663I(n491Var, n491Var.f50039a.getHeight() - view.getTop());
                break;
            default:
                n491 n491Var2 = this.f139878b;
                n491.m63663I(n491Var2, n491Var2.f50039a.getHeight() - i2);
                break;
        }
    }
}
