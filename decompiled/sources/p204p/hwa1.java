package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hwa1 implements jwa1 {

    /* JADX INFO: renamed from: a */
    public final String f95898a;

    public hwa1(String str) {
        this.f95898a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hwa1) && wj50.m88271j(this.f95898a, ((hwa1) obj).f95898a);
    }

    public final int hashCode() {
        return this.f95898a.hashCode();
    }
}
