package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jma1 implements nma1 {

    /* JADX INFO: renamed from: a */
    public final String f113808a;

    public jma1(String str) {
        this.f113808a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jma1) && wj50.m88271j(this.f113808a, ((jma1) obj).f113808a);
    }

    @Override // p204p.nma1
    public final String getUri() {
        return this.f113808a;
    }

    public final int hashCode() {
        return this.f113808a.hashCode();
    }
}
