package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ogc {

    /* JADX INFO: renamed from: a */
    public final String f165086a;

    public ogc(String str) {
        this.f165086a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ogc) && wj50.m88271j(this.f165086a, ((ogc) obj).f165086a);
    }

    public final int hashCode() {
        return this.f165086a.hashCode();
    }
}
