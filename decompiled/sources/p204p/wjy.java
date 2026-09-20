package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wjy implements yjy {

    /* JADX INFO: renamed from: a */
    public final String f252066a;

    public wjy(String str) {
        this.f252066a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wjy) && wj50.m88271j(this.f252066a, ((wjy) obj).f252066a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f252066a.hashCode() * 31);
    }
}
