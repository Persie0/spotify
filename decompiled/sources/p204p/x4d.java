package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x4d implements h5d {

    /* JADX INFO: renamed from: a */
    public final l6s f258063a;

    public x4d(l6s l6sVar) {
        this.f258063a = l6sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4d) && wj50.m88271j(this.f258063a, ((x4d) obj).f258063a);
    }

    public final int hashCode() {
        return this.f258063a.hashCode();
    }
}
