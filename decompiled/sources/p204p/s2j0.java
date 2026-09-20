package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class s2j0 extends b3j0 {

    /* JADX INFO: renamed from: a */
    public final String f205023a;

    public s2j0(String str) {
        this.f205023a = str;
    }

    @Override // p204p.b3j0
    /* JADX INFO: renamed from: a */
    public final boolean mo28034a() {
        return false;
    }

    @Override // p204p.b3j0
    /* JADX INFO: renamed from: b */
    public final String mo28035b() {
        return s571.m77251j("deep_link(", this.f205023a, ")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2j0) && wj50.m88271j(this.f205023a, ((s2j0) obj).f205023a);
    }

    public final int hashCode() {
        return this.f205023a.hashCode();
    }
}
