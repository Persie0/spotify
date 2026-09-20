package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class hbb0 implements jbb0 {

    /* JADX INFO: renamed from: a */
    public final s7f f89468a;

    public hbb0(s7f s7fVar) {
        this.f89468a = s7fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hbb0) && wj50.m88271j(this.f89468a, ((hbb0) obj).f89468a);
    }

    public final int hashCode() {
        return this.f89468a.hashCode();
    }
}
