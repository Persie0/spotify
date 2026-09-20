package p204p;

import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class yn10 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f274375a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ao10 f274376b;

    public /* synthetic */ yn10(ao10 ao10Var, int i) {
        this.f274375a = i;
        this.f274376b = ao10Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [p.eh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v3, types: [p.eh00, p.qe70] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f274375a) {
            case 0:
                ao10 ao10Var = this.f274376b;
                ?? r0 = ao10Var.f17541R1;
                if (r0 != 0) {
                    r0.invoke();
                }
                Iterator it = ao10Var.f179286Q1.iterator();
                while (it.hasNext()) {
                    ((zn90) it.next()).mo68864a();
                }
                ao10Var.dismiss();
                break;
            default:
                ao10 ao10Var2 = this.f274376b;
                ?? r1 = ao10Var2.f17542S1;
                if (r1 != 0) {
                    r1.invoke();
                }
                Iterator it2 = ao10Var2.f179286Q1.iterator();
                while (it2.hasNext()) {
                    ((zn90) it2.next()).mo92671b();
                }
                ao10Var2.dismiss();
                break;
        }
    }
}
