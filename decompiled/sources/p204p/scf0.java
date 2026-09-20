package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class scf0 implements vcf0 {

    /* JADX INFO: renamed from: a */
    public final String f207700a;

    /* JADX INFO: renamed from: b */
    public final String f207701b;

    public scf0(String str) {
        this.f207700a = str;
        this.f207701b = s571.m77251j("{", str, "}");
    }

    @Override // p204p.vcf0
    /* JADX INFO: renamed from: a */
    public final String mo75299a() {
        return this.f207701b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof scf0) && wj50.m88271j(this.f207700a, ((scf0) obj).f207700a);
    }

    public final int hashCode() {
        return this.f207700a.hashCode();
    }
}
