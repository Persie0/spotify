package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o9w {

    /* JADX INFO: renamed from: a */
    public final String f163145a;

    /* JADX INFO: renamed from: b */
    public final String f163146b;

    public o9w(String str, String str2) {
        this.f163145a = str;
        this.f163146b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9w)) {
            return false;
        }
        o9w o9wVar = (o9w) obj;
        return wj50.m88271j(this.f163145a, o9wVar.f163145a) && wj50.m88271j(this.f163146b, o9wVar.f163146b);
    }

    public final int hashCode() {
        int iHashCode = this.f163145a.hashCode() * 31;
        String str = this.f163146b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
