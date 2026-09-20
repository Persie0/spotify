package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class qn10 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f190453a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rn10 f190454b;

    public /* synthetic */ qn10(rn10 rn10Var, int i) {
        this.f190453a = i;
        this.f190454b = rn10Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f190453a) {
            case 0:
                rn10 rn10Var = this.f190454b;
                eh00 eh00Var = rn10Var.f200694R1;
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                rn10Var.m67381t1();
                rn10Var.m83052i1(false, false);
                break;
            default:
                rn10 rn10Var2 = this.f190454b;
                eh00 eh00Var2 = rn10Var2.f200695S1;
                if (eh00Var2 != null) {
                    eh00Var2.invoke();
                }
                rn10Var2.m67380s1();
                rn10Var2.m83052i1(false, false);
                break;
        }
    }
}
