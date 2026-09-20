package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class s8w extends t8w {

    /* JADX INFO: renamed from: a */
    public final String f206798a;

    public s8w(String str) {
        this.f206798a = str;
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
        return (obj instanceof s8w) && wj50.m88271j(this.f206798a, ((s8w) obj).f206798a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f206798a.hashCode() * 31);
    }
}
