package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class i830 extends mye {

    /* JADX INFO: renamed from: c */
    public final String f99685c;

    public i830(String str) {
        this.f99685c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i830) && wj50.m88271j(this.f99685c, ((i830) obj).f99685c);
    }

    public final int hashCode() {
        return this.f99685c.hashCode();
    }
}
