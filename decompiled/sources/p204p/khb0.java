package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class khb0 implements mhb0 {

    /* JADX INFO: renamed from: a */
    public final s7f f122595a;

    public khb0(s7f s7fVar) {
        this.f122595a = s7fVar;
    }

    @Override // p204p.mhb0
    /* JADX INFO: renamed from: a */
    public final s7f mo53373a() {
        return this.f122595a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khb0) && wj50.m88271j(this.f122595a, ((khb0) obj).f122595a);
    }

    public final int hashCode() {
        return this.f122595a.hashCode();
    }
}
