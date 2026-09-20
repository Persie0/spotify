package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class khb implements phb {

    /* JADX INFO: renamed from: a */
    public final boolean f122593a;

    /* JADX INFO: renamed from: b */
    public final String f122594b;

    public khb(boolean z, String str) {
        this.f122593a = z;
        this.f122594b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khb)) {
            return false;
        }
        khb khbVar = (khb) obj;
        return this.f122593a == khbVar.f122593a && wj50.m88271j(this.f122594b, khbVar.f122594b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f122593a) * 31;
        String str = this.f122594b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
