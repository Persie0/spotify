package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class zht extends k2h1 {

    /* JADX INFO: renamed from: b */
    public final d850 f283010b;

    public zht(d850 d850Var) {
        this.f283010b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zht) && wj50.m88271j(this.f283010b, ((zht) obj).f283010b);
    }

    public final int hashCode() {
        d850 d850Var = this.f283010b;
        if (d850Var == null) {
            return 0;
        }
        return d850Var.hashCode();
    }
}
