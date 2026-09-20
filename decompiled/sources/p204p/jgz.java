package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class jgz {

    /* JADX INFO: renamed from: a */
    public final int f112298a;

    /* JADX INFO: renamed from: b */
    public final ogz f112299b;

    public jgz(int i, ogz ogzVar) {
        this.f112298a = i;
        this.f112299b = ogzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgz)) {
            return false;
        }
        jgz jgzVar = (jgz) obj;
        return this.f112298a == jgzVar.f112298a && wj50.m88271j(this.f112299b, jgzVar.f112299b);
    }

    public final int hashCode() {
        return this.f112299b.hashCode() + (Integer.hashCode(this.f112298a) * 31);
    }
}
