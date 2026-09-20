package p204p;

import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes6.dex */
public final class g7v implements r7l0, oal0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mzx0 f77358a;

    public /* synthetic */ g7v(mzx0 mzx0Var) {
        this.f77358a = mzx0Var;
    }

    @Override // p204p.oal0
    /* JADX INFO: renamed from: o */
    public void mo27479o(Exception exc) {
        this.f77358a.resumeWith(new c6x0(exc));
    }

    @Override // p204p.r7l0
    public void onComplete(Task task) {
        Exception excM65555t;
        boolean zMo1518j = task.mo1518j();
        w2a1 w2a1Var = w2a1.f247311a;
        mzx0 mzx0Var = this.f77358a;
        if (zMo1518j) {
            mzx0Var.resumeWith(w2a1Var);
            return;
        }
        Exception excMo1514f = task.mo1514f();
        if (excMo1514f == null || (excM65555t = nsg1.m65555t(excMo1514f)) == null) {
            mzx0Var.resumeWith(w2a1Var);
        } else {
            mzx0Var.resumeWith(new c6x0(excM65555t));
        }
    }
}
