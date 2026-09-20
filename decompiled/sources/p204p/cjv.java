package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cjv extends kjv {

    /* JADX INFO: renamed from: a */
    public final miv f38690a;

    /* JADX INFO: renamed from: b */
    public final bjv f38691b;

    public cjv(miv mivVar, bjv bjvVar) {
        this.f38690a = mivVar;
        this.f38691b = bjvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjv)) {
            return false;
        }
        cjv cjvVar = (cjv) obj;
        return wj50.m88271j(this.f38690a, cjvVar.f38690a) && wj50.m88271j(this.f38691b, cjvVar.f38691b);
    }

    public final int hashCode() {
        return this.f38691b.hashCode() + (this.f38690a.hashCode() * 31);
    }
}
