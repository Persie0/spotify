package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i190 implements k190 {

    /* JADX INFO: renamed from: a */
    public final String f97446a;

    /* JADX INFO: renamed from: b */
    public final h190 f97447b;

    public i190(String str) {
        h190 h190Var = new h190();
        this.f97446a = str;
        this.f97447b = h190Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i190)) {
            return false;
        }
        i190 i190Var = (i190) obj;
        return wj50.m88271j(this.f97446a, i190Var.f97446a) && wj50.m88271j(this.f97447b, i190Var.f97447b);
    }

    @Override // p204p.k190
    public final h190 getMetadata() {
        return this.f97447b;
    }

    public final int hashCode() {
        return this.f97446a.hashCode() * 31;
    }
}
