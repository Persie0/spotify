package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class so10 implements vo10 {

    /* JADX INFO: renamed from: a */
    public final Exception f211077a;

    public so10(Exception exc) {
        this.f211077a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof so10) && wj50.m88271j(this.f211077a, ((so10) obj).f211077a);
    }

    public final int hashCode() {
        return this.f211077a.hashCode();
    }
}
