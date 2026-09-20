package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class flt {

    /* JADX INFO: renamed from: a */
    public final String f70866a;

    /* JADX INFO: renamed from: b */
    public final String f70867b;

    public flt(String str, String str2) {
        this.f70866a = str;
        this.f70867b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof flt)) {
            return false;
        }
        flt fltVar = (flt) obj;
        return wj50.m88271j(this.f70866a, fltVar.f70866a) && wj50.m88271j(this.f70867b, fltVar.f70867b);
    }

    public final int hashCode() {
        return this.f70867b.hashCode() + (this.f70866a.hashCode() * 31);
    }
}
