package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class r8w extends t8w {

    /* JADX INFO: renamed from: a */
    public final String f196845a;

    /* JADX INFO: renamed from: b */
    public final boolean f196846b;

    public r8w(String str, boolean z) {
        this.f196845a = str;
        this.f196846b = z;
    }

    @Override // p204p.t8w
    /* JADX INFO: renamed from: a */
    public final boolean mo63860a() {
        return this.f196846b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8w)) {
            return false;
        }
        r8w r8wVar = (r8w) obj;
        return wj50.m88271j(this.f196845a, r8wVar.f196845a) && this.f196846b == r8wVar.f196846b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f196846b) + (this.f196845a.hashCode() * 31);
    }
}
