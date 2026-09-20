package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g2x0 extends j2x0 {

    /* JADX INFO: renamed from: a */
    public final String f76020a;

    public g2x0(String str) {
        this.f76020a = str;
    }

    @Override // p204p.j2x0
    /* JADX INFO: renamed from: a */
    public final String mo27976a() {
        return "not_found";
    }

    @Override // p204p.j2x0
    /* JADX INFO: renamed from: b */
    public final String mo27977b() {
        return this.f76020a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2x0) && wj50.m88271j(this.f76020a, ((g2x0) obj).f76020a);
    }

    public final int hashCode() {
        return this.f76020a.hashCode();
    }
}
