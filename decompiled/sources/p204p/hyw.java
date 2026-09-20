package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hyw extends b2x {

    /* JADX INFO: renamed from: a */
    public final String f96689a;

    public hyw(String str) {
        this.f96689a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hyw) && wj50.m88271j(this.f96689a, ((hyw) obj).f96689a);
    }

    public final int hashCode() {
        return this.f96689a.hashCode();
    }
}
