package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class hd3 extends s95 {

    /* JADX INFO: renamed from: j */
    public final String f89974j;

    /* JADX INFO: renamed from: k */
    public final dsr f89975k;

    public hd3(String str, dsr dsrVar) {
        this.f89974j = str;
        this.f89975k = dsrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd3)) {
            return false;
        }
        hd3 hd3Var = (hd3) obj;
        return wj50.m88271j(this.f89974j, hd3Var.f89974j) && wj50.m88271j(this.f89975k, hd3Var.f89975k);
    }

    public final int hashCode() {
        return this.f89975k.hashCode() + (this.f89974j.hashCode() * 31);
    }
}
