package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class bjy {

    /* JADX INFO: renamed from: a */
    public final String f27782a;

    public bjy(String str) {
        this.f27782a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bjy) && wj50.m88271j(this.f27782a, ((bjy) obj).f27782a);
    }

    public final int hashCode() {
        return this.f27782a.hashCode();
    }
}
