package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nrk {

    /* JADX INFO: renamed from: a */
    public final String f157575a;

    /* JADX INFO: renamed from: b */
    public final String f157576b;

    public nrk(String str, String str2) {
        this.f157575a = str;
        this.f157576b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrk)) {
            return false;
        }
        nrk nrkVar = (nrk) obj;
        return wj50.m88271j(this.f157575a, nrkVar.f157575a) && wj50.m88271j(this.f157576b, nrkVar.f157576b);
    }

    public final int hashCode() {
        int iHashCode = this.f157575a.hashCode() * 31;
        String str = this.f157576b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
