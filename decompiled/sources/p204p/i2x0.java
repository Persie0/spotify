package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i2x0 extends j2x0 {

    /* JADX INFO: renamed from: a */
    public final String f97928a;

    public i2x0(String str) {
        this.f97928a = str;
    }

    @Override // p204p.j2x0
    /* JADX INFO: renamed from: a */
    public final String mo27976a() {
        return "unknown";
    }

    @Override // p204p.j2x0
    /* JADX INFO: renamed from: b */
    public final String mo27977b() {
        return this.f97928a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i2x0) && wj50.m88271j(this.f97928a, ((i2x0) obj).f97928a);
    }

    public final int hashCode() {
        return this.f97928a.hashCode();
    }
}
