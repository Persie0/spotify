package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h2x0 extends j2x0 {

    /* JADX INFO: renamed from: a */
    public final String f87088a;

    public h2x0(String str) {
        this.f87088a = str;
    }

    @Override // p204p.j2x0
    /* JADX INFO: renamed from: a */
    public final String mo27976a() {
        return "unavailable_for_legal_reasons";
    }

    @Override // p204p.j2x0
    /* JADX INFO: renamed from: b */
    public final String mo27977b() {
        return this.f87088a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h2x0) && wj50.m88271j(this.f87088a, ((h2x0) obj).f87088a);
    }

    public final int hashCode() {
        return this.f87088a.hashCode();
    }
}
