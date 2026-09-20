package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class bdf implements hdf {

    /* JADX INFO: renamed from: a */
    public final String f26090a;

    public bdf(String str) {
        this.f26090a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdf) && wj50.m88271j(this.f26090a, ((bdf) obj).f26090a);
    }

    public final int hashCode() {
        return this.f26090a.hashCode();
    }
}
