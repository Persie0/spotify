package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes2.dex */
public final class xcf0 {

    /* JADX INFO: renamed from: a */
    public final String f260220a;

    /* JADX INFO: renamed from: b */
    public final rbf0 f260221b;

    /* JADX INFO: renamed from: c */
    public final adf0 f260222c;

    public xcf0(String str, rbf0 rbf0Var, adf0 adf0Var) {
        this.f260220a = str;
        this.f260221b = rbf0Var;
        this.f260222c = adf0Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m90393a() {
        String str;
        String strM38562k;
        qcf0 qcf0Var = this.f260221b.f197587b;
        if (wj50.m88271j(qcf0Var, pcf0.f176071a)) {
            str = "sum";
        } else if (wj50.m88271j(qcf0Var, ocf0.f163920a)) {
            str = "last";
        } else if (wj50.m88271j(qcf0Var, mcf0.f142147a)) {
            str = "delta";
        } else {
            if (!(qcf0Var instanceof ncf0)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "histogram";
        }
        adf0 adf0Var = this.f260222c;
        if (adf0Var instanceof ycf0) {
            strM38562k = edb.m38562k(((ycf0) adf0Var).f271483a, "global_", "s");
        } else {
            if (!adf0Var.equals(zcf0.f281504a)) {
                throw new NoWhenBranchMatchedException();
            }
            strM38562k = "observation";
        }
        return rbz.m75190h(this.f260220a, ".", str, ".", strM38562k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcf0)) {
            return false;
        }
        xcf0 xcf0Var = (xcf0) obj;
        return this.f260220a.equals(xcf0Var.f260220a) && this.f260221b.equals(xcf0Var.f260221b) && this.f260222c.equals(xcf0Var.f260222c);
    }

    public final int hashCode() {
        return this.f260222c.hashCode() + ((this.f260221b.hashCode() + (this.f260220a.hashCode() * 31)) * 31);
    }
}
