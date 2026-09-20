package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wly implements hmy {

    /* JADX INFO: renamed from: a */
    public final String f252642a;

    public wly(String str) {
        this.f252642a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wly) && wj50.m88271j(this.f252642a, ((wly) obj).f252642a);
    }

    public final int hashCode() {
        return this.f252642a.hashCode();
    }
}
