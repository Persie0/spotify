package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class nqh implements yqh {

    /* JADX INFO: renamed from: a */
    public final String f157277a;

    /* JADX INFO: renamed from: b */
    public final String f157278b;

    public nqh(String str, String str2) {
        this.f157277a = str;
        this.f157278b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqh)) {
            return false;
        }
        nqh nqhVar = (nqh) obj;
        return wj50.m88271j(this.f157277a, nqhVar.f157277a) && wj50.m88271j(this.f157278b, nqhVar.f157278b);
    }

    public final int hashCode() {
        return this.f157278b.hashCode() + (this.f157277a.hashCode() * 31);
    }
}
