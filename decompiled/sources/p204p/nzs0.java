package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nzs0 {

    /* JADX INFO: renamed from: a */
    public final sdd f160162a;

    /* JADX INFO: renamed from: b */
    public final mcd f160163b;

    public nzs0(sdd sddVar, mcd mcdVar) {
        this.f160162a = sddVar;
        this.f160163b = mcdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nzs0)) {
            return false;
        }
        nzs0 nzs0Var = (nzs0) obj;
        return wj50.m88271j(this.f160162a, nzs0Var.f160162a) && wj50.m88271j(this.f160163b, nzs0Var.f160163b);
    }

    public final int hashCode() {
        int iHashCode = this.f160162a.hashCode() * 31;
        mcd mcdVar = this.f160163b;
        return iHashCode + (mcdVar == null ? 0 : mcdVar.hashCode());
    }
}
