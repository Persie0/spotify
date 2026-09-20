package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class t7j0 implements gvb0, gdl0 {

    /* JADX INFO: renamed from: a */
    public final pcf f217841a;

    /* JADX INFO: renamed from: b */
    public e301 f217842b;

    public t7j0(pcf pcfVar) {
        this.f217841a = pcfVar;
    }

    @Override // p204p.gdl0
    /* JADX INFO: renamed from: a */
    public final void mo44428a(e301 e301Var) {
        this.f217842b = e301Var;
    }

    @Override // p204p.gvb0
    /* JADX INFO: renamed from: b */
    public final boolean mo45893b(Intent intent) {
        e301 e301Var = this.f217842b;
        if (e301Var != null) {
            return this.f217841a.m69577a(new pnx0(intent, e301Var));
        }
        throw new IllegalStateException(("Unable to route intent because session state is missing: sessionState=" + this.f217842b).toString());
    }
}
