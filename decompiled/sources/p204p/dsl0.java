package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class dsl0 implements gsl0 {

    /* JADX INFO: renamed from: a */
    public final Exception f52598a;

    public dsl0(Exception exc) {
        this.f52598a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dsl0) && wj50.m88271j(this.f52598a, ((dsl0) obj).f52598a);
    }

    public final int hashCode() {
        return this.f52598a.hashCode();
    }
}
