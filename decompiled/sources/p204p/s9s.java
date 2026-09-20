package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s9s implements x9s {

    /* JADX INFO: renamed from: a */
    public final Float f207059a;

    public s9s(Float f) {
        this.f207059a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s9s) && wj50.m88271j(this.f207059a, ((s9s) obj).f207059a);
    }

    public final int hashCode() {
        Float f = this.f207059a;
        if (f == null) {
            return 0;
        }
        return f.hashCode();
    }
}
