package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p8w extends t8w {

    /* JADX INFO: renamed from: a */
    public final String f175075a;

    public p8w(String str) {
        this.f175075a = str;
    }

    @Override // p204p.t8w
    /* JADX INFO: renamed from: a */
    public final boolean mo63860a() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8w) && this.f175075a.equals(((p8w) obj).f175075a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f175075a.hashCode() * 31);
    }
}
