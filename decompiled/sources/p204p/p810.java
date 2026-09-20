package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class p810 {

    /* JADX INFO: renamed from: a */
    public final String f174809a;

    public p810(String str) {
        this.f174809a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p810) && wj50.m88271j(this.f174809a, ((p810) obj).f174809a);
    }

    public final int hashCode() {
        return this.f174809a.hashCode();
    }
}
