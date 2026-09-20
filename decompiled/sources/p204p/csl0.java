package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class csl0 implements gsl0 {

    /* JADX INFO: renamed from: a */
    public final Exception f41654a;

    public csl0(Exception exc) {
        this.f41654a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof csl0) && wj50.m88271j(this.f41654a, ((csl0) obj).f41654a);
    }

    public final int hashCode() {
        return this.f41654a.hashCode();
    }
}
