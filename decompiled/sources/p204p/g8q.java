package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class g8q implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f77571a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View.OnClickListener f77572b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c631 f77573c;

    public /* synthetic */ g8q(c631 c631Var, View.OnClickListener onClickListener, int i) {
        this.f77571a = i;
        this.f77573c = c631Var;
        this.f77572b = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f77571a) {
            case 0:
                this.f77573c.m68776b(3);
                this.f77572b.onClick(view);
                break;
            default:
                this.f77572b.onClick(view);
                this.f77573c.m68776b(1);
                break;
        }
    }
}
