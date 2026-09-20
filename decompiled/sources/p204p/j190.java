package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j190 implements k190 {

    /* JADX INFO: renamed from: a */
    public final String f107700a;

    /* JADX INFO: renamed from: b */
    public final h190 f107701b;

    public j190(String str) {
        h190 h190Var = new h190();
        this.f107700a = str;
        this.f107701b = h190Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j190)) {
            return false;
        }
        j190 j190Var = (j190) obj;
        return wj50.m88271j(this.f107700a, j190Var.f107700a) && wj50.m88271j(this.f107701b, j190Var.f107701b);
    }

    @Override // p204p.k190
    public final h190 getMetadata() {
        return this.f107701b;
    }

    public final int hashCode() {
        return this.f107700a.hashCode() * 31;
    }
}
