package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f2x0 extends j2x0 {

    /* JADX INFO: renamed from: a */
    public final String f65277a;

    public f2x0(String str) {
        this.f65277a = str;
    }

    @Override // p204p.j2x0
    /* JADX INFO: renamed from: a */
    public final String mo27976a() {
        return "internal_error";
    }

    @Override // p204p.j2x0
    /* JADX INFO: renamed from: b */
    public final String mo27977b() {
        return this.f65277a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f2x0) && wj50.m88271j(this.f65277a, ((f2x0) obj).f65277a);
    }

    public final int hashCode() {
        return this.f65277a.hashCode();
    }
}
