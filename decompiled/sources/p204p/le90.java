package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class le90 {

    /* JADX INFO: renamed from: a */
    public final String f132492a;

    public le90(String str) {
        this.f132492a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof le90) && wj50.m88271j(this.f132492a, ((le90) obj).f132492a);
    }

    public final int hashCode() {
        String str = this.f132492a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
