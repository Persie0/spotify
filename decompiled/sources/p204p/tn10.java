package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class tn10 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f221858a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ un10 f221859b;

    public /* synthetic */ tn10(un10 un10Var, int i) {
        this.f221858a = i;
        this.f221859b = un10Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v2, types: [p.eh00, p.qe70] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f221858a) {
            case 0:
                un10 un10Var = this.f221859b;
                ?? r0 = un10Var.f232007R1;
                if (r0 != 0) {
                    r0.invoke();
                }
                un10Var.m67381t1();
                un10Var.m83052i1(false, false);
                break;
            default:
                un10 un10Var2 = this.f221859b;
                ?? r1 = un10Var2.f232008S1;
                if (r1 != 0) {
                    r1.invoke();
                }
                un10Var2.m67380s1();
                un10Var2.m83052i1(false, false);
                break;
        }
    }
}
