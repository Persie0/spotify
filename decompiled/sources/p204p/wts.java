package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class wts {

    /* JADX INFO: renamed from: a */
    public final String f255001a;

    /* JADX INFO: renamed from: b */
    public final String f255002b;

    public wts(String str, String str2) {
        this.f255001a = str;
        this.f255002b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wts)) {
            return false;
        }
        wts wtsVar = (wts) obj;
        return wj50.m88271j(this.f255001a, wtsVar.f255001a) && wj50.m88271j(this.f255002b, wtsVar.f255002b);
    }

    public final int hashCode() {
        return this.f255002b.hashCode() + (this.f255001a.hashCode() * 31);
    }
}
