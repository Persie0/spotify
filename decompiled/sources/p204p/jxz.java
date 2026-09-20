package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class jxz {

    /* JADX INFO: renamed from: a */
    public final String f117251a;

    /* JADX INFO: renamed from: b */
    public final String f117252b;

    public jxz(String str, String str2) {
        this.f117251a = str;
        this.f117252b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jxz)) {
            return false;
        }
        jxz jxzVar = (jxz) obj;
        return wj50.m88271j(this.f117251a, jxzVar.f117251a) && wj50.m88271j(this.f117252b, jxzVar.f117252b);
    }

    public final int hashCode() {
        return this.f117252b.hashCode() + (this.f117251a.hashCode() * 31);
    }
}
