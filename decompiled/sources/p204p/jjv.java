package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jjv extends kjv {

    /* JADX INFO: renamed from: a */
    public final miv f113113a;

    /* JADX INFO: renamed from: b */
    public final bjv f113114b;

    public jjv(miv mivVar, bjv bjvVar) {
        this.f113113a = mivVar;
        this.f113114b = bjvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jjv)) {
            return false;
        }
        jjv jjvVar = (jjv) obj;
        return wj50.m88271j(this.f113113a, jjvVar.f113113a) && wj50.m88271j(this.f113114b, jjvVar.f113114b);
    }

    public final int hashCode() {
        return this.f113114b.hashCode() + (this.f113113a.hashCode() * 31);
    }
}
