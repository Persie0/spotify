package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e2x0 extends j2x0 {

    /* JADX INFO: renamed from: a */
    public final String f55544a;

    public e2x0(String str) {
        this.f55544a = str;
    }

    @Override // p204p.j2x0
    /* JADX INFO: renamed from: a */
    public final String mo27976a() {
        return "insufficient_storage";
    }

    @Override // p204p.j2x0
    /* JADX INFO: renamed from: b */
    public final String mo27977b() {
        return this.f55544a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2x0) && wj50.m88271j(this.f55544a, ((e2x0) obj).f55544a);
    }

    public final int hashCode() {
        return this.f55544a.hashCode();
    }
}
