package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wz31 implements b041 {

    /* JADX INFO: renamed from: a */
    public final String f256459a;

    public wz31(String str) {
        this.f256459a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wz31) && wj50.m88271j(this.f256459a, ((wz31) obj).f256459a);
    }

    public final int hashCode() {
        return this.f256459a.hashCode();
    }
}
