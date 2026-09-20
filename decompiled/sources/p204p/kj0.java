package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kj0 {

    /* JADX INFO: renamed from: a */
    public final String f123189a;

    /* JADX INFO: renamed from: b */
    public final String f123190b;

    public kj0(String str, String str2) {
        this.f123189a = str;
        this.f123190b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj0)) {
            return false;
        }
        kj0 kj0Var = (kj0) obj;
        return wj50.m88271j(this.f123189a, kj0Var.f123189a) && wj50.m88271j(this.f123190b, kj0Var.f123190b);
    }

    public final int hashCode() {
        return this.f123190b.hashCode() + (this.f123189a.hashCode() * 31);
    }
}
