package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jgi {

    /* JADX INFO: renamed from: a */
    public final String f112195a;

    public jgi(String str) {
        this.f112195a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jgi) && wj50.m88271j(this.f112195a, ((jgi) obj).f112195a);
    }

    public final int hashCode() {
        return this.f112195a.hashCode();
    }
}
