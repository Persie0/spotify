package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes6.dex */
public final class m2v implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f139466a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n2v f139467b;

    public /* synthetic */ m2v(n2v n2vVar, int i) {
        this.f139466a = i;
        this.f139467b = n2vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f139466a) {
            case 0:
                n2v n2vVar = this.f139467b;
                m780 m780Var = n2vVar.f149839U1;
                if (m780Var != null) {
                    m780Var.invoke();
                }
                n2vVar.m83052i1(false, false);
                break;
            default:
                n2v n2vVar2 = this.f139467b;
                m780 m780Var2 = n2vVar2.f149838T1;
                if (m780Var2 != null) {
                    m780Var2.invoke();
                }
                n2vVar2.m83052i1(false, false);
                break;
        }
    }
}
