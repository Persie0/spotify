package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class idl extends AbstractC1861fi {

    /* JADX INFO: renamed from: b */
    public final String f101149b;

    /* JADX INFO: renamed from: c */
    public final String f101150c;

    public idl(String str, String str2) {
        super(str);
        this.f101149b = str;
        this.f101150c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof idl)) {
            return false;
        }
        idl idlVar = (idl) obj;
        return wj50.m88271j(this.f101149b, idlVar.f101149b) && wj50.m88271j(this.f101150c, idlVar.f101150c);
    }

    public final int hashCode() {
        return this.f101150c.hashCode() + (this.f101149b.hashCode() * 31);
    }
}
