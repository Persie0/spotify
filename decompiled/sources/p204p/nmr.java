package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nmr {

    /* JADX INFO: renamed from: a */
    public final String f156251a;

    public nmr(String str) {
        this.f156251a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nmr) && wj50.m88271j(this.f156251a, ((nmr) obj).f156251a);
    }

    public final int hashCode() {
        return this.f156251a.hashCode();
    }
}
