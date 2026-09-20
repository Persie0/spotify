package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class csf implements dsf {

    /* JADX INFO: renamed from: a */
    public final String f41538a;

    /* JADX INFO: renamed from: b */
    public final String f41539b;

    public csf(String str, String str2) {
        this.f41538a = str;
        this.f41539b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csf)) {
            return false;
        }
        csf csfVar = (csf) obj;
        return wj50.m88271j(this.f41538a, csfVar.f41538a) && wj50.m88271j(this.f41539b, csfVar.f41539b);
    }

    public final int hashCode() {
        return this.f41539b.hashCode() + (this.f41538a.hashCode() * 31);
    }
}
