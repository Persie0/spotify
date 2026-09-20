package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class glf implements bmf {

    /* JADX INFO: renamed from: a */
    public final daa0 f81066a;

    public glf(daa0 daa0Var) {
        this.f81066a = daa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof glf) && wj50.m88271j(this.f81066a, ((glf) obj).f81066a);
    }

    public final int hashCode() {
        return this.f81066a.hashCode();
    }
}
