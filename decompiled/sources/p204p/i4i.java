package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i4i {

    /* JADX INFO: renamed from: a */
    public final luh f98531a;

    /* JADX INFO: renamed from: b */
    public final pfa0 f98532b;

    public i4i(luh luhVar, pfa0 pfa0Var) {
        this.f98531a = luhVar;
        this.f98532b = pfa0Var;
    }

    /* JADX INFO: renamed from: a */
    public final luh m49674a() {
        return this.f98531a;
    }

    /* JADX INFO: renamed from: b */
    public final pfa0 m49675b() {
        return this.f98532b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4i)) {
            return false;
        }
        i4i i4iVar = (i4i) obj;
        return wj50.m88271j(this.f98531a, i4iVar.f98531a) && wj50.m88271j(this.f98532b, i4iVar.f98532b);
    }

    public final int hashCode() {
        return this.f98532b.hashCode() + (this.f98531a.hashCode() * 31);
    }
}
