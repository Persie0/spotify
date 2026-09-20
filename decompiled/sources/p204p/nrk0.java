package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nrk0 {

    /* JADX INFO: renamed from: a */
    public final String f157577a;

    /* JADX INFO: renamed from: b */
    public final String f157578b;

    /* JADX INFO: renamed from: c */
    public final String f157579c;

    public nrk0(String str, String str2, String str3) {
        this.f157577a = str;
        this.f157578b = str2;
        this.f157579c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrk0)) {
            return false;
        }
        nrk0 nrk0Var = (nrk0) obj;
        return wj50.m88271j(this.f157577a, nrk0Var.f157577a) && wj50.m88271j(this.f157578b, nrk0Var.f157578b) && wj50.m88271j(this.f157579c, nrk0Var.f157579c);
    }

    public final int hashCode() {
        return this.f157579c.hashCode() + s571.m77243b(this.f157577a.hashCode() * 31, 31, this.f157578b);
    }
}
