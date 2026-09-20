package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class jie {

    /* JADX INFO: renamed from: a */
    public final String f112739a;

    /* JADX INFO: renamed from: b */
    public final String f112740b;

    public jie(String str, String str2) {
        this.f112739a = str;
        this.f112740b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jie)) {
            return false;
        }
        jie jieVar = (jie) obj;
        return wj50.m88271j(this.f112739a, jieVar.f112739a) && wj50.m88271j(this.f112740b, jieVar.f112740b);
    }

    public final int hashCode() {
        return this.f112740b.hashCode() + (this.f112739a.hashCode() * 31);
    }
}
