package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h2s0 implements hwf {

    /* JADX INFO: renamed from: a */
    public final v64 f87056a;

    public h2s0(v64 v64Var) {
        this.f87056a = v64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2s0) && this.f87056a == ((h2s0) obj).f87056a;
    }

    public final int hashCode() {
        return this.f87056a.hashCode();
    }
}
