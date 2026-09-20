package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class gwa1 implements jwa1 {

    /* JADX INFO: renamed from: a */
    public final String f84963a;

    public gwa1(String str) {
        this.f84963a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gwa1) && wj50.m88271j(this.f84963a, ((gwa1) obj).f84963a);
    }

    public final int hashCode() {
        return this.f84963a.hashCode();
    }
}
