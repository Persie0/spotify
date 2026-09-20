package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class jxd implements lxd {

    /* JADX INFO: renamed from: a */
    public final String f117098a;

    public jxd(String str) {
        this.f117098a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxd) && wj50.m88271j(this.f117098a, ((jxd) obj).f117098a);
    }

    public final int hashCode() {
        return this.f117098a.hashCode();
    }
}
