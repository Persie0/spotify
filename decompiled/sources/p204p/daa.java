package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class daa implements gaa {

    /* JADX INFO: renamed from: a */
    public final myf0 f47009a;

    public daa(myf0 myf0Var) {
        this.f47009a = myf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof daa) && wj50.m88271j(this.f47009a, ((daa) obj).f47009a);
    }

    public final int hashCode() {
        return this.f47009a.hashCode();
    }
}
