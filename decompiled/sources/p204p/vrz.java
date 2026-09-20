package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class vrz implements xrz {

    /* JADX INFO: renamed from: a */
    public final String f244283a;

    /* JADX INFO: renamed from: b */
    public final String f244284b;

    public vrz(String str, String str2) {
        this.f244283a = str;
        this.f244284b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrz)) {
            return false;
        }
        vrz vrzVar = (vrz) obj;
        return wj50.m88271j(this.f244283a, vrzVar.f244283a) && wj50.m88271j(this.f244284b, vrzVar.f244284b);
    }

    public final int hashCode() {
        return this.f244284b.hashCode() + (this.f244283a.hashCode() * 31);
    }
}
