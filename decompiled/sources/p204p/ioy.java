package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ioy extends koy {

    /* JADX INFO: renamed from: a */
    public final String f104307a;

    /* JADX INFO: renamed from: b */
    public final String f104308b;

    public ioy(String str, String str2) {
        this.f104307a = str;
        this.f104308b = str2;
    }

    @Override // p204p.koy
    /* JADX INFO: renamed from: a */
    public final String mo51222a() {
        return this.f104308b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ioy)) {
            return false;
        }
        ioy ioyVar = (ioy) obj;
        return wj50.m88271j(this.f104307a, ioyVar.f104307a) && wj50.m88271j(this.f104308b, ioyVar.f104308b);
    }

    public final int hashCode() {
        return this.f104308b.hashCode() + (this.f104307a.hashCode() * 31);
    }
}
