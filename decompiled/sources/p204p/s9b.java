package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class s9b {

    /* JADX INFO: renamed from: a */
    public final String f206898a;

    /* JADX INFO: renamed from: b */
    public final r9b f206899b;

    public s9b(String str, r9b r9bVar) {
        this.f206898a = str;
        this.f206899b = r9bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9b)) {
            return false;
        }
        s9b s9bVar = (s9b) obj;
        return wj50.m88271j(this.f206898a, s9bVar.f206898a) && wj50.m88271j(this.f206899b, s9bVar.f206899b);
    }

    public final int hashCode() {
        String str = this.f206898a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        r9b r9bVar = this.f206899b;
        return iHashCode + (r9bVar != null ? r9bVar.hashCode() : 0);
    }
}
