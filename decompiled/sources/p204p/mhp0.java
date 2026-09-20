package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class mhp0 implements shp0 {

    /* JADX INFO: renamed from: a */
    public final String f143851a;

    public mhp0(String str) {
        this.f143851a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mhp0) && wj50.m88271j(this.f143851a, ((mhp0) obj).f143851a);
    }

    public final int hashCode() {
        return this.f143851a.hashCode();
    }
}
