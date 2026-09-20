package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class wkl implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f252257a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe70 f252258b;

    /* JADX WARN: Multi-variable type inference failed */
    public wkl(int i, gh00 gh00Var) {
        this.f252257a = i;
        switch (i) {
            case 1:
                this.f252258b = (qe70) gh00Var;
                break;
            default:
                this.f252258b = (qe70) gh00Var;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r1v2, types: [p.gh00, p.qe70] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f252257a) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                this.f252258b.invoke(fkl.f70559b);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                this.f252258b.invoke(new gkl(view));
                break;
        }
    }
}
