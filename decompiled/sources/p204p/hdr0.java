package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hdr0 {

    /* JADX INFO: renamed from: a */
    public final String f90177a;

    /* JADX INFO: renamed from: b */
    public final String f90178b;

    /* JADX INFO: renamed from: c */
    public final Float f90179c;

    public hdr0(String str, String str2, Float f) {
        this.f90177a = str;
        this.f90178b = str2;
        this.f90179c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdr0)) {
            return false;
        }
        hdr0 hdr0Var = (hdr0) obj;
        return wj50.m88271j(this.f90177a, hdr0Var.f90177a) && wj50.m88271j(this.f90178b, hdr0Var.f90178b) && wj50.m88271j(this.f90179c, hdr0Var.f90179c);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f90177a.hashCode() * 31, 31, this.f90178b);
        Float f = this.f90179c;
        return iM77243b + (f == null ? 0 : f.hashCode());
    }
}
