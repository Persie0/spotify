package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class tqj implements yqj {

    /* JADX INFO: renamed from: a */
    public final Exception f222825a;

    public tqj(Exception exc) {
        this.f222825a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tqj) && wj50.m88271j(this.f222825a, ((tqj) obj).f222825a);
    }

    public final int hashCode() {
        return this.f222825a.hashCode();
    }
}
