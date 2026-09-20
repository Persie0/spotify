package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class cis implements dis {

    /* JADX INFO: renamed from: a */
    public final String f38429a;

    /* JADX INFO: renamed from: b */
    public final String f38430b;

    public cis(String str, String str2) {
        this.f38429a = str;
        this.f38430b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cis)) {
            return false;
        }
        cis cisVar = (cis) obj;
        return wj50.m88271j(this.f38429a, cisVar.f38429a) && wj50.m88271j(this.f38430b, cisVar.f38430b);
    }

    public final int hashCode() {
        return this.f38430b.hashCode() + (this.f38429a.hashCode() * 31);
    }
}
