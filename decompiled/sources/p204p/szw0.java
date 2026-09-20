package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class szw0 {

    /* JADX INFO: renamed from: a */
    public final vac f215686a;

    /* JADX INFO: renamed from: b */
    public final cac f215687b;

    public szw0(vac vacVar, cac cacVar) {
        this.f215686a = vacVar;
        this.f215687b = cacVar;
    }

    /* JADX INFO: renamed from: a */
    public final cac m79766a() {
        return this.f215687b;
    }

    /* JADX INFO: renamed from: b */
    public final vac m79767b() {
        return this.f215686a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szw0)) {
            return false;
        }
        szw0 szw0Var = (szw0) obj;
        return wj50.m88271j(this.f215686a, szw0Var.f215686a) && this.f215687b == szw0Var.f215687b;
    }

    public final int hashCode() {
        vac vacVar = this.f215686a;
        return Boolean.hashCode(true) + ((this.f215687b.hashCode() + ((vacVar == null ? 0 : vacVar.hashCode()) * 31)) * 31);
    }
}
