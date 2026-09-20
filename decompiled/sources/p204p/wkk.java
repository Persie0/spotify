package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wkk {

    /* JADX INFO: renamed from: a */
    public final String f252254a;

    /* JADX INFO: renamed from: b */
    public final int f252255b;

    public wkk(String str, int i) {
        this.f252254a = str;
        this.f252255b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkk)) {
            return false;
        }
        wkk wkkVar = (wkk) obj;
        return wj50.m88271j(this.f252254a, wkkVar.f252254a) && this.f252255b == wkkVar.f252255b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f252255b) + (this.f252254a.hashCode() * 31);
    }
}
