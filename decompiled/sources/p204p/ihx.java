package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ihx {

    /* JADX INFO: renamed from: a */
    public final String f102376a;

    /* JADX INFO: renamed from: b */
    public final String f102377b;

    public ihx(String str, String str2) {
        this.f102376a = str;
        this.f102377b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihx)) {
            return false;
        }
        ihx ihxVar = (ihx) obj;
        return wj50.m88271j(this.f102376a, ihxVar.f102376a) && wj50.m88271j(this.f102377b, ihxVar.f102377b);
    }

    public final int hashCode() {
        return this.f102377b.hashCode() + (this.f102376a.hashCode() * 31);
    }
}
