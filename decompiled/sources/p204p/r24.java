package p204p;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class r24 implements View.OnDragListener, lcs {

    /* JADX INFO: renamed from: a */
    public final ncs f195047a = new ncs(null, 3);

    /* JADX INFO: renamed from: b */
    public final zj5 f195048b = new zj5(0);

    /* JADX INFO: renamed from: c */
    public final q24 f195049c = new q24(this);

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        gcs gcsVar = new gcs(dragEvent);
        int action = dragEvent.getAction();
        zj5 zj5Var = this.f195048b;
        ncs ncsVar = this.f195047a;
        switch (action) {
            case 1:
                nlv0 nlv0Var = new nlv0();
                tug1.m81571i(ncsVar, new ziq(gcsVar, ncsVar, nlv0Var, 7));
                boolean z = nlv0Var.f155174a;
                zj5Var.getClass();
                sj5 sj5Var = new sj5(zj5Var);
                while (sj5Var.hasNext()) {
                    ((ocs) sj5Var.next()).mo64173Y0(gcsVar);
                }
                return z;
            case 2:
                ncsVar.mo64175d0(gcsVar);
                return false;
            case 3:
                return ncsVar.mo64174a1(gcsVar);
            case 4:
                ncsVar.mo64171H0(gcsVar);
                zj5Var.clear();
                return false;
            case 5:
                ncsVar.mo64172Q0(gcsVar);
                return false;
            case 6:
                ncsVar.mo64176u(gcsVar);
                return false;
            default:
                return false;
        }
    }
}
