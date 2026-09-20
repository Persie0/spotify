package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class znj extends eoj {

    /* JADX INFO: renamed from: a */
    public final jyn0 f284512a;

    /* JADX INFO: renamed from: b */
    public final boolean f284513b;

    public znj(jyn0 jyn0Var, boolean z) {
        this.f284512a = jyn0Var;
        this.f284513b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znj)) {
            return false;
        }
        znj znjVar = (znj) obj;
        return wj50.m88271j(this.f284512a, znjVar.f284512a) && this.f284513b == znjVar.f284513b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f284513b) + (this.f284512a.hashCode() * 31);
    }
}
