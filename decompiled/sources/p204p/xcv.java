package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xcv {

    /* JADX INFO: renamed from: a */
    public final ncv f260288a;

    /* JADX INFO: renamed from: b */
    public final ncv f260289b;

    public xcv(ncv ncvVar, ncv ncvVar2) {
        this.f260288a = ncvVar;
        this.f260289b = ncvVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcv)) {
            return false;
        }
        xcv xcvVar = (xcv) obj;
        return wj50.m88271j(this.f260288a, xcvVar.f260288a) && wj50.m88271j(this.f260289b, xcvVar.f260289b);
    }

    public final int hashCode() {
        return this.f260289b.hashCode() + (this.f260288a.hashCode() * 31);
    }
}
