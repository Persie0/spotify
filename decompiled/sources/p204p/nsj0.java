package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class nsj0 extends psj0 {

    /* JADX INFO: renamed from: d */
    public final hgx0 f157827d;

    /* JADX INFO: renamed from: e */
    public final View f157828e;

    /* JADX INFO: renamed from: f */
    public final csp f157829f;

    public nsj0(hgx0 hgx0Var, View view, csp cspVar) {
        super(view);
        this.f157827d = hgx0Var;
        this.f157828e = view;
        this.f157829f = cspVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsj0)) {
            return false;
        }
        nsj0 nsj0Var = (nsj0) obj;
        return this.f157827d.equals(nsj0Var.f157827d) && wj50.m88271j(this.f157828e, nsj0Var.f157828e) && wj50.m88271j(this.f157829f, nsj0Var.f157829f);
    }

    public final int hashCode() {
        int iHashCode = (this.f157828e.hashCode() + (this.f157827d.hashCode() * 31)) * 31;
        csp cspVar = this.f157829f;
        return ker0.DEFAULT.hashCode() + ((iHashCode + (cspVar == null ? 0 : cspVar.hashCode())) * 31);
    }

    @Override // p204p.ppg1
    /* JADX INFO: renamed from: q */
    public final ker0 mo62771q() {
        return ker0.DEFAULT;
    }
}
