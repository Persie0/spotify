package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class avq {

    /* JADX INFO: renamed from: a */
    public final String f20247a;

    /* JADX INFO: renamed from: b */
    public final boolean f20248b;

    public avq(String str, boolean z) {
        this.f20247a = str;
        this.f20248b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avq)) {
            return false;
        }
        avq avqVar = (avq) obj;
        return this.f20247a.equals(avqVar.f20247a) && this.f20248b == avqVar.f20248b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20248b) + (this.f20247a.hashCode() * 31);
    }
}
