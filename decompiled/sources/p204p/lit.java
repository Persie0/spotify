package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lit {

    /* JADX INFO: renamed from: a */
    public final String f133887a;

    /* JADX INFO: renamed from: b */
    public final String f133888b;

    public lit(String str, String str2) {
        this.f133887a = str;
        this.f133888b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lit)) {
            return false;
        }
        lit litVar = (lit) obj;
        return wj50.m88271j(this.f133887a, litVar.f133887a) && wj50.m88271j(this.f133888b, litVar.f133888b);
    }

    public final int hashCode() {
        return this.f133888b.hashCode() + (this.f133887a.hashCode() * 31);
    }
}
