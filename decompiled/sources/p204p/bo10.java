package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class bo10 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f28980a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ co10 f28981b;

    public /* synthetic */ bo10(co10 co10Var, int i) {
        this.f28980a = i;
        this.f28981b = co10Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v2, types: [p.eh00, p.qe70] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f28980a) {
            case 0:
                co10 co10Var = this.f28981b;
                ?? r0 = co10Var.f40147R1;
                if (r0 != 0) {
                    r0.invoke();
                }
                co10Var.m67381t1();
                co10Var.m83052i1(false, false);
                break;
            default:
                co10 co10Var2 = this.f28981b;
                ?? r1 = co10Var2.f40148S1;
                if (r1 != 0) {
                    r1.invoke();
                }
                co10Var2.m67380s1();
                co10Var2.m83052i1(false, false);
                break;
        }
    }
}
