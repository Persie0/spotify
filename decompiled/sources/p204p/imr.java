package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class imr {

    /* JADX INFO: renamed from: a */
    public final String f103769a;

    /* JADX INFO: renamed from: b */
    public final String f103770b;

    public imr(String str, String str2) {
        this.f103769a = str;
        this.f103770b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imr)) {
            return false;
        }
        imr imrVar = (imr) obj;
        return wj50.m88271j(this.f103769a, imrVar.f103769a) && wj50.m88271j(this.f103770b, imrVar.f103770b);
    }

    public final int hashCode() {
        return this.f103770b.hashCode() + (this.f103769a.hashCode() * 31);
    }
}
