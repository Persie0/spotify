package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class unv {

    /* JADX INFO: renamed from: a */
    public final String f232268a;

    /* JADX INFO: renamed from: b */
    public final String f232269b;

    public unv(String str, String str2) {
        this.f232268a = str;
        this.f232269b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unv)) {
            return false;
        }
        unv unvVar = (unv) obj;
        return wj50.m88271j(this.f232268a, unvVar.f232268a) && wj50.m88271j(this.f232269b, unvVar.f232269b);
    }

    public final int hashCode() {
        return this.f232269b.hashCode() + (this.f232268a.hashCode() * 31);
    }
}
