package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class v881 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f238431a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qe1 f238432b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o981 f238433c;

    public /* synthetic */ v881(qe1 qe1Var, o981 o981Var, int i) {
        this.f238431a = i;
        this.f238432b = qe1Var;
        this.f238433c = o981Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f238431a) {
            case 0:
                xfl0 xfl0Var = this.f238432b.f187826b;
                if (xfl0Var != null) {
                    xfl0Var.mo32174f(this.f238433c.f162971h.f227864g);
                }
                break;
            default:
                xfl0 xfl0Var2 = this.f238432b.f187826b;
                if (xfl0Var2 != null) {
                    xfl0Var2.mo32172b(this.f238433c.f162971h.f227861d);
                }
                break;
        }
    }
}
