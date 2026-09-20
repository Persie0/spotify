package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kq50 implements hr50 {

    /* JADX INFO: renamed from: a */
    public final String f125218a;

    public kq50(String str) {
        this.f125218a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m57080a() {
        return this.f125218a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kq50) && wj50.m88271j(this.f125218a, ((kq50) obj).f125218a);
    }

    public final int hashCode() {
        return this.f125218a.hashCode();
    }
}
