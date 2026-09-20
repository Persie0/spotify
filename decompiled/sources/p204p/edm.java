package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class edm extends hdm {
    @Override // p204p.hdm
    /* JADX INFO: renamed from: b */
    public final void mo35749b(StringBuilder sb) {
        sb.append('(');
        sb.append(this.f90161a);
    }

    @Override // p204p.hdm
    /* JADX INFO: renamed from: c */
    public final void mo35750c(StringBuilder sb) {
        sb.append(this.f90161a);
        sb.append(']');
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Comparable, java.lang.Object] */
    @Override // p204p.hdm
    /* JADX INFO: renamed from: e */
    public final boolean mo35752e(Comparable comparable) {
        i5u0 i5u0Var = i5u0.f99026c;
        return this.f90161a.compareTo(comparable) < 0;
    }

    @Override // p204p.hdm
    public final int hashCode() {
        return ~this.f90161a.hashCode();
    }

    public final String toString() {
        return edb.m38568q(new StringBuilder("/"), this.f90161a, "\\");
    }
}
