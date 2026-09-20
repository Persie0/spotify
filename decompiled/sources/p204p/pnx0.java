package p204p;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class pnx0 implements lnx0 {

    /* JADX INFO: renamed from: a */
    public final Intent f179540a;

    /* JADX INFO: renamed from: b */
    public final e301 f179541b;

    public pnx0(Intent intent, e301 e301Var) {
        this.f179540a = intent;
        this.f179541b = e301Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnx0)) {
            return false;
        }
        pnx0 pnx0Var = (pnx0) obj;
        return wj50.m88271j(this.f179540a, pnx0Var.f179540a) && wj50.m88271j(this.f179541b, pnx0Var.f179541b);
    }

    public final int hashCode() {
        return this.f179541b.hashCode() + (this.f179540a.hashCode() * 31);
    }
}
