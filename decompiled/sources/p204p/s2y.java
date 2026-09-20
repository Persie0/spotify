package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class s2y {

    /* JADX INFO: renamed from: a */
    public final ywz f205091a;

    /* JADX INFO: renamed from: b */
    public final f1j f205092b;

    /* JADX INFO: renamed from: c */
    public final boolean f205093c;

    public s2y(ywz ywzVar, f1j f1jVar, boolean z) {
        this.f205091a = ywzVar;
        this.f205092b = f1jVar;
        this.f205093c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2y)) {
            return false;
        }
        s2y s2yVar = (s2y) obj;
        return wj50.m88271j(this.f205091a, s2yVar.f205091a) && wj50.m88271j(this.f205092b, s2yVar.f205092b) && this.f205093c == s2yVar.f205093c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f205093c) + ((this.f205092b.hashCode() + (Boolean.hashCode(this.f205091a.f277079a) * 31)) * 31);
    }
}
