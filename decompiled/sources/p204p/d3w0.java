package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class d3w0 extends j3w0 {

    /* JADX INFO: renamed from: a */
    public final String f45024a;

    public d3w0(String str) {
        this.f45024a = str;
    }

    @Override // p204p.j3w0
    /* JADX INFO: renamed from: a */
    public final String mo34897a() {
        return this.f45024a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d3w0) && wj50.m88271j(this.f45024a, ((d3w0) obj).f45024a);
    }

    public final int hashCode() {
        String str = this.f45024a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
