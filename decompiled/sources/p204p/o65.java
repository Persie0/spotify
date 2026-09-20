package p204p;

import android.app.Dialog;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class o65 extends ugr {
    @Override // p204p.ugr
    /* JADX INFO: renamed from: l1 */
    public Dialog mo25833l1(Bundle bundle) {
        return new n65(m49717p0(), mo33450k1());
    }

    @Override // p204p.ugr
    /* JADX INFO: renamed from: o1 */
    public final void mo66330o1(Dialog dialog, int i) {
        if (!(dialog instanceof n65)) {
            super.mo66330o1(dialog, i);
            return;
        }
        n65 n65Var = (n65) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        n65Var.m63757d().mo31530f(1);
    }
}
