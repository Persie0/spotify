package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dgu0 implements egu0 {

    /* JADX INFO: renamed from: a */
    public final String f48898a;

    public dgu0(String str) {
        this.f48898a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dgu0) && wj50.m88271j(this.f48898a, ((dgu0) obj).f48898a);
    }

    public final int hashCode() {
        return this.f48898a.hashCode();
    }
}
