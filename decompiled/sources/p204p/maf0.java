package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class maf0 extends oaf0 {

    /* JADX INFO: renamed from: b */
    public final String f141583b;

    public maf0(String str) {
        super(false);
        this.f141583b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof maf0) && wj50.m88271j(this.f141583b, ((maf0) obj).f141583b);
    }

    public final int hashCode() {
        return this.f141583b.hashCode();
    }
}
