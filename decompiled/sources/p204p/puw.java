package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class puw implements s2x {

    /* JADX INFO: renamed from: a */
    public final String f181537a;

    /* JADX INFO: renamed from: b */
    public final String f181538b;

    public puw(String str, String str2) {
        this.f181537a = str;
        this.f181538b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puw)) {
            return false;
        }
        puw puwVar = (puw) obj;
        return wj50.m88271j(this.f181537a, puwVar.f181537a) && wj50.m88271j(this.f181538b, puwVar.f181538b);
    }

    public final int hashCode() {
        return this.f181538b.hashCode() + (this.f181537a.hashCode() * 31);
    }
}
