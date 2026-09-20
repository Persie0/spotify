package p204p;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes9.dex */
public final class ugn0 extends WebView.VisualStateCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f230215a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ double f230216b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f230217c;

    public /* synthetic */ ugn0(Object obj, double d, int i) {
        this.f230215a = i;
        this.f230217c = obj;
        this.f230216b = d;
    }

    @Override // android.webkit.WebView.VisualStateCallback
    public final void onComplete(long j) {
        switch (this.f230215a) {
            case 0:
                ((gh00) this.f230217c).invoke(new lgn0(this.f230216b));
                break;
            default:
                miq0 miq0Var = (miq0) this.f230217c;
                double d = this.f230216b;
                miq0Var.f144072c.setValue(Double.valueOf(d));
                vfn0 vfn0Var = miq0Var.f144075f;
                if (vfn0Var != null) {
                    vfn0Var.mo74686d(d);
                }
                break;
        }
    }
}
