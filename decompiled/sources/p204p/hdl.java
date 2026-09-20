package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hdl extends AbstractC1861fi {

    /* JADX INFO: renamed from: b */
    public final String f90158b;

    /* JADX INFO: renamed from: c */
    public final String f90159c;

    public hdl(String str, String str2) {
        super(str);
        this.f90158b = str;
        this.f90159c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdl)) {
            return false;
        }
        hdl hdlVar = (hdl) obj;
        return wj50.m88271j(this.f90158b, hdlVar.f90158b) && wj50.m88271j(this.f90159c, hdlVar.f90159c);
    }

    public final int hashCode() {
        return this.f90159c.hashCode() + (this.f90158b.hashCode() * 31);
    }
}
