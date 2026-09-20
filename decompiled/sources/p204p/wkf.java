package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wkf implements bmf {

    /* JADX INFO: renamed from: a */
    public final Exception f252224a;

    /* JADX INFO: renamed from: b */
    public final String f252225b;

    public wkf(Exception exc, String str) {
        this.f252224a = exc;
        this.f252225b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkf)) {
            return false;
        }
        wkf wkfVar = (wkf) obj;
        return this.f252224a.equals(wkfVar.f252224a) && wj50.m88271j(this.f252225b, wkfVar.f252225b);
    }

    public final int hashCode() {
        return this.f252225b.hashCode() + (this.f252224a.hashCode() * 31);
    }
}
