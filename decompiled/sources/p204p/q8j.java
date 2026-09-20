package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class q8j {

    /* JADX INFO: renamed from: a */
    public final String f186328a;

    /* JADX INFO: renamed from: b */
    public final String f186329b;

    public q8j(String str, String str2) {
        this.f186328a = str;
        this.f186329b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8j)) {
            return false;
        }
        q8j q8jVar = (q8j) obj;
        return wj50.m88271j(this.f186328a, q8jVar.f186328a) && wj50.m88271j(this.f186329b, q8jVar.f186329b);
    }

    public final int hashCode() {
        int iHashCode = this.f186328a.hashCode() * 31;
        String str = this.f186329b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
