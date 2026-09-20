package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f3w0 extends j3w0 {

    /* JADX INFO: renamed from: a */
    public final String f65607a;

    public f3w0(String str) {
        this.f65607a = str;
    }

    @Override // p204p.j3w0
    /* JADX INFO: renamed from: a */
    public final String mo34897a() {
        return this.f65607a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f3w0) && wj50.m88271j(this.f65607a, ((f3w0) obj).f65607a);
    }

    public final int hashCode() {
        String str = this.f65607a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
