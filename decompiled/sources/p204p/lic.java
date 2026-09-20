package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class lic extends nic {

    /* JADX INFO: renamed from: a */
    public final String f133763a;

    /* JADX INFO: renamed from: b */
    public final boolean f133764b;

    public lic(String str, boolean z) {
        this.f133763a = str;
        this.f133764b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lic)) {
            return false;
        }
        lic licVar = (lic) obj;
        return wj50.m88271j(this.f133763a, licVar.f133763a) && this.f133764b == licVar.f133764b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133764b) + (this.f133763a.hashCode() * 31);
    }
}
