package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class qby0 {

    /* JADX INFO: renamed from: a */
    public final String f187213a;

    /* JADX INFO: renamed from: b */
    public final String f187214b;

    public qby0(String str, String str2) {
        this.f187213a = str;
        this.f187214b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qby0)) {
            return false;
        }
        qby0 qby0Var = (qby0) obj;
        return wj50.m88271j(this.f187213a, qby0Var.f187213a) && wj50.m88271j(this.f187214b, qby0Var.f187214b);
    }

    public final int hashCode() {
        return this.f187214b.hashCode() + (this.f187213a.hashCode() * 31);
    }
}
