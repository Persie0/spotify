package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wlf implements bmf {

    /* JADX INFO: renamed from: a */
    public final String f252539a;

    /* JADX INFO: renamed from: b */
    public final Throwable f252540b;

    public wlf(String str, Throwable th) {
        this.f252539a = str;
        this.f252540b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlf)) {
            return false;
        }
        wlf wlfVar = (wlf) obj;
        return wj50.m88271j(this.f252539a, wlfVar.f252539a) && wj50.m88271j(this.f252540b, wlfVar.f252540b);
    }

    public final int hashCode() {
        return this.f252540b.hashCode() + (this.f252539a.hashCode() * 31);
    }
}
