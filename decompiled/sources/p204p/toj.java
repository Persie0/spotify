package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class toj implements zoj {

    /* JADX INFO: renamed from: a */
    public final Exception f222275a;

    public toj(Exception exc) {
        this.f222275a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof toj) && wj50.m88271j(this.f222275a, ((toj) obj).f222275a);
    }

    public final int hashCode() {
        return this.f222275a.hashCode();
    }
}
