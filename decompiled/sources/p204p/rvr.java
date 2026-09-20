package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class rvr {

    /* JADX INFO: renamed from: a */
    public final String f203121a;

    /* JADX INFO: renamed from: b */
    public final boolean f203122b;

    public rvr(String str, boolean z) {
        this.f203121a = str;
        this.f203122b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvr)) {
            return false;
        }
        rvr rvrVar = (rvr) obj;
        return wj50.m88271j(this.f203121a, rvrVar.f203121a) && this.f203122b == rvrVar.f203122b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f203122b) + (this.f203121a.hashCode() * 31);
    }
}
