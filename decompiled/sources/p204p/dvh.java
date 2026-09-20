package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dvh {

    /* JADX INFO: renamed from: a */
    public final String f53460a;

    /* JADX INFO: renamed from: b */
    public final String f53461b;

    /* JADX INFO: renamed from: c */
    public final String f53462c;

    public dvh(String str, String str2, String str3) {
        this.f53460a = str;
        this.f53461b = str2;
        this.f53462c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvh)) {
            return false;
        }
        dvh dvhVar = (dvh) obj;
        return wj50.m88271j(this.f53460a, dvhVar.f53460a) && wj50.m88271j(this.f53461b, dvhVar.f53461b) && wj50.m88271j(this.f53462c, dvhVar.f53462c);
    }

    public final int hashCode() {
        int iHashCode = this.f53460a.hashCode() * 31;
        String str = this.f53461b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f53462c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
