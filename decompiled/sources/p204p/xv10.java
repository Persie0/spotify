package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xv10 {

    /* JADX INFO: renamed from: a */
    public final String f266241a;

    /* JADX INFO: renamed from: b */
    public final ss10 f266242b;

    public xv10(String str, ss10 ss10Var) {
        this.f266241a = str;
        this.f266242b = ss10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv10)) {
            return false;
        }
        xv10 xv10Var = (xv10) obj;
        return wj50.m88271j(this.f266241a, xv10Var.f266241a) && this.f266242b == xv10Var.f266242b;
    }

    public final int hashCode() {
        return this.f266242b.hashCode() + (this.f266241a.hashCode() * 31);
    }

    public /* synthetic */ xv10(String str) {
        this(str, ss10.f213451a);
    }
}
