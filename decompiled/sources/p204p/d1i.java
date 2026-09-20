package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class d1i implements e1i {

    /* JADX INFO: renamed from: a */
    public final String f44299a;

    /* JADX INFO: renamed from: b */
    public final int f44300b;

    public d1i(String str, int i) {
        this.f44299a = str;
        this.f44300b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1i)) {
            return false;
        }
        d1i d1iVar = (d1i) obj;
        return wj50.m88271j(this.f44299a, d1iVar.f44299a) && this.f44300b == d1iVar.f44300b;
    }

    @Override // p204p.e1i
    public final String getUri() {
        return this.f44299a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f44300b) + (this.f44299a.hashCode() * 31);
    }
}
