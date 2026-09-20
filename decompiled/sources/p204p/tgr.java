package p204p;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class tgr extends q0f1 {

    /* JADX INFO: renamed from: L0 */
    public final /* synthetic */ ugr f220239L0;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ c500 f220240Z;

    public tgr(ugr ugrVar, c500 c500Var) {
        this.f220239L0 = ugrVar;
        this.f220240Z = c500Var;
    }

    @Override // p204p.q0f1
    /* JADX INFO: renamed from: L */
    public final View mo31451L(int i) {
        c500 c500Var = this.f220240Z;
        if (c500Var.mo31452M()) {
            return c500Var.mo31451L(i);
        }
        Dialog dialog = this.f220239L0.f230244L1;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // p204p.q0f1
    /* JADX INFO: renamed from: M */
    public final boolean mo31452M() {
        return this.f220240Z.mo31452M() || this.f220239L0.f230248P1;
    }
}
