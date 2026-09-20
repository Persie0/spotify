package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class zh81 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282835a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ci81 f282836b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mh81 f282837c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f282838d;

    public /* synthetic */ zh81(ci81 ci81Var, mh81 mh81Var, int i, int i2) {
        this.f282835a = i2;
        this.f282836b = ci81Var;
        this.f282837c = mh81Var;
        this.f282838d = i;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r6v5, types: [p.gh00, p.qe70] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f282835a) {
            case 0:
                ci81 ci81Var = this.f282836b;
                if (!ci81Var.f38252t) {
                    ?? r6 = ci81Var.f38250h;
                    mh81 mh81Var = this.f282837c;
                    r6.invoke(new gi81(mh81Var.f143725a, this.f282838d, mh81Var.f143732h));
                    break;
                }
                break;
            default:
                ?? r7 = this.f282836b.f38250h;
                mh81 mh81Var2 = this.f282837c;
                r7.invoke(new hi81(mh81Var2.f143725a, this.f282838d, mh81Var2.f143732h, mh81Var2.f143730f));
                break;
        }
    }
}
