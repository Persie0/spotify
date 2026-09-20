package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wde0 implements xde0 {

    /* JADX INFO: renamed from: a */
    public final String f250269a;

    public wde0(String str) {
        this.f250269a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wde0) && wj50.m88271j(this.f250269a, ((wde0) obj).f250269a);
    }

    public final int hashCode() {
        return this.f250269a.hashCode();
    }
}
