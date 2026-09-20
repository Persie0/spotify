package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class deo implements heo {

    /* JADX INFO: renamed from: a */
    public final String f48133a;

    public deo(String str) {
        this.f48133a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof deo) && wj50.m88271j(this.f48133a, ((deo) obj).f48133a);
    }

    public final int hashCode() {
        return this.f48133a.hashCode();
    }
}
