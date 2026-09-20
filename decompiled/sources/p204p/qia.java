package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qia implements sia {

    /* JADX INFO: renamed from: a */
    public final cia f188969a;

    public qia(cia ciaVar) {
        this.f188969a = ciaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qia) && wj50.m88271j(this.f188969a, ((qia) obj).f188969a);
    }

    public final int hashCode() {
        cia ciaVar = this.f188969a;
        if (ciaVar == null) {
            return 0;
        }
        return ciaVar.hashCode();
    }
}
